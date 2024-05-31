package enshu12_01;

/*クラス名:CarTravel
 *概要:車の総走行距離を管理
 *作成者:K.Asakura
 *作成日:2024/05/29
 */
class CarTravel extends Car {
	//車の総走行距離を表すint型のフィールドを宣言
	private double carTotalTravelDistance = 0;

	/*コンストラクタ名:CarTravel
	 *概要:Carクラスのコンストラクタを呼び出し、総移動距離を0で初期化
	 *引数:車の名前、ナンバー(String型)、
	 *車幅、車高、車長(int型),x座標、y座標、タンク容量、燃費、残り燃料(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	CarTravel(String carName, String carNumber, int carWidth, int carHeight, int carLength,
			double tankCapacity, double fuelConsumption, double remainingFuel, Day purchaseDay) {
		//スーパークラスのコンストラクタを呼び出す
		super(carName, carNumber, carWidth, carHeight, carLength, tankCapacity, fuelConsumption,
				remainingFuel,
				purchaseDay);
		//総移動距離を0で初期化
		this.carTotalTravelDistance = 0;
	}

	/*インスタンスメソッド名:getCarTotalTravelDistance
	 *概要:総移動距離を取得するメソッド
	 *引数:なし
	 *戻り値:総移動距離(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	double getCarTotalTravelDistance() {
		//総移動距離を返却
		return carTotalTravelDistance;
	}

	/*インスタンスメソッド名:calculateCarTotalTravelDistance
	 *概要:総移動距離を取得するメソッド
	 *引数:x,y座標(double型)
	 *戻り値:総移動距離(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/29
	 */
	double calculateCarTotalTravelDistance(double horizontalAxisCoordinate, double verticalAxisCoordinate) {
		//総移動距離に移動距離を計算したものを加算して代入
		carTotalTravelDistance += Math.sqrt(horizontalAxisCoordinate * horizontalAxisCoordinate +
				verticalAxisCoordinate * verticalAxisCoordinate);
		//総移動距離を返却
		return carTotalTravelDistance;
	}

}
