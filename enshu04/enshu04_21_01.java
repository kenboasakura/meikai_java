package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_21_01
 *概要:左上が直角三角形になるように*を表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/12
 */
public class enshu04_21_01 {

	/*関数名:main
	 *概要:左上が直角三角形になるように*を表示するテキスト
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
		
		//三角形の高さを入力された整数分の高さにする
		for (int i = 1; i <= integerNumber; i++) {
			//入力された整数分の*を改行するごとに1つずつ減らして表示
			for (int j = i ;j <= integerNumber; j++) {
			//*を出力
			System.out.print('*');
			}
			//改行して表示
			System.out.println();
			
		}
		
	}

}
