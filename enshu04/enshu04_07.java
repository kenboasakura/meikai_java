package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu04_06_01
*概要:読み込んだ整数分の*を表示させるテキスト
*作成者:K.Asakura
*作成日:2024/04/9
*/
public class enshu04_07 {

	/*関数名:main
	 *概要:読み込んだ整数分の*を表示させるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/9
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//変数を宣言
		int firstVariable = 0;
		
		do {
			//整数の入力を促す
			System.out.print("何個*と+を交互に表示しますか:");
			//整数を読み込む
			firstVariable = standardInput.nextInt();
		//変数が負の整数であればループ
		}while(firstVariable<1);
		
		//変数を宣言
		int integerVariable = 0;
		//2で割り切れる数を定義するためにfinal変数を宣言
		final int DIVISIBLE_NUMBER = 2;
		//余りが0であることをを定義するためにfinal変数を宣言
		final int REMINDER_NUMBER = 0;
		
		//整数が入力した整数より少なければループ
		while (integerVariable < firstVariable) {
			//整数が２で割り切れるなら実行
			if (integerVariable % DIVISIBLE_NUMBER == REMINDER_NUMBER) {
				//*を表示
				System.out.print('*');
			}
			//整数が２で割り切れないなら実行
			else {
				//+を表示
				System.out.print('+');
			}
			//整数をインクリメント
			integerVariable++;
		}
		
		
		//*と+を交互に入力した整数分表示
		System.out.println();

	}

}
	
	