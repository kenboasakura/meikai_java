package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_10
*概要:整数値の差を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_10 {
	
	/*関数名:main
	 *概要:整数値の差を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//整数の入力を促す
		System.out.print("整数a:");   
		//整数値を読み込む
		int firstNumber = standardInput.nextInt();   
		//整数の入力を促す
		System.out.print("整数b:");   
		//整数値を読み込む
		int secondNumber = standardInput.nextInt();   
		
		//整数値の差を判別
		int differenceNumber = firstNumber>secondNumber ? firstNumber-secondNumber:secondNumber-firstNumber;    
		
		//文字列を表示
	    System.out.println("整数値の差は"+differenceNumber+"です。");
	    
	}
}
