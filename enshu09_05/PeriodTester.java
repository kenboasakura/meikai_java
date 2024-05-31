package enshu09_05;
//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:PeriodTester
 *概要:2つの日付を読み込んで開始日と終了日を表示
 *作成者:K.Asakura
 *作成日:2024/05/23
 */
public class PeriodTester {

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

	/*関数名:inputYearData
	 *概要:年を入力して返却するメソッド
	 *引数:なし
	 *戻り値:年(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	static int inputYearData() {
		//入力した整数を読み込むため変数を初期化して宣言
		int inputIntegerData = 0;
		//正の整数を入力させる
		while (inputIntegerData <= 0) {
			//年の入力を促す
			System.out.print("年:");
			//整数を読み込む
			inputIntegerData = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (inputIntegerData <= 0) {
				//0より大きい数値を入力してくださいと表示
				System.out.println("0より大きい数値を入力してください");
			}
		}
		//入力したデータを返却
		return inputIntegerData;
	}

	/*関数名:inputMonthData
	 *概要:月を入力して返却するメソッド
	 *引数:なし
	 *戻り値:月(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	static int inputMonthData() {
		//入力した整数を読み込むため変数を初期化して宣言
		int inputIntegerData = 0;
		//年間の月数の合計を定数化
		final int MAXIMUM_MONTH_VALUE = 12;
		//1以上12以下の整数を入力させる
		while (inputIntegerData <= 0 || inputIntegerData > MAXIMUM_MONTH_VALUE) {
			//月の入力を促す
			System.out.print("月:");
			//整数を読み込む
			inputIntegerData = standardInput.nextInt();
			//0以下か12より大きい整数が入力された場合実行
			if (inputIntegerData <= 0 || inputIntegerData > MAXIMUM_MONTH_VALUE) {
				//1以上12以下の整数を入力してくださいと表示
				System.out.println("1から12の数値を入力してください");
			}
		}
		//入力した月を返却
		return inputIntegerData;
	}

	/*関数名:isLeapYear
	 *概要:うるう年であるか判別し、うるう年であればtrueを、そうでなければfalseを返却するメソッド
	 *引数:年(int型)
	 *戻り値:true,false(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	static boolean isLeapYear(int yearNumber) {
		//うるう年の計算に用いる定数の配列を生成
		final int LEAP_YEAR_CALCULATING_FORMULA[] = { 4, 100, 400 };
		//うるう年であればtrueを、そうでなければfalseを論理型の変数に代入
		boolean isLeapYear = yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ZERO] == 0
				&& (yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ONE] != 0
						|| yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_TWO] == 0) ? true : false;
		//論理値を返却
		return isLeapYear;
	}

	/*関数名:inputDateData
	 *概要:日を入力して返却するメソッド
	 *引数:年、月(int型)
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	static int inputDateData(int monthNumber, int yearNumber) {
		//入力した整数を読み込むため変数を初期化して宣言
		int inputIntegerData = 0;
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
		//1からその月の最大日数以下の整数を入力させる
		while (inputIntegerData <= 0 || inputIntegerData > maximumDays) {
			//日の入力を促す
			System.out.print("日:");
			//整数を読み込む
			inputIntegerData = standardInput.nextInt();
			//0以下かその月の最大日数より大きな整数が入力された場合実行
			if (inputIntegerData <= 0 || inputIntegerData > maximumDays) {
				//1からその月の最大日数の数値を入力してくださいと表示
				System.out.println("1から" + maximumDays + "の数値を入力してください");
			}
		}
		//入力した日を返却
		return inputIntegerData;
	}

	/*関数名:isFirstIntegerSmaller
	 *概要:2つの整数のうち1つめの整数が2つめの整数以下かを判別し、正しければtrueをそうでなければfalseを返却するメソッド
	 *引数:2つの整数(int型)
	 *戻り値:trueもしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	static boolean isFirstIntegerSmaller(int firstInteger, int secondInteger) {
		//2つめの整数が1つめの整数以上であればtrueをそうでなければfalseを論理値の変数に代入
		boolean logicalValue = firstInteger <= secondInteger ? true : false;
		//2つめの整数が1つめの整数より小さかった場合実行
		if (logicalValue == false) {
			//1つめの整数以上の整数を入力させる文字列を表示
			System.out.println(firstInteger + "以上の数値を入力してください");
		}
		//論理値を返却
		return logicalValue;
	}

	/*関数名:main
	 *概要:2つの日付を読み込んで開始日と終了日を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public static void main(String[] args) {
		//開始日と表示
		System.out.println("開始日");
		//メソッドを呼び出して、開始年を読み込んで代入
		int startYear = inputYearData();
		//メソッドを呼び出して、開始月を読み込んで代入
		int startMonth = inputMonthData();
		//メソッドを呼び出して、開始日を読み込んで代入
		int startDate = inputDateData(startMonth, startYear);
		//入力された年、月、日を引数としてインスタンスを生成
		Day startDateInstans = new Day(startYear, startMonth, startDate);
		//終了年を表す変数を初期化して宣言
		int endYear = 0;
		//終了月を表す変数を初期化して宣言
		int endMonth = 0;
		//終了日を表す変数を初期化して宣言
		int endDate = 0;
		//終了日と表示
		System.out.println("終了日");
		//終了年が開始年以上になるように入力させる
		while (true) {
			//メソッドを呼び出して、終了年を読み込んで代入
			endYear = inputYearData();
			//終了年が開始年以上であれば実行
			if (isFirstIntegerSmaller(startYear, endYear) == true) {
				//無限ループを終了
				break;
			}
		}
		//終了年月が開始年月以上になるよう入力させる
		while (true) {
			//メソッドを呼び出して、終了月を読み込んで代入
			endMonth = inputMonthData();
			if (startYear < endYear) {
				//無限ループを終了
				break;
			}
			//終了月が開始月以上であれば実行
			if (isFirstIntegerSmaller(startMonth, endMonth) == true) {
				//無限ループを終了
				break;
			}
		}
		//終了日が開始日以上になるよう入力させる
		while (true) {
			//メソッドを呼び出して、終了日を読み込んで代入
			endDate = inputDateData(endMonth, endYear);
			//終了年月が開始年月より大きい場合実行
			if (startYear < endYear || startMonth < endMonth) {
				//無限ループを終了
				break;
			}
			//終了日が開始日以上であれば実行
			if (isFirstIntegerSmaller(startDate, endDate) == true) {
				//無限ループを終了
				break;
			}
		}
		//入力された年、月、日を引数としてインスタンスを生成
		Day endDateInstans = new Day(endYear, endMonth, endDate);
		//開始日と終了日を引数としてインスタンスを生成
		Period twoDatePeriod = new Period(startDateInstans, endDateInstans);
		//メソッドを呼び出して2つの日付を表示
		System.out.println(twoDatePeriod);
		//開始日と終了日が同じであれば実行
		if (startYear == endYear && startMonth == endMonth && startDate == endDate) {
			//期間が0日間であったことを表示
			System.out.println("期間は0日間でした。");
		}
	}

}
