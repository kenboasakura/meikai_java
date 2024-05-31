package enshu10_04;
//Calendarクラスの静的インポート
import static java.util.Calendar.*;

//GregorianCalendarクラスのインポート
import java.util.GregorianCalendar;

/*クラス名:Day
*概要:日付を管理
*作成者:K.Asakura
*作成日:2024/05/27
*/
public class Day {

	//先頭にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_ZERO = 0;
	//2番目にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_ONE = 1;
	//3番目にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_TWO = 2;
	//1月を表す整数を定数化
	static final int JANUARY_MONTH = 1;
	//2月を表す整数を定数化
	static final int FEBRUARY_MONTH = 2;
	//3月を表す整数を定数化
	static final int MARCH_MONTH = 3;
	//4月を表す整数を定数化
	static final int APRIL_MONTH = 4;
	//5月を表す整数を定数化
	static final int MAY_MONTH = 5;
	//6月を表す整数を定数化
	static final int JUNE_MONTH = 6;
	//7月を表す整数を定数化
	static final int JULY_MONTH = 7;
	//8月を表す整数を定数化
	static final int AUGUST_MONTH = 8;
	//9月を表す整数を定数化
	static final int SEPTEMBER_MONTH = 9;
	//10月を表す整数を定数化
	static final int OCTOBER_MONTH = 10;
	//11月を表す整数を定数化
	static final int NOVEMBER_MONTH = 11;
	//12月を表す整数を定数化
	static final int DECEMBER_MONTH = 12;
	//西暦1年を表す整数を定数化
	static final int AD_ONE_YEAR = 1;
	//月初めの日を表す整数を定数化
	static final int MONTH_FIRST_DAY = 1;
	//存在しない年数を表す整数を定数化
	static final int NON_EXISTING_YEAR = 0;
	//存在しない月数を表す整数を定数化
	static final int NON_EXISTING_MONTH = 0;
	//日付の大きさを求めるため、年にかける整数を定数化
	static final int YEARS_SIZE = 10000;
	//日付の大きさを求めるため、月にかける整数を定数化
	static final int MONTH_SIZE = 100;
	//日付の大きさを求めるため、日にかける整数を定数化
	static final int DATE_SIZE = 1;
	//プログラム実行時の月を正しく表示させるため、足す整数を定数化
	static final int MONTH_CENTURY_DISPLAY = 1;

	//年を表すint型の静的フィールドを宣言
	private static int yearNumber;
	//月を表すint型の静的フィールドを宣言
	private static int monthNumber;
	//日を表すint型の静的フィールドを宣言
	private static int dateNumber;
	//日付の比較の時に用いる年を表すint型のフィールドを宣言
	private int comparisonYearNumber;
	//日付の比較の時に用いる月を表すint型のフィールドを宣言
	private int comparisonMonthNumber;
	//日付の比較の時に用いる日を表すint型のフィールドを宣言
	private int comparisonDateNumber;
	//静的初期化子を設定
	static {
		//プログラムを実行した日付に設定されたインスタンスを生成
		GregorianCalendar todayDate = new GregorianCalendar();
		//年を表すint型のフィールドを宣言して実行時の年で初期化
		int yearNumber = todayDate.get(YEAR);
		//月を表すint型のフィールドを宣言して実行時の月で初期化
		int monthNumber = todayDate.get(MONTH) + MONTH_CENTURY_DISPLAY;
		//日を表すint型のフィールドを宣言して実行時の日付で初期化
		int dateNumber = todayDate.get(DATE);
		//Day型の年を現在の年で初期化
		Day.yearNumber = yearNumber;
		//Day型の月を現在の月で初期化
		Day.monthNumber = monthNumber;
		//Day型の日を現在の日で初期化
		Day.dateNumber = dateNumber;
	}

	/*コンストラクタ名:Day
	 *概要:日付の項目をプログラム実行時の日付で初期化
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day() {
	}

	/*コンストラクタ名:Day
	 *概要:年を仮引数で初期化し、それ以外をプログラム実行時の月、日で初期化
	 *引数:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day(int yearNumber) {
		//仮引数が0以下の場合実行
		if (yearNumber <= 0) {
			//仮引数に1を代入
			yearNumber = AD_ONE_YEAR;
		}
		//年を表す静的フィールドを仮引数で初期化
		Day.yearNumber = yearNumber;
		//年を表すフィールドを仮引数で初期化
		this.comparisonYearNumber = yearNumber;
	}

	/*コンストラクタ名:Day
	 *概要:年と月を仮引数で初期化し、日をプログラム実行時の日で初期化
	 *引数:年、月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day(int yearNumber, int monthNumber) {
		//コンストラクタを呼び出し、年を表すフィールドを仮引数で初期化
		this(yearNumber);
		//仮引数が12より大きい場合実行
		if (monthNumber > DECEMBER_MONTH) {
			//仮引数に12を代入
			monthNumber = DECEMBER_MONTH;
			//仮引数が1未満の場合実行
		} else if (monthNumber < JANUARY_MONTH) {
			//仮引数に1を代入
			monthNumber = JANUARY_MONTH;
		}
		//月を表す静的フィールドを仮引数で初期化
		Day.monthNumber = monthNumber;
		//月を表すフィールドを仮引数で初期化
		this.comparisonMonthNumber = monthNumber;
	}

	/*コンストラクタ名:Day
	 *概要:年、月、日を引数で初期化
	 *引数:年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day(int yearNumber, int monthNumber, int dateNumber) {
		//コンストラクタを呼び出し、年、月を表すフィールドを仮引数で初期化
		this(yearNumber, monthNumber);
		//仮引数がその月の最大日数を上回ったとき実行
		if (dateNumber >= maximumDayOfMonth(Day.monthNumber, Day.yearNumber)) {
			//その月の最大日数を代入
			dateNumber = maximumDayOfMonth(Day.monthNumber, Day.yearNumber);
		}
		//仮引数が1未満の場合実行
		else if (dateNumber <= MONTH_FIRST_DAY) {
			//仮引数に1を代入
			dateNumber = MONTH_FIRST_DAY;
		}
		//日を表す静的フィールドを仮引数で初期化
		Day.dateNumber = dateNumber;
		//日を表すフィールドを仮引数で初期化
		this.comparisonDateNumber = dateNumber;
	}

	/*コンストラクタ名:Day
	 *概要:同じクラスの年、月、日をコピーした値で初期化
	 *引数:同じクラスの年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day(Day dayInstance) {
		//同じクラスの年、月、日で初期化
		this(Day.yearNumber, Day.monthNumber, Day.dateNumber);
	}

	/*インスタンスメソッド名:getYaer
	 *概要:年を取得するメソッド
	 *引数:なし
	 *戻り値:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */

	public int getYaer() {
		//年を返却
		return yearNumber;
	}
	/*インスタンスメソッド名:getMonth
	 *概要:月を取得するメソッド
	 *引数:なし
	 *戻り値:月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */

	public int getMonth() {
		//月を返却
		return monthNumber;
	}

	/*インスタンスメソッド名:getDate
	 *概要:日を取得するメソッド
	 *引数:なし
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public int getDate() {
		//日を返却
		return dateNumber;
	}

	/*インスタンスメソッド名:setYaer
	 *概要:年を設定するメソッド
	 *引数:年(int型)
	 *戻り値:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setYaer(int year) {
		//引数を年に代入
		Day.yearNumber = year;
	}

	/*インスタンスメソッド名:setMonth
	 *概要:月を設定するメソッド
	 *引数:月(int型)
	 *戻り値:月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setMonth(int month) {
		//引数を月に代入
		Day.monthNumber = month;
	}

	/*インスタンスメソッド名:setDate
	 *概要:日を設定するメソッド
	 *引数:日(int型)
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setDate(int date) {
		//引数を日に代入
		Day.dateNumber = date;
	}

	/*インスタンスメソッド名:setDay
	 *概要:年、月、日を設定するメソッド
	 *引数:年、月、日(int型)
	 *戻り値:年、月、日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setDay(int year, int month, int date) {
		//引数を年に代入
		Day.yearNumber = year;
		//引数を月に代入
		Day.monthNumber = month;
		//引数を日に代入
		Day.dateNumber = date;
	}

	/*インスタンスメソッド名:getComparisonYearNumber
	 *概要:日付を比較する際に用いる年を取得するメソッド
	 *引数:なし
	 *戻り値:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public int getComparisonYearNumber() {
		//日付を比較する際に用いる年を返却
		return comparisonYearNumber;
	}

	/*インスタンスメソッド名:get
	 *概要:日付を比較する際に用いる月を取得するメソッド
	 *引数:なし
	 *戻り値:月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public int getComparisonMonthNumber() {
		//日付を比較する際に用いる月を返却
		return comparisonMonthNumber;
	}

	/*インスタンスメソッド名:get
	 *概要:日付を比較する際に用いる日を取得するメソッド
	 *引数:なし
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public int getComparisonDateNumber() {
		//日付を比較する際に用いる日を返却
		return comparisonDateNumber;
	}

	/*インスタンスメソッド名:setComparisonDay
	 *概要:日付を比較する際に用いる日付を設定するメソッド
	 *引数:年、月、日(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setComparisonDay(int yearNumber, int monthNumber, int dateNumber) {
		//日付を比較する際に用いる年に引数を代入
		comparisonYearNumber = yearNumber;
		//日付を比較する際に用いる月に引数を代入
		comparisonMonthNumber = monthNumber;
		//日付を比較する際に用いる日に引数を代入
		comparisonDateNumber = dateNumber;

	}

	/*インスタンスメソッド名:maximumDayOfMonth
	 *概要:その月の最大日数を求めて返却するメソッド
	 *引数:月、年(int型)
	 *戻り値:月の最大日数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public int maximumDayOfMonth(int monthNumber, int yearNumber) {
		//月の最大日数を代入するため変数を初期化して宣言
		int maximumDays = 0;
		//それぞれの月の最大日数が要素の値である配列を生成
		final int NOMAL_YEAR_MAXMUM_DAYS[] = { 31, 30, 28 };
		//うるう年の2月の最大日数を定数化
		final int LEAP_YEAR_MAXIMUM_DAYS = 29;
		//月によって代入する値を変更
		switch (monthNumber) {
		//1月の場合実行
		case JANUARY_MONTH:
			//3月の場合実行
		case MARCH_MONTH:
			//5月の場合実行
		case MAY_MONTH:
			//7月の場合実行
		case JULY_MONTH:
			//8月の場合実行
		case AUGUST_MONTH:
			//10月の場合実行
		case OCTOBER_MONTH:
			//12月の場合実行
		case DECEMBER_MONTH:
			//月の最大日数を代入
			maximumDays = NOMAL_YEAR_MAXMUM_DAYS[INDEX_NUMBER_ZERO];
			//条件分を抜け出る
			break;
		//4月の場合実行
		case APRIL_MONTH:
			//6月の場合実行
		case JUNE_MONTH:
			//9月の場合実行
		case SEPTEMBER_MONTH:
			//11月の場合実行
		case NOVEMBER_MONTH:
			//月の最大日数を代入
			maximumDays = NOMAL_YEAR_MAXMUM_DAYS[INDEX_NUMBER_ONE];
			//条件分を抜け出る
			break;
		//2月の場合実行
		case FEBRUARY_MONTH:
			//うるう年の場合であれば29をそうでないなら28を代入
			maximumDays = isLeapYear(yearNumber) ? LEAP_YEAR_MAXIMUM_DAYS
					: NOMAL_YEAR_MAXMUM_DAYS[INDEX_NUMBER_TWO];

		}
		//入力した日を返却
		return maximumDays;
	}

	/*関数名:leapYearDiscriminant
	 *概要:うるう年であればtrueを、そうでなければfalseを返却するメソッド
	 *引数:年(int型)
	 *戻り値:true,false(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public boolean isLeapYear(int yearNumber) {
		//うるう年の計算に用いる定数の配列を生成
		final int LEAP_YEAR_CALCULATING_FORMULA[] = { 4, 100, 400 };
		//うるう年であればtrueを、そうでなければfalseを代入
		boolean isLeapYear = yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ZERO] == 0
				&& (yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ONE] != 0
						|| yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_TWO] == 0) ? true : false;
		//論理値を返却
		return isLeapYear;
	}

	/*インスタンスメソッド名:getDaysPast
	 *概要:経過日数を算出して返却するメソッド
	 *引数:経過のインスタンス(Dayクラス型)
	 *戻り値:残り日数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public int pastDayOfYear(Day dayInstance) {
		//経過日数を算出ために、引く整数を定数化
		final int NUMBER_CALCULATE_PAST_DAYS = 1;
		//経過日数を表す変数を初期化して宣言
		int pastDateVaue = 0;
		//経過日数を計算して代入
		for (int i = JANUARY_MONTH; i < monthNumber; i++) {
			//各月の最大日数を計算
			int maximamMonthNumber = maximumDayOfMonth(i, yearNumber);
			//経過日数に各月の最大日数を加算して代入
			pastDateVaue += maximamMonthNumber;
		}
		//経過日数にインスタンスの日数を加算して代入
		pastDateVaue += dateNumber - NUMBER_CALCULATE_PAST_DAYS;
		//経過日数を返却
		return pastDateVaue;
	}

	/*インスタンスメソッド名:getRemainingDays
	 *概要:年内の残り日数を算出して返却するメソッド
	 *引数:日付のインスタンス(Dayクラス型)
	 *戻り値:残り日数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public int remainingDayOfYear(Day dayInstance) {
		//うるう年でない場合の年間の日数を定数化
		final int NOMAL_YEAR_ANNUAL_DAYS = 365;
		//うるう年の年間の日数を定数化
		final int LEAP_YEAR_ANNUAL_DAYS = 366;
		//残り日数を算出ために、その日付を含まないようにするための引く整数を定数化
		final int NUMBER_CALCULATE_REMAINING_DAYS = 1;
		//年間の日数を表す変数にうるう年なら366を、そうでなければ365を代入
		int annualDays = isLeapYear(yearNumber) == true ? LEAP_YEAR_ANNUAL_DAYS
				: NOMAL_YEAR_ANNUAL_DAYS;
		//残り日数を表す変数に年間の日数から経過日数とその日付を含まないようにするため1を引いた値を代入
		int remaingDateValue = annualDays - pastDayOfYear(dayInstance)-NUMBER_CALCULATE_REMAINING_DAYS;
		//残り日数を返却
		return remaingDateValue;
	}

	/*クラスメソッド名:todayAndAnotherDateComparison
	 *概要:2つの日付のを比較し、前後関係を判定した文字列を返却するメソッド
	 *引数:2つの日付(Dayクラス型)
	 *戻り値:判定結果を表した文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public static String todayAndAnotherDateComparison(Day dayInstance) {
		//プログラムを実行した日付に設定されたインスタンスを生成
		GregorianCalendar todayDate = new GregorianCalendar();
		//文字列を格納する変数を初期化して宣言
		String comparisonResult;
		//プログラム実行時の日付を数量化したもので初期化
		int firstDayValue = YEARS_SIZE * todayDate.get(YEAR)
				+ MONTH_SIZE * (todayDate.get(MONTH) + MONTH_CENTURY_DISPLAY)
				+ DATE_SIZE * todayDate.get(DATE);
		//引数の日付を数量化したもので初期化
		int secondDayValue = YEARS_SIZE * dayInstance.getYaer() + MONTH_SIZE * dayInstance.getMonth()
				+ DATE_SIZE * dayInstance.getDate();
		//1つめの日付が2つめの日付より前の場合実行
		if (firstDayValue > secondDayValue) {
			//変数に日付1の方が前であることを表す文字列を代入
			comparisonResult = ("入力した日付は本日よりも前の日付です。");
			//1つめの日付が2つめの日付より後ろの場合実行
		} else if (firstDayValue < secondDayValue) {
			//変数に日付1の方が後であることを表す文字列を代入
			comparisonResult = ("入力した日付は本日よりも後の日付です。");
			//日付1と2が同じ場合実行
		} else {
			//変数に同じであることを表す文字列を代入
			comparisonResult = ("入力した日付と本日は同じ日付です。");
		}
		//代入した文字列を返却
		return comparisonResult;

	}

	/*インスタンスメソッド名:twoInstanceDateDataComparison
	 *概要:2つの日付のを比較し、前後関係を判定した文字列を返却するメソッド
	 *引数:2つの日付(Dayクラス型)
	 *戻り値:判定結果を表した文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public String twoInstanceDateDataComparison(Day firstDayInstance, Day secondDayInstance) {
		//文字列を格納する変数を初期化して宣言
		String comparisonResult;

		//1つめの日付を数量化したもので初期化
		int firstDayValue = YEARS_SIZE * firstDayInstance.comparisonYearNumber
				+ MONTH_SIZE * firstDayInstance.comparisonMonthNumber
				+ DATE_SIZE * firstDayInstance.comparisonDateNumber;
		//2つめの日付を数量化したもので初期化
		int secondDayValue = YEARS_SIZE * secondDayInstance.comparisonYearNumber
				+ MONTH_SIZE * secondDayInstance.comparisonMonthNumber
				+ DATE_SIZE * secondDayInstance.comparisonDateNumber;

		//1つめの日付が2つめの日付より前の場合実行
		if (firstDayValue < secondDayValue) {
			//変数に日付1の方が前であることを表す文字列を代入
			comparisonResult = ("日付1は日付2よりも前の日付です。");
			//1つめの日付が2つめの日付より後ろの場合実行
		} else if (firstDayValue > secondDayValue) {
			//変数に日付1の方が後であることを表す文字列を代入
			comparisonResult = ("日付1は日付2よりも後の日付です。");
			//日付1と2が同じ場合実行
		} else {
			//変数に同じであることを表す文字列を代入
			comparisonResult = ("日付1と日付2は同じ日付です。");
		}
		//代入した文字列を返却
		return comparisonResult;

	}

	/*インスタンスメソッド名:updateAfterOneDay
	 *概要:日付を翌日に更新して返却するメソッド
	 *引数:日付(Dayクラス型)
	 *戻り値:翌日に更新した日付(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day updateAfterOneDay(Day dayInstance) {
		//インスタンスの日がその月の最大日数であった場合実行
		Outer: if (dateNumber == maximumDayOfMonth(monthNumber, yearNumber)) {
			//12月であった場合実行
			if (monthNumber == DECEMBER_MONTH) {
				//年を1増加
				yearNumber++;
				//1月を月に代入
				monthNumber = JANUARY_MONTH;
				//日に1を代入
				dateNumber = MONTH_FIRST_DAY;
				//アウターラベルを抜け出る
				break Outer;
			}
			//月を1増加
			monthNumber++;
			//日に1を代入
			dateNumber = MONTH_FIRST_DAY;
		}
		//その月の最後の日でなければ実行
		else {
			//日を1増加
			dateNumber++;
		}
		//日付の1日後の日付を返却
		return dayInstance;
	}

	/*インスタンスメソッド名:getNextDay
	 *概要:日付の翌日日付のデータを返却するメソッド
	 *引数:日付(Dayクラス型)
	 *戻り値:引数の翌日の日付(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day getNextDay(Day dayInstance) {
		//年を表す変数に引数のインスタンスの年を代入
		int yearNumber = Day.yearNumber;
		//月を表す変数に引数のインスタンスの月を代入
		int monthNumber = Day.monthNumber;
		//日を表す変数に引数のインスタンスの日を代入
		int dateNumber = Day.dateNumber;
		//インスタンスの日がその月の最大日数であった場合実行
		Outer: if (dateNumber == maximumDayOfMonth(monthNumber, yearNumber)) {
			//12月であった場合実行
			if (monthNumber == DECEMBER_MONTH) {
				//年を1増加
				yearNumber++;
				//1月を月に代入
				monthNumber = JANUARY_MONTH;
				//日に1を代入
				dateNumber = MONTH_FIRST_DAY;
				//アウターラベルを抜け出る
				break Outer;
			}
			//月を1増加
			monthNumber++;
			//日に1を代入
			dateNumber = MONTH_FIRST_DAY;
		}
		//その月の最後の日でなければ実行
		else {
			//日を1増加
			dateNumber++;
		}
		//引数の翌日の日付のインスタンスを生成
		Day nextDay = new Day(yearNumber, monthNumber, dateNumber);
		//翌日の日付のインスタンスを返却
		return nextDay;
	}

	/*インスタンスメソッド名:updateBeforeOneDay
	 *概要:日付を前日に更新して返却するメソッド
	 *引数:日付(Dayクラス型)
	 *戻り値:前日に更新した日付(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day updateBeforeOneDay(Day dayInstance) {
		//インスタンスの日が月初めの日であった場合実行
		Outer: if (dateNumber == MONTH_FIRST_DAY) {
			//1月であった場合実行
			if (monthNumber == JANUARY_MONTH) {
				//年を1減少
				yearNumber--;
				//年が0の場合実行
				if (yearNumber == NON_EXISTING_YEAR) {
					//年に1を代入
					yearNumber = AD_ONE_YEAR;
					//1年1月1日以前の日付が存在しないことを表示
					System.out.println("0001年01月01日以前の日付は存在しません\nなので、0001年01月01日(月) と表示します。");
					//アウターラベルを抜け出る
					break Outer;
				}
				//12月を月に代入
				monthNumber = DECEMBER_MONTH;
				//日に31を代入
				dateNumber = maximumDayOfMonth(monthNumber, yearNumber);
				//アウターラベルを抜け出る
				break Outer;
			}
			//月を1減少
			monthNumber--;
			//日にその月の最大日数を代入
			dateNumber = maximumDayOfMonth(monthNumber, yearNumber);
		}
		//その月の最初の日でなければ実行
		else {
			//日を1減少
			dateNumber--;
		}
		//日付の1日後の日付を返却
		return dayInstance;
	}

	/*インスタンスメソッド名:getLastDay
	 *概要:日付の前日の日付のデータを返却するメソッド
	 *引数:日付(Dayクラス型)
	 *戻り値:引数の前日の日付(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day getLastDay(Day dayInstance) {
		//年を表す変数に引数のインスタンスの年を代入
		int yearNumber = Day.yearNumber;
		//月を表す変数に引数のインスタンスの月を代入
		int monthNumber = Day.monthNumber;
		//日を表す変数に引数のインスタンスの日を代入
		int dateNumber = Day.dateNumber;
		//インスタンスの日が月初めの日であった場合実行
		Outer: if (dateNumber == MONTH_FIRST_DAY) {
			//1月であった場合実行
			if (monthNumber == JANUARY_MONTH) {
				//年を1減少
				yearNumber--;
				//年が0の場合実行
				if (yearNumber == NON_EXISTING_YEAR) {
					//年に1を代入
					yearNumber = AD_ONE_YEAR;
					//1年1月1日以前の日付が存在しないことを表示
					System.out.println("0001年01月01日以前の日付は存在しません\nなので、0001年01月01日(月) と表示します。");
					//アウターラベルを抜け出る
					break Outer;
				}
				//12月を月に代入
				monthNumber = DECEMBER_MONTH;
				//日に31を代入
				dateNumber = maximumDayOfMonth(monthNumber, yearNumber);
				//アウターラベルを抜け出る
				break Outer;
			}
			//月を1減少
			monthNumber--;
			//日にその月の最大日数を代入
			dateNumber = maximumDayOfMonth(monthNumber, yearNumber);
		}
		//その月の最初の日でなければ実行
		else {
			//日を1減少
			dateNumber--;
		}
		//引数の前日の日付のインスタンスを生成
		Day lastDay = new Day(yearNumber, monthNumber, dateNumber);
		//前日の日付のインスタンスを返却
		return lastDay;
	}

	/*インスタンスメソッド名:updateForwardIncrementDate
	 *概要:引数の進める日数分日付を後ろに更新して返却するメソッド
	 *引数:日付(Dayクラス型)、進める日数(int型)
	 *戻り値:進める日数分後ろに更新した日付(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day updateForwardIncrementDate(Day dayInstance, int advanceDayValue) {
		//進める日数と日の合計値を算出した変数を宣言
		int sumableValue = dateNumber + advanceDayValue;
		//年、月を跨いだ時に年、月を翌年、翌月にする処理
		while (sumableValue > maximumDayOfMonth(monthNumber, yearNumber)) {
			//その月が12月であった場合
			if (monthNumber == DECEMBER_MONTH) {
				//年を1増加
				yearNumber++;
				//月に1を代入
				monthNumber = JANUARY_MONTH;
				//進める日数と日の合計値からその月の最大日数を減算
				sumableValue -= maximumDayOfMonth(monthNumber, yearNumber);
				//ループの末尾へスキップ
				continue;
			}
			//進める日数と日の合計値からその月の最大日数を減算
			sumableValue -= maximumDayOfMonth(monthNumber, yearNumber);
			//月を1増加
			monthNumber++;
		}
		//日に残った合計値を代入
		dateNumber = sumableValue;
		//更新した日付を返却
		return dayInstance;
	}

	/*インスタンスメソッド名:forwardIncrementDate
	 *概要:引数分だけ日数を進めた日付のデータを返却するメソッド
	 *引数:日付(Dayクラス型)、進める日数(int型)
	 *戻り値:引数分後ろに進めた日付のデータが格納された配列(int型の配列)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day forwardIncrementDate(Day dayInstance, int advanceDayValue) {
		//年を表す変数に引数のインスタンスの年を代入
		int yearNumber = Day.yearNumber;
		//月を表す変数に引数のインスタンスの月を代入
		int monthNumber = Day.monthNumber;
		//日を表す変数に引数のインスタンスの日を代入
		int dateNumber = Day.dateNumber;

		///進める日数と日の合計値を算出した変数を宣言
		int sumableValue = dateNumber + advanceDayValue;
		//年、月を跨いだ時に年、月を翌年、翌月にする処理
		while (sumableValue > maximumDayOfMonth(monthNumber, yearNumber)) {
			//その月が12月であった場合
			if (monthNumber == DECEMBER_MONTH) {
				//年を1増加
				yearNumber++;
				//月に1を代入
				monthNumber = JANUARY_MONTH;
				//進める日数と日の合計値からその月の最大日数を減算
				sumableValue -= maximumDayOfMonth(monthNumber, yearNumber);
				//ループの末尾へスキップ
				continue;
			}
			//進める日数と日の合計値からその月の最大日数を減算
			sumableValue -= maximumDayOfMonth(monthNumber, yearNumber);
			//月を1増加
			monthNumber++;
		}
		//日に残った合計値を代入
		dateNumber = sumableValue;
		//引数のインスタンスを進める日数分進めた日付のインスタンスを生成
		Day forwardIncrementDate = new Day(yearNumber, monthNumber, dateNumber);

		//進める日数分進めた日付のインスタンスを返却
		return forwardIncrementDate;
	}

	/*インスタンスメソッド名:updateRevertIncrementDate
	 *概要:引数の戻す日数分日付を前に戻して更新して返却するメソッド
	 *引数:日付(Dayクラス型)、戻す日数(int型)
	 *戻り値:戻す日数分前に戻して更新した日付(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day updateRevertIncrementDate(Day dayInstance, int revertDayValue) {
		//年、月を跨いだ時に年、月を昨年、昨月にする処理
		Outer: while (revertDayValue >= dateNumber) {
			if (monthNumber == JANUARY_MONTH) {
				//年を1減少
				yearNumber--;
				//年が0の場合実行
				if (yearNumber == NON_EXISTING_YEAR) {
					//年に1を代入
					yearNumber = AD_ONE_YEAR;
					//月に1を代入
					monthNumber = JANUARY_MONTH;
					//日に1を代入
					dateNumber = MONTH_FIRST_DAY;
					//1年1月1日以前の日付が存在しないことを表示
					System.out.println("0001年01月01日以前の日付は存在しません\nなので、0001年01月01日(月) と表示します。");
					//アウターラベルを抜け出る
					break Outer;
				}
				//12月を月に代入
				monthNumber = DECEMBER_MONTH;
				//戻す日数からその月の最大日数を引いて代入
				revertDayValue -= maximumDayOfMonth(monthNumber, yearNumber);
				//ループの末尾へスキップ
				continue;
			}
			//月を1減少
			monthNumber--;
			//戻す日数からその月の最大日数を引いて代
			revertDayValue -= maximumDayOfMonth(monthNumber, yearNumber);
		}
		//戻す日数が日以下であれば実行
		if (revertDayValue <= dateNumber) {
			//日から戻す日数を引いて代入
			dateNumber -= revertDayValue;
		}
		//日が0の時実行
		if (dateNumber == NON_EXISTING_YEAR) {
			//月を1減少
			monthNumber--;
			//その月の最大日数を日に代入
			dateNumber = maximumDayOfMonth(monthNumber, yearNumber);
			//月が0である場合実行
			if (monthNumber == NON_EXISTING_MONTH) {
				//月に1を代入
				monthNumber = JANUARY_MONTH;
				//日に1を代入
				dateNumber = MONTH_FIRST_DAY;
			}

		}
		//更新した日付を返却
		return dayInstance;
	}

	/*インスタンスメソッド名:revertIncrementDate
	 *概要:引数の戻す日数分日付を前に戻した日付を返却するメソッド
	 *引数:日付(Dayクラス型)、戻す日数(int型)
	 *戻り値:戻す日数分前に戻した日付(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day revertIncrementDate(Day dayInstance, int revertDayValue) {
		//年を表す変数に引数のインスタンスの年を代入
		int yearNumber = Day.yearNumber;
		//月を表す変数に引数のインスタンスの月を代入
		int monthNumber = Day.monthNumber;
		//日を表す変数に引数のインスタンスの日を代入
		int dateNumber = Day.dateNumber;
		//年、月を跨いだ時に年、月を昨年、昨月にする処理
		Outer: while (revertDayValue >= dateNumber) {
			if (monthNumber == JANUARY_MONTH) {
				//年を1減少
				yearNumber--;
				//年が0の場合実行
				if (yearNumber == NON_EXISTING_YEAR) {
					//年に1を代入
					yearNumber = AD_ONE_YEAR;
					//月に1を代入
					monthNumber = JANUARY_MONTH;
					//日に1を代入
					dateNumber = MONTH_FIRST_DAY;
					//1年1月1日以前の日付が存在しないことを表示
					System.out.println("0001年01月01日以前の日付は存在しません\nなので、0001年01月01日(月) と表示します。");
					//アウターラベルを抜け出る
					break Outer;
				}
				//12月を月に代入
				monthNumber = DECEMBER_MONTH;
				//戻す日数からその月の最大日数を引いて代入
				revertDayValue -= maximumDayOfMonth(monthNumber, yearNumber);
				//ループの末尾へスキップ
				continue;
			}
			//月を1減少
			monthNumber--;
			//戻す日数からその月の最大日数を引いて代
			revertDayValue -= maximumDayOfMonth(monthNumber, yearNumber);
		}
		//戻す日数が日以下であれば実行
		if (revertDayValue <= dateNumber) {
			//日から戻す日数を引いて代入
			dateNumber -= revertDayValue;
		}
		//日が0の時実行
		if (dateNumber == NON_EXISTING_YEAR) {
			//月を1減少
			monthNumber--;
			//その月の最大日数を日に代入
			dateNumber = maximumDayOfMonth(monthNumber, yearNumber);
			//月が0である場合実行
			if (monthNumber == NON_EXISTING_MONTH) {
				//月に1を代入
				monthNumber = JANUARY_MONTH;
				//日に1を代入
				dateNumber = MONTH_FIRST_DAY;
			}

		}
		//引数のインスタンスを戻す日数分前に戻した日付のインスタンスを生成
		Day revertIncrementDate = new Day(yearNumber, monthNumber, dateNumber);
		//戻す日数分前に戻した日付のインスタンスを返却
		return revertIncrementDate;
	}

	/*インスタンスメソッド名:dayOfWeek
	 *概要:曜日を求めて返却するメソッド
	 *引数:なし
	 *戻り値:曜日にあたる整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
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

	/*インスタンスメソッド名:toString
	 *概要:その日付の曜日の文字列を返却するメソッド
	 *引数:なし
	 *戻り値:日付(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public String toString() {
		//曜日の文字列を格納する配列を生成
		String[] wd = {
				"日", "月", "火", "水", "木", "金", "土"
		};
		//年月日とそれに対応する曜日の文字列を返却
		return String.format("%04d年%02d月%02d日(%s)", yearNumber, monthNumber, dateNumber, wd[dayOfWeek()]);
	}

}