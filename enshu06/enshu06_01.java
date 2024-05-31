package enshu06;

/*クラス名:enshu06_01
 *概要:要素型がdouble型で要素数が5の配列を生成し、その全要素を表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/16
 */
public class enshu06_01 {

	/*関数名:main
	 *概要:要素型がdouble型で要素数が5の配列を生成し、その全要素を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/16
	 */
	public static void main(String[] args) {

		//要素数５を定数化
		final int ARRAY_FIVE = 5;

		//要素数5の配列の宣言
		double[] generatedNumber = new double[ARRAY_FIVE];

		//要素1に37を代入
		generatedNumber[1] = 37;
		//要素2に51を代入
		generatedNumber[2] = 51;
		//要素4に要素数1に2をかけた数を代入
		generatedNumber[4] = generatedNumber[1] * 2;

		//要素0の値を表示
		System.out.println("generatedNumber[" + 0 + "]=" + generatedNumber[0]);
		//要素1の値を表示
		System.out.println("generatedNumber[" + 1 + "]=" + generatedNumber[1]);
		//要素2の値を表示
		System.out.println("generatedNumber[" + 2 + "]=" + generatedNumber[2]);
		//要素3の値を表示
		System.out.println("generatedNumber[" + 3 + "]=" + generatedNumber[3]);
		//要素4の値を表示
		System.out.println("generatedNumber[" + 4 + "]=" + generatedNumber[4]);

	}

}
