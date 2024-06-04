package enshu14.enshu14_02;

/*インタフェース名:Skinable
 *概要:着せ替えを行うインタフェース
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public interface Skinable {

	//黒にする場合の整数を定数化
	final int BRACK_CASE = 0;
	//赤にする場合の整数を定数化
	final int RED_CASE = 1;
	//緑にする場合の整数を定数化
	final int GREEN_CASE = 2;
	//青にする場合の整数を定数化
	final int BLUE_CASE = 3;

	/*メソッド名:getSkin
	 *概要:着せ替えを行うメソッド
	 *引数:着せ替えする色に当たる整数(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public void changeSkin(int skinNumber);

}
