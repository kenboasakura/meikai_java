package enshu15;

/*クラス名:enshu15_06
 *概要:円の半径を読み込み、その半径の円周の長さと面積を表示
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class enshu15_06 {
	

	/*関数名:main
	 *概要:円の半径を読み込み、その半径の円周の長さと面積を表示
	 *引数:半径(String型の配列)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//コマンドライン引数の先頭のインデックスを定数化
		final int INDEX_ZERO = 0;
		//半径にコマンドライン引数を代入
		double radiusLengs = Double.parseDouble(args[INDEX_ZERO]);
		//コマンドライン引数が負の実数の場合実行
		if (radiusLengs <= 0) {
			//値を反転することを表示
			System.out.println("コマンドライン引数が負の実数のため値を反転します。");
			//半径に値を反転したものを代入
			radiusLengs = -radiusLengs;
		}
		//円周を求める公式を用いて円周の長さを表示
		System.out.println("円周の長さは" + 2 * Math.PI * radiusLengs + "です。");
		//面積を表示
		System.out.println(
				"面積は" + Math.PI * radiusLengs * radiusLengs + "です。");

	}

}
