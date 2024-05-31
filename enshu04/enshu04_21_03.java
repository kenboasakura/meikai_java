package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_21_03
*概要:右上が直角三角形になるように*を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/12
*/
public class enshu04_21_03 {

	/*関数名:main
	 *概要:右上が直角三角形になるように*を表示するテキスト
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
		//三角形の高さを表示
		for (int i = 1; i <= integerNumber; i++) {
			//右上に直角を生成するため、空白を1行ずつ増やして生成
			for (int j = 1; j <= i-1; j++) {
				//空白を出力
				System.out.print(' ');
			}
			//三角形の横を作るために*を1行につき1つずつ減らして生成
			for (int k = i; k <= integerNumber; k++) {
				//*を出力
				System.out.print('*');
			}
			
			//上記のプログラムを改行して表示
			System.out.println();

		}
	}
}
