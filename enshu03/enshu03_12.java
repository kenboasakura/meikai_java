package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_12
*概要:3つの整数値の最小値を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_12{
	
	/*関数名:main
	 *概要:3つの整数値の最小値を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//整数の入力を促す
		System.out.print("整数A:");   
		//整数を読み込む
		int firstNumber = standardInput.nextInt();   
		//整数の入力を促す
		System.out.print("整数B:");   
		//整数を読み込む
		int secondNumber = standardInput.nextInt(); 
		//整数の入力を促す
		System.out.print("整数C:");   
		//整数を読み込む
		int thirdNumber = standardInput.nextInt();   
		
		//trueであれば代入
		int smallestNumber = firstNumber;  
		//secondNumber < smallestNumberがtrueであれば代入
		if ( secondNumber < smallestNumber ) { smallestNumber = secondNumber;   
		}
		//thirdNumber < smallestNumbetrueであれば代入
		if ( thirdNumber < smallestNumber ) {smallestNumber = thirdNumber;   
		
		}
		//文字列を表示
		System.out.println(smallestNumber);    

	}		
}
