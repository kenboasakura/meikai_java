package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_23
*概要:入力した整数分の段数数字ピラミッドを表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/12
*/
public class enshu04_23 {

	/*関数名:main
	 *概要:入力した整数分の段数数字ピラミッドを表示するテキスト
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
		
		//ピラミッドの公式の数を定数化
		final int OFFICIAL_FIRST = 1;
		//ピラミッドの公式の数を定数化
		final int OFFICIAL_SECOND = 2;
		
		//ピラミッドの形になるよう高さを整数分表す
		for(int i = 1; i <= integerNumber; i++) {
			
			//ピラミッド型になるよう空白を出力
			for(int k = i; k <=integerNumber-OFFICIAL_FIRST ; k++) {/////////
				//空白を出力
				System.out.print(" ");	
			}
			//ピラミッドの横をインクリメントした変数分その数で表す
			for(int j = 1; j<=i*OFFICIAL_SECOND-OFFICIAL_FIRST ; j++) {//////////
				//数字を出力///////
				System.out.print(+i);
			}
			
			//数字を改行して出力
			System.out.println();
			
			
		}

	}
}