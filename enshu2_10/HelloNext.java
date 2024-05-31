package enshu2_10;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:HelloNext
 *概要:性と名と個別に打ちこんだものを読み込むテキスト
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
public class HelloNext {

	/*関数名:main
	 *概要:性と名と個別に打ちこんだものを読み込むテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);
		
		//性に入力を促す
		System.out.print("性:");
		//文字列を読み込む
		String firstName = standardInput.next();  
		
		//名に入力を促す
		System.out.print("名:");
		//文字列を読み込む
		String secondName = standardInput.next(); 
		
		//名前を表示
		System.out.println("こんにちは"+firstName+secondName+"さん。");
		
		
		
	}

}
