package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_06
*概要:その整数値が10の倍数か判別するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_06 {
	
	/*関数名:main
	 *概要:その整数値が10の倍数か判別するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput= new Scanner(System.in);
		
		//整数の入力を促す
		System.out.print("整数値:");
		//整数を読み込む
		int integerNumber = standardInput.nextInt();
		
		//integerNumber>0がtrueなら実行
		if(integerNumber>0) {
			//integerNumber0がtrueなら実行
			if(integerNumber%10==0) {
				//文字列を表示
				System.out.println("その値は10の倍数です。");
			//integerNumber0がfalseなら実行
			}else {
				//文字列を表示
				System.out.println("その値は10の倍数ではありません。");
			}
			//integerNumber>0がfalseなら実行
		}else {
			//文字列を表示
			System.out.println("正でない値が入力されました。");
		}	
		
	}
}
