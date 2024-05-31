package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_09
*概要:大きいほうの値を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_09 {

	/*関数名:main
	 *概要:大きいほうの値を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//実数の入力を促す
		System.out.print("a:"); 
		//実数値を読み込む
		double firstNumber = standardInput.nextDouble(); 
		//実数の入力を促す
		System.out.print("b:"); 
		//実数値を読み込む
		double secondNumber = standardInput.nextDouble();  
		
		
		//大きい方の値を読み込む
		double bigNumber = firstNumber>secondNumber ? firstNumber:secondNumber;   
		//大きいほうの値を表示
		System.out.println("大きいほうの値は"+bigNumber+"です。");
		

	}

}
