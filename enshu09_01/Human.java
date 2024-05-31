package enshu09_01;

/*クラス名:Human
 *概要:個人情報のデータを管理する
 *作成者:K.Asakura
 *作成日:2024/05/120
 */
public class Human {
	//名前を表すString型のフィールド宣言
	private String humanName;
	//身長を表すdouble型のフィールド宣言
	private double humanHeight;
	//体重を表すdouble型のフィールド宣言
	private double humanWeight;
	//BMIを表すdouble型のフィールド宣言
	private double humanBodyMathIndex;

	/*コンストラクタ名:Human
	 *概要:個人情報のインスタンスを仮引数の値で初期化
	 *引数:名前(String型)と身長、体重、BMA(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/15
	 */
	public Human(String humanName, double humanHeight, double humanWeight,double humanBodyMathIndex) {
		//名前を表すフィールドを仮引数で初期化
		this.humanName = humanName;
		//身長を表すフィールドを仮引数で初期化
		this.humanHeight = humanHeight;
		//体重を表すフィールドを仮引数初期化
		this.humanWeight = humanWeight;
		//BMIを表すフィールドを仮引数で初期化
		this.humanBodyMathIndex = humanBodyMathIndex;
	}
	
	/*関数名:getName
	 *概要:個人の名前を返却するメソッド
	 *引数:なし
	 *戻り値:名前(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/15
	 */
	public String getHumanName(){
		//名前を返却
		return humanName;
	}
	/*関数名:gethumanHeightt
	 *概要:個人の身長を返却するメソッド
	 *引数:なし
	 *戻り値:身長(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/15
	 */
	public double getHumanHeight() {
		//身長を返却
		return humanHeight;
	}
	/*関数名:getHumanWeight
	 *概要:個人の体重を返却するメソッド
	 *引数:なし
	 *戻り値:体重(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/15
	 */
	public double getHumanWeight() {
		//体重を返却
		return humanWeight;
	}

	/*関数名:getHumanBodyMathIndex
	 *概要:個人のBMIを返却するメソッド
	 *引数:なし
	 *戻り値:BMI(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/15
	 */
	public double getHumanBodyMathIndex() {
		//体重を返却
		return humanBodyMathIndex;
	}
}


