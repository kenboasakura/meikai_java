package enshu09_03;

/*クラス名:Day
 *概要:日付を管理
 *作成者:K.Asakura
 *作成日:2024/05/22
 */
public class Day {
	//年を表すint型のフィールドを宣言して1で初期化
	private int year = 1;
	//月を表すint型のフィールドを宣言して1で初期化
	private int month = 1;
	//日を表すint型のフィールドを宣言して1で初期化
	private int date = 1;

	/*コンストラクタ名:Day
	 *概要:日付の項目を1で初期化
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public Day() {
	}

	/*コンストラクタ名:Day
	 *概要:年を引数で初期化し、それ以外を1で初期化
	 *引数:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public Day(int year) {
		//年を表すフィールドを仮引数で初期化
		this.year = year;
	}

	/*コンストラクタ名:Day
	 *概要:年と月を引数で初期化し、日を1で初期化
	 *引数:年、月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public Day(int year, int month) {
		//コンストラクタを呼び出し、年を表すフィールドを仮引数で初期化
		this(year);
		//月を表すフィールドを仮引数で初期化
		this.month = month;
	}

	/*コンストラクタ名:Day
	 *概要:年、月、日を引数で初期化
	 *引数:年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public Day(int year, int month, int date) {
		//コンストラクタを呼び出し、年、月を表すフィールドを仮引数で初期化
		this(year, month);
		//日を表すフィールドを仮引数で初期化
		this.date = date;
	}

	/*コンストラクタ名:Day
	 *概要:同じクラスの年、月、日をコピーした値で初期化
	 *引数:同じクラスの年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public Day(Day d) {
		//同じクラスの年、月、日で初期化
		this(d.year, d.month, d.date);
	}

	/*インスタンスメソッド名:getTaer
	 *概要:年を取得するメソッド
	 *引数:なし
	 *戻り値:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */

	public int getTaer() {
		//年を返却
		return year;
	}
	/*インスタンスメソッド名:getMonth
	 *概要:月を取得するメソッド
	 *引数:なし
	 *戻り値:月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */

	public int getMonth() {
		//月を返却
		return month;
	}

	/*インスタンスメソッド名:getMate
	 *概要:日を取得するメソッド
	 *引数:なし
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public int getMate() {
		//日を返却
		return date;
	}

	/*インスタンスメソッド名:setYaer
	 *概要:年を設定するメソッド
	 *引数:年(int型)
	 *戻り値:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public void setYaer(int year) {
		//引数を年に代入
		this.year = year;
	}

	/*インスタンスメソッド名:setMonth
	 *概要:月を設定するメソッド
	 *引数:月(int型)
	 *戻り値:月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public void setMonth(int month) {
		//引数を月に代入
		this.month = month;
	}

	/*インスタンスメソッド名:setDate
	 *概要:日を設定するメソッド
	 *引数:日(int型)
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public void setDate(int date) {
		//引数を日に代入
		this.date = date;
	}

	/*インスタンスメソッド名:setDate
	 *概要:年、月、日を設定するメソッド
	 *引数:年、月、日(int型)
	 *戻り値:年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public void set(int year, int month, int date) {
		//引数を年に代入
		this.year = year;
		//引数を月に代入
		this.month = month;
		//引数を日に代入
		this.date = date;
	}

	/*インスタンスメソッド名:dayOfWeek
	 *概要:曜日を求めて返却するメソッド
	 *引数:なし
	 *戻り値:曜日にあたる整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public int dayOfWeek() {
		//1月を表す整数を定数化
		final int JANUARY_MONTH = 1;
		//2月を表す整数を定数化
		final int FEBRUARY_MONTH = 2;
		//月を表す変数に加える整数を定数化
		final int CALCULATE_ADDITION_VALUE = 12;
		//年を表す変数に年を代入
		int yearValue = year;
		//月を表す変数に月を代入
		int monthValue = month;
		//1月か2月の場合実行
		if (monthValue == JANUARY_MONTH || monthValue == FEBRUARY_MONTH) {
			//年数を1減らす
			yearValue--;
			//12を加算して代入
			monthValue += CALCULATE_ADDITION_VALUE;
		}
		//曜日に当たる整数を返却(ツェラーの公式を用いているため定数化なし)
		return (yearValue + yearValue / 4 - yearValue / 100 + yearValue / 400 + (13 * monthValue + 8) / 5 + date) % 7;
	}

	/*インスタンスメソッド名:equalTo
	 *概要:引数の日付が正しければtrueをそうでなければfalseを返却するメソッド
	 *引数:日付のインスタンス
	 *戻り値:trueもしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public boolean equalTo(Day d) {
		//2つの日付の年月日が同じであればtrueを、そうでなければfalseを返却
		return year == d.year && month == d.month && date == d.date;
	}

	/*インスタンスメソッド名:toString
	 *概要:その日付の曜日の文字列を返却するメソッド
	 *引数:なし
	 *戻り値:日付(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public String toString() {
		//曜日の文字列を格納する配列を生成
		String[] wd = {
				"日", "月", "火", "水", "木", "金", "土"
		};
		//年月日とそれに対応する曜日の文字列を返却
		return String.format("%4d年%2d月%2d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
