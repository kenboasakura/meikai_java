package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_22
*概要:ピラミッドの形になるように*を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/12
*/
public class enshu04_22 {

	/*関数名:main
	 *概要:ピラミッドの形になるように*を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/12
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//整数を入力するための変数を初期化して宣言
		int integerNumber = 0;

		//正の整数を入力するまで実行
		do {
			//正の整数の入力を促す
			System.out.print("段数は:");
			//整数を読み込む
			integerNumber = standardInput.nextInt();
			//の整数でなければ実行
			if (integerNumber <= 0) {
				//正しい数を入力するよう促す
				System.out.println("正しい値を入力してください");
			}

			//正の整数でなければループ
		} while (integerNumber <= 0);

		final int OFICIAL_FIRST = 1;

		final int OFICIAL_SECOND = 2;
		//ピラミッドの形になるよう*を高さとして整数分表して表示
		for (int i = 1; i <= integerNumber; i++) {

			//ピラミッド型になるよう空白を出力
			for (int k = i; k <= integerNumber - OFICIAL_FIRST; k++) {
				//空白を出力
				System.out.print(" ");
			}
			//ピラミッドの横を*を整数分で表す
			for (int j = 1; j <= (i - OFICIAL_FIRST) * OFICIAL_SECOND + OFICIAL_FIRST; j++) {
				//*を出力
				System.out.print('*');
			}

			//*を改行して出力
			System.out.println();

		}

	}
}