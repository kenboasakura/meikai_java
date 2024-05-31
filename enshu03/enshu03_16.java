package enshu03;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_16
*概要:読み込んだ3つの整数を小さい順に表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_16 {

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
		//整数を表示
		int firstNumber = standardInput.nextInt();   
		//整数の入力を促す
		System.out.print("変数B:");   
		//整数を表示
		int secondNumber = standardInput.nextInt(); 
		//整数の入力を促す
		System.out.print("変数C:");   
		//整数を表示
		int thirdNumber = standardInput.nextInt(); 
		
		//キーボードで入力した変数Aが変数Bより大きければ実行
		if(firstNumber>secondNumber){
			
			//firstNumberをsortNumberに保存
			int sortNumber = firstNumber;   
			//sesondNumberをfirstNumberに代入
			firstNumber = secondNumber;
			//最初に保存しておいたfirstNumberをsecondNumberに代入
			secondNumber = sortNumber;
		}
		//secondNumberがthirdNumberより大きければ実行
		if (secondNumber>thirdNumber) {
			
			//secondNumberをsortNumberに保存
			int sortNumber = secondNumber;
			//thirdNumberをsecondNumberに代入
			secondNumber = thirdNumber;
			//最初に保存しておいたsesondNumberにthirdNumberを代入
			thirdNumber = sortNumber;
		}
			
		//firstNumberがsecondNumberより大きければ実行
		if(firstNumber>secondNumber){
		
			//thirdNumberをsortNumberに保存
			int sortNumber = firstNumber;   
			//secondNumberをfirstNumberに代入
			firstNumber = secondNumber;
			//最初に保存しておいたfirstNumberにsecondNumberを代入
			secondNumber = sortNumber;
		
		}
		
		
		//文字列を表示
		System.out.println("A<B<Cとなるようにソートしました。");
		//文字列を表示
		System.out.println(+firstNumber+"<"+secondNumber+"<"+thirdNumber+"です。");


		
		
		}
	}
	


