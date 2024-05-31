package enshu09_02;

import java.util.Scanner;

/*クラス名:DayTester
 *概要:入力した年月日をもつ日付1と日付2、日付2をコピーした日付3を表示
 *作成者:K.Asakura
 *作成日:2024/05/20
 */
public class DayTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
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

	/*関数名:main
	 *概要:日を入力して返却するメソッド
	 *引数:年、月(int型)
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	static int inputDateData(int firstInteger, int secondInteger) {
		//入力した整数を読み込むため変数を初期化して宣言
		int inputIntegerData = 0;
		//月の最大日数を代入するため変数を初期化して宣言
		int maximumDays = 0;
		//それぞれの月の最大日数が要素の値である配列を生成
		final int NOMAL_YEAR_MAXMUM_DAYS[] = { 31, 30, 28 };
		//うるう年の計算に用いる定数の配列を生成
		final int LEAP_YEAR_CALCULATING_FORMULA[] = { 4, 100, 400 };
		//うるう年の2月の最大日数を定数化
		final int LEAP_YEAR_MAXIMUM_DAYS = 29;
		//先頭にある構成要素の場所を表す整数を定数化
		final int INDEX_NUMBER_ZERO = 0;
		//2番目にある構成要素の場所を表す整数を定数化
		final int INDEX_NUMBER_ONE = 1;
		//3番目にある構成要素の場所を表す整数を定数化
		final int INDEX_NUMBER_TWO = 2;

		//引数に応じて代入する値を変更
		switch (firstInteger) {
		//1,3,5,7,8,10,12月の場合実行
		case JANUARY_MONTH:
		case MARCH_MONTH:
		case MAY_MONTH:
		case JULY_MONTH:
		case AUGUST_MONTH:
		case OCTOBER_MONTH:
		case DECEMBER_MONTH:
			//月の最大日数を代入
			maximumDays = NOMAL_YEAR_MAXMUM_DAYS[INDEX_NUMBER_ZERO];
			//条件分を抜け出る
			break;
		//4,6,9,11月の場合実行
		case APRIL_MONTH:
		case JUNE_MONTH:
		case SEPTEMBER_MONTH:
		case NOVEMBER_MONTH:
			//月の最大日数を代入
			maximumDays = NOMAL_YEAR_MAXMUM_DAYS[INDEX_NUMBER_ONE];
			//条件分を抜け出る
			break;
		//2月の場合実行
		case FEBRUARY_MONTH:
			//うるう年の場合であれば29をそうでないなら28を代入
			maximumDays = (secondInteger % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ZERO] == 0
					&& (secondInteger % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ONE] != 0
							|| secondInteger % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_TWO] == 0))
									? LEAP_YEAR_MAXIMUM_DAYS
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

	/*関数名:main
	 *概要:入力した年月日をもつ日付1と日付2、日付2をコピーした日付3を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public static void main(String[] args) {
		//日付1の入力を促す文字列を表示
		System.out.println("日付1の年、月、日を入力してください");
		//メソッドを呼び出して日付1の年を読み込んで代入
		int firstYearNumber = inputYearData();
		//メソッドを呼び出して日付1の月を読み込んで代入
		int firstMonthNumber = inputMonthData();
		//メソッドを呼び出して日付1の日を読み込んで代入
		int firstDateNumber = inputDateData(firstMonthNumber, firstYearNumber);
		//日付のデータを格納したインスタンスの生成
		Day firstDayInstans = new Day();
		//日付を表示
		System.out.println("日付1を" + firstDayInstans + "で初期化しました。");
		//入力した年を引数とするコンストラクタを呼び出し、インスタンスを生成
		firstDayInstans = new Day(firstYearNumber);
		//日付を表示＊月数と日数は1で初期化
		System.out.println("日付1=" + firstDayInstans + "＊月数と日数は1で初期化しています。");
		//入力した年、日を引数とするコンストラクタを呼び出し、インスタンスを生成
		firstDayInstans = new Day(firstYearNumber, firstMonthNumber);
		//日付を表示＊日数は1で初期化
		System.out.println("日付1=" + firstDayInstans + "＊日数は1で初期化しています。");
		//入力した年、月、日を引数とするコンストラクタを呼び出し、インスタンスを生成
		firstDayInstans = new Day(firstYearNumber, firstMonthNumber, firstDateNumber);
		//日付を表示
		System.out.println("日付1=" + firstDayInstans);
		//区切りを表示
		System.out.println("----------------------------------------------------------");
		//日付2の入力を促す文字列を表示
		System.out.println("日付2の年、月、日を入力してください");
		//メソッドを呼び出して日付2の年を読み込んで代入
		int secondYearNumber = inputYearData();
		//メソッドを呼び出して日付2の月を読み込んで代入
		int secondMonthNumber = inputMonthData();
		//メソッドを呼び出して日付2の日を読み込んで代入
		int secondDateNumber = inputDateData(secondMonthNumber, secondYearNumber);
		//入力した年、月、日を引数とするコンストラクタを呼び出し、インスタンスを生成
		Day secondDayInstans = new Day(secondYearNumber, secondMonthNumber, secondDateNumber);
		//日付2を表示
		System.out.println("日付2=" + secondDayInstans);
		//区切りを表示
		System.out.println("----------------------------------------------------------");
		//日付3の内容を表示
		System.out.println("日付2をコピーした日付3を表示します。");
		//日付のインスタンスを引数とするコンストラクタを呼び出し、コピーインスタンスを生成
		Day copyDayInstans = new Day(secondDayInstans);
		//日付2をコピーした日付3を表示
		System.out.println("日付3=" + copyDayInstans);
	}

}
