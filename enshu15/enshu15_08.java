package enshu15;

//Calendarクラスの静的インポート
import static java.util.Calendar.*;

//GregorianCalendarクラスのインポート
import java.util.GregorianCalendar;
//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:enshu15_08
 *概要:指定された年、月のカレンダーを表示
 *作成者:K.Asakura
 *作成日:2024/06/04
 */
public class enshu15_08 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
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
	//月初めの日を表す整数を定数化
	static final int FIRST_DATE = 1;
	//日付の調整のために足す整数を定数化
	static final int ADJUSTMENT_MONTH = 1;
	//西暦1年を定数化
	static final int AD_ONE_YEAR = 1;
	//1週間の日数を定数化
	static final int WEEKLY_DAYS = 7;

	/*インスタンスメソッド名:maximumDayOfMonth
	 *概要:その月の最大日数を求めて返却するメソッド
	 *引数:月、年(int型)
	 *戻り値:月の最大日数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/06/04
	 */
	public static int maximumDayOfMonth(int monthNumber, int yearNumber) {
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
	 *作成日:2024/06/04
	 */
	public static boolean isLeapYear(int yearNumber) {
		//うるう年の計算に用いる定数の配列を生成
		final int LEAP_YEAR_CALCULATING_FORMULA[] = { 4, 100, 400 };
		//うるう年であればtrueを、そうでなければfalseを代入
		boolean isLeapYear = yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ZERO] == 0
				&& (yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ONE] != 0
						|| yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_TWO] == 0) ? true : false;
		//論理値を返却
		return isLeapYear;
	}

	/*メソッド名:startingDayOfWeek
	 *概要:月初めの曜日を求めて返却するメソッド
	 *引数:なし
	 *戻り値:曜日にあたる整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/06/04
	 */
	public static int startingDayOfWeek(int yearNumber, int monthNumber) {
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
		return (yearValue + yearValue / 4 - yearValue / 100 + yearValue / 400 + (13 * monthValue + 8) / 5 + FIRST_DATE)
				% 7;
	}

	/*メソッド名:displayCalendar
	 *概要:その年、月のカレンダーを表示
	 *引数:年、月(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/04
	 */
	public static void displayCalendar(int yearNumber, int monthNumber) {
		//その月を表示
		System.out.println(monthNumber + "月");
		//カレンダーの曜日を表示
		System.out.println("日 月 火 水 木 金 土");
		//月初めの曜日に合わせて空白を出力
		for (int i = 0; i < startingDayOfWeek(yearNumber, monthNumber); i++) {
			//空白を出力
			System.out.print("   ");
		}
		//その月の日にちをカレンダー形式で
		for (int i = FIRST_DATE; i <= maximumDayOfMonth(monthNumber, yearNumber); i++) {
			//その日付を表示
			System.out.printf("%2d ", i);
			//次の日が日曜日の場合
			if ((startingDayOfWeek(yearNumber, monthNumber) + i) % WEEKLY_DAYS == 0) {
				//改行を出力
				System.out.println();
			}
		}
		//改行を出力
		System.out.println();
	}

	/*関数名:main
	 *概要:指定された年、月のカレンダーを表示
	 *引数:年,月(String型の配列)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/04
	 */
	public static void main(String[] args) {
		//年のみが入力された場合の整数を定数化
		final int ONLY_YEAR = 1;
		//年と月が入力された場合の整数を定数化
		final int YEAR_AND_MONTH = 2;
		//月を表す変数を初期化して宣言
		int monthNumber = 0;
		//年をを表す変数を初期化して宣言
		int yearNumber = 0;
		//グレゴリアンカレンダークラスのオブジェクトを生成
		GregorianCalendar todayCalendar = new GregorianCalendar();
		//引数に年のみが与えられた場合
		if (args.length == ONLY_YEAR) {
			//年にコマンドライン引数を代入
			yearNumber = Integer.parseInt(args[INDEX_NUMBER_ZERO]);
			//読み込んだ年を表示
			System.out.println(yearNumber + "年");
			//0以下の整数が読み込まれた場合実行
			if (yearNumber <= 0) {
				//年に1月を代入することを表示
				System.out.println("年に0以下の整数が読み込まれたため現在の西暦1年のカレンダーを表示");
				//年に1を代入
				yearNumber = AD_ONE_YEAR;
				//現在の年を表示
				System.out.println(yearNumber + "年");
			}
			//年内のカレンダーを表示することを表示
			System.out.println("年のみが入力されたため、年内のカレンダーを表示します。");
			//その年の1月から12月までのカレンダーを表示
			for (int i = JANUARY_MONTH; i <= DECEMBER_MONTH; i++) {
				//各月のカレンダーを表示
				displayCalendar(yearNumber, i);
			}
			//引数に年と月が与えられた場合
		} else if (args.length == YEAR_AND_MONTH) {
			//年にコマンドライン引数を代入
			yearNumber = Integer.parseInt(args[INDEX_NUMBER_ZERO]);
			//月にコマンドライン引数を代入
			monthNumber = Integer.parseInt(args[INDEX_NUMBER_ONE]);
			//読み込んだ年を表示
			System.out.println(yearNumber + "年");
			//読み込んだ月を表示
			System.out.println(monthNumber + "月");
			//0以下の整数が読み込まれた場合実行
			if (yearNumber <= 0) {
				//年に西暦1年を代入することを表示
				System.out.println("年に0以下の整数が読み込まれたため現在の西暦1年のカレンダーを表示");
				//年に1を代入
				yearNumber = AD_ONE_YEAR;
				//現在の年を表示
				System.out.println(yearNumber + "年");
			} //1から12以外の整数が入力された場合実行
			if (monthNumber < JANUARY_MONTH) {
				//現月に1月を代入することを表示
				System.out.println("月に0以下の整数が読み込まれたため1月のカレンダーを表示");
				//月に1月を代入
				monthNumber = JANUARY_MONTH;
				//月に12月より大きい値が入力された場合
			} else if (monthNumber > DECEMBER_MONTH) {
				//月に12月を代入することを表示
				System.out.println("月に13以上の整数が読み込まれたため12月のカレンダーを表示");
				//月に12月を代入
				monthNumber = DECEMBER_MONTH;
			}
			//月のカレンダーを表示することを表示
			System.out.println("年、月が入力されたため、月のカレンダーを表示");
			//その月のカレンダーを表示
			displayCalendar(yearNumber, monthNumber);
			//コマンドライン引数が与えられなかったか、要素数が2つより多い場合
		} else {
			//コマンドライン引数が入力されていない場合
			if (args.length == 0) {
				//西暦1年1月のカレンダーを表示することを表示
				System.out.println("引数が入力されていないため現在の月のカレンダーを表示");

				//年に現在の年を代入
				yearNumber = todayCalendar.get(YEAR);
				//月に現在の月を代入
				monthNumber = todayCalendar.get(MONTH) + ADJUSTMENT_MONTH;
				//その月のカレンダーを表示
				displayCalendar(yearNumber, monthNumber);
			}
		}

	}

}
