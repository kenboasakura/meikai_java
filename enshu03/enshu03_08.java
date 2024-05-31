package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_08
*概要:成績を判定するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
class enshu03_08 {

	/*関数名:main
	 *概要:成績を判定するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		
        //整数値の入力を促す
		System.out.print("成績判定：");  
		//整数値を読み込む
		int integerNumber = standardInput.nextInt();
		
		//integerNumber >= 0 && integerNumber <= 59がtrueの時表示
		if(integerNumber >= 0 && integerNumber <= 59) {
			System.out.println("不可");
			//integerNumber >= 60 && integerNumber <= 69がtrueの時表示
		}else if(integerNumber >= 60 && integerNumber <= 69) {
			//文字列を表示
			System.out.println("可");
			//integerNumber >= 70 && integerNumber <= 79trueの時表示
		} else if(integerNumber >= 70 && integerNumber <= 79) {
			//文字列を表示
			System.out.println("良");
			//integerNumber >= 80 && integerNumber <= 100がtrueの時表示
		} else if(integerNumber >= 80 && integerNumber <= 100) {
			//文字列を表示
			System.out.println("優");
		//integerNumber >= 0 && integerNumber <= 59がtrueの時表示
		} else {
			//文字列を表示
			System.out.println("判定できません");
		}
			


	}

}
