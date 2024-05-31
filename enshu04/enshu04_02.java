package enshu04;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu04_02
* 概要:２桁の整数を当てさせるテキスト
*作成者:K.Asakura
*作成日:2024/04/08
*/
public class enshu04_02 {

	/*関数名:main
	 *概要:２桁の整数を当てさせるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/08
	 */
	public static void main(String[] args) {

		//Randomクラスの設定
		Random randomNumber = new Random();
		//Scannerクラスの設定
		Scanner standardInput = new Scanner(System.in);
		//final変数の宣言
		final int RANDOM_TWODIGITS = 90;

		//10から99の乱数を生成
		int answerdNumber = randomNumber.nextInt(RANDOM_TWODIGITS) + 10;

		//文字列を表示
		System.out.println("数当てゲーム開始！");
		//文字列を表示
		System.out.println("10～99までの数を当ててください");

		//最小値を定義するために定数を宣言
		final int MINIMUM_NUMBER = 10;
		//最大値を定義するために定数を宣言
		final int MUXIMUM_NUMBER = 99;

		//変数を初期化して設定
		int integerNumber = 0;

		do {
			//文字列を表示
			System.out.print("いくつかな:");
			//入力した数の読み込み
			integerNumber = standardInput.nextInt();
			//10未満99より大きければ実行
			if (integerNumber < MINIMUM_NUMBER || integerNumber > MUXIMUM_NUMBER) {
				//文字列を表示
				System.out.println("２桁の整数を入力してください");

				//当てるべき整数より高ければ実行
			} else if (integerNumber > answerdNumber) {
				//文字列を表示
				System.out.println("もっと小さな数だよ");
				//当てるべき整数より低ければ実行
			} else if (integerNumber < answerdNumber) {
				//文字列を表示
				System.out.println("もっと大さな数だよ");
			}
			//当てるべき整数と同じでないならループ
		} while (integerNumber != answerdNumber);
		//文字列を表示
		System.out.println("正解です。");

	}
}
