package enshu10_03;

import java.util.Scanner;

/*クラス名:MinMaxTester
 *概要:入力した3つの実数値の1つめと2つめの実数、3つの実数の最大値と最小値を表示。
 *また、入力した要素数と要素をもつ配列の最大値と最小値を表示
 *作成者:K.Asakura
 *作成日:2024/05/24
 */
public class MinMaxTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputdoubleArray
	 *概要:各要素に実数を読み込んで代入した配列を返却するメソッド
	 *引数:要素数(int型)
	 *戻り値:配列(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	static double[] inputdoubleArray(int elementNumber) {
		//引数を要素数にもつdouble型の配列を生成
		double doubleArray[] = new double[elementNumber];
		//各要素の値を読み込む
		for (int i = 0; i < doubleArray.length; i++) {
			//各要素の値の入力を促す
			System.out.print("[" + i + "]=");
			//実数を読み込む
			doubleArray[i] = standardInput.nextDouble();
		}
		//読み込んだ値の要素をもつ配列を返却
		return doubleArray;
	}

	/*関数名:inputRegularInteger
	 *概要:正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static int inputRegularInteger(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//正の整数を入力させる
		while (inputInteger <= 0) {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (inputInteger <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力して下さい");
			}
		}
		//読み込んだ整数を返却
		return inputInteger;
	}

	/*関数名:main
	*概要:入力した3つの実数値の1つめと2つめの実数、3つの実数の最大値と最小値を表示。
	*また、入力した要素数と要素をもつ配列の最大値と最小値を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	public static void main(String[] args) {

		//1つめの実数の入力を促す
		System.out.print("一つ目の実数:");
		//実数を読み込む
		double firstInputDouble = standardInput.nextDouble();
		//2つめの実数の入力を促す
		System.out.print("二つ目の実数:");
		//実数を読み込む
		double secondInputDouble = standardInput.nextDouble();
		//3つめの実数の入力を促す
		System.out.print("三つ目の実数:");
		//実数を読み込む
		double thirdInputDouble = standardInput.nextDouble();
		//配列の要素数を読み込んで代入
		int elementNumber = inputRegularInteger("配列の要素数:");
		//実数を代入した配列を生成
		double doubleArray[] = inputdoubleArray(elementNumber);
		//ユーティリティクラスのメソッドを呼び出して始めの2つの実数の最大値を表示
		System.out.println("始めの2つの実数の最大値は" + MinMax.getBinaryMaximumValue(firstInputDouble, secondInputDouble));
		//ユーティリティクラスのメソッドを呼び出してつの3実数の最大値を表示
		System.out.println(
				"3つの実数の最大値は" + MinMax.getTernaryMaximumValue(firstInputDouble, secondInputDouble, thirdInputDouble));
		//ユーティリティクラスのメソッドを呼び出して配列の最大値を表示
		System.out.println("配列の最大値は" + MinMax.getArrayMaximumValue(doubleArray));

		//ユーティリティクラスのメソッドを呼び出して始めの2つの実数の最小値を表示
		System.out.println("始めの2つの実数の最小値は" + MinMax.getBinaryMinimumValue(firstInputDouble, secondInputDouble));
		//ユーティリティクラスのメソッドを呼び出してつの3実数の最小値を表示
		System.out.println(
				"3つの実数の最小値は" + MinMax.getTernaryMinimumValue(firstInputDouble, secondInputDouble, thirdInputDouble));
		//ユーティリティクラスのメソッドを呼び出して配列の最小値を表示
		System.out.println("配列の最小値は" + MinMax.getArrayMinimumValue(doubleArray));

	}

}
