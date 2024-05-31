package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_11
*概要:読み込んだ整数値が１０以下か１１以上か判別するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_11 {
	
	/*関数名:main
	 *概要:読み込んだ整数値が１０以下か１１以上か判別するテキスト
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
		
		//firstNumber > secondNumberならば条件演算子の左の式を代入、でなければ右の式を代入
		int differenceNumber = firstNumber > secondNumber ? (firstNumber-secondNumber):(secondNumber-firstNumber);
		
		//differenceNumberが１０より大きければ代入
		if(differenceNumber>10) {
			//文字列を表示
			System.out.println("それらの差は１１以上です。");
		//differenceNumberが１０より小さければ代入
		} else {
			//文字列を表示
			System.out.println("それらの差は１０以下です。");
		}
				

	}

}