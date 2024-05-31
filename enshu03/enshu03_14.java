package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_14
*概要:読み込んだ整数の小さいほうと大きい方を判別するするテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_14 {
	
	/*関数名:main
	 *概要:読み込んだ整数の小さいほうと大きい方を判別するするテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//整数の入力を促す*aは教科書準拠
		System.out.print("変数a:");   
		//整数を読み込む
		int a = standardInput.nextInt();   
		//整数の入力を促す*bは教科書準拠
		System.out.print("変数b:"); 
		//整数を読み込む
		int b = standardInput.nextInt();   
		
		//大きい数を判別するため変数を初期化して設定
		int bigNumber = 0;
		//小さい数を判別するため変数を初期化して設定
		int smallNumber = 0;
		
		//aよりbが大きければれば実行
		if (a<b) {
			//smallNumberにaを代入
			smallNumber = a;
			//bigNumberにbを代入
			bigNumber = b;
		//aよりbが小さければ実行
		} else {
			//smallNumberにbを代入
			smallNumber = b;
			//bugNumberにaを代入
			bigNumber = a;
		}
		//二つの値が同じなら実行
		if(bigNumber==smallNumber) {
			//文字列を表示
			System.out.println("二つの値は同じです。");
		}

		//文字列を表示
		System.out.println("小さいほうは"+smallNumber+"です。");
		//文字列を表示
		System.out.println("大きいほうは"+bigNumber+"です。");
			
		
		
		
		
		
 		
		}
		
	}