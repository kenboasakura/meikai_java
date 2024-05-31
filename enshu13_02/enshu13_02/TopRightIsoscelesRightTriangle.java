package enshu13_02;

/*クラス名:TopRightIsoscelesRightTriangle
 *概要:右上が直角の二等辺三角形を表すクラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class TopRightIsoscelesRightTriangle extends IsoscelesRightTriangle {

	/*コンストラクタ名:TopRightIsoscelesRightTriangle
	 *概要:右上が直角の二等辺三角形を表すコンストラクタ
	 *引数:二等辺の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public TopRightIsoscelesRightTriangle(int twoEqualSidesLength) {
		//IsoscelesRightTriangleクラスのコンストラクタを呼び出す
		super(twoEqualSidesLength);

	}

	/*メソッド名:toString
	 *概要:右上が直角の二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:右上が直角の二等辺三角形に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//右上が直角の二等辺三角形に関する図形情報を表す文字列を返却
		return "TopRightIsoscelesRightTriangle(twoEqualSidesLength:" + getTwoEqualSidesLength() + ")";
	}

	/*メソッド名:drawShape
	 *概要:右上が直角の二等辺三角形を描画するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void drawShape() {
		//三角形の高さを設定
		for (int i = 0; i < getTwoEqualSidesLength(); i++) {
			//右上に直角を作るためにその分の空白を生成
			for (int j = 0; j < i; j++) {
				//空白を出力
				System.out.print(" ");
			}
			//右上が直角の二等辺三角形になるように*を出力
			for (int k = i; k < getTwoEqualSidesLength(); k++) {
				//*を出力
				System.out.print('*');
			}
			//改行を出力
			System.out.println();
		}
	}

}
