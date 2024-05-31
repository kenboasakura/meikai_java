package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_15
*概要:読み込んだ整数を大きい順に表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_15 {
	
	/*関数名:main
	 *概要:読み込んだ整数を大きい順に表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//整数の入力を促す
		System.out.print("変数A:");   
		//整数を読み込むs
		int firstNumber = standardInput.nextInt();   
		//整数の入力を促す
		System.out.print("変数B:");   
		//整数を読み込む
		int secondNumber = standardInput.nextInt();  
		
		
		//firstNumber < secondNumberであれば実行
		if (firstNumber < secondNumber){
		
			//firstNumberをassignmentValueに保存
			int assignmentValue = firstNumber;   
			//secondNumberをfirstNumberに代入
			firstNumber = secondNumber;
			//assignmentValueに保存していた最初の値をsecondNumberに代入
			secondNumber = assignmentValue; 
		
		}
		
		
		//文字列を表示
		System.out.println("A>Bとなるようにソートしました。");
		//文字列を表示
		System.out.println("大きいほうは"+firstNumber+"です。");
		//文字列を表示
		System.out.println("小さいほうは"+secondNumber+"です。");  
		
		}
		
	}