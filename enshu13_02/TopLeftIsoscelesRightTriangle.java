package enshu13_02;

/*クラス名:TopLeftIsoscelesRightTriangle
 *概要:左上が直角の二等辺三角形を表すクラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class TopLeftIsoscelesRightTriangle extends IsoscelesRightTriangle {

	/*コンストラクタ名:TopLeftIsoscelesRightTriangle
	 *概要:左上が直角の二等辺三角形を表すコンストラクタ
	 *引数:二等辺の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public TopLeftIsoscelesRightTriangle(int twoEqualSidesLength) {
		//IsoscelesRightTriangleクラスのコンストラクタを呼び出す
		super(twoEqualSidesLength);

	}

	/*メソッド名:toString
	 *概要:左上が直角の二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:左上が直角の二等辺三角形に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//左上が直角の二等辺三角形に関する図形情報を表す文字列を返却
		return "TopLeftIsoscelesRightTriangle(twoEqualSidesLength:" + getTwoEqualSidesLength() + ")";
	}

	/*メソッド名:drawShape
	 *概要:左上が直角の二等辺三角形を描画するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void drawShape() {
		//三角形の高さを設定
		for (int i = 0; i < getTwoEqualSidesLength(); i++) {
			//左上が直角の二等辺三角形になるように*を出力
			for (int j = i; j < getTwoEqualSidesLength(); j++) {
				//*を出力
				System.out.print('*');
			}
			//改行して表示
			System.out.println();
		}
	}

}
