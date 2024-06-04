package enshu14.enshu14_02;

/*クラス名:Pet
 *概要:ペットの情報を管理
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class Pet {
	//ペットの名前を表すString型のフィールドを宣言
	private String petName;
	//主人の名前を表すString型のフィールドを宣言
	private String masterName;

	/*コンストラクタ名:Pet
	 *概要:ペットと主人の名前を仮引数で初期化
	 *引数:ペットと主人の名前(String型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public Pet(String petName, String masterName) {
		//ペットの名前を仮引数で初期化
		this.petName = petName;
		//主人の名前を仮引数で初期化
		this.masterName = masterName;
	}

	/*インスタンスメソッド名:getPetName
	 *概要:ペットの名前を取得するメソッド
	 *引数:なし
	 *戻り値:ペットの名前(String型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public String getPetName() {
		//ペットの名前を返却
		return petName;
	}

	/*インスタンスメソッド名:getMasterName
	 *概要:主人の名前を取得するメソッド
	 *引数:なし
	 *戻り値:主人の名前(String型)
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public String getMasterName() {
		//主人の名前を返却
		return masterName;
	}

	/*インスタンスメソッド名:introduceName
	 *概要:自己紹介を行うメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public void introduceName() {
		//ペットの名前を表示
		System.out.println("■僕の名前は"+petName+"です!");
		//主人の名前を表示
		System.out.println("■ご主人様は"+masterName+"です!");

	}

}
