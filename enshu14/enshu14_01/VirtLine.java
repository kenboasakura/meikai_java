package enshu14.enshu14_01;


/*クラス名:VirtyLine
 *概要:垂直直線を表すクラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class VirtLine extends AbstLine{
	
	/*メソッド名:VirtyLine
	 *概要:垂直直線を生成するコンストラクタ
	 *引数:直線の長さ(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public VirtLine(int lengthValue) {
		//AbstLineクラスのコンストラクタを呼び出す
		super(lengthValue);
	}
	
	/*メソッド名:toString
	 *概要:垂直直線に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:垂直直線に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//垂直直線に関する図形情報を表す文字列を返却
		return "VirtLine(length:"+getLength()+")";
	}
	
	/*メソッド名:drawShape
	 *概要:垂直直線を描画するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void drawShape() {
		//垂直直線を描画
		for(int i = 0;i < getLength();i++) {
			//|を出力
			System.out.println('|');
		}
	}
	

}
