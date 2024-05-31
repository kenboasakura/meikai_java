package enshu09_05;

/*クラス名:Period
 *概要:開始日から終了日までの期間を管理
 *作成者:K.Asakura
 *作成日:2024/05/22
 */
public class Period {
	//開始日を表すDayクラス型のフィールド宣言
	private Day from;
	//終了日を表すDayクラス型のフィールド宣言
	private Day to;

	/*コンストラクタ名:Period
	 *概要:期間のインスタンスを規定値で初期化
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Period() {
	}
	
	/*コンストラクタ名:Period
	 *概要:開始日のインスタンスを仮引数で初期化し、終了日のインスタンスを規定値で初期化
	 *引数:開始日(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Period(Day from) {
		//開始日を表すフィールドを仮引数で初期化
		this.from = from;
	}
	
	/*コンストラクタ名:Period
	 *概要:開始日、終了日のインスタンスを仮引数で初期化
	 *引数:開始日、終了日(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Period(Day from, Day to) {
		//コンストラクタを呼び出し、開始日を表すフィールドを仮引数で初期化
		this(from);
		//終了日を表すフィールドを仮引数で初期化
		this.to = to;
	}
	
	/*インスタンスメソッド名:getFrom
	 *概要:開始日を取得するメソッド
	 *引数:なし
	 *戻り値:開始日(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */

	public Day getFrom() {
		//開始日を返却
		return from;
	}
	
	/*インスタンスメソッド名:get
	 *概要:終了日を取得するメソッド
	 *引数:なし
	 *戻り値:終了日(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Day getTo() {
		//終了日を返却
		return to;
	}
	
	/*インスタンスメソッド名:set
	 *概要:開始日を設定するメソッド
	 *引数:開始日(Dayクラス型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public void setFrom(Day from) {
		//仮引数に開始日を代入
		this.from = from;
	}
	
	/*インスタンスメソッド名:set
	 *概要:終了日を設定するメソッド
	 *引数:終了日(Dayクラス型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public void setTo(Day to) {
		//仮引数に終了日を代入
		this.to = to;
	}
	
	/*インスタンスメソッド名:toString
	 *概要:開始日と終了日の文字列を返却するメソッド
	 *引数:なし
	 *戻り値:開始日と終了日の文字列(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public String toString() {
		//開始日と終了日を表示する文字列を返却
		return  String.format("開始日:%1s\n終了日:%1s",from,to);		
	}

}
