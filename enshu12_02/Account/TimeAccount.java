package Account;

/*クラス名:TimeAccount
 *概要:定期預金の預金残高を管理
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
class TimeAccount extends Account {

	//定期預金の預金残高を表すlong型のフィールドを宣言
	private long timeBalance;

	/*コンストラクタ名:TimeAccount
	 *概要:Accountクラスのコンストラクタを呼び出し、定期預金の預金残高を仮引数で初期化
	 *引数:講座名義、番号(String型)、普通預金、定期預金の預金残高(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	TimeAccount(String nameString, String numberString, long balanceValue, long timeBalance) {
		//Accountクラスのコンストラクタを呼び出す
		super(nameString, numberString, balanceValue);
		//定期預金の預金残高をフィールドを仮引数で初期化
		this.timeBalance = timeBalance;
	}

	/*インスタンスメソッド名:getBalance
	 *概要:普通預金と定期預金残高を足して合計値を取得するメソッド
	 *引数:なし
	 *戻り値:預金残高の合計値(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public long getBalance() {
		//定期預金の預金残高を足して預金残高を返却
		return super.getBalance() + timeBalance;
	}

	/*インスタンスメソッド名:getTimeBalance
	 *概要:定期預金の預金残高を取得するメソッド
	 *引数:なし
	 *戻り値:定期預金の預金残高(long型)Z
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	long getTimeBalance() {
		//定期預金の預金残高を返却
		return timeBalance;
	}

}
