//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:DateIdTester
 *概要:入力した整数の数分、本日の日付をもとにした識別番号を1ずつ増加させて表示
 *作成者:K.Asakura
 *作成日:2024/05/29
 */
public class DateIdTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputRegularInteger
	 *概要:正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
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
	 *概要:入力した整数の数分、本日の日付をもとにした識別番号を1ずつ増加させて表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public static void main(String[] args) {
		//識別番号の個数を読み込んで代入
		int elementNumber = inputRegularInteger("識別番号の個数:");
		//識別番号を格納する配列を生成
		id.DateId[] idInstance = new id.DateId[elementNumber];
		//入力した整数の数分、本日の日付をもとにした識別番号を1ずつ増加させて表示
		for (int i = 0; i < elementNumber; i++) {
			//本日の日付をもとにした識別番号のインスタンスを生成
			idInstance[i] = new id.DateId();
			//識別番号を表示
			System.out.println("id[" + i + "]の識別番号:" + idInstance[i].getId());
		}

	}

}
