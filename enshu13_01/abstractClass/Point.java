package abstractClass;

/*クラス名:Point
 *概要:点を表すクラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class Point extends Shape{
	
	/*コンストラクタ名:point
	 *概要:点を生成するコンストラクタ
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public Point() {
		
	}
	
	/*メソッド名:toString
	 *概要:図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:文字列"Point"(Point型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//図形情報を表す文字列を返却
		return "Point";
	}
	/*メソッド名:drawShape
	 *概要:プラス記号を1つだけ表示するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void drawShape() {
		//+を表示
		System.out.println('+');
	}

}
