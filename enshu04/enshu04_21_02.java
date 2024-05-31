package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_21_02
*概要:右下が直角三角形になるように*を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/12
*/
public class enshu04_21_02 {

	/*関数名:main
	 *概要:右下が直角三角形になるように*を表示するテキスト
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

		//三角形の高さを整数分改行して*を表示
		for (int i = 1; i <= integerNumber; i++) {
			//右下に直角を作るためにその分の空白を生成
			for (int j = 1; j <= integerNumber - i; j++) {
				//空白を出力
				System.out.print(" ");
			}
			//三角形の横を*を一つずつ増やして表現
			for (int k = 1; k <= i; k++) {
				//*を出力
				System.out.print('*');
			}
			//改行して表示
			System.out.println();
		}
		
	}

}
