package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_06
 *概要:入力された整数の月の季節を表示
 *作成者:K.Asakura
 *作成日:2024/04/24
 */
public class enshu07_06 {

	/*関数名:printSeason
	 *概要:入力された整数に対応する季節を表示するメソッド
	 *引数:入力された月の数/////
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	static void printSeason(int m) {

		//1月の数を定義するためにfinal変数を宣言
		final int JANUARY_MONTH = 1;
		//2月の数を定義するためにfinal変数を宣言
		final int FEBRUARY_MONTH = 2;
		//3月の数を定義するためにfinal変数を宣言
		final int MARCH_MONTH = 3;
		//4月の数を定義するためにfinal変数を宣言
		final int APRIL_MONTH = 4;
		//5月の数を定義するためにfinal変数を宣言
		final int MAY_MONTH = 5;
		//6月の数を定義するためにfinal変数を宣言
		final int JUNE_MONTH = 6;
		//7月の数を定義するためにfinal変数を宣言
		final int JULY_MONTH = 7;
		//8月の数を定義するためにfinal変数を宣言
		final int AUGUST_MONTH = 8;
		//9月の数を定義するためにfinal変数を宣言
		final int SEPTEMBER_MONTH = 9;
		//10月の数を定義するためにfinal変数を宣言
		final int OCTOBER_MONTH = 10;
		//11月の数を定義するためにfinal変数を宣言
		final int NOVEMBER_MONTH = 11;
		//12月の数を定義するためにfinal変数を宣言
		final int DECEMBER_MONTH = 12;

		//入力された整数が3から5であれば実行
		if (m == MARCH_MONTH || m == APRIL_MONTH || m == APRIL_MONTH) {
			//春ですと表示
			System.out.println("春です。");
			//入力された整数が6から8であれば実行
		} else if (m == JUNE_MONTH || m == JULY_MONTH || m == AUGUST_MONTH) {
			//夏ですと表示
			System.out.println("夏です。");
			//入力された整数が9から11であれば実行
		} else if (m == SEPTEMBER_MONTH || m == OCTOBER_MONTH || m == NOVEMBER_MONTH) {
			//秋ですと表示
			System.out.println("秋です。");
			//入力された整数が12.1.2であれば実行
		} else {
			//冬ですと表示
			System.out.println("冬です。");
		}
	}

	/*関数名:main
	 *概要:入力された整数の月の季節を関数を用いて表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//入力させる整数の上限12を定数化
		final int MUXIMUM_NUMBER =12;
		//入力させる整数の下限限1を定数化
		final int MINIMUM_NUMBER =1;

		//整数を読みこむために変数を初期化して宣言
		int inputNumber = 0;
		//1から12の整数が入力されるまで実行
		do {
			//月の数の入力を促す////
			System.out.print("整数:");
			//整数を読み込む
			inputNumber = standardInput.nextInt();
			//1から12以外の整数が入力された場合実行
			if (inputNumber < MINIMUM_NUMBER || inputNumber > MUXIMUM_NUMBER) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//1から12以外の整数が入力された場合ループ
		} while (inputNumber < MINIMUM_NUMBER || inputNumber > MUXIMUM_NUMBER);

		//「入力された整数」月の季節はと表示
		System.out.print(inputNumber + "月の季節は");
		//入力された月に対応する季節を表示
		printSeason(inputNumber);
	}

}
