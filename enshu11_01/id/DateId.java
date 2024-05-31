package id;

//Calendarクラスのオンデマンド静的インポート
import static java.util.Calendar.*;

//GregorianCalendarクラスをインポート
import java.util.GregorianCalendar;

/*クラス名:DateId
 *概要:識別番号を管理
 *作成者:K.Asakura
 *作成日:2024/05/29
 */
public class DateId {
	//識別番号をカウントするint型の静的フィールドを初期化して宣言
	private static int counterNumber = 0;
	//識別番号を表すint型のフィールドを宣言
	private int idNumber = 0;
	//プログラム実行時の月を正しく表示させるため、足す整数を定数化
	static final int MONTH_CENTURY_DISPLAY = 1;
	//識別番号を表示するため、年にかける整数を定数化
	static final int YEARS_SIZE = 1000000;
	//識別番号を表示するため、月にかける整数を定数化
	static final int MONTH_SIZE = 10000;
	//識別番号を表示するため、日にかける整数を定数化
	static final int DATE_SIZE = 100;
	//静的初期化子を設定
	static {
		//プログラムを実行した日付を格納するインスタンスを生成
		GregorianCalendar todayDate = new GregorianCalendar();
		//年を表すint型のフィールドを宣言して本日の年で初期化
		int yearNumber = todayDate.get(YEAR);
		//月を表すint型のフィールドを宣言して本日の月で初期化
		int monthNumber = todayDate.get(MONTH) + MONTH_CENTURY_DISPLAY;
		//日を表すint型のフィールドを宣言して本日の日付で初期化
		int dateNumber = todayDate.get(DATE);
		//本日の日付を表示
		System.out.printf("今日は%04d年%02d月%02d日です。\n",yearNumber,monthNumber,dateNumber);
		//プログラムの実行日を元に識別番号をカウントするフィールドに代入
		counterNumber = yearNumber * YEARS_SIZE + monthNumber * MONTH_SIZE + dateNumber * DATE_SIZE;
	}
	
	/*コンストラクタ名:DateId
	 *概要:識別番号を、本日の日付をもとにした識別番号と生成されたインスタンスの個数を加算した値で初期化
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public DateId() {
		//識別番号に識別番号をカウントするフィールドを1増加してから代入
		idNumber = ++counterNumber;
	}
	
	/*インスタンスメソッド名:getId
	 *概要:識別番号を取得するメソッド
	 *引数:なし
	 *戻り値:識別番号(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public int getId () {
		//識別番号を返却
		return idNumber;
	}

}
