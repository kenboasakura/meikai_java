package enshu12_01.enshu12_01;

//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:CarTravelTester
 *概要:対話的に車を移動し、総移動距離を表示
 *作成者:K.Asakura
 *作成日:2024/05/29
 */
public class CarTravelTester {
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
	 *作成日:2024/05/29
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
	 *作成日:2024/05/29
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

	/*関数名:leapYearDiscriminant
	 *概要:うるう年であればtrueを、そうでなければfalseを返却するメソッド
	 *引数:年(int型)
	 *戻り値:true,false(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	static boolean leapYearDiscriminant(int yearNumber) {
		//うるう年を計算する公式を用いてうるう年であればtrueを、そうでなければfalseを代入
		boolean isLeapYear = yearNumber % 4 == 0
				&& (yearNumber % 100 != 0
						|| yearNumber % 400 == 0) ? true : false;
		//論理値を返却
		return isLeapYear;
	}

	/*関数名:inputDateData
	 *概要:日を入力して返却するメソッド
	 *引数:年、月(int型)
	 *戻り値:日(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
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
			maximumDays = leapYearDiscriminant(yearNumber) ? LEAP_YEAR_MAXIMUM_DAYS
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

	/*関数名:inputDouble
	 *概要:正の実数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した実数(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	static double inputRegularDouble(String stringPromptEntry) {
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

	/*関数名:inputRegularInteger
	 *概要:正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	static int inputRegularInteger(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//正の整数を入力させる
		while (inputInteger <= 0) {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (inputInteger <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力して下さい");
			}
		}
		//読み込んだ整数を返却
		return inputInteger;
	}
	/*関数名:isYes
	 *概要:YesかNoかを判別し、Yesの場合はtrueを、Noの場合はfalseを返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:teue,もしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	static boolean isYes(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//Yesの場合に入力される整数を定数化
		final int WHEN_YES = 1;
		//Noの場合に入力される整数を定数化
		final int WHEN_NO = 0;
		//0か1の整数を入力させる
		do {
			//入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//0か1以外の整数が入力された場合実行
			if (inputInteger != WHEN_NO && inputInteger != WHEN_YES) {
				//0か1の整数を入力させる文字列を表示
				System.out.println("0か1の整数を入力してください");
			}
			//0か1の整数を入力されるまでループ
		} while (inputInteger != WHEN_NO && inputInteger != WHEN_YES);
		//1が入力された場合trueを、そうでなければfalseを代入
		boolean logicalValue = inputInteger == WHEN_YES ? true : false;
		//論理値を返却
		return logicalValue;

	}

	/*関数名:main
	 *概要:対話的に車を移動し、最後に総移動距離を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	public static void main(String[] args) {
		//車のデータを入力してくださいと表示
		System.out.println("車のデータを入力してください");
		//名前の入力を促す
		System.out.print("名前:");
		//車の名前を読み込む
		String carName = standardInput.next();
		//車のナンバーの入力を促す
		System.out.print("ナンバー:");
		//車のナンバーを読み込む
		String carNumber = standardInput.next();
		//車幅を読み込んで代入
		int carWidth = inputRegularInteger("車幅:");
		//車幅を読み込んで代入
		int carHeight = inputRegularInteger("車高:");
		//車長を読み込んで代入
		int carLength = inputRegularInteger("車長:");
		//タンク容量を読み込んで代入
		double carTankCapasity = inputRegularDouble("タンク容量:");
		//燃費を読み込んで代入
		double fuelConsumption = inputRegularDouble("燃費(km/L):");
		//残り燃料を表す変数を初期化して宣言
		double remainingFuel = 0;
		do {
			//残り燃料を読み込んで代入
			remainingFuel = inputRegularDouble("残り燃料:");
			if (remainingFuel > carTankCapasity) {
				System.out.println("0より大きく" + carTankCapasity + "以下の燃料を入れてください");
			}
		} while (remainingFuel > carTankCapasity);
		//車の購入日の入力を促す文字列を表示
		System.out.println("車の購入日を入力してください");
		//購入日の年を読み込んで代入
		int yearNumber = inputYearData();
		//購入日の月を読み込んで代入
		int monthNumber = inputMonthData();
		//購入日の日を読み込んで代入
		int dateNumber = inputDateData(monthNumber, yearNumber);
		//購入日の日付のデータを格納したインスタンスを生成
		Day purchaseDay = new Day(yearNumber, monthNumber, dateNumber);
		//車のデータを格納したCarクラスのインスタンスを生成
		Car myCar = new Car(carName, carNumber, carWidth, carHeight, carLength, carTankCapasity, fuelConsumption,
				remainingFuel,
				purchaseDay);
		//車のデータを格納したCarクラスのサブクラスのインスタンスを生成
		CarTravel myTravelCar = new CarTravel(carName, carNumber, carWidth, carHeight, carLength, carTankCapasity,
				fuelConsumption,
				remainingFuel,
				purchaseDay);
		//インスタンスメソッドを呼び出して車のスペックを表示
		myCar.putSpec();
		//X方向への移動距離を表す変数を初期化して宣言
		double movingHorizontalAxisCoordinate = 0;
		//Y方向への移動距離を表す変数を初期化して宣言
		double movingVerticalAxisCoordinate = 0;
		//対話的に自動車を移動させるため無限ループを実行
		while (true) {
			//インスタンスメソッドを呼び出して現在地の座標と残り燃料を表示
			System.out.printf("現在地(%1.2f,%1.2f)残り燃料:%1.2fL\n", myCar.getHorizontalAxisCoordinate(),
					myCar.getVerticalAxisCoordinate(), myCar.getRemainingFuel());
			//タンク容量の15%を求めるために、乗算される実数を定数化
			final double PROMPT_REFUEL = 0.15;
			//給油を促す燃料の残量を求めるために、乗算する実数を定数化
			if (myCar.getRemainingFuel() <= myCar.getTankCapacity() * PROMPT_REFUEL) {
				//ガソリンランプが消えるまで給油させる
				while (myCar.getRemainingFuel() <= myCar.getTankCapacity() * PROMPT_REFUEL) {
					//給油を促す文をを表示
					System.out.println("給油してください!");
					//インスタンスメソッドを呼び出して給油する
					myCar.getCarRefill();
					//給油後の残り燃料を表示
					System.out.printf("残り燃料%1.2fL\n", myCar.getRemainingFuel());
				}
			}
			//移動しない場合プログラムを終了
			if (isYes("移動しますか? [1…Yes/0…No]:") == false) {
				//ループを抜け出す
				break;
			}
			//X方向への移動距離の入力を促す
			System.out.print("X方向の移動距離:");
			//X方向への移動距離を読み込む
			movingHorizontalAxisCoordinate = standardInput.nextDouble();
			//Y方向への移動距離の入力を促す
			System.out.print("Y方向の移動距離:");
			//Y方向への移動距離を読み込む
			movingVerticalAxisCoordinate = standardInput.nextDouble();
			//移動によってガソリンの残り残量がなくなってしまった場合実行
			if (myCar.canCarMovavle(movingHorizontalAxisCoordinate, movingVerticalAxisCoordinate) == false) {
				//燃料がないことを表示
				System.out.println("燃料が足りません!");
				//移動できないためx方向の移動距離に0を代入
				movingHorizontalAxisCoordinate = 0;
				//移動できないためy方向の移動距離に0を代入
				movingVerticalAxisCoordinate = 0;
			}
			//総移動距離を表示
			System.out.printf("総移動距離:%1.2fkm\n",
					myTravelCar.calculateCarTotalTravelDistance(movingHorizontalAxisCoordinate,
							movingVerticalAxisCoordinate));
		}
		//移動をしなかったことを表示
		System.out.println("移動を終了します。");
		//総移動距離を表示
		System.out.printf("総移動距離は%1.2fkmでした。",
				myTravelCar.getCarTotalTravelDistance());

	}

}
