package enshu13_03;

//Randomクラスのインポート
import java.util.Random;

/*クラス名:ComputerPlayer
 *概要:コンピューターの出す手を選択
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class ComputerPlayer extends Player {
	//じゃんけんの手のグーにあたる整数を定数化
	final int HAND_ROCK = 0;
	//じゃんけんの手のチョキにあたる整数を定数化
	final int HAND_SCISSOERS = 1;
	//じゃんけんの手のパーにあたる整数を定数化
	final int HAND_PAPER = 2;
	//Randomクラスを設定
	Random ramdomNumber = new Random();
	//じゃんけんの手を表すint型のフィールドを初期化して宣言
	private int handNumber = 0;

	/*コンストラクタ名:ComputerPlayer
	 *概要:コンピューターの出す手を生成するコンストラクタ
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public ComputerPlayer() {
		//じゃんけんの手の種類を定数化
		final int HAND_CATEGORY = 3;
		//ランダムにじゃんけんの手にあたる整数を代入
		int ramdomHand = ramdomNumber.nextInt(HAND_CATEGORY);
		//じゃんけんの手を表すフィールドをランダムに入れられた数値で初期化
		this.handNumber = ramdomHand;
	}

	/*メソッド名:main
	 *概要:コンピューターの出す手を取得するメソッド
	 *引数:なし
	 *戻り値:コンピューターの出す手(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public int ComputerHand() {
		//コンピューターの出す手を返却
		return handNumber;
	}

	/*メソッド名:toString
	 *概要:コンピューターが出す手を文字列で返却するメソッド
	 *引数:なし
	 *戻り値:コンピューターの出す手に関する文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public String toString() {
		//コンピューターの手を入れる変数を初期化して宣言
		String playerHand = null;
		//じゃんけんの手によって飛び先を変更
		switch (ComputerHand()) {
		//グーの場合実行
		case HAND_ROCK:
			//グーであることを表示
			playerHand = "コンピューターの手は:グー";
			//seitch文を抜け出る
			break;
		//チョキの場合実行
		case HAND_SCISSOERS:
			//チョキであることを表示
			playerHand = "コンピューターの手は:チョキ";
			//seitch文を抜け出る
			break;
		//パーの場合実行
		case HAND_PAPER:
			//パーであることを表示
			playerHand = "コンピューターの手は:パー";
			//seitch文を抜け出る
			break;
		}
		//コンピューターの出す手の文字列を返却
		return playerHand;

	}

}
