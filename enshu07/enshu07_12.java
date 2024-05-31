package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_12
 *概要:先に入力した整数を後に入力した整数分左右に回転させたビット数を表示
 *作成者:K.Asakura
 *作成日:2024/04/25
 */
public class enshu07_12 {
	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:printBits
	 *概要:int型のビット構成を表示するメソッド
	 *引数:firstInput
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/25
	 */
	static void printBits(int x) {
		//二進数の上限を示すため31を定数化
		final int MUXIMUM_BITS = 31;
		//そのビットが1であるか確認するため1を定数化
		final int BINARY_NUMBER = 1;

		//入力された整数分のビット数を表示
		for (int i = MUXIMUM_BITS; i >= 0; i--) {
			//右へ論理シフト
			System.out.print(((x >>> i & BINARY_NUMBER) == BINARY_NUMBER) ? '1' : '0');
		}
	}

	/*クラス名:rRotate
	 *概要:入力した整数分右にビット数を回転させるメソッド
	 *作成者:K.Asakura
	 *作成日:2024/04/25
	 */
	static int rRotate(int x, int n) {
		//あふれたビットを計算するため32を定数化
		final int SPIN_MUXIMUM_BITS = 32;
		//先に入力した整数を後に入力した整数分右に論理シフト
		int firstAssignment = x >>> n;
		//入力した整数があふれたときにその分左から右へビット数をシフト
		int secondAssignment = x << SPIN_MUXIMUM_BITS - n;
		//ビット単位の論理和を生成
		int thirdAssignment = firstAssignment | secondAssignment;
		//生成した論理和を返却
		return thirdAssignment;

	}

	/*クラス名:rRotate
	 *概要:入力した整数分左ににビット数を回転させるメソッド
	 *作成者:K.Asakura
	 *作成日:2024/04/25
	 */
	static int lRotate(int x, int n) {
		//あふれたビットを計算するため32を定数化
		final int SPIN_MINIMUM_BITS = 32;
		//先に入力した整数を後に入力した整数分左にシフト
		int firstAssignment = x << n;
		//入力した整数があふれた場合その分右に論理シフト
		int secondAsignment = x >>> SPIN_MINIMUM_BITS - n;
		//ビット単位の論理和を生成
		int thirdAssignment = firstAssignment | secondAsignment;
		//生成した論理和を返却
		return thirdAssignment;

	}

	/*関数名:main
	 *概要:先に入力した整数を後に入力した整数分左右に回転させたビット数を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/25
	 */
	public static void main(String[] args) {
		//整数の入力を促す
		System.out.print("整数:");
		//入力された整数を読み込む
		int firstInput = standardInput.nextInt();
		//回転させるビット数を整数で入力させる
		System.out.print("回転させるビット数:");
		//入力された移動分の整数を読み込む
		int srcondInput = standardInput.nextInt();
		
		//入力された整数分右に回転させたビット数を表示
		System.out.print("回転前のビット表示 = ");
		printBits(firstInput);
		//改行を出力
		System.out.println();

		//入力された整数分右に回転させた値を表示
		System.out.print("右に回転させた整数 = "+rRotate(firstInput,srcondInput));
		//改行を出力
		System.out.println();
		//入力された整数分右に回転させたビット数を表示
		System.out.print("右に回転させたビット構成 = ");
		printBits(rRotate(firstInput, srcondInput));
		//改行を出力
		System.out.println();

		//入力された整数分左に回転させた値を表示
		System.out.print("左に回転させた整数 = "+lRotate(firstInput,srcondInput));
		//改行を出力
		System.out.println();
		//入力された整数分左に回転させたビット数を表示
		System.out.print("左に回転させたビット構成 = ");
		printBits(lRotate(firstInput, srcondInput));

	}

}
