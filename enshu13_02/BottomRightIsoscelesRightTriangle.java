package enshu13_02;


/*クラス名:BottomRightIsoscelesRightTriangle
 *概要:右下が直角の二等辺三角形を表すクラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class BottomRightIsoscelesRightTriangle extends IsoscelesRightTriangle {

	/*コンストラクタ名:BottomRightIsoscelesRightTriangle
	 *概要:右下が直角の二等辺三角形を表すコンストラクタ
	 *引数:二等辺の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public BottomRightIsoscelesRightTriangle(int twoEqualSidesLength) {
		//IsoscelesRightTriangleクラスのコンストラクタを呼び出す
		super(twoEqualSidesLength);

	}

	/*メソッド名:toString
	 *概要:右下が直角の二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:右下が直角の二等辺三角形に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//右下が直角の二等辺三角形に関する図形情報を表す文字列を返却
		return "BottomRightIsoscelesRightTriangle(twoEqualSidesLength:" + getTwoEqualSidesLength() + ")";
	}

	/*メソッド名:drawShape
	 *概要:右下が直角の二等辺三角形を描画するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void drawShape() {
		//空白を出力する数を調整するために引かれる整数を定数化
		final int SPACE_OUTPUT_TIMES_ADJUSTMENT = 1;
		//三角形の高さ設定
		for (int i = 0; i < getTwoEqualSidesLength(); i++) {
			//右下に直角を作るためにその分の空白を生成
			for (int j = 0; j < getTwoEqualSidesLength() - i - SPACE_OUTPUT_TIMES_ADJUSTMENT; j++) {
				//空白を出力
				System.out.print(" ");
			}
			//右下が直角の二等辺三角形になるように*を出力
			for (int k = 0; k <= i; k++) {
				//*を出力
				System.out.print('*');
			}
			//改行を出力
			System.out.println();
		}
	}

}
