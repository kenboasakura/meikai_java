package enshu15;

/*クラス名:HumanPlayer
 *概要:プレイヤーの出す手を管理
 *作成者:K.Asakura
 *作成日:2024/05/31
 */
public class HumanPlayer extends Player {
	//じゃんけんの手のグーにあたる整数を定数化
	final int HAND_ROCK = 0;
	//じゃんけんの手のチョキにあたる整数を定数化
	final int HAND_SCISSOERS = 1;
	//じゃんけんの手のパーにあたる整数を定数化
	final int HAND_PAPER = 2;
	//じゃんけんの手を表すint型のフィールドを初期化して宣言
	private int handNumber = 0;

	/*コンストラクタ名:HumanPlayer
	 *概要:人間のじゃんけんの手を仮引数で初期化
	 *引数:じゃんけんの手にあたる整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	HumanPlayer(int handNumber) {
		//じゃんけんの手を表すフィールドを仮引数で初期化
		this.handNumber = handNumber;
	}

	/*メソッド名:getHumanHand
	 *概要:じゃんけんの手を表す整数を取得するメソッド
	 *引数:なし
	 *戻り値:じゃんけんの手を表す整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public int getHumanHand() {
		//じゃんけんの手を表す整数を返却
		return handNumber;
	}

	/*メソッド名:toString
	 *概要:人間が出す手を文字列で返却するメソッド
	 *引数:なし
	 *戻り値:人間が出す手に関する文字列(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//人間の手を入れる変数を初期化して宣言
		String playerHand = "";
		//じゃんけんの手によって飛び先を変更
		switch (handNumber) {
		//グーの場合実行
		case HAND_ROCK:
			//グーであることを表示
			playerHand = "プレイヤーの手は:グー";
			//seitch文を抜け出る
			break;
		//チョキの場合実行
		case HAND_SCISSOERS:
			//チョキであることを表示
			playerHand = "プレイヤーの手は:チョキ";
			//seitch文を抜け出る
			break;
		//パーの場合実行
		case HAND_PAPER:
			//パーであることを表示
			playerHand = "プレイヤーの手は:パー";
			//seitch文を抜け出る
			break;
		}
		//人間の出す手の文字列を返却
		return playerHand;
	}

}
