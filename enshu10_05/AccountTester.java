package enshu10_05;
//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:AccountTester
 *概要:読み込んだ人数分の個人の口座情報を表示
 *作成者:K.Asakura
 *作成日:2024/05/27
 */
public class AccountTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputRegularInteger
	 *概要:正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
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

	/*関数名:inputLong
	 *概要0以上の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static long inputLong(String string) {

		//整数を読み込むため変数を初期化して宣言
		long intputLong = 0;
		//0以上の整数が入力させる
		do {
			//整数の入力を促す文字列を表示
			System.out.print(string);
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

	/*関数名:inputString
	 *概要:文字列を入力させてそれを返却するメソッド
	 *引数:なし
	 *戻り値:入力した文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static String inputString() {
		//文字列を読み込む
		String inputString = standardInput.next();
		//読み込んだ文字列を返却
		return inputString;
	}

	/*関数名:main
	 *概要:読み込んだ人数分の個人の口座情報を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public static void main(String[] args) {
		//開設する口座の個数を読み込んで表示
		int elementNumber = inputRegularInteger("開設する口座の個数:");
		//口座情報を格納する配列を生成
		Account individualAccount[] = new Account[elementNumber];
		//各個人の口座情報を読み込んで表示
		for (int i = 0; i < elementNumber; i++) {
			//口座名義の入力を促す
			System.out.print("口座名義:");
			//メソッドを呼び出して、名前を読み込んで代入
			String individualName = inputString();
			//口座番号の入力を促す
			System.out.print("口座番号:");
			//メソッドを呼び出して、口座番号を読み込んで代入
			String individualNumber = inputString();
			//メソッドを呼び出して、預金残高を読み込んで代入
			long individualBalance = inputLong("預金残高:");
			//プログラム実行時の日付のインスタンスを生成
			Day courseOpeningDate = new Day();
			//入力した口座名義、番号、預金残高と、本日の日付を引数とするコンストラクタを呼び出し、インスタンスを生成
			individualAccount[i] = new Account(individualName, individualNumber, individualBalance,
					courseOpeningDate);
			//口座情報を表示
			System.out.println(individualAccount[i]);
		}

	}
}
