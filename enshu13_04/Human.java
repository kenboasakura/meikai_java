package enshu13_04;

/**クラス名:Human
 *概要:個人情報のデータを管理する
 *@author:K.Asakura
 *作成日:2024/05/15
 */
public class Human {
	/**-private 名前を表すString型のフィールド宣言*/
	private String humanName;
	/**-private 身長を表すdouble型のフィールド宣言*/
	private double humanHeight;
	/**-private 体重を表すdouble型のフィールド宣言*/
	private double humanWeight;
	/**-private 誕生日を表すDayクラス型のフィールドを宣言*/
	private Day humanBirthday;

	/**コンストラクタ名:Human
	 *概要:個人情報のインスタンスを規定値で初期化
	 *@param
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public Human() {
	}

	/**コンストラクタ名:Human
	 *概要:名前のインスタンスを仮@paramの値で初期化し、それ以外の項目を規定値で初期化
	 *@param:名前(String型)
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public Human(String humanName) {
		//名前を表すフィールドを仮@paramで初期化
		this.humanName = humanName;
	}

	/**コンストラクタ名:Human
	 *概要:名前、身長のインスタンスを仮@paramの値で初期化し、それ以外の項目を規定値で初期化
	 *@param:名前(String型)、身長(double型)
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public Human(String humanName, double humanHeight) {
		//コンストラクタを呼び出し、名前を表すフィールドを仮@paramで初期化
		this(humanName);
		//身長を表すフィールドを仮@paramで初期化
		this.humanHeight = humanHeight;
	}

	/**コンストラクタ名:Human
	 *概要:名前、身長、体重のインスタンスを仮@paramの値で初期化し、誕生日の項目を規定値で初期化
	 *@param:名前(String型)、身長、体重(double型)
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public Human(String humanName, double humanHeight, double humanWeight) {
		//コンストラクタを呼び出し、名前、身長を表すフィールドを仮@paramで初期化
		this(humanName, humanHeight);
		//体重を表すフィールドを仮@paramで初期化
		this.humanWeight = humanWeight;
	}

	/**コンストラクタ名:Human
	 *概要:個人情報のインスタンスを仮@paramの値で初期化
	 *@param:名前(String型)、身長、体重(double型)、誕生日(Dayクラス型)
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public Human(String humanName, double humanHeight, double humanWeight, Day humanBirthday) {
		//コンストラクタを呼び出し、名前、身長、体重を表すフィールドを仮@paramで初期化
		this(humanName, humanHeight, humanWeight);
		//誕生日を表すフィールドを仮@paramで初期化
		this.humanBirthday = humanBirthday;
	}

	/**関数名:getHumanName
	 *概要:個人の名前を取得するメソッド
	 *@param
	 *@return:名前(String型)
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public String getHumanName() {
		//名前を返却
		return humanName;
	}

	/**関数名:gethumanHeightt
	 *概要:個人の身長を取得するメソッド
	 *@param
	 *@return:身長(double型)
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public double getHumanHeight() {
		//身長を返却
		return humanHeight;
	}

	/**関数名:getHumanWeight
	 *概要:個人の体重を取得するメソッド
	 *@param
	 *@return:体重(double型)
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public double getHumanWeight() {
		//体重を返却
		return humanWeight;

	}

	/**関数名:getHumanWeight
	 *概要:個人の誕生日を取得するメソッド
	 *@param
	 *@return:誕生日(Dayクラス型)
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public Day getHumanBirthday() {
		//誕生日を返却
		return humanBirthday;
	}

	/**関数名:setHumanName
	 *概要:個人の名前を設定するメソッド
	 *@param:名前(String型)
	 *@return
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public void setHumanName(String humanName) {
		//@paramに名前を代入
		this.humanName = humanName;
	}

	/**関数名:gethumanHeightt
	 *概要:個人の身長を設定するメソッド
	 *@param:身長(double型)
	 *@return
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public void setHumanHeight(double humanHeight) {
		//@paramに身長を代入
		this.humanHeight = humanHeight;
	}

	/**関数名:getHumanWeight
	 *概要:個人の体重を設定するメソッド
	 *@param:体重(double型)
	 *@return
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public void setHumanWeight(double humanWeight) {
		//@paramに体重を代入
		this.humanWeight = humanWeight;
	}

	/**関数名:getHumanWeight
	 *概要:個人の誕生日を設定するメソッド
	 *@param:誕生日(Dayクラス型)
	 *@return
	 *@author:K.Asakura
	 *作成日:2024/05/15
	 */
	public void setHumanBirthday(Day humanBirthday) {
		//@paramに誕生日を代入
		this.humanBirthday = humanBirthday;
	}

	/**インスタンスメソッド名:main
	 *概要:個人情報の文字列を返却するメソッド
	 *@param
	 *@return:個人情報(String型)
	 *@author:K.Asakura
	 *作成日:2024/05/22
	 */
	public String toString() {
		//個人情報を表示する文字列を返却
		return String.format("名前:%1s\n身長:%1.1fcm\n体重:%1.1fkg\n誕生日\n%1s", humanName, humanHeight, humanWeight,
				humanBirthday);
	}

}