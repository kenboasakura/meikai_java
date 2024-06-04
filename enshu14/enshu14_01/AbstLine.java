package enshu14.enshu14_01;


/*クラス名:AbstLine
 *概要:直線を表す抽象クラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public abstract class AbstLine extends Shape {
	//直線の長さを表すint型のフィールドを初期化して宣言
	private int lengthValue = 0;

	/*コンストラクタ名:AbstLine
	 *概要:直線を生成するコンストラクタ
	 *引数:直線の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public AbstLine(int lengthValue) {
		//メソッドを呼び出して直線の長さを生成
		setLength(lengthValue);
	}

	/*メソッド名:getLength
	 *概要:直線の長さを取得するメソッド
	 *引数:なし
	 *戻り値:直線の長さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public int getLength() {
		//直線の長さを返却
		return lengthValue;
	}

	/*メソッド名:setLength
	 *概要:直線の長さを設定
	 *引数:直線の長さ(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void setLength(int lengthValue) {
		//直線の長さに引数を代入
		this.lengthValue = lengthValue;
	}
	
	/*メソッド名:toString
	 *概要:直線に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:直線に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//直線に関する図形情報を表す文字列を返却
		return "AbstLine(length:"+lengthValue+")";
	}

}
