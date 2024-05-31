package enshu10_04;
//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:DayTester11
 *概要:日付と進める日数を入力し、日付を進める日数分後ろに進めて表示
 *(日付を入力した日数後ろに更新するメソッドのテスター)
 *作成者:K.Asakura
 *作成日:2024/05/27
 */
public class DayTester11 {

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

	/*関数名:main
	 *概要:日付と進める日数を入力し、日付を進める日数分後ろに進めて表示
	 *(日付を入力した日数後ろに更新するメソッドのテスター)
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public static void main(String[] args) {
		//日付の入力を促す文字列を表示
		System.out.println("日付の年、月、日を入力してください");
		//年の入力を促す
		System.out.print("年:");
		//日付の年を読み込んで代入
		int yearNumber = standardInput.nextInt();
		//月の入力を促す
		System.out.print("月:");
		//日付の月を読み込んで代入
		int monthNumber = standardInput.nextInt();
		//日の入力を促す
		System.out.print("日:");
		//メソッドを呼び出して日付の日を読み込んで代入
		int dateNumber = standardInput.nextInt();
		//日付のデータを格納したインスタンスの生成
		Day dayInstance = new Day(yearNumber, monthNumber, dateNumber);
		//日付の年、月、日を引数としてインスタンスを表示
		System.out.println("日付:" + dayInstance);
		//進める日数を読み込んで代入
		int advanceDayValue = inputRegularInteger("進める日数:");
		//入力した日数分進めた日付をを表示
		System.out.println(advanceDayValue+"日進めた日付:" + dayInstance.updateForwardIncrementDate(dayInstance,advanceDayValue));

	}
}
