package enshu10_04;
//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:DayTester0102
 *概要:入力した年、月、日の日付を表示＊初期化はプログラム実行時の日付
 *作成者:K.Asakura
 *作成日:2024/05/27
 */
public class DayTester0102 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	/*関数名:main
	 *概要:入力した年、月、日の日付を表示＊初期化はプログラム実行時の日付
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
		//メソッドを呼び出して日付1の日を読み込んで代入
		int firstDateNumber = standardInput.nextInt();
		//静的初期化子を用いてプログラム実行時の日付でインスタンスの生成	
		Day firstDayInstance = new Day();
		//日付を表示
		System.out.println("本日の日付は:" + firstDayInstance);
		//日付の年を引数としてインスタンスを生成
		firstDayInstance = new Day(firstYearNumber);
		//日付の年を引数としてインスタンスを表示
		System.out.println("年のみの引数の日付:" + firstDayInstance);
		//日付の年、月を引数としてインスタンスを生成
		firstDayInstance = new Day(firstYearNumber, firstMonthNumber);
		//日付の年、月を引数としてインスタンスを表示
		System.out.println("年、月の引数の日付:" + firstDayInstance);
		//日付の年、月、日を引数としてインスタンスを生成
		firstDayInstance = new Day(firstYearNumber, firstMonthNumber,firstDateNumber);
		//日付の年、月、日を引数としてインスタンスを表示
		System.out.println("年月日の引数の日付:" + firstDayInstance);
		

	}

}
