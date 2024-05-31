package enshu10_03;

/*クラス名:MinMax
 *概要:最大値と最小値を求めるメソッドを管理
 *作成者:K.Asakura
 *作成日:2024/05/24
 */
public class MinMax {

	/*関数名:getBinaryMaximumValue
	 *概要:2つの実数のうち大きい方を返却するメソッド
	 *引数:2つの実数(double型)
	 *戻り値:最大値(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	public static double getBinaryMaximumValue(double firstDouble, double secondDouble) {
		//mathクラスを用いて2つの実数値の大きい方の値を代入
		double maximumValue = Math.max(firstDouble, secondDouble);
		//最大値を返却
		return maximumValue;
	}

	/*関数名:getTernaryMaximumValue
	 *概要:3つの実数のうち最大値を返却するメソッド
	 *引数:3つの実数(double型)
	 *戻り値:最大値(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	public static double getTernaryMaximumValue(double firstDouble, double secondDouble, double thirdDoube) {
		//mathクラスを用いて始めの2つの実数値の最大値を代入
		double maximumValue = Math.max(firstDouble, secondDouble);
		//mathクラスを用いて最大値を表す変数と3つめの実数値の大きい方を代入
		maximumValue = Math.max(maximumValue, thirdDoube);
		//最大値を返却
		return maximumValue;
	}

	/*関数名:getArrayMaximumValue
	 *概要:配列の最大値を求めて返却するメソッド
	 *引数:配列(double型)
	 *戻り値:最大値(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	public static double getArrayMaximumValue(double doubleArray[]) {
		//先頭のインデックスを表す整数を定数化
		final int INDEX_NUMBER_ZERO = 0;
		//最大値を表す変数を先頭の要素の値で初期化
		double maximumValue = doubleArray[INDEX_NUMBER_ZERO];
		//最大値を求めて代入
		for (int i = 0; i < doubleArray.length; i++) {
			//大きい方を最大値に代入
			maximumValue = Math.max(maximumValue, doubleArray[i]);
		}
		//最大値を返却
		return maximumValue;
	}

	/*関数名:getBinaryMinimumValue
	 *概要:2つの実数のうち小さい方を返却するメソッド
	 *引数:2つの実数(double型)
	 *戻り値:最小値(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	public static double getBinaryMinimumValue(double firstDouble, double secondDouble) {
		//mathクラスを用いて2つの実数値の小さい方の値を代入
		double minimumValue = Math.min(firstDouble, secondDouble);
		//最小値を返却
		return minimumValue;
	}

	/*関数名:getTernaryMinimumValue
	 *概要:3つの実数のうち最小値を返却するメソッド
	 *引数:3つの実数(double型)
	 *戻り値:最小値(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	public static double getTernaryMinimumValue(double firstDouble, double secondDouble, double thirdDoube) {
		//mathクラスを用いて始めの2つの実数値の最小値を代入
		double minimumValue = Math.min(firstDouble, secondDouble);
		//mathクラスを用いて最小値を表す変数と3つめの実数値の小さい方を代入
		minimumValue = Math.min(minimumValue, thirdDoube);
		//最小値を返却
		return minimumValue;
	}

	/*関数名:getArrayMinimumValue
	 *概要:配列の最小値を返却するメソッド
	 *引数:配列(double型)
	 *戻り値:最小値(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	public static double getArrayMinimumValue(double doubleArray[]) {
		//先頭のインデックスを表す整数を定数化
		final int INDEX_NUMBER_ZERO = 0;
		//最小値を表す変数を先頭の要素の値で初期化
		double minimumValue = doubleArray[INDEX_NUMBER_ZERO];
		//最小値を求めて代入
		for (int i = 0; i < doubleArray.length; i++) {
			//大きい方を最小値に代入
			minimumValue = Math.min(minimumValue, doubleArray[i]);
		}
		//最小値を返却
		return minimumValue;
	}

}
