package enshu13_03;

//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:PayerTester
 *概要:コンピューターとじゃんけんをする
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class PayerTester {

	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputSelectionNumber
	 *概要:0から引数未満の間の正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)、選択範囲(int型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static int inputSelectionNumber(String stringPromptEntry, int selectionNumberCount) {
		//整数を読み込むため変数を初期化して宣言
		int selectionNumber = 0;
		//範囲を調節するため引かれる整数を定数化
		final int RANGE_ADJUSTMENT = 1;
		//0以上引数未満の整数を入力させる処理
		do {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			selectionNumber = standardInput.nextInt();
			//0未満か引数以上の整数が入力された場合実行
			if (selectionNumber < 0 || selectionNumber >= selectionNumberCount) {
				//指定された範囲内の整数の入力を促す文字列を表示
				System.out.println("0から" + (selectionNumberCount - RANGE_ADJUSTMENT) + "の整数を入力して下さい");
			}
		} //0以上引数未満の整数が入力されるまでループ
		while (selectionNumber < 0 || selectionNumber >= selectionNumberCount);
		//読み込んだ整数を返却
		return selectionNumber;
	}

	/*関数名:isYes
	 *概要:YesかNoかを判別し、Yesの場合はtrueを、Noの場合はfalseを返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:teue,もしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	static boolean isYes(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//Yesの場合に入力される整数を定数化
		final int WHEN_YES = 1;
		//Noの場合に入力される整数を定数化
		final int WHEN_NO = 0;
		//0か1の整数を入力させる
		do {
			//入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//0か1以外の整数が入力された場合実行
			if (inputInteger != WHEN_NO && inputInteger != WHEN_YES) {
				//0か1の整数を入力させる文字列を表示
				System.out.println("0か1の整数を入力してください");
			}
			//0か1の整数を入力されるまでループ
		} while (inputInteger != WHEN_NO && inputInteger != WHEN_YES);
		//1が入力された場合trueを、そうでなければfalseを代入
		boolean logicalValue = inputInteger == WHEN_YES ? true : false;
		//論理値を返却
		return logicalValue;

	}

	/*関数名:main
	 *概要:コンピューターとじゃんけんをする
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public static void main(String[] args) {
		//じゃんけんの手のグーにあたる整数を定数化
		final int HAND_ROCK = 0;
		//じゃんけんの手のチョキにあたる整数を定数化
		final int HAND_SCISSOERS = 1;
		//じゃんけんの手のパーにあたる整数を定数化
		final int HAND_PAPER = 2;
		//じゃんけんの手の種類を定数化
		final int HAND_CATEGORY = 3;
		//じゃんけんの手を読み込んで代入
		int selectHand = inputSelectionNumber("0...グー/1...チョキ/2...パー:", HAND_CATEGORY);
		//プレイヤーの手を引数にしたインスタンスを生成
		HumanPlayer humanHand = new HumanPlayer(selectHand);
		//ランダムな手が生成されたインスタンスを生成
		ComputerPlayer computerHand = new ComputerPlayer();
		//プレイヤーの手を表示
		humanHand.printHand();
		//コンピューターの手を表示
		computerHand.printHand();
		//プレイヤーがじゃんけんに勝った場合
		if (humanHand.getHumanHand() == HAND_ROCK && computerHand.ComputerHand() == HAND_SCISSOERS ||
				humanHand.getHumanHand() == HAND_SCISSOERS && computerHand.ComputerHand() == HAND_PAPER ||
				humanHand.getHumanHand() == HAND_PAPER && computerHand.ComputerHand() == HAND_ROCK) {
			//プレイヤーがじゃんけんに勝ったことを表示
			System.out.println("あなたの勝利です!!");
			//プレイヤーがじゃんけんに負けた場合
		} else if (humanHand.getHumanHand() == HAND_ROCK && computerHand.ComputerHand() == HAND_PAPER ||
				humanHand.getHumanHand() == HAND_SCISSOERS && computerHand.ComputerHand() == HAND_ROCK ||
				humanHand.getHumanHand() == HAND_PAPER && computerHand.ComputerHand() == HAND_SCISSOERS) {
			//プレイヤーがじゃんけんに負けたことを表示
			System.out.println("あなたの負けです...");
			//あいこの場合
		} else {
			//あいこであることを表示
			System.out.println("あいこです。");
		}

	}

}
