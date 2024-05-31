package enshu07;

import java.util.Scanner;

/*クラス名:enshu07_32
 *概要:byte型、short型、int型、long型のそれぞれ入力した整数のビット構成を表示する
 *作成者:K.Asakura
 *作成日:2024/05/09
 */
public class enshu07_32 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:printBits
	 *概要:byte型のビット構成を表示するメソッド
	 *引数:byte型の整数
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static void printBits(byte x) {
		//byte型の整数のビット数の上限を示す数を定数化
		final int MUXIMUM_BITS = 8;
		//ビット構成を表示する処理に用いる、表示するビット構成の桁数を調整するための数を定数化
		final int ADJUSTMENT_VALUE = 1;
		//各位のビットを求めるために、整数値を各ビットの位分論理シフトした値との論理積に用いる整数を定数化
		final int LOGICAL_MULTIPLY_VALUE = 1;
		//整数値を各ビットの位分倫理シフトした値と1を論理積した数との等価演算に使用する整数を定数化
		final int BINARY_NUMBER_ONE = 1;

		//入力された整数内のビットを調べて、ビット構成を表示
		for (int i = MUXIMUM_BITS - ADJUSTMENT_VALUE; i >= 0; i--) {
			//整数値を各ビットの位分論理シフトした値と1を論理積した数が1であるなら1を、そうでないなら0を表示
			System.out.print(((x >>> i & LOGICAL_MULTIPLY_VALUE) == BINARY_NUMBER_ONE) ? '1' : '0');
		}
	}

	/*関数名:printBits
	 *概要:short型のビット構成を表示するメソッド
	 *引数:short型の整数
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static void printBits(short x) {
		//short型の整数のビット数の上限を示す数を定数化
		final int MUXIMUM_BITS = 16;
		//ビット構成を表示する処理に用いる、表示するビット構成の桁数を調整するための数を定数化
		final int ADJUSTMENT_VALUE = 1;
		//各位のビットを求めるために、整数値を各ビットの位分論理シフトした値との論理積に用いる整数を定数化
		final int LOGICAL_MULTIPLY_VALUE = 1;
		//整数値を各ビットの位分倫理シフトした値と1を論理積した数との等価演算に使用する整数を定数化
		final int BINARY_NUMBER_ONE = 1;

		//入力された整数内のビットを調べて、ビット構成を表示
		for (int i = MUXIMUM_BITS - ADJUSTMENT_VALUE; i >= 0; i--) {
			//整数値を各ビットの位分論理シフトした値と1を論理積した数が1であるなら1を、そうでないなら0を表示
			System.out.print(((x >>> i & LOGICAL_MULTIPLY_VALUE) == BINARY_NUMBER_ONE) ? '1' : '0');
		}
	}

	/*関数名:printBits
	 *概要:int型のビット構成を表示するメソッド
	 *引数:int型の整数
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static void printBits(int x) {
		//int型の整数のビット数の上限を示す数を定数化
		final int MUXIMUM_BITS = 32;
		//ビット構成を表示する処理に用いる、表示するビット構成の桁数を調整するための数を定数化
		final int ADJUSTMENT_VALUE = 1;
		//各位のビットを求めるために、整数値を各ビットの位分論理シフトした値との論理積に用いる整数を定数化
		final int LOGICAL_MULTIPLY_VALUE = 1;
		//整数値を各ビットの位分倫理シフトした値と1を論理積した数との等価演算に使用する整数を定数化
		final int BINARY_NUMBER_ONE = 1;

		//入力された整数内のビットを調べて、ビット構成を表示
		for (int i = MUXIMUM_BITS - ADJUSTMENT_VALUE; i >= 0; i--) {
			//整数値を各ビットの位分論理シフトした値と1を論理積した数が1であるなら1を、そうでないなら0を表示
			System.out.print(((x >>> i & LOGICAL_MULTIPLY_VALUE) == BINARY_NUMBER_ONE) ? '1' : '0');
		}
	}

	/*関数名:printBits
	 *概要:long型のビット構成を表示するメソッド
	 *引数:long型の整数
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static void printBits(long x) {
		//long型の整数のビット数の上限を示す数を定数化
		final int MUXIMUM_BITS = 64;
		//ビット構成を表示する処理に用いる、表示するビット構成の桁数を調整するための数を定数化
		final int ADJUSTMENT_VALUE = 1;
		//各位のビットを求めるために、整数値を各ビットの位分論理シフトした値との論理積に用いる整数を定数化
		final int LOGICAL_MULTIPLY_VALUE = 1;
		//整数値を各ビットの位分倫理シフトした値と1を論理積した数との等価演算に使用する整数を定数化
		final int BINARY_NUMBER_ONE = 1;

		//入力された整数内のビットを調べて、ビット構成を表示
		for (int i = MUXIMUM_BITS - ADJUSTMENT_VALUE; i >= 0; i--) {
			//整数値を各ビットの位分論理シフトした値と1を論理積した数が1であるなら1を、そうでないなら0を表示
			System.out.print(((x >>> i & LOGICAL_MULTIPLY_VALUE) == BINARY_NUMBER_ONE) ? '1' : '0');
		}
	}

	/*関数名:main
	 *概要:byte型、short型、int型、long型のそれぞれ入力した整数のビット構成を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	public static void main(String[] args) {
		//byte型の整数の入力を促す
		System.out.print("byte型の整数:");
		//入力された整数を読み込む
		byte byteValue = standardInput.nextByte();
		//short型の整数の入力を促す
		System.out.print("short型の整数:");
		//入力された整数を読み込む
		short shortValue = standardInput.nextShort();
		//int型の整数の入力を促す
		System.out.print("int型の整数:");
		//入力された整数を読み込む
		int integerValue = standardInput.nextInt();
		//long型の整数の入力を促す
		System.out.print("long型の整数:");
		//入力された整数を読み込む
		long longValue = standardInput.nextLong();

		//byte型の整数のビット構成と表示
		System.out.println("byte型の整数のビット構成");
		//入力されたbyte型の整数を引数としてメソッドを呼び出し、byte型のビット構成を表示
		printBits(byteValue);
		//改行を出力
		System.out.println();
		//short型の整数のビット構成と表示
		System.out.println("short型の整数のビット構成");
		//入力されたshort型の整数を引数としてメソッドを呼び出し、short型のビット構成を表示
		printBits(shortValue);
		//改行を出力
		System.out.println();
		//int型の整数のビット構成と表示
		System.out.println("int型の整数のビット構成");
		//入力されたint型の整数を引数としてメソッドを呼び出し、int型のビット構成を表示
		printBits(integerValue);
		//改行を出力
		System.out.println();
		//long型の整数のビット構成と表示
		System.out.println("long型の整数のビット構成");
		//入力されたlong型の整数を引数としてメソッドを呼び出し、long型のビット構成を表示
		printBits(longValue);

	}

}
