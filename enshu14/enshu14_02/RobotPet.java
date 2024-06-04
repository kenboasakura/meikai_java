package enshu14.enshu14_02;

/*クラス名:RobotPet
 *概要:ロボットの情報を管理
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class RobotPet extends Pet {

	/*コンストラクタ名:RobotPet
	 *概要:ロボットと主人の名前を仮引数で初期化
	 *引数:ロボットと主人の名前(String型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public RobotPet(String petName, String masterName) {
		//スーパークラスのコンストラクタを呼び出す
		super(petName, masterName);
	}

	/*インスタンスメソッド名:introduceName
	 *概要:自己紹介を行うメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public void introduceName() {
		//ロボットの名前を表示
		System.out.println("◇僕はロボット。名前は" + getPetName() + "です!");
		//主人の名前を表示
		System.out.println("◇ご主人様は" + getMasterName() + "です!");

	}

	/*メソッド名:houseworkSelection
	 *概要:家事を行うメソッド
	 *引数:する家事にあたる整数(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public void houseworkSelection(int houseworkSelection) {
		//掃除をする際のラベルの飛び先を定数化
		final int CASE_CLEANING = 0;
		//洗濯をする際のラベルの飛び先を定数化
		final int CASE_WASHING = 1;
		//炊事をする際のラベルの飛び先を定数化
		final int CASE_COOKING = 2;
		//する家事によって飛び先を変更
		switch (houseworkSelection) {
		//掃除をする場合実行
		case CASE_CLEANING:
			//掃除をすることを表示
			System.out.println("掃除します。");
			//switch文を抜け出る
			break;
		//洗濯をする場合実行
		case CASE_WASHING:
			//洗濯をすることを表示
			System.out.println("洗濯します。");
			//switch文を抜け出る
			break;
		//炊事をする場合実行
		case CASE_COOKING:
			//炊事をすることを表示
			System.out.println("炊事します。");
			//switch文を抜け出る
			break;
		}
	}

}
