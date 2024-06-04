package enshu15;
//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:enshu15_07
 *概要:コマンドライン引数の数値の合計を表示
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class enshu15_07 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:main
	 *概要:コマンドライン引数の数値の合計を表示
	 *引数:入力した実数(String型の配列)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//合計値を算出するための変数を初期化して宣言
		double totalValue = 0;
		//入力した実数の合計を求めて表示
		for(String argsValue :args) {
			//実数の合計値を代入
			totalValue += Double.parseDouble(argsValue);
		}
		//合計値を表示
		System.out.println("合計値は"+totalValue+"です。");
		
	}

}
