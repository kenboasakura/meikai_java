package enshu15;

//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:enshu15_05
 *概要:プレイヤー1人とコンピューター2人でじゃんけんを行う
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class enshu15_05 {
	//じゃんけんの手のグーにあたる整数を定数化
	static final int HAND_ROCK = 0;
	//じゃんけんの手のチョキにあたる整数を定数化
	static final int HAND_SCISSOERS = 1;
	//じゃんけんの手のパーにあたる整数を定数化
	static final int HAND_PAPER = 2;

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
		final int RANGE_ADJUSTMENT = -1;
		//0以上引数未満の整数を入力させる処理
		do {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			selectionNumber = standardInput.nextInt();
			//0未満か引数以上の整数が入力された場合実行
			if (selectionNumber < 0 || selectionNumber >= selectionNumberCount) {
				//指定された範囲内の整数の入力を促す文字列を表示
				System.out.println("0から" + (selectionNumberCount + RANGE_ADJUSTMENT) + "の整数を入力して下さい");
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

	/*関数名:isWinner
	 *概要:一人目のプレイヤーが勝利した場合にtrueを、そうでなければfalseを返却するメソッド
	 *引数:2人のプレイヤーの手(int型)
	 *戻り値:trueもしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	static boolean isWinner(int firstPlayer, int secondPlayer) {
		//一人目のプレイヤーが勝利した場合にtrueをそうでなければfalseを返却する
		return (firstPlayer == HAND_ROCK && secondPlayer == HAND_SCISSOERS ||
				firstPlayer == HAND_SCISSOERS && secondPlayer == HAND_PAPER ||
				firstPlayer == HAND_PAPER && secondPlayer == HAND_ROCK);
	}

	/*関数名:main
	 *概要:プレイヤー1人とコンピューター2人でじゃんけんを行う
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//じゃんけんの手の種類を定数化
		final int HAND_CATEGORY = 3;
		//じゃんけんの手を読み込んで代入
		int selectHand = inputSelectionNumber("0...グー/1...チョキ/2...パー:", HAND_CATEGORY);
		//プレイヤーの手を引数にしたインスタンスを生成
		HumanPlayer humanHand = new HumanPlayer(selectHand);
		//ランダムな手が生成されたコンピューター1のインスタンスを生成
		ComputerPlayer firstComputer = new ComputerPlayer();
		//ランダムな手が生成されたコンピューター2のインスタンスを生成
		ComputerPlayer secodnComputer = new ComputerPlayer();
		//プレイヤーの手を表示
		humanHand.printHand();
		//コンピュータ1の手を表示
		firstComputer.printHand();
		//コンピュータ2の手を表示
		secodnComputer.printHand();
		//あいこの場合実行
		if (humanHand.getHumanHand() == firstComputer.ComputerHand()
				&& firstComputer.ComputerHand() == secodnComputer.ComputerHand() ||
				humanHand.getHumanHand() != firstComputer.ComputerHand() &&
						firstComputer.ComputerHand() != secodnComputer.ComputerHand() &&
						secodnComputer.ComputerHand() != humanHand.getHumanHand()) {
			//あいこであることを表示
			System.out.println("あいこです。");
			//あいこでない場合
		} else {
			//プレイヤーが勝利した場合trueを代入
			boolean humanWin = isWinner(humanHand.getHumanHand(), firstComputer.ComputerHand())
					|| isWinner(humanHand.getHumanHand(), secodnComputer.ComputerHand());
			//コンピューター1が勝利した場合trueを代入
			boolean firstComputerWin = isWinner(firstComputer.ComputerHand(), humanHand.getHumanHand())
					|| isWinner(firstComputer.ComputerHand(), secodnComputer.ComputerHand());
			//コンピューター2が勝利した場合trueを代入
			boolean secondComputerWin = isWinner(secodnComputer.ComputerHand(), humanHand.getHumanHand())
					|| isWinner(secodnComputer.ComputerHand(), firstComputer.ComputerHand());
			//プレイヤーとコンピューター1の勝ちの場合
			if (humanWin && firstComputerWin && !secondComputerWin) {
				//プレイヤーとコンピューター1の勝ちであることを表示
				System.out.println("プレイヤーとコンピューター1の勝ちです!!");
				//プレイヤーとコンピューター2の勝ちである場合
			} else if (humanWin && secondComputerWin && !firstComputerWin) {
				//プレイヤーとコンピューター2の勝ちであることを表示
				System.out.println("プレイヤーとコンピューター2の勝ちです!!");
				//コンピューター1とコンピューター2の勝ちである場合
			} else if (firstComputerWin && secondComputerWin && !humanWin) {
				//コンピューター1とコンピューター2の勝ちであることを表示
				System.out.println("コンピューター1とコンピューター2の勝ちです!!");
				//プレイヤーだけが勝利の場合
			} else if (humanWin && !firstComputerWin && !secondComputerWin) {
				//プレイヤーの勝ちであることを表示
				System.out.println("プレイヤーだけの勝ちです!!");
			} //コンピューター1だけの勝ちである場合実行
			else if (firstComputerWin && !humanWin && !secondComputerWin) {
				//コンピューター1の勝ちであることを表示
				System.out.println("コンピューター1だけの勝ちです!!");
				//コンピューター2だけの勝ちである場合実行
			} else if (secondComputerWin && !humanWin && !firstComputerWin) {
				//コンピューター2の勝ちであることを表示
				System.out.println("コンピューター2だけの勝ちです!!");
			}
		}
	}
}
