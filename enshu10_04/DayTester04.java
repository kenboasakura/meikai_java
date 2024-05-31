package enshu10_04;
//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:DayTester04
 *概要:日付とその年内の残り日数を表示
 *作成者:K.Asakura
 *作成日:2024/05/27
 */
public class DayTester04 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	/*関数名:main
	 *概要:日付とその年内の残り日数を表示
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
		//日付1の月を読み込んで代入
		int monthNumber = standardInput.nextInt();
		//日の入力を促す
		System.out.print("日:");
		//メソッドを呼び出して日付の日を読み込んで代入
		int dateNumber = standardInput.nextInt();
		//静的初期化子を用いてプログラム実行時の日付でインスタンスの生成	
		Day dayInstance = new Day();
		//入力した年、月、日を引数としたインスタンスの生成
		dayInstance = new Day(yearNumber, monthNumber, dateNumber);
		//日付の年、月、日を引数としてインスタンスを表示
		System.out.println("日付:" + dayInstance);
		//日付の残り日数を表示
		System.out.println("日付の年内の残り日数:" + dayInstance.remainingDayOfYear(dayInstance));

	}

}
