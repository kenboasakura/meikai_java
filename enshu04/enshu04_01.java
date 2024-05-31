package enshu04;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_03
*概要:読み込んだ整数値が正か負か０か判別するテキスト
*作成者:K.Asakura
*作成日:2024/04/08
*/
class enshu04_01 {

	/*関数名:main
	 *概要:読み込んだ整数値が正か負か０か判別するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//整数を読み込む
		int retryNumber;

		//whileがtrueの限り実行
		do {
			//整数の入力を促す
			System.out.print("整数値：");
			//整数を読み込む
			int integerNumber = standardInput.nextInt();

			//読み込んだ整数が０より大きければ実行
			if (integerNumber > 0) {
				//文字列を表示
				System.out.println("その整数値は正です。");
				//読み込んだ整数が０より小さければ実行
			} else if (integerNumber < 0) {
				//文字列を表示
				System.out.println("その整数値は負です。");
				//読み込んだ整数が０であれば実行
			} else {
				//文字列を表示
				System.out.println("その整数値は０です。");
			}
			//whileの限り実行
			do {
				//文字列を表示
				System.out.print("もう一度？1..Yes/0..No :");
				//整数を読み込む
				retryNumber = standardInput.nextInt();
				//整数が１より上、０より下の数であればループ
			} while (retryNumber > 1 || retryNumber < 0);
			//整数が１であればループ
		} while (retryNumber == 1);

	}

}