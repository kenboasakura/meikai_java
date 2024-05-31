package enshu08_02;

//Scannerクラスを呼び出す
import java.util.Scanner;

/*クラス名:CarTester
 *概要:車のデータを読み込んで表示し、対話的に車を移動する
 *作成者:K.Asakura
 *作成日:2024/05/16
 */
public class CarTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputRealNumber
	 *概要:正の実数値を入力させるメソッド
	 *引数:整数(int型)
	 *戻り値:入力された車のデータ(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	static double inputRegularData(int x) {
		//車のデータの入力を促す文字列を格納した配列を生成
		String[] carDataItems = {
				"車幅:", "車高:", "車長:", "タンク容量:", "燃費:", "残り燃料:"
		};
		//入力した実数を読み込むための変数を初期化して宣言
		double inputDataValue = 0;
		//0以上の実数を入力させる
		while (inputDataValue <= 0) {
			//配列の中から各データの入力を促す文字列を表示
			System.out.print(carDataItems[x]);
			//実数の入力を促す
			inputDataValue = standardInput.nextDouble();
			//0以下の整数が入力された場合実行
			if (inputDataValue <= 0) {
				//0より大きい数値を入力してくださいと表示
				System.out.println("0より大きい数値を入力してください");
			}
		}
		//入力したデータを返却
		return inputDataValue;
	}

	/*関数名:main
	 *概要:車のデータを読み込んで表示し、対話的に車を移動する
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	public static void main(String[] args) {
		//車のデータに格納されている情報の個数を定数化
		final int CAR_DATA_COUNT = 6;
		//車幅が格納されている場所を表す整数を定数化
		final int CAR_WIDHS_INDEX = 0;
		//車高が格納されている場所を表す整数を定数化
		final int CAR_HEIGHT_INDEX = 1;
		//車長が格納されている場所を表す整数を定数化
		final int CAR_LENGTH_INDEX = 2;
		//タンク容量が格納されている場所を表す整数を定数化
		final int CAR_TANK_CAPACITY_INDEX = 3;
		//燃費が格納されている場所を表す整数を定数化
		final int CAR_FUEL_COMSUPTION_INDEX = 4;
		//残り燃料が格納されている場所を表す整数を定数化
		final int CAR_REMAINING_FUEL_INDEX = 5;
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
		//車のデータを格納する配列を生成
		double CarData[] = new double[CAR_DATA_COUNT];
		//車のデータに入力した実数を代入する処理
		for (int i = 0; i < CAR_DATA_COUNT; i++) {
			//メソッドを呼び出して入力した車のデータを各要素に代入
			CarData[i] = inputRegularData(i);
			//燃料が0未満もしくはタンク容量を上回った場合実行
			if (i == CAR_REMAINING_FUEL_INDEX && (CarData[CAR_REMAINING_FUEL_INDEX] < 0
					|| CarData[CAR_TANK_CAPACITY_INDEX] < CarData[CAR_REMAINING_FUEL_INDEX])) {
				//適切な値を入力してくださいと表示
				System.out.println("0より大きく" + CarData[CAR_TANK_CAPACITY_INDEX] + "以下の燃料を入れてください");
				//もう一度燃料を入れさせる
				i--;
			}
		}
		//車のデータを格納したインスタンスの生成
		Car myCar = new Car(carName, carNumber, CarData[CAR_WIDHS_INDEX], CarData[CAR_HEIGHT_INDEX],
				CarData[CAR_LENGTH_INDEX],
				CarData[CAR_TANK_CAPACITY_INDEX], CarData[CAR_FUEL_COMSUPTION_INDEX],
				CarData[CAR_REMAINING_FUEL_INDEX]);
		//インスタンスメソッドを呼び出して車のスペックを表示
		myCar.putSpec();
		//対話的に自動車を移動させるため無限ループを実行
		while (true) {
			//インスタンスメソッドを呼び出して現在地の座標と残り燃料を表示
			System.out.println("現在地(" + myCar.getHorizontalAxisCoordinate() + "," + myCar.getVerticalAxisCoordinate() +
					")・残り燃料" + myCar.getRemainingFuel() + "L");
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
					System.out.println("残り燃料" + myCar.getRemainingFuel() + "L");
				}
			}

			//移動するかを問うための変数を初期化して宣言
			int questionMoving = 0;
			//0か1を入力させる処理に用いる1を定数化
			final int EXECUTION_MOVING_CAR = 1;
			//0か1の整数を入力させる
			do {
				System.out.print("移動しますか? [0…No/1…Yes]:");
				//整数を読み込む
				questionMoving = standardInput.nextInt();
				//0か1以外の整数が入力された場合
				if (questionMoving < 0 || questionMoving > EXECUTION_MOVING_CAR) {
					//0か1の整数を入力させる
					System.out.println("0か1の整数を入力してください");
				}
				//0か1が入力されるまでループ
			} while (questionMoving < 0 || questionMoving > EXECUTION_MOVING_CAR);
			//移動しない場合プログラムを終了
			if (questionMoving == 0)
				break;
			//X方向への移動距離の入力を促す
			System.out.print("X方向の移動距離:");
			//X方向への移動距離を読み込む
			double movingHorizontalAxisCoordinate = standardInput.nextDouble();
			//Y方向への移動距離の入力を促す
			System.out.print("Y方向の移動距離:");
			//Y方向への移動距離を読み込む
			double movingVerticalAxisCoordinate = standardInput.nextDouble();
			//移動によってガソリンの残り残量がなくなってしまった場合実行
			if (myCar.isCarMovavle(movingHorizontalAxisCoordinate, movingVerticalAxisCoordinate) == false) {
				//燃料がないことを表示
				System.out.println("燃料が足りません!");
				//移動できないためx方向の移動距離に0を代入
				movingHorizontalAxisCoordinate = 0;
				//移動できないためy方向の移動距離に0を代入
				movingVerticalAxisCoordinate = 0;
			}
		}
		//移動をしなかったことを表示
		System.out.println("移動を終了します。");
	}
}
