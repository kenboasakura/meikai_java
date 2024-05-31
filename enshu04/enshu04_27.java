package enshu04;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_27
*概要:数当てゲームに回数制限をもたせたテキスト
*作成者:K.Asakura
*作成日:2024/04/15
*/
public class enshu04_27 {

	/*関数名:main
	 *概要:数当てゲームに回数制限をもたせたテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/15
	 */
	public static void main(String[] args) {
		//Randomクラスの設定
		Random randomNumber = new Random();
		//Scannerクラスの設定
		Scanner standardInput = new Scanner(System.in);
		//final変数の宣言
		final int RANDOM_TWODIGITS = 100;

		//10から99の乱数を生成////////
		int answerdNumber = randomNumber.nextInt(RANDOM_TWODIGITS);

		//文字列を表示
		System.out.println("数当てゲーム開始！");
		//文字列を表示
		System.out.println("0～99までの数を当ててください");

		//最小値を定義するために定数を宣言
		final int MINIMUM_NUMBER = 0;
		//最大値を定義するために定数を宣言
		final int MUXIMUM_NUMBER = 99;//////////

		final int LIMIT_NUMBER = 10;

		//変数を初期化して設定
		int integerNumber = 0;
		//入力した回数をカウントするために変数を初期化して宣言
		int countNumber = 0;
		//入力回数を５回に制限して数当てゲームを実行
		Outer: for (int i = 1; i <= LIMIT_NUMBER; i++) {
			//2桁の整数を入力するまで実行
			do {
				//文字列を表示
				System.out.print("いくつかな？:");
				//整数を読み込む
				integerNumber = standardInput.nextInt();
				//正の整数以外が入力された場合実行
				if (MINIMUM_NUMBER > integerNumber || MUXIMUM_NUMBER < integerNumber) {
					//正の整数の入力を促す文字列を表示
					System.out.println("正しい値を入力してください");
				}
				//2桁の正の整数以外が入力された場合ループ
			} while (MINIMUM_NUMBER > integerNumber || MUXIMUM_NUMBER < integerNumber);
			//正解と一致なら実行
			if (integerNumber == answerdNumber) {
				//文字列を表示
				System.out.println("正解です。");
				//数当てゲームを終了
				break Outer;
			}
			//当てるべき整数より入力した整数が大きければ実行
			else if (integerNumber > answerdNumber) {

				//文字列を表示
				System.out.println("もっと小さな数だよ");
				//数当てゲームを続行
				continue Outer;
			}
			//当てるべき整数より入力した整数が小さければ実行
			else if (integerNumber < answerdNumber) {
				//文字列を表示
				System.out.println("もっと大さな数だよ");
				//数当てゲームを続行
				continue Outer;
			}

		}//
		if (integerNumber != answerdNumber) {
			//文字列を表示
			System.out.println("正解は" + answerdNumber + "です。");
		}
	}
}
