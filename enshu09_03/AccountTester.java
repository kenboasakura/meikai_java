package enshu09_03;

//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:AccountTester
 *概要:個人の講座情報を表示
 *作成者:K.Asakura
 *作成日:2024/05/22
 */
public class AccountTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	//先頭にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_ZERO = 0;
	//2番目にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_ONE = 1;
	//3番目にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_TWO = 2;

	/*関数名:inputLong
	 *概要0以上の整数を入力させて返却するメソッド
	 *引数:なし
	 *戻り値:入力した整数(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static long inputLong() {
		//入力を促す文字列を格納した配列を生成
		String stringDisplay[] = {
				"預金残高:"
		};
		//整数を読み込むため変数を初期化して宣言
		long intputLong = 0;
		//0以上の整数が入力させる
		do {
			//預金残高の入力を促す
			System.out.print(stringDisplay[INDEX_NUMBER_ZERO]);
			//整数を読み込む
			intputLong = standardInput.nextLong();
			//0未満の整数が入力された場合実行
			if (intputLong < 0) {
				//正の整数の入力を促す
				System.out.println("0以上の数値を入力して下さい");
			}
			//0以上の整数が入力されるまでループ
		} while (intputLong < 0);
		//読み込んだ整数を返却
		return intputLong;
	}

	/*関数名:inputString
	 *概要:文字列を入力させてそれを返却するメソッド
	 *引数:なし
	 *戻り値:入力した文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static String inputString() {
		//文字列を読み込む
		String inputString = standardInput.next();
		//読み込んだ文字列を返却
		return inputString;
	}

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

	/*関数名:inputDateData
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
	 *概要:個人の口座情報を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public static void main(String[] args) {
		//口座名義の入力を促す
		System.out.print("口座名義:");
		//メソッドを呼び出して、名前を読み込んで代入
		String individualName = inputString();
		//口座番号の入力を促す
		System.out.print("口座番号:");
		//メソッドを呼び出して、口座番号を読み込んで代入
		String individualNumber = inputString();
		//メソッドを呼び出して、預金残高を読み込んで代入
		long individualBalance = inputLong();
		//口座開設日の入力を促す文字列を表示
		System.out.println("口座開設日");
		//メソッドを呼び出して口座開設した年を読み込んで代入
		int openingYearNumber = inputYearData();
		//メソッドを呼び出して口座開設した月を読み込んで代入
		int openingMonthNumber = inputMonthData();
		//メソッドを呼び出して口座開設した日を読み込んで代入
		int openingDateNumber = inputDateData(openingMonthNumber, openingYearNumber);
		//入力した年、月、日を引数とするコンストラクタを呼び出し、インスタンスを生成
		Day courseOpeningDate = new Day(openingYearNumber, openingMonthNumber, openingDateNumber);
		//入力した口座名義、番号、預金残高、口座開設日を引数とするコンストラクタを呼び出し、インスタンスを生成
		Account individualInformation = new Account(individualName, individualNumber, individualBalance,
				courseOpeningDate);
		//口座情報を表示
		System.out.println(individualInformation);
		
		
	}

}
