package enshu05;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu05_02
 *概要:float型の変数とdouble型の変数に値を読み込んで表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/15
 */
public class enshu05_02 {

	/*関数名:main
	 *概要:float型の変数とdouble型の変数に値を読み込んで表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/15
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//xに代入する変数を初期化して宣言
		float firstDouble = 0;
		//yに代入する実数を初期化して宣言
		double secondDouble = 0;

			//xに変数の入力を促す
			System.out.print("x:");
			//実数を読み込む
			firstDouble = standardInput.nextFloat();
			
			//yに実数の入力を促す
			System.out.print("y:");
			//実数を読み込む
			secondDouble = standardInput.nextDouble();
			
		//xの値をを表示
		System.out.println("x ="+firstDouble);
		//yの値を表示
		System.out.println("y ="+secondDouble);
		

	}

}
