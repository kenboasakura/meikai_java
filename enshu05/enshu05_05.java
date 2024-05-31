package enshu05;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu05_05
*概要:3つの整数値を読み込んで合計と平均を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/15
*/
public class enshu05_05 {

	/*関数名:main
	 *概要:3つの整数値を読み込んで合計と平均を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/15
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//xに代入するための変数を初期化して宣言
		int firstNumber = 0;
		//yに代入するための変数を初期化して宣言
		int secondNumber = 0;
		//zに代入するための変数を初期化して宣言
		int thirdNumber = 0;

		//正の整数を入力するまで実行
		do {
			//正の整数の入力を促す
			System.out.print("整数x:");
			//整数を読み込む
			firstNumber = standardInput.nextInt();
			//の整数でなければ実行
			if (firstNumber <= 0) {
				//正しい数を入力するよう促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (firstNumber <= 0);

		//正の整数を入力するまで実行
		do {
			//正の整数の入力を促す
			System.out.print("整数y:");
			//整数を読み込む
			secondNumber = standardInput.nextInt();
			//の整数でなければ実行
			if (secondNumber <= 0) {
				//正しい数を入力するよう促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (secondNumber <= 0);

		//正の整数を入力するまで実行
		do {
			//正の整数の入力を促す
			System.out.print("整数z:");
			//整数を読み込む
			thirdNumber = standardInput.nextInt();
			//の整数でなければ実行
			if (thirdNumber <= 0) {
				//正しい数を入力するよう促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (thirdNumber <= 0);
		
		//平均を求めるための定数をfinalintで宣言
		final int AVERAGE_NUMBER = 3;
		
		//平均値を読み込む
		double averageValue = (double)(firstNumber+secondNumber+thirdNumber)/AVERAGE_NUMBER;
		
		//合計値を表示
		System.out.println("合計値は"+(firstNumber+secondNumber+thirdNumber)+"です。");
		//平均値を表示
		System.out.println("平均値は"+averageValue+"です。");

	}

}