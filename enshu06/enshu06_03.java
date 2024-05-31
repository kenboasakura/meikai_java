package enshu06;

/*クラス名:enshu06_03
 *概要:要素型がdouble型で要素数が5の配列の要素に対して、1.1ずつ増加させて代入するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/16
 */
public class enshu06_03 {

	/*関数名:main
	 *概要:要素型がdouble型で要素数が5の配列の要素に対して、1.1ずつ増加させて代入するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/16
	 */
	public static void main(String[] args) {

		//要素数５を定数化
		final int ARRAY_FIVE = 5;
		//増加する値1.1を定数化
		final double ARRAY_ONE= 1.1;

		//要素数5のdouble型の配列を宣言
		double[] generatedNumber = new double[ARRAY_FIVE];

		//要素数5まで1.1ずつ増加する処理
		for (int i = 0; i < generatedNumber.length; i++) {
			//各要素に1.1ずつ増加させて代入
			generatedNumber[i] = i * ARRAY_ONE + ARRAY_ONE;
			//代入した各要素の値を表示
			System.out.println("generatedNumber[" + i + "]=" + generatedNumber[i]);
		}

	}

}
