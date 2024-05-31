package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_31
 *概要:入力されたint型、long型、float型、doube型の数の絶対値を表示
 *作成者:K.Asakura
 *作成日:2024/05/09
 */
public class enshu07_31 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:absolute
	 *概要:int型の整数の絶対値を返却するメソッド
	 *引数:int型の整数
	 *戻り値:int型の整数の絶対値
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	static int absolute(int x) {
		//絶対値を表す変数を初期化して宣言
		int absoluteIntegerValue = x;
		//整数が0より小さい場合
		if (x < 0) {
			//整数の符号を反転して代入
			absoluteIntegerValue = -x;
		}
		//絶対値を返却
		return absoluteIntegerValue;
	}

	/*関数名:absolute
	 *概要:long型の整数の絶対値を返却するメソッド
	 *引数:long型の整数
	 *戻り値:long型の整数の絶対値
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	static long absolute(long x) {
		//絶対値を表す変数を初期化して宣言
		long absolutelongValue = x;
		//入力された整数が0より小さい場合
		if (x < 0) {
			//整数の符号を反転して代入
			absolutelongValue = -x;
		}
		//絶対値を返却
		return absolutelongValue;
	}

	/*関数名:absolute
	 *概要:float型の実数の絶対値を返却するメソッド
	 *引数:float型の実数
	 *戻り値:float型の実数の絶対値
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	static float absolute(float x) {
		//絶対値を表す変数を初期化して宣言
		float absolutefloatValue = x;

		//実数が0より小さい場合
		if (x < 0) {
			//実数の符号を反転して代入
			absolutefloatValue = -x;
		}
		//絶対値を返却
		return absolutefloatValue;
	}

	/*関数名:absolute
	 *概要:double型の実数の絶対値を返却するメソッド
	 *引数:double型の実数
	 *戻り値:double型の実数の絶対値
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	static double absolute(double x) {
		//絶対値を表す変数を初期化して宣言
		double absolutedoubleValue = x;

		//実数が0より小さい場合
		if (x < 0) {
			//実数の符号を反転して代入
			absolutedoubleValue = -x;
		}
		//絶対値を返却
		return absolutedoubleValue;
	}

	/*関数名:main
	 *概要:入力されたint型、long型、float型、double型の数の絶対値を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	public static void main(String[] args) {
		//int型の整数の入力を促す
		System.out.print("int型の整数:");
		//入力された整数を読み込む
		int integerValue = standardInput.nextInt();
		//long型の整数の入力を促す
		System.out.print("long型の整数:");
		//入力された整数を読み込む
		long longValue = standardInput.nextLong();
		//float型の実数の入力を促す
		System.out.print("float型の実数:");
		//入力された整数を読み込む
		float floatValue = standardInput.nextFloat();
		//double型の実数の入力を促す
		System.out.print("double型の実数:");
		//入力された整数を読み込む
		double doubleValue = standardInput.nextDouble();

		//int型の絶対値を表示
		System.out.println("int型の絶対値は" + absolute(integerValue));
		//long型の絶対値を表示
		System.out.println("long型の絶対値は" + absolute(longValue));
		//float型の絶対値を表示
		System.out.println("float型の絶対値は" + absolute(floatValue));
		//double型の絶対値を表示
		System.out.println("double型の絶対値は" + absolute(doubleValue));

	}

}
