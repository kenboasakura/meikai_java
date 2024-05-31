package enshu10_04;
//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:DayTester06
 *概要:日付1と日付2のデータを入力し、2つの日付の前後関係を表示
 *作成者:K.Asakura
 *作成日:2024/05/27
 */
public class DayTester06 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:main
	 *概要:日付1と日付2のデータを入力し、2つの日付の前後関係を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public static void main(String[] args) {
		//日付1の入力を促す文字列を表示
		System.out.println("日付1の年、月、日を入力してください");
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
		//日付1のデータを格納したインスタンスの生成
		Day firstDayInstance = new Day(firstYearNumber, firstMonthNumber, firstDateNumber);
		//日付2の入力を促す文字列を表示
		System.out.println("日付2の年、月、日を入力してください");
		//年の入力を促す
		System.out.print("年:");
		//日付の年を読み込んで代入
		int secondYearNumber = standardInput.nextInt();
		//月の入力を促す
		System.out.print("月:");
		//日付の月を読み込んで代入
		int secondMonthNumber = standardInput.nextInt();
		//日の入力を促す
		System.out.print("日:");
		//日付の日を読み込んで代入
		int secondDateNumber = standardInput.nextInt();
		//日付2のデータを格納したインスタンスの生成
		Day secondDayInstance = new Day(secondYearNumber, secondMonthNumber, secondDateNumber);
		//インスタンスメソッドを用いて2つの日付の前後関係を調べますと表示
		System.out.println("インスタンスメソッドを用いて2つの日付の前後関係を調べます。");
		//インスタンスメソッドを呼び出して、2つの日付の前後関係を表示
		System.out.println(secondDayInstance.twoInstanceDateDataComparison(firstDayInstance,
				secondDayInstance));

	}
}
