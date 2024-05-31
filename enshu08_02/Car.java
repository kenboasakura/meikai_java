package enshu08_02;

//Scannerクラスを呼び出す
import java.util.Scanner;

/*クラス名:Car
 *概要:車のデータを管理
 *作成者:K.Asakura
 *作成日:2024/05/16
 */
public class Car {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	//名前を表すString型のフィールド宣言
	private String carName;
	//ナンバーを表すString型のフィールド宣言
	private String carNumber;
	//車幅を表すdouble型のフィールド宣言
	private double carWidth;
	//車高を表すdouble型のフィールド宣言
	private double carHeight;
	//車長を表すdouble型のフィールド宣言
	private double carLength;
	//現在のx座標を表すdouble型のフィールド宣言
	private double horizontalAxisCoordinate;
	//現在のy座標を表すdouble型のフィールド宣言
	private double verticalAxisCoordinate;
	//タンク容量を表すdouble型のフィールド宣言
	private double tankCapacity;
	//燃費を表すdouble型のフィールド宣言
	private double fuelConsumption;
	//残り燃料を表すdouble型のフィールド宣言
	private double remainingFuel;

	/*コンストラクタ名:Car
	 *概要:車のデータのインスタンスを仮引数で初期化
	 *引数:Stringの車の名前、String型の車のナンバー、
	 *車の車幅、車高、車長,x座標、y座標、タンク容量、燃費、残り燃料(すべてdouble型)
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	Car(String carName, String carNumber, double carWidth, double carHeight, double carLength,
			double tankCapacity, double fuelConsumption, double remainingFuel) {
		//名前を表すフィールドを仮引数で初期化
		this.carName = carName;
		//ナンバーを表すフィールドを仮引数で初期化
		this.carNumber = carNumber;
		//車幅を表すフィールドを仮引数で初期化
		this.carWidth = carWidth;
		//車高を表すフィールドを仮引数で初期化
		this.carHeight = carHeight;
		//車長を表すフィールドを仮引数で初期化
		this.carLength = carLength;
		//現在のx座標を仮引数で初期化
		this.horizontalAxisCoordinate = 0;
		//現在のy座標を仮引数で初期化
		this.verticalAxisCoordinate = 0;
		//タンク容量を表すフィールドを仮引数で初期化
		this.tankCapacity = tankCapacity;
		//燃費を表すフィールドを仮引数で初期化
		this.fuelConsumption = fuelConsumption;
		//残り燃料を表すフィールドを仮引数で初期化
		this.remainingFuel = remainingFuel;
	}

	/*インスタンスメソッド名:putSpec
	 *概要:車のスペックを表示するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	void putSpec() {
		//車のスペックと表示
		System.out.println("車のスペックを表示します。");
		//車の名前を表示
		System.out.println("名前:" + carName);
		//車のナンバーを表示
		System.out.println("ナンバー:" + carNumber);
		//車幅を表示
		System.out.println("車幅:" + carWidth + "mm");
		//車高を表示
		System.out.println("車高:" + carHeight + "mm");
		//車長を表示
		System.out.println("車高:" + carLength + "mm");
		//車のタンク容量をを表示
		System.out.println("タンク容量:" + tankCapacity + "L");
		//燃費を表示
		System.out.println("燃費:" + fuelConsumption + "km/L");

	}

	/*インスタンスメソッド名:gethorizontalAxisCoordinate
	 *概要:現在のx座標を返却するメソッド
	 *引数:なし
	 *戻り値:現在のx座標(double型の値)
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	double getHorizontalAxisCoordinate() {
		//現在のx座標を返却
		return horizontalAxisCoordinate;
	}

	/*インスタンスメソッド名:getverticalAxisCoordinate
	 *概要:現在のy座標を返却するメソッド
	 *引数:なし
	 *戻り値:現在のy座標(double型の値)
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	double getVerticalAxisCoordinate() {
		//現在のy座標を返却
		return verticalAxisCoordinate;
	}

	/*インスタンスメソッド名:getTankCapacity
	 *概要:タンク容量を返却するメソッド
	 *引数:なし
	 *戻り値:タンク容量(double型の値)
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	double getTankCapacity() {
		//タンク容量を返却
		return tankCapacity;
	}

	/*インスタンスメソッド名:getTankCapacity
	 *概要:残り燃料を返却するメソッド
	 *引数:なし
	 *戻り値:残り燃料(double型の値)
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	double getRemainingFuel() {
		//残り燃料を返却
		return remainingFuel;
	}

	/*インスタンスメソッド名:getRefillValue
	 *概要:給油したのちの残り燃料を返却するメソッド
	 *引数:なし
	 *戻り値:残り燃料(double型の値)
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	double getCarRefill() {
		//給油量を表す変数を初期化して宣言
		double inputFuelValue = 0;
		//給油を促す燃料の残量を求めるために、乗算する実数を定数化
		final double PROMPT_REFUEL = 0.15;
		//給油量が0より多いかつ容量以内になるまで給油させる
		do {
			//給油量の入力を促す
			System.out.print("給油量:");
			//給油量を読みこむ
			inputFuelValue = standardInput.nextDouble();
			//給油量が0以下か、給油後の燃料が容量の15%以下の場合か、給油後の燃料が容量を上回ったときに実行
			if(inputFuelValue <= 0 ||inputFuelValue+ remainingFuel <= tankCapacity * PROMPT_REFUEL
					||tankCapacity < inputFuelValue + remainingFuel){
				//適切な給油量を表示
				System.out.println((tankCapacity * PROMPT_REFUEL - remainingFuel)+"Lより多く"
				+(tankCapacity - remainingFuel) + "L以下で給油してください");
				}
			//給油後の燃料が容量の15%より多いかつ容量以内になるまでループ
		} while (remainingFuel+ inputFuelValue <= tankCapacity * PROMPT_REFUEL || tankCapacity <remainingFuel+ inputFuelValue);
		//残り燃料に給油した量を加えて代入
		remainingFuel = remainingFuel + inputFuelValue;
		//残り燃料を返却
		return remainingFuel;
	}

	/*インスタンスメソッド名:isCarMovale
	 *概要:移動後の残り燃料が残っている場合trueを、残っていなければfalseを返却するメソッド
	 *引数:x,y方向への移動距離(double型の値)
	 *戻り値:trueもしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/16
	 */
	boolean isCarMovavle(double x, double y) {
		//移動後の残り燃料を表す変数を初期化して宣言
		double afterMovingRemainingFuel = 0;
		//移動した距離を算出して代入
		double movingDistance = Math.sqrt(x * x + y * y);
		//移動後の残り燃料を算出して代入
		afterMovingRemainingFuel = remainingFuel - (movingDistance / fuelConsumption);
		//移動の可否を問う論理型の変数にtrueを代入して宣言
		boolean movingAvailability = true;
		//移動後の残り燃料が移動前の残り燃料を上回った場合に実行
		if (afterMovingRemainingFuel <= 0) {
			//移動の可否を問う論理型の変数にfalseを代入
			movingAvailability = false;
		} //移動後の燃料が残っている場合実行
		else {
			//残り燃料に移動後の残り燃料を代入
			remainingFuel = afterMovingRemainingFuel;
			//現在のx座標に移動した距離を足して代入
			horizontalAxisCoordinate += x;
			//現在のy座標に移動した距離を足して代入
			verticalAxisCoordinate += y;
		}
		//移動の可否を問う論理型の変数を返却
		return movingAvailability;
	}

}
