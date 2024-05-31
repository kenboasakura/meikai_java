package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu0419
 *概要:入力された月の季節とそれ以外の整数が入力されたときに再入力を促すテキスト
 *作成者:K.Asakura
 *作成日:2024/04/11
 */
public class enshu0419 {

	/*関数名:main
	 *概要:入力された月の季節とそれ以外の整数が入力されたときに再入力を促すテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/11
	 */
	public static void main(String[] args) {

		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//もう一度プログラムを実行するための変数を初期化して宣言
		int retryNumber = 0;
		//月を入力するための変数を初期化して宣言
		int monthNumber = 0;

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

		//季節を表示させるプログラムが終了するまで実行
		do {
			//1から12までの正の整数を入力するまで実行
			do {
				//整数の入力を促す
				System.out.print("季節を求めます。\n何月ですか:");
				//整数値を読み込む*monthは教科書準拠
				monthNumber = standardInput.nextInt();
				//入力した値が0以下か13以上であれば実行
				if (monthNumber <= 0 || monthNumber >= 13) {
					//正しい値を入力するよう促す	
					System.out.println("正しい数値を入力してください");
				}
				//0以下か以上であればループ
			} while (monthNumber <= 0 || monthNumber >= 13);

			//入力した月の季節を表示
			switch (monthNumber) {

			//3月の場合実行
			case MARCH_MONTH:
				//4月の場合実行
			case APRIL_MONTH:
				//5月の場合実行：春と表示
			case MAY_MONTH:
				System.out.println("それは春です。");
				//抜け出す
				break;
			//6月の場合実行
			case JUNE_MONTH:
				//7月の場合実行
			case JULY_MONTH:
				//8月の場合実行：夏と表示
			case AUGUST_MONTH:
				System.out.println("それは夏です。");
				//抜け出す
				break;
			//9月の場合実行
			case SEPTEMBER_MONTH:
				//10月の場合実行
			case OCTOBER_MONTH:
				//11月の場合実行：秋と表示
			case NOVEMBER_MONTH:
				System.out.println("それは秋です。");
				//抜け出す
				break;
			case DECEMBER_MONTH:
				//1月の場合実行
			case JANUARY_MONTH:
				//2月の場合実行:冬と表示
			case FEBRUARY_MONTH:
				System.out.println("それは冬です。");
				//抜け出す
				break;
			}
			//もう一度入力する場面で0か1がが入力されるまで実行
			do {
				//もう一度入力させるか確認するため整数の入力を促す
				System.out.print("もう一度？ 1..Yes/0..No :");
				//整数を読み込む
				retryNumber = standardInput.nextInt();
				//0か1と入力するよう促す
				if (retryNumber < 0 || retryNumber > 1) {
					//正しい値を入力するよう促す	
					System.out.println("正しい数値を入力してください");
				}
				//0か1でなければループ
			} while (retryNumber < 0 || retryNumber > 1);

			//入力した値が1ならループ  
		} while (retryNumber == 1);

	}

}
