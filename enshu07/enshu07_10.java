package enshu07;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_10
 *概要:3桁のランダムな整数3つを代入した加算と減算を含む4つの問題をランダムに出題させる
 *作成者:K.Asakura
 *作成日:2024/04/24
 */
public class enshu07_10 {

	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	//クラス全体にRandomクラスを設定
	static Random RandomNumber = new Random();

	//問題で使う1つめの数字に代入するための変数を初期化して宣言////////////
	static int firstVariable = 0;
	//問題で使う2つめの数字に代入するための変数を初期化して宣言////////////
	static int secondVariable = 0;
	//問題で使う3つめの数字に代入するための変数を初期化して宣言////////////
	static int thirdVariable = 0;

	/*関数名:confirmRetry
	 *概要:続行の確認を行うメソッド
	 *引数:なし
	 *戻り値:trueもしくはfalse/////////
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	static boolean confirmRetry() {
		//もう一度行うか確認するための変数を初期化して宣言
		int continueNumber = 0;
		//0か1の整数を入力させる処理
		do {
			//0か1の整数の入力を促す
			System.out.print("もう一度？<Yes...1/No...0>");
			//整数を読み込む
			continueNumber = standardInput.nextInt();
			//0か1以外の整数が入力された場合実行
			if (continueNumber != 1 && continueNumber != 0) {
				//0か1の整数の入力を促す
				System.out.println("正しい整数を入力してください");
			}
			//0か1の整数を入力するまでループ
		} while (continueNumber != 0 && continueNumber != 1);
		//入力された整数が1であれば返却
		return continueNumber == 1;
	}

	/*関数名:randomQuestion
	 *概要:0から3の範囲の乱数を生成するメソッド
	 *引数:なし
	 *戻り値:0から3の範囲の乱数
	 *作成者:K.Asakura
	 *作成日:2024/04/25
	 */
	static int randomQuestion() {
		//問題をランダムに出題するための範囲4を定数化
		final int RANDOM_FOUR = 4;

		//0から3の乱数を代入
		int questionNumber = RandomNumber.nextInt(RANDOM_FOUR);

		return questionNumber;

	}

	/*関数名:main
	 *概要:3桁のランダムな整数3つを代入した加算と減算を含む4つの問題をランダムに出題させる
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	public static void main(String[] args) {

		//ランダムに出題する計算式に用いる乱数の範囲900を定数化
		final int RANDOM_RENGE = 900;
		//ランダムに出題する計算式に用いる乱数の範囲の調整のため100を定数化
		final int THREE_DIGITS = 100;

		//暗算力トレーニングと表示
		System.out.println("暗算力トレーニング!!");
		//暗算力トレーニングが完全に終了するまで実行
		do {
			//1つめの変数に100から999の範囲の乱数を代入
			firstVariable = RandomNumber.nextInt(RANDOM_RENGE) + THREE_DIGITS;
			//2つめの変数に100から999の範囲の乱数を代入
			secondVariable = RandomNumber.nextInt(RANDOM_RENGE) + THREE_DIGITS;
			//3つめの変数に100から999の範囲の乱数を代入
			thirdVariable = RandomNumber.nextInt(RANDOM_RENGE) + THREE_DIGITS;

			//出題する問題の配列を生成
			String[] mentalArithmeticQuestion = {
					"(" + firstVariable + "+" + secondVariable + "+" + thirdVariable + ")=",
					"(" + firstVariable + "+" + secondVariable + "-" + thirdVariable + ")=",
					"(" + firstVariable + "-" + secondVariable + "+" + thirdVariable + ")=",
					"(" + firstVariable + "-" + secondVariable + "-" + thirdVariable + ")="
			};

			//出題する問題の解答にあたる配列を生成
			int[] mentalArithmeticAnswer = {
					(firstVariable + secondVariable + thirdVariable), (firstVariable + secondVariable - thirdVariable),
					(firstVariable - secondVariable + thirdVariable), (firstVariable - secondVariable - thirdVariable)
			};
			//各配列のインデックスに関数から返却された乱数を代入
			int questionValue = randomQuestion();

			//暗算に正解するまで問題を繰り返し表示
			while (true) {
				//生成された配列のインデックスとその乱数に対応する問題を出題
				System.out.print(mentalArithmeticQuestion[questionValue]);
				//暗算の解答を読み込む
				int inputNumber = standardInput.nextInt();
				//読み込んだ整数が解答と一致していた場合実行
				if (inputNumber == mentalArithmeticAnswer[questionValue]) {
					//暗算力トレーニングを終了
					break;
				}
				//解答が違うことを表示
				System.out.println("違いますよ!!");

			}
			//関数から受け取った数値が1であるならばループ
		} while (confirmRetry());

	}

}