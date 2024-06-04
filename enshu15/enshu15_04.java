package enshu15;

//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:enshu15_04
 *概要:浮動小数点を指定した桁数で表示
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class enshu15_04 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:printDouble
	 *概要:浮動小数点を指定した形で表示
	 *引数:表示する実数(double型)、小数点以下の桁数、全体の桁数(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	static void printDouble(double inputDouble, int decimalUnderDisplay, int totalDisplay) {
		//フォーマット用の変数に引数を表示したものを代入
		String formatDouble = "%" + totalDisplay + "." + decimalUnderDisplay + "f";
		//浮動小数点を指定した形でフォーマットして表示
		System.out.printf(String.format(formatDouble, inputDouble));
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

	/*関数名:main
	 *概要:浮動小数点を指定した桁数で表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//実数の入力を促す
		System.out.print("実数:");
		//実数を読み込む
		double inputDouble = standardInput.nextDouble();
		//小数点以下の桁数を読み込んで代入
		int decimalPlaceNumber = inputInteger("小数点以下の桁数:");
		//全体の桁数を読み込んで代入
		int totalDigits = inputRegularInteger("全体の桁数:");
		//浮動小数点を指定した桁数で表示
		printDouble(inputDouble, decimalPlaceNumber, totalDigits);
	}

}
