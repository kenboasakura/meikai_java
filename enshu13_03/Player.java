package enshu13_03;

/*クラス名:Player
 *概要:じゃんけんの情報を管理する抽象クラス
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
abstract class Player {
	
	
	/*コンストラクタ名:Player
	 *概要:じゃんけんの手を生成するコンストラクタ
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public Player() {
		
	}
		
	/*メソッド名:toString
	 *概要:プレイヤーの情報を表す文字列を出力
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public abstract String toString();
	
	/*メソッド名:printHand
	 *概要:プレイヤーの情報を表示するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public void printHand() {
		//プレイヤーの情報を表示
		System.out.println(toString());
	}
	

}
