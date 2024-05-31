package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_02
*概要:入力された3つの整数の最小値を求めて表示
*作成者:K.Asakura
*作成日:2024/04/23
*/
public class enshu07_02 {

	/*関数名:minimumNumber
	 *概要:3つのint型整数a,b,cの最小値を求めるメソッド *整数a,b,cは教科書準拠
	 *引数:int型の入力された整数a,b,c
	 *戻り値:最小値
	 *作成者:K.Asakura
	 *作成日:2024/04/23
	 */
	static int minimumNumber(int firstVariable, int secondVariable, int thirdVariable) {
		//戻り値を格納する変数に仮として整数aを代入
		int minimumNumber = firstVariable;
		//整数aとbを比較し最小を求める処理
		if (secondVariable < minimumNumber) {
			//整数bを戻り値を格納する変数に代入
			minimumNumber = secondVariable;
		}
		//整数a,b,cを最小を求める処理
		if (thirdVariable < minimumNumber) {
			//整数cを戻り値を格納する変数に代入
			minimumNumber = thirdVariable;
		}
		//整数a,b,cの中の最小値を返却
		return minimumNumber;
	}

	/*関数名:main
	 *概要:入力された3つの整数の最小値を求めて表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/23
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促す *aは教科書準拠
		System.out.print("整数a:");
		//整数を読み込む
		int firstVariable = standardInput.nextInt();
		//整数の入力を促す *bは教科書準拠
		System.out.print("整数b:");
		//整数を読み込む
		int secondVariable = standardInput.nextInt();
		//整数の入力を促す *c教科書準拠
		System.out.print("整数c:");
		//整数を読み込む
		int thirdVariable = standardInput.nextInt();

		//最小値を表示
		System.out.println("最小値は"+minimumNumber(firstVariable,secondVariable,thirdVariable)+"です。");

	}

}

