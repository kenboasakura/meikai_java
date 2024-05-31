package enshu12_01;

//Calendarクラスの静的インポート
import static java.util.Calendar.*;

//GregorianCalendarクラスのインポート
import java.util.GregorianCalendar;

/*クラス名:Day
*概要:日付を管理
*作成者:K.Asakura
*作成日:2024/05/29
*/
public class Day {
	//プログラム実行時の月を正しく表示させるため、足す整数を定数化
	static final int MONTH_CENTURY_DISPLAY = 1;
	//プログラムを実行した日付を格納するインスタンスを生成
	GregorianCalendar todayDate = new GregorianCalendar();
	//年を表すint型のフィールドを宣言して本日の年で初期化
	private int yearNumber = todayDate.get(YEAR);
	//月を表すint型のフィールドを宣言して本日の月で初期化
	private int monthNumber = todayDate.get(MONTH) + MONTH_CENTURY_DISPLAY;
	//日を表すint型のフィールドを宣言して本日の日付で初期化
	private int dateNumber = todayDate.get(DATE);

	/*コンストラクタ名:Day
	 *概要:日付の項目をプログラムを実行した日付で初期化
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public Day() {
	}

	/*コンストラクタ名:Day
	 *概要:年を引数で初期化し、それ以外をプログラムを実行した日付で初期化
	 *引数:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public Day(int yearNumber) {
		//年を表すフィールドを仮引数で初期化
		this.yearNumber = yearNumber;
	}

	/*コンストラクタ名:Day
	 *概要:年と月を引数で初期化し、日をプログラムを実行した日付で初期化
	 *引数:年、月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public Day(int yearNumber, int monthNumber) {
		//コンストラクタを呼び出し、年を表すフィールドを仮引数で初期化
		this(yearNumber);
		//月を表すフィールドを仮引数で初期化
		this.monthNumber = monthNumber;
	}

	/*コンストラクタ名:Day
	 *概要:年、月、日を引数で初期化
	 *引数:年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public Day(int yearNumber, int monthNumber, int dateNumber) {
		//コンストラクタを呼び出し、年、月を表すフィールドを仮引数で初期化
		this(yearNumber, monthNumber);
		//日を表すフィールドを仮引数で初期化
		this.dateNumber = dateNumber;
	}

	/*コンストラクタ名:Day
	 *概要:同じクラスの年、月、日をコピーした値で初期化
	 *引数:同じクラスの年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public Day(Day dayInstance) {
		//同じクラスの年、月、日で初期化
		this(dayInstance.yearNumber, dayInstance.monthNumber, dayInstance.dateNumber);
	}

	/*インスタンスメソッド名:getTaer
	 *概要:年を取得するメソッド
	 *引数:なし
	 *戻り値:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */

	public int getTaer() {
		//年を返却
		return yearNumber;
	}
	/*インスタンスメソッド名:getMonth
	 *概要:月を取得するメソッド
	 *引数:なし
	 *戻り値:月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */

	public int getMonth() {
		//月を返却
		return monthNumber;
	}

	/*インスタンスメソッド名:getMate
	 *概要:日を取得するメソッド
	 *引数:なし
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public int getMate() {
		//日を返却
		return dateNumber;
	}

	/*インスタンスメソッド名:setYaer
	 *概要:年を設定するメソッド
	 *引数:年(int型)
	 *戻り値:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public void setYaer(int yearNumber) {
		//引数を年に代入
		this.yearNumber = yearNumber;
	}

	/*インスタンスメソッド名:setMonth
	 *概要:月を設定するメソッド
	 *引数:月(int型)
	 *戻り値:月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public void setMonth(int monthNumber) {
		//引数を月に代入
		this.monthNumber = monthNumber;
	}

	/*インスタンスメソッド名:setDate
	 *概要:日を設定するメソッド
	 *引数:日(int型)
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public void setDate(int dateNumber) {
		//引数を日に代入
		this.dateNumber = dateNumber;
	}

	/*インスタンスメソッド名:setDate
	 *概要:年、月、日を設定するメソッド
	 *引数:年、月、日(int型)
	 *戻り値:年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public void set(int yearNumber, int monthNumber, int dateNumber) {
		//引数を年に代入
		this.yearNumber = yearNumber;
		//引数を月に代入
		this.monthNumber = monthNumber;
		//引数を日に代入
		this.dateNumber = dateNumber;
	}

	/*インスタンスメソッド名:dayOfWeek
	 *概要:曜日を求めて返却するメソッド
	 *引数:なし
	 *戻り値:曜日にあたる整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public int dayOfWeek() {
		//1月を表す整数を定数化
		final int JANUARY_MONTH = 1;
		//2月を表す整数を定数化
		final int FEBRUARY_MONTH = 2;
		//月を表す変数に加える整数を定数化
		final int CALCULATE_ADDITION_VALUE = 12;
		//年を表す変数に年を代入
		int yearValue = yearNumber;
		//月を表す変数に月を代入
		int monthValue = monthNumber;
		//1月か2月の場合実行
		if (monthValue == JANUARY_MONTH || monthValue == FEBRUARY_MONTH) {
			//年数を1減らす
			yearValue--;
			//12を加算して代入
			monthValue += CALCULATE_ADDITION_VALUE;
		}
		//曜日に当たる整数を返却(ツェラーの公式を用いているため定数化なし)
		return (yearValue + yearValue / 4 - yearValue / 100 + yearValue / 400 + (13 * monthValue + 8) / 5 + dateNumber)
				% 7;
	}

	/*インスタンスメソッド名:equalTo
	 *概要:引数の日付が正しければtrueをそうでなければfalseを返却するメソッド
	 *引数:日付のインスタンス
	 *戻り値:trueもしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public boolean equalTo(Day dayInstance) {
		//2つの日付の年月日が同じであればtrueを、そうでなければfalseを返却
		return yearNumber == dayInstance.yearNumber && monthNumber == dayInstance.monthNumber
				&& dateNumber == dayInstance.dateNumber;
	}

	/*インスタンスメソッド名:toString
	 *概要:その日付の曜日の文字列を返却するメソッド
	 *引数:なし
	 *戻り値:日付(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public String toString() {
		//曜日の文字列を格納する配列を生成
		String[] weekDay = {
				"日", "月", "火", "水", "木", "金", "土"
		};
		//年月日とそれに対応する曜日の文字列を返却
		return String.format("%04d年%02d月%02d日(%s)", yearNumber, monthNumber, dateNumber, weekDay[dayOfWeek()]);
	}
}
