package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_08
 *概要:正の整数値を読み込んでその桁数を表示させるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/10
 */

public class enshu04_08 {
	
	/*関数名:main
	 *概要:正の整数値を読み込んでその桁数を表示させるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);
		
		//桁数を求めます。と文字列を表示
		System.out.println("その正の整数の桁数を求めます。");
		
		//変数を初期化して設定
		int integralVariable = 0;
		
		//whileの間実行
		do {
			//正の整数の入力を促す
			System.out.print("正の整数を入力してください:");
			//正の整数値を読み込む
			integralVariable = standardInput.nextInt();
		//正の整数でなければループ
		}while(integralVariable<=0);
		

		//変数を初期化して設定
		int divideNUmber = 0;
		//割る数を定義するためにfinal変数を設定
		final int CONSTANT_NUMBER = 10;
		
		//whileの限り実行
		do {
			//入力した整数を10で割る
			integralVariable /= CONSTANT_NUMBER;
			//桁数をインクリメント
			divideNUmber++;
		//整数が0より大きければループ
		}while(integralVariable>0);
		
		
		
		//整数の桁数はと表示
		System.out.print("整数の桁数は"+divideNUmber+"桁です。");
	}

}
