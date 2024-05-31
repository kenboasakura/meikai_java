package enshu10_05;

/*クラス名:Account
 *概要:銀行口座情報を管理
 *作成者:K.Asakura
 *作成日:2024/05/27
 */
public class Account {
	//名前を表すString型のフィールドを宣言
	private String nameString;
	//口座番号を表すString型のフィールドを宣言
	private String numberString;
	//預金残高を表すlong型のフィールドを宣言
	private long balanceValue;
	//口座開設日を表すDayクラス型のフィールドを宣言
	private Day accountOpeningDate;
	//インスタンス初期化子を設定
	{
		//インスタンスが生成されるたび、文字列を表示
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}

	/*コンストラクタ名:Account
	 *概要:口座情報の項目を規定値で初期化
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Account() {
	}

	/*コンストラクタ名:Account
	 *概要:講座名義を引数で初期化し、それ以外を規定値で初期化
	 *引数:講座名義(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Account(String nameString) {
		//講座名義を表すフィールドを仮引数で初期化
		this.nameString = nameString;
	}

	/*コンストラクタ名:Account
	 *概要:講座名義と番号を引数で初期化し、それ以外を規定値で初期化
	 *引数:講座名義、番号(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Account(String nameString, String nonumberString) {
		//コンストラクタを呼び出し、講座名義を表すフィールドを仮引数で初期化
		this(nameString);
		//口座番号を表すフィールドを仮引数で初期化
		this.numberString = nonumberString;
	}

	/*コンストラクタ名:Account
	 *概要:講座名義、番号、預金残高を引数で初期化し、口座開設日を規定値で初期化
	 *引数:講座名義、番号(String型)、預金残高(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Account(String nameString, String numberString, long balanceValue) {
		//コンストラクタを呼び出し、講座名義、番号を表すフィールドを仮引数で初期化
		this(nameString, numberString);
		//預金残高を表すフィールドを仮引数で初期化
		this.balanceValue = balanceValue;
	}

	/*コンストラクタ名:Account
	 *概要:講座名義、番号、預金残高、口座開設日を引数で初期化
	 *引数:講座名義、番号(String型)、預金残高(long型)、口座開設日(Dayクラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Account(String nameString, String numberString, long balanceValue, Day accountOpeningDate) {
		//コンストラクタを呼び出し、講座名義、番号、預金残高を表すフィールドを仮引数で初期化
		this(nameString, numberString, balanceValue);
		//口座開設日を表すフィールドを仮引数で初期化
		this.accountOpeningDate = accountOpeningDate;
	}

	/*インスタンスメソッド名:getname
	 *概要:講座名義を取得するメソッド
	 *引数:なし
	 *戻り値:講座名義(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public String getName() {
		//講座名義を返却
		return nameString;
	}

	/*インスタンスメソッド名:getNo
	 *概要:講座番号を取得するメソッド
	 *引数:なし
	 *戻り値:講座番号(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public String getNo() {
		//口座番号を返却
		return numberString;
	}

	/*インスタンスメソッド名:getname
	 *概要:預金残高を取得するメソッド
	 *引数:なし
	 *戻り値:預金残高(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public long getBalance() {
		//預金残高を返却
		return balanceValue;
	}

	/*インスタンスメソッド名:getAccountOpeningDate
	 *概要:口座開設日を取得するメソッド
	 *引数:なし
	 *戻り値:口座開設日(クラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public Day getAccountOpeningDate() {
		//口座開設日を返却
		return accountOpeningDate;
	}

	/*インスタンスメソッド名:setName
	 *概要:講座名義を設定するメソッド
	 *引数:講座名義(String型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setName(String nameString) {
		//引数に講座名義を代入
		this.nameString = nameString;
	}

	/*インスタンスメソッド名:setNo
	 *概要:講座番号を設定するメソッド
	 *引数:講座番号(String型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setNo(String numberString) {
		//引数に口座番号を代入
		this.numberString = numberString;
	}

	/*インスタンスメソッド名:setBalance
	 *概要:預金残高を設定するメソッド
	 *引数:預金残高(long型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setBalance(long balanceValue) {
		//引数に預金残高を代入
		this.balanceValue = balanceValue;
	}

	/*インスタンスメソッド名:setAccountOpeningDate
	 *概要:口座開設日を設定するメソッド
	 *引数:口座開設日(Dayクラス型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void setAccountOpeningDate(Day accountOpeningDate) {
		//引数に口座開設日を代入
		this.accountOpeningDate = accountOpeningDate;
	}

	/*インスタンスメソッド名:deposit
	 *概要:お金を預けて預金残高を増やすメソッド
	 *引数:預ける金額(long型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void deposit(long transferAmount) {
		//預金残高に引数を加算して代入
		balanceValue += transferAmount;
	}

	/*インスタンスメソッド名:withdraw
	 *概要:お金を引き出して引数を減らすメソッド
	 *引数:引き出す金額(long型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public void withdraw(long drawerAmount) {
		//預金残高に引数を減算して代入
		balanceValue -= drawerAmount;
	}

	/*インスタンスメソッド名:toString
	 *概要:口座情報の文字列を返却するメソッド
	 *引数:なし
	 *戻り値:口座情報(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/27
	 */
	public String toString() {
		//口座情報を表示する文字列を返却
		return String.format("口座名義:%1s\n口座番号:%1s\n預金残高:%1d円\n口座開設日:%1s", nameString, numberString, balanceValue, accountOpeningDate);
	}

}