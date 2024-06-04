package enshu14.enshu14_01;

/*クラス名:Parallelogram
 *概要:平行四辺形を表すクラス
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class Parallelogram extends Shape implements Plane2D{
	//平行四辺形の幅を表すint型のフィールドを宣言
	private int widthValue = 0;
	//平行四辺形の高さを表すint型のフィールドを宣言
	private int heigthValue = 0;
	
	/*コンストラクタ名:Parallelogram
	 *概要:平行四辺形の幅、高さを引数で初期化
	 *引数:平行四辺形の幅、高さ(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public Parallelogram (int widthValue,int heigthValue) {
		//幅を表すフィールドを仮引数で初期化
		this.widthValue = widthValue;
		//高さを表すフィールドを仮引数で初期化
		this.heigthValue = heigthValue;
	}

	/*メソッド名:toString
	 *概要:平行四辺形に関する図形情報を表す文字列を返却するメソッド
	 *引数:なし
	 *戻り値:平行四辺形に関する図形情報を表す文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//平行四辺形に関する図形情報を表す文字列を返却
		return "Parallelogram(width:"+widthValue+"),(height"+heigthValue+")";
	}

	/*メソッド名:drawShape
	 *概要:平行四辺形を描画するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public void drawShape() {
		//平行四辺形の高さを設定
		for(int i = 0; i < heigthValue;i++) {
			//空白を出力する回数を決める
			for(int j = 0; j < heigthValue-i;j++) {
				//空白を出力
				System.out.print(' ');
			}
			//幅の数だけ#を出力
			for(int j = 0; j < widthValue;j++) {
				//#を出力
				System.out.print('#');
			}
			//改行を出力
			System.out.println();
		}
		
	}
	/*メソッド名:getArea
	 *概要:平行四辺形の面積を取得するメソッド
	 *引数:なし
	 *戻り値:平行四辺形の面積(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public int getArea() {
		//平行四辺形の面積を求めて返却
		return widthValue * heigthValue;
	}

}
