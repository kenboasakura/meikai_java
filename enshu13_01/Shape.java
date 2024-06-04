package enshu13_01;

/*クラス名:Shape
*概要:図形の概念を表す抽象クラス
*作成者:K.Asakura
*作成日:2024/05/30
*/
public abstract class Shape {
	
	/*メソッド名:toString
	 *概要:図形情報を表す文字列を返却する抽象メソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public abstract String toString();
	
	/*メソッド名:draw
	 *概要:図形を描画するための抽象メソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public abstract void drawShape();
	
	/*メソッド名:printShape
	 *概要:図形情報の表示と描画を行うメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void printShape() {
		//toStringが返却する文字列を表示
		System.out.println(toString());
		//メソッドを呼び出して図形を描画
		drawShape();
	}
	

}