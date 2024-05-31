package enshu13_02;

/*クラス名:BottomLeftIsoscelesRightTriangle
 *概要:左下が直角の二等辺三角形を表すクラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class BottomLeftIsoscelesRightTriangle extends IsoscelesRightTriangle {

	/*コンストラクタ名:BottomLeftIsoscelesRightTriangle
	 *概要:左下が直角の二等辺三角形を表すコンストラクタ
	 *引数:二等辺の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public BottomLeftIsoscelesRightTriangle(int twoEqualSidesLength) {
		//IsoscelesRightTriangleクラスのコンストラクタを呼び出す
		super(twoEqualSidesLength);

	}

	/*メソッド名:toString
	 *概要:左下が直角の二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:左下が直角の二等辺三角形に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//左下が直角の二等辺三角形に関する図形情報を表す文字列を返却
		return "BottomLeftIsoscelesRightTriangle(twoEqualSidesLength:" + getTwoEqualSidesLength() + ")";
	}

	/*メソッド名:drawShape
	 *概要:左下が直角の二等辺三角形を描画するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void drawShape() {
		//三角形の高さを設定
		for (int i = 0; i < getTwoEqualSidesLength(); i++) {
			//左下が直角の二等辺三角形になるように*を出力
			for (int j = 0; j <= i; j++) {
				//*を出力
				System.out.print('*');
			}
			//改行を出力
			System.out.println();
		}
	}
}
