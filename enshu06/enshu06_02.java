package enshu06;

/*クラス名:enshu06_02
 *概要:要素型がint型で要素数が5の配列の要素に対して先頭から5,4,3,2,1と代入するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/16
 */

public class enshu06_02 {

	/*関数名:main
	 *概要:要素型がint型で要素数が5の配列の要素に対して先頭から5,4,3,2,1と代入するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/16
	 */
	public static void main(String[] args) {
		
		//要素数を示すため5を定数化
		final int ELEMENT_COUNT = 5;
		
		//要素数5の配列を宣言
		int[] generatedNumber = new int [ELEMENT_COUNT];
		
		//要素数分1ずつ減少させて代入する処理
		for(int i =0 ; i < generatedNumber.length;i++) {
			//5を1ずつ減少させて代入
			generatedNumber[i] = -i+ELEMENT_COUNT;
			//代入した各要素の値を表示
			System.out.println("generatedNumber["+i+"]="+generatedNumber[i]);
		}
		

	}

}
