package enshu09_03;

/*クラス名:Account
 *概要:銀行口座情報を管理
 *作成者:K.Asakura
 *作成日:2024/05/22
 */
public class Account {
	//名前を表すString型のフィールドを宣言
	private String name;
	//口座番号を表すString型のフィールドを宣言
	private String no;
	//預金残高を表すlong型のフィールドを宣言
	private long balance ;
	//口座開設日を表すクラス型のフィールドを宣言
	private Day accountOpeningDate;

	/*コンストラクタ名:Account
	 *概要:口座情報の項目を初期化
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Account() {
	}

	/*コンストラクタ名:Account
	 *概要:講座名義を引数で初期化し、それ以外を規定値で初期化
	 *引数:講座名義(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Account(String name) {
		//講座名義を表すフィールドを仮引数で初期化
		this.name = name;
	}

	/*コンストラクタ名:Account
	 *概要:講座名義と番号を引数で初期化し、それ以外を規定値で初期化
	 *引数:講座名義、番号(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Account(String name, String no) {
		//コンストラクタを呼び出し、講座名義を表すフィールドを仮引数で初期化
		this(name);
		//口座番号を表すフィールドを仮引数で初期化
		this.no = no;
	}

	/*コンストラクタ名:Account
	 *概要:講座名義、番号、預金残高を引数で初期化し、口座開設日を規定値で初期化
	 *引数:講座名義、番号(String型)、預金残高(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Account(String name, String no, long balance) {
		//コンストラクタを呼び出し、講座名義、番号を表すフィールドを仮引数で初期化
		this(name, no);
		//預金残高を表すフィールドを仮引数で初期化
		this.balance = balance;
	}

	/*コンストラクタ名:Account
	 *概要:講座名義、番号、預金残高、口座開設日を引数で初期化
	 *引数:講座名義、番号(String型)、預金残高(long型)、口座開設日(クラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public Account(String name, String no, long balance, Day accountOpeningDate) {
		//コンストラクタを呼び出し、講座名義、番号、預金残高を表すフィールドを仮引数で初期化
		this(name, no, balance);
		//口座開設日を表すフィールドを仮引数で初期化
		this.accountOpeningDate = new Day(accountOpeningDate);
	}

	/*インスタンスメソッド名:getname
	 *概要:講座名義を取得するメソッド
	 *引数:なし
	 *戻り値:講座名義(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public String getName() {
		//講座名義を返却
		return name;
	}

	/*インスタンスメソッド名:getNo
	 *概要:講座番号を取得するメソッド
	 *引数:なし
	 *戻り値:講座番号(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public String getNo() {
		//口座番号を返却
		return no;
	}

	/*インスタンスメソッド名:getname
	 *概要:預金残高を取得するメソッド
	 *引数:なし
	 *戻り値:預金残高(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public long getBalance() {
		//預金残高を返却
		return balance;
	}

	/*インスタンスメソッド名:getAccountOpeningDate
	 *概要:口座開設日を取得するメソッド
	 *引数:なし
	 *戻り値:口座開設日(クラス型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
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
	 *作成日:2024/05/22
	 */
	public void setName(String name) {
		//引数に講座名義を代入
		this.name = name;
	}

	/*インスタンスメソッド名:setNo
	 *概要:講座番号を設定するメソッド
	 *引数:講座番号(String型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public void setNo(String no) {
		//引数に口座番号を代入
		this.no = no;
	}

	/*インスタンスメソッド名:setBalance
	 *概要:預金残高を設定するメソッド
	 *引数:預金残高(long型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public void setBalance(long balance) {
		//引数に預金残高を代入
		this.balance = balance;
	}

	/*インスタンスメソッド名:setAccountOpeningDate
	 *概要:口座開設日を設定するメソッド
	 *引数:口座開設日(クラス型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
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
	 *作成日:2024/05/22
	 */
	public void deposit(long k) {
		//預金残高に引数を加算して代入
		balance += k;
	}

	/*インスタンスメソッド名:withdraw
	 *概要:お金を引き出して引数を減らすメソッド
	 *引数:引き出す金額(long型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public void withdraw(long k) {
		//預金残高に引数を減算して代入
		balance -= k;
	}
	
	/*インスタンスメソッド名:toString
	 *概要:口座情報の文字列を返却するメソッド
	 *引数:なし
	 *戻り値:口座情報(String型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	public String toString() {
		//口座情報を表示
		return String.format("口座名義:%1s\n口座番号:%1s\n預金残高:%1d円\n口座開設日\n%1s",name,no,balance,accountOpeningDate);
	}
	

}
