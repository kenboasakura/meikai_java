package enshu10_04;
//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:DayTester10
 *概要:入力した日付とその前日の日付を表示(入力した日付の前日の日付を返却するメソッドのテスター)
 *作成者:K.Asakura
 *作成日:2024/05/27
 */
public class DayTester10 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	/*関数名:main
	 *概要:入力した日付とその前日の日付を表示(入力した日付の前日の日付を返却するメソッドのテスター)
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
		//前日の日付をを表示
		System.out.println("前日の日付:" + dayInstance.getLastDay(dayInstance));

	}
}
