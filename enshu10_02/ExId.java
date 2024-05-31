package enshu10_02;

/*クラス名:ExId
 *概要:識別番号を管理
 *作成者:K.Asakura
 *作成日:2024/05/24
 */
public class ExId {
	//識別番号のもともとの増分を定数化
	static final int ORIGINAL_INCREMENT = 1;
	//増分プラスされた識別番号を表すint型の静的フィールドを初期化して宣言
	static int counterNumber = 0;
	//識別番号の増分を表すint型の静的フィールドを元の増分1で初期化して宣言
	static int exstraCounter = ORIGINAL_INCREMENT;
	//識別番号を表すint型のフィールドを宣言
	private int idNumber;
	//識別番号を与えた個数を表すint型の静的フィールドを初期化して宣言
	static int idNumberCount = 0;

	/*クラスメソッド名:getMaxId
	 *概要:最後に与えた識別番号を返却するメソッド
	 *引数:なし
	 *戻り値:最後に与えた識別番号(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public static int getMaxmumExId() {
		//最後に与えた識別番号を返却
		return counterNumber;
	}

	/*コンストラクタ名:Id
	 *概要:識別番号のインスタンスを初期化
	 *引数:変更箇所(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public ExId() {
		//識別番号の個数を1増加
		idNumberCount++;
		//識別番号を増やしたものに、識別番号の増分をプラスして代入
		counterNumber += exstraCounter;
		//識別番号に増分プラスされたものを代入
		idNumber +=  counterNumber;
	}

	/*インスタンスメソッド名:getExId
	 *概要:識別番号を取得するメソッド
	 *引数:なし
	 *戻り値:識別番号(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public int getExId() {
		//識別番号を返却
		return idNumber;
	}

	/*インスタンスメソッド名:getIdNumberCount
	 *概要:識別番号を与えた個数を取得するメソッド
	 *引数:なし
	 *戻り値:識別番号を与えた個数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public int getIdNumberCount() {
		//識別番号を与えた個数を返却
		return idNumberCount;
	}

	/*インスタンスメソッド名:setExId
	 *概要:識別番号を設定するメソッド
	 *引数:識別番号(int型)
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public void setExId(int idNumber) {
		//仮引数に識別番号を代入
		this.idNumber = idNumber;
	}
}
