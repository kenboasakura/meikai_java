package enshu13_02;

/*クラス名:IsoscelesRightTriangle
 *概要:直角二等辺三角形を表す抽象クラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public abstract class IsoscelesRightTriangle extends Shape {
	//直角二等辺三角形の二等辺の長さを表すint型のフィールドを初期化して宣言
	private int twoEqualSidesLength = 0;

	/*コンストラクタ名:IsoscelesRightTriangle
	 *概要:二等辺の長さを生成するコンストラクタ
	 *引数:二等辺の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public IsoscelesRightTriangle(int twoEqualSidesLength) {
		//メソッドを呼び出して三角形の二等辺の長さを生成
				setTwoEqualSidesLength(twoEqualSidesLength);
	}

	/*メソッド名:getTwoEqualSidesLength
	 *概要:二等辺の長さを取得するメソッド
	 *引数:なし
	 *戻り値:二等辺の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public int getTwoEqualSidesLength() {
		//二等辺の長さを返却
		return twoEqualSidesLength;
		
	}
	
	/*インスタンスメソッド名:setTwoEqualSidesLength
	 *概要:二等辺の長さを設定するメソッド
	 *引数:二等辺の長さ(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void setTwoEqualSidesLength(int twoEqualSidesLength) {
		//二等辺の長さを表すフィールドに仮引数を代入
		this.twoEqualSidesLength = twoEqualSidesLength;
	}
		
	/*インスタンスメソッド名:toString
	 *概要:二等辺の長さを表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:二等辺の長さを表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString () {
		//二等辺の長さを表す文字列を返却
		return "twoEqualSidesLength("+twoEqualSidesLength+")";
	}

}
