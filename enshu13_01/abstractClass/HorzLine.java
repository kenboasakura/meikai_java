package abstractClass;

/*クラス名:HorzLine
 *概要:水平直線を表すクラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class HorzLine extends AbstLine {

	/*コンストラクタ名:HorzLine
	 *概要:水平直線を生成するコンストラクタ
	 *引数:直線の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public HorzLine(int lengthValue) {
		//AbstLineクラスのコンストラクタを呼び出す
		super(lengthValue);
	}

	/*メソッド名:toString
	 *概要:水平直線に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:水平直線に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//水平直線に関する図形情報を表す文字列を返却
		return "HorzLine(length:" + getLength() + ")";
	}

	/*メソッド名:draw
	 *概要:水平直線を描画するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void drawShape() {
		//水平直線を描画
		for (int i = 0; i < getLength(); i++) {
			//-を出力
			System.out.print('-');
		}
		//改行を出力
		System.out.println();
	}

}
