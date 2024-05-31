package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_03
*概要:読み込んだ整数値が正か負か０か判別するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
class enshu03_03 {

	/*関数名:main
	 *概要:読み込んだ整数値が正か負か０か判別するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
		//整数の入力を促す
		System.out.print("整数値：");
		//整数を読み込む
		int intNumber = standardInput.nextInt();
		
		//intNumber>0がtrueなら表示
		if(intNumber>0) {
			//文字列を表示
			System.out.println("その整数値は正です。");
		//intNumber<0がtrueなら表示
		} else if(intNumber<0) {
			//文字列を表示
			System.out.println("その整数値は負です。");
		//intNumber==0がtrueなら表示
		}else if(intNumber==0) {
			//文字列を表示
			System.out.println("その整数値は０です。");
		}
	
	}

}