package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_04
*概要:aとbの大小を判別するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
class enshu03_04  {

	/*関数名:main
	 *概要:aとbの大小を判別するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//整数の入力を促す*aは教科書準拠
		System.out.print("整数a:");  
		//整数を読み込む
		int a= standardInput.nextInt();   
		//整数の入力を促す*bは教科書準拠
		System.out.print("整数b:");  
		//整数を読み込む
		int b= standardInput.nextInt(); 
		
		
		//a>bがtrueなら表示
		if(a>b) {
			//文字列を表示	
			System.out.println("aのほうが大きいです。");	
		//a<bがtrueなら表示
		} else if(a<b) {
			//文字列を表示
			System.out.println("bのほうが大きいです。");
		//a>b.a<bがfalseなら表示
		} else {
			//文字列を表示
			System.out.println("aとbは等しいです。");
		}
		
		
		
	}
	
}