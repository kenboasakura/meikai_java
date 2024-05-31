package enshu10_04;
//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:DayTester05
 *概要:プログラム実行時の日付と入力した日付を比較し、2つの日付の前後関係を表示
 *作成者:K.Asakura
 *作成日:2024/05/15
 */
public class DayTester05 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:main
	 *概要:プログラム実行時の日付と入力した日付を比較し、2つの日付の前後関係を表示
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
		int firstYearNumber = standardInput.nextInt();
		//月の入力を促す
		System.out.print("月:");
		//日付の月を読み込んで代入
		int firstMonthNumber = standardInput.nextInt();
		//日の入力を促す
		System.out.print("日:");
		//日付の日を読み込んで代入
		int firstDateNumber = standardInput.nextInt();
		//日付のデータを格納したインスタンスの生成
		Day firstDayInstance = new Day(firstYearNumber, firstMonthNumber, firstDateNumber);
		//クラスメソッドを呼び出して、日付の前後関係を表示
		System.out.println(Day.todayAndAnotherDateComparison(firstDayInstance));
	}

}
