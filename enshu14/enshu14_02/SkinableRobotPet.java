package enshu14.enshu14_02;

/*クラス名:SkinableRobotPet
 *概要:着せ替え可能なロボットの情報を管理
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class SkinableRobotPet extends Pet implements Skinable {
	//着せ替えの種類のint型のフィールドを初期化して宣言
	private int skinNumber = 0;
	//黒にする場合の整数を定数化
	final int BRACK_CASE = 0;
	//赤にする場合の整数を定数化
	final int RED_CASE = 1;
	//緑にする場合の整数を定数化
	final int GREEN_CASE = 2;
	//青にする場合の整数を定数化
	final int BLUE_CASE = 3;
	//ヒョウ柄にする場合の整数を定数化
	final int LEOPARDCASE = 4;

	/*コンストラクタ名:SkinableRobotPet
	 *概要:スーパークラスのコンストラクタを呼び出し、着せ替えを仮引数で初期化
	 *引数:ロボットの名前、主人の名前(String型)、着せ替えの種類(int型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public SkinableRobotPet(String petName, String masterName, int skinNumber) {
		//スーパークラスのコンストラクタを呼び出す
		super(petName, masterName);
		//着せ替えの種類のフィールドを仮引数で初期化
		this.skinNumber = skinNumber;
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
		//着せ替えの色を表示
		System.out.println("◇色は" + getSkin() + "です!");
	}

	/*メソッド名:getSkin
	 *概要:着せ替えを取得するメソッド
	 *引数:なし
	 *戻り値:着せ替えの色を表す整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public String getSkin() {
		//
		String skinColor = null;
		//現在着ている色によって分岐
		switch (skinNumber) {
		//黒に変更したい場合実行
		case BRACK_CASE:
			//黒に変更したことを表示
			skinColor = "黒";
			//switch文を抜け出る
			break;
		//赤に変更したい場合実行
		case RED_CASE:
			//赤に変更したことを表示
			skinColor = "赤";
			//switch文を抜け出る
			break;
		//緑に変更したい場合実行
		case GREEN_CASE:
			//緑に変更したことを表示
			skinColor = "緑";
			//switch文を抜け出る
			break;
		//青に変更したい場合実行
		case BLUE_CASE:
			//青に変更したことを表示
			skinColor = "青";
			//switch文を抜け出る
			break;
		//ヒョウ柄に変更したい場合実行
		case LEOPARDCASE:
			//ヒョウ柄に変更したことを表示
			skinColor = "ヒョウ柄";
			//switch文を抜け出る
			break;
		//無地にしたい場合実行
		default:
			//無地に変更したことを表示
			skinColor = "無地";
			//switch文を抜け出る
			break;
		}
		//スキンを返却
		return skinColor;
	}

	/*メソッド名:changeSkin
	 *概要:着せ替えを変更するメソッド
	 *引数:なし
	 *戻り値:着せ替えの色を表す整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public void changeSkin(int skinNumber) {
		//着せ替えを変更
		this.skinNumber = skinNumber;
		//着せ替えたい色によって分岐
		switch (skinNumber) {

		//黒に変更したい場合実行
		case BRACK_CASE:
			//黒に変更したことを表示
			System.out.print("[黒]");
			//switch文を抜け出る
			break;
		//赤に変更したい場合実行
		case RED_CASE:
			//赤に変更したことを表示
			System.out.print("[赤]");
			//switch文を抜け出る
			break;
		//緑に変更したい場合実行
		case GREEN_CASE:
			//緑に変更したことを表示
			System.out.print("[緑]");
			//switch文を抜け出る
			break;
		//青に変更したい場合実行
		case BLUE_CASE:
			//青に変更したことを表示
			System.out.print("[青]");
			//switch文を抜け出る
			break;
		//ヒョウ柄に変更したい場合実行
		case LEOPARDCASE:
			//ヒョウ柄に変更したことを表示
			System.out.print("[ヒョウ柄]");
			//switch文を抜け出る
			break;
		//無地にしたい場合実行
		default:
			//無地に変更したことを表示
			System.out.print("無地");
			//switch文を抜け出る
			break;
		}

		//着せ替えを変更したことを表示
		System.out.println("に変更しました!");

	}

}
