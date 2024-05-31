package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_13
*概要:読み込んだ３つの整数の中央値を判別するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_13 {
	
	/*関数名:main
	 *概要:読み込んだ３つの整数の中央値を判別するテキスト
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
		
		//firstNumberが中央値であれば代入
		int centerNumber = firstNumber; 
		//firstNumber>=secondNumber>=thirdNumberまたはthirdNmber>=secondNumber>=firstNumberであればsecondNumberを代入
		if ((firstNumber >= secondNumber) && (secondNumber >= thirdNumber) || (thirdNumber >= secondNumber) && (secondNumber >= firstNumber)) { centerNumber = secondNumber;
		}
		//furstNumber>=thirdNumber>=secondNumberまたはsecondNumber>=thirdNumber>=furstNumberであればthirdNumberを代入
		if ((firstNumber >= thirdNumber) && (thirdNumber >= secondNumber) || (secondNumber >= thirdNumber) && (thirdNumber >= firstNumber)) { centerNumber = thirdNumber;
		}
		
		//文字列を表示
		System.out.println(centerNumber);    
		
		
		 
		

	}

}
