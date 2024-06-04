package enshu14.enshu14_03;

/*クラス名:DVDPlayerTester
 *概要:DVDを再生、停止、スロー再生する
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class DVDPlayerTester {

	/*関数名:main
	 *概要:DVDを再生、停止、スロー再生する
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//DVDPlayerクラスのインスタンスを生成
		DVDPlayer myDVD = new DVDPlayer();
		//再生する
		myDVD.play();
		//停止する
		myDVD.stop();
		//スローにする
		myDVD.slow();

	}

}
