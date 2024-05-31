package enshu09_04;

//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:HumanTester
 *概要:個人情報を読み込んで表示
 *作成者:K.Asakura
 *作成日:2024/05/22
 */
public class HumanTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	//先頭にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_ZERO = 0;
	//2番目にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_ONE = 1;
	//3番目にある構成要素の場所を表す整数を定数化
	static final int INDEX_NUMBER_TWO = 2;

	/*関数名:inputDouble
	 *概要:正の実数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した実数(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static double inputDouble(String stringPromptEntry) {
		//実数を読み込むため変数を初期化して宣言
		double inputDouble = 0;
		//正の実数を入力させる
		while (inputDouble <= 0) {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//実数を読み込む
			inputDouble = standardInput.nextDouble();
			//0以下の実数が入力された場合実行
			if (inputDouble <= 0) {
				//正の整数の入力を促す
				System.out.println("正の実数を入力して下さい");
			}
		}
		//読み込んだ実数を返却
		return inputDouble;
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
	static int inputDateData(int monthNumber, int yearNumber) {
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
			maximumDays = (yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ZERO] == 0
					&& (yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_ONE] != 0
							|| yearNumber % LEAP_YEAR_CALCULATING_FORMULA[INDEX_NUMBER_TWO] == 0))
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
	 *概要:個人情報を読み込んで表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public static void main(String[] args) {
		//名前の入力を促す
		System.out.print("名前:");
		//名前を読み込む
		String individualName = standardInput.next();
		//身長を読み込むための変数を初期化して宣言
		double individualHeight = inputDouble("身長:");
		//体重を読み込むための変数を初期化して宣言
		double individualWeight = inputDouble("体重:");
		//誕生日の入力を促す文字列を表示
		System.out.println("誕生日");
		//メソッドを呼び出して誕生日の年を読み込んで代入
		int individualBirthdayYear = inputYearData();
		//メソッドを呼び出して誕生日の月を読み込んで代入
		int individualBirthdayMonth = inputMonthData();
		//メソッドを呼び出して誕生日の日を読み込んで代入
		int individualBirthdayDate = inputDateData(individualBirthdayMonth, individualBirthdayYear);
		//入力した年、月、日を引数とするコンストラクタを呼び出し、インスタンスを生成
		Day individualBirthdayInstance = new Day(individualBirthdayYear, individualBirthdayMonth,
				individualBirthdayDate);
		//入力した名前、身長、体重、誕生日を引数とするコンストラクタを呼び出し、インスタンスを生成
		Human individualInformation = new Human(individualName, individualHeight, individualWeight,
				individualBirthdayInstance);
		//個人情報を表示
		System.out.println(individualInformation);
	}

}
