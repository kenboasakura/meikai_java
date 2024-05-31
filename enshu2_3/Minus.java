package enshu2_3;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:Minus
 *概要: キーボードに出力した整数値とその整数値を反復させるプログラム
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
public class Minus {
	
	/*関数名:main
	*概要:キーボードに出力した整数値とその整数値を反復させるプログラム
	*引数:なし
	*戻り値:なし
	*作成者:K.Asakura
	*作成日:2024/04/4
	*/
	public static void main(String[] args) {
		//Scannerクラスをに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//キーボードに整数の入力を促す
		System.out.print("整数値:");
		//キーボードから入力された整数を読み込む
		int muximunNumber = standardInput.nextInt();  
			
		//読み込んだ整数値を表示させるプログラム
		System.out.println(+muximunNumber+"と入力しましたね？");
		}
		
		
		
	}

