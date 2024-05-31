package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_20
 *概要:入力した整数分の段数の正方形を作成するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/12
 */

public class enshu04_20 {

	/*関数名:main
	 *概要:入力した整数分の段数の正方形を作成するテキスト
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

		//正方形を表示しますと表示
		System.out.println("n段の正方形を表示します。");

		//正の整数を入力するまで実行
		do {
			//正の整数の入力を促す
			System.out.print("n:");
			//整数を読み込む
			integerNumber = standardInput.nextInt();
			//の整数でなければ実行
			if (integerNumber <= 0) {
				//正しい数を入力するよう促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (integerNumber <= 0);

		//iを1から初めて入力された数になるまでiをインクリメント
		for (int i = 1; i <= integerNumber; i++) {
			//jを1から初めて入力された数になるまでjをインクリメント
			for (int j = 1; j <= integerNumber; j++) {
				//*を出力
				System.out.print('＊');
			}
			//正方形を表示
			System.out.println();
		}
	}

}
