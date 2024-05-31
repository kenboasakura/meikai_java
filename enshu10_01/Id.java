package enshu10_01;

/*クラス名:Id
 *概要:識別番号を管理
 *作成者:K.Asakura
 *作成日:2024/05/23
 */
class Id {
	//識別番号を与えた個数を表すint型の静的フィールドを初期化して宣言
	static int counterNumber = 0;
	//識別番号を表すint型のフィールドを宣言
	private int idNumber ;
	
	/*クラスメソッド名:getMaxId
	 *概要:最後に与えた識別番号を返却するメソッド
	 *引数:なし
	 *戻り値:最後に与えた識別番号(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public static int getMaxId() {
		//識最後に与えた識別番号を返却
		return counterNumber;
	}
	
	/*コンストラクタ名:Id
	 *概要:識別番号のインスタンスを初期化
	 *引数:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public Id() {
		//識別番号を与えた個数を1増やして識別番号に代入
		idNumber = ++counterNumber;
	}
	
	/*インスタンスメソッド名:getId
	 *概要:識別番号を取得するメソッド
	 *引数:なし
	 *戻り値:識別番号(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public int getId() {
		//識別番号を返却
		return idNumber ;
	}
	/*インスタンスメソッド名:set
	 *概要:識別番号を設定するメソッド
	 *引数:識別番号(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public void setId(int  idNumber) {
		//仮引数に識別番号を代入
		this.idNumber = idNumber;
	}

}