package enshu13_01;

/*クラス名:Rectangle
 *概要:長方形を表すクラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class Rectangle extends Shape{
	//長方形の幅を表すint型のフィールドを初期化して宣言
	private int widthValue = 0; 
	//長方形の高さを表すint型のフィールドを初期化して宣言
	private int heigthValue = 0;
	
	/*コンストラクタ名:Rectangle
	 *概要:長方形の幅、高さを引数で初期化
	 *引数:長方形の幅、高さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public Rectangle(int widthValue,int heigthValue) {
		//長方形の幅を表すフィールドを仮引数で初期化
		this.widthValue = widthValue;
		//長方形の高さを表すフィールドを仮引数で初期化
		this.heigthValue = heigthValue;
	}
	
	/*メソッド名:toString
	 *概要:長方形に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:長方形に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//長方形に関する図形情報を表す文字列を返却
		return "Reactangle(width:"+widthValue+",height:"+heigthValue+")";
	}
	
	/*メソッド名:drawShape
	 *概要:長方形を描画するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void drawShape() {
		//長方形の高さを描画
		for (int i = 0;i < heigthValue;i++) {
			//長方形の幅を描画
			for(int j = 0; j < widthValue;j++) {
				//*を出力
				System.out.print('*');
			}
			//改行を出力
			System.out.println();
		}
	}

}
