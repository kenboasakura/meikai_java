package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_03
*概要:入力された整数a,b,cの中央値を求めて表示
*作成者:K.Asakura
*作成日:2024/04/23
*/
public class enshu07_03 {

	/*関数名:centralValue
	 *概要:入力された整数a,b,cの中央値を求めるメソッド
	 *引数:整数a,b,c
	 *戻り値:中央値
	 *作成者:K.Asakura
	 *作成日:2024/04/23
	 */
	static int centralValue(int firstVariable, int secondVariable, int thirdVariable) {
		//整数aを戻り値を格納する変数に一時的に代入
		int centralValue = firstVariable;
		//整数bが中央値であれば実行
		if (firstVariable < secondVariable && secondVariable < thirdVariable
				|| firstVariable > secondVariable && secondVariable > thirdVariable) {
			//整数bを戻り値を格納する変数に代入
			centralValue = secondVariable;
		}
		//整数cが中央値であれば実行
		if (firstVariable < thirdVariable && thirdVariable < secondVariable
				|| firstVariable > thirdVariable && thirdVariable > secondVariable) {
			//整数cを戻り値を格納する変数に代入
			centralValue = thirdVariable;
		}
		//整数a,b,cの中の中央値を返却
		return centralValue;
	}

	/*関数名:main
	 *概要:入力された整数a,b,cの中央値を求めて表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/23
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促す*aは教科書準拠
		System.out.print("整数a:");
		//整数を読み込む
		int firstVariable = standardInput.nextInt();
		//整数の入力を促す*bは教科書準拠
		System.out.print("整数b:");
		//整数を読み込む
		int secondVariable = standardInput.nextInt();
		//整数の入力を促す*cは教科書準拠
		System.out.print("整数c:");
		//整数を読み込む
		int thirdVariable = standardInput.nextInt();

		//中央値を表示
		System.out.println("中央値は" + centralValue(firstVariable, secondVariable, thirdVariable) + "です。");

	}

}
