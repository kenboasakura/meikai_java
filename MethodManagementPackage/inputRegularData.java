package MethodManagementPackage;

//Scannerクラスのインポート
import java.util.Scanner;

public class inputRegularData {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	//先頭にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_ZERO = 0;
	//2番目にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_ONE = 1;
	//3番目にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_TWO = 2;

	/*関数名:inputLong
	 *概要0以上の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static long inputLong(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		long intputLong = 0;
		//0以上の整数が入力させる
		do {
			//引数の入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			intputLong = standardInput.nextLong();
			//0未満の整数が入力された場合実行
			if (intputLong < 0) {
				//正の整数の入力を促す
				System.out.println("0以上の数値を入力して下さい");
			}
			//0以上の整数が入力されるまでループ
		} while (intputLong < 0);
		//読み込んだ整数を返却
		return intputLong;
	}

	/*関数名:inputRegularDouble
	 *概要:正の実数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した実数(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static double inputRegularDouble(String stringPromptEntry) {
		//実数を読み込むため変数を初期化して宣言
		double inputDouble = 0;
		//正の実数を入力させる
		while (inputDouble <= 0) {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//実数を読み込む
			inputDouble = standardInput.nextDouble();
			//0以下の実数が入力された場合実行
			if (inputDouble <= 0) {
				//正の整数の入力を促す
				System.out.println("正の実数を入力して下さい");
			}
		}
		//読み込んだ実数を返却
		return inputDouble;
	}

	/*関数名:inputRegularInteger
	 *概要:正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
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

	/*関数名:inputInteger
	 *概要:0以上の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	static int inputInteger(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//0以上の整数を入力させる
		do {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//負の整数が入力された場合実行
			if (inputInteger < 0) {
				//0以上の整数の入力を促す
				System.out.println("0以上の整数を入力して下さい");
			}
			//0以上の整数が入力されるまでループ
		} while (inputInteger < 0);
		//読み込んだ整数を返却
		return inputInteger;
	}

	/*関数名:inputdouble
	 *概要:0以上の実数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した実数(double型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	static double inputdouble(String stringPromptEntry) {
		//実数を読み込むため変数を初期化して宣言
		double inputDouble = 0;
		//0以上の整数を入力させる
		do {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//実数を読み込む
			inputDouble = standardInput.nextInt();
			//負の実数が入力された場合実行
			if (inputDouble < 0) {
				//0以上の実数の入力を促す
				System.out.println("0以上の整数を入力して下さい");
			}
			//0以上の実数が入力されるまでループ
		} while (inputDouble < 0);
		//読み込んだ実数を返却
		return inputDouble;
	}

	public static void main(String[] args) {

	}

}
