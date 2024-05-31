package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_02
*概要:BはAの約数であるか判別するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_02 {

	/*関数名:main
	 *概要:BはAの約数であるか判別するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput= new Scanner(System.in);
		
		//整数Aの入力を促す
		System.out.print("整数A:");  
		//整数を読み込む
		int firstNumber= standardInput.nextInt();
		//整数Bの入力を促す
		System.out.print("整数B:");  
		//整数を読み込む
		int secondNumber= standardInput.nextInt();
			
			//０より大きければ実行
			if(firstNumber> 0 ||secondNumber > 0 ) {
		
				//B%A==0がtrueなら表示
				if(firstNumber%secondNumber==0) {
					//文字列を表示
					System.out.println("BはAの約数です。");
				//B%A==0がfalseなら表示
				} else if(firstNumber%secondNumber!=0){
				//文字列を表示
				System.out.println("BはAの約数ではありません。");
				}
			//読み込んだ整数値正しくないときに実行
			}else {
			//文字列を表示
			System.out.print("正しくない値が入力されました。");
		}
		
		
	
		


	}

}