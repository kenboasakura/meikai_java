package Account;

//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:TimeAccountTester
 *概要:2つの口座情報を入力し、預金残高の合計を比較し結果を表示
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class TimeAccountTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	//1つめの口座の預金残高の合計額が2つめより多かった場合に代入される値を定数化
	static final int FIRST_LAGER_THAN_SECOND = 1;
	//1つめの口座の預金残高の合計額が2つめより少なかった場合に代入される値を定数化
	static final int FIRST_LESS_THAN_SECOND = -1;
	//1つめと2つめの口座の預金残高の合計額が一緒の場合に代入される値を定数化
	static final int FIRST_EQUAL_SECOND = 0;
	
	/*関数名:isYes
	 *概要:YesかNoかを判別し、Yesの場合はtrueを、Noの場合はfalseを返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:teue,もしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static boolean isYes(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//Yesの場合に入力される整数を定数化
		final int WHEN_YES = 1;
		//Noの場合に入力される整数を定数化
		final int WHEN_NO = 0;
		//0か1の整数を入力させる
		do {
			//入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//0か1以外の整数が入力された場合実行
			if (inputInteger != WHEN_NO && inputInteger != WHEN_YES) {
				//0か1の整数を入力させる文字列を表示
				System.out.println("0か1の整数を入力してください");
			}
			//0か1の整数を入力されるまでループ
		} while (inputInteger != WHEN_NO && inputInteger != WHEN_YES);
		//1が入力された場合trueを、そうでなければfalseを代入
		boolean logicalValue = inputInteger == WHEN_YES ? true : false;
		//論理値を返却
		return logicalValue;

	}

	/*関数名:inputLong
	 *概要0以上の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(long型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static long inputLong(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		long intputLong = 0;
		//0以上の整数が入力させる
		do {
			//引数の入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			intputLong = standardInput.nextLong();
			//0未満の整数が入力された場合実行
			if (intputLong < 0) {
				//正の整数の入力を促す
				System.out.println("0以上の数値を入力して下さい");
			}
			//0以上の整数が入力されるまでループ
		} while (intputLong < 0);
		//読み込んだ整数を返却
		return intputLong;
	}

	/*関数名:compBalance
	 *概要:2つのインスタンスの普通預金と定期預金の合計額を比較した結果に伴った整数を返却するメソッド
	 *引数:2つの口座情報(Account型)
	 *戻り値:比較結果に伴った整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static int compBalance(Account firstInstance, Account secondInstance) {
		//合計額を比較した結果に伴った整数を格納する変数に一緒だった場合の定数を代入して宣言
		int comparisonResult = FIRST_EQUAL_SECOND;
		//1つめのインスタンスの合計金額の方が高かった場合実行
		if (firstInstance.getBalance() > secondInstance.getBalance()) {
			//合計額を比較した結果に伴った整数を格納する変数に1を代入
			comparisonResult = FIRST_LAGER_THAN_SECOND;
			//2つめのインスタンスの合計金額の方が高かった場合実行
		} else if (firstInstance.getBalance() < secondInstance.getBalance()) {
			//合計額を比較した結果に伴った整数を格納する変数に-1を代入
			comparisonResult = FIRST_LESS_THAN_SECOND;
		}
		//合計額を比較した結果に伴った整数を返却
		return comparisonResult;
	}

	/*関数名:main
	 *概要:2つの口座情報を入力し、預金残高の合計を比較し結果を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public static void main(String[] args) {
		//1人目の口座情報の入力を促す文字列を表示
		System.out.println("1人目の口座情報");
		//口座名義の入力を促す
		System.out.print("口座名義:");
		//名前を読み込んで代入
		String firstAccountName = standardInput.next();
		//口座番号の入力を促す
		System.out.print("口座番号:");
		//口座番号を読み込んで代入
		String firstAccountNumber = standardInput.next();
		//メソッドを呼び出して、預金残高を読み込んで代入
		long firstAccountBalance = inputLong("普通預金の残高:");
		//入力した口座名義、番号、普通預金残高を引数とするコンストラクタを呼び出し、インスタンスを生成
		Account firstAccount = new Account(firstAccountName, firstAccountNumber, firstAccountBalance);
		//定期預金の口座をもっている場合実行
		if(isYes("定期預金の口座をもっていますか? はい...1/いいえ...0:")) {
			//メソッドを呼び出して、定期預金の預金残高を読み込んで代入
			long firstAccountTimeBalance = inputLong("定期預金の残高:");
			//入力した口座名義、番号、普通預金、定期預金残高を引数とするコンストラクタを呼び出し、インスタンスを生成
			firstAccount = new TimeAccount(firstAccountName, firstAccountNumber, firstAccountBalance,
					firstAccountTimeBalance);
		}
		//2人目の口座情報の入力を促す文字列を表示
		System.out.println("2人目の口座情報");
		//口座名義の入力を促す
		System.out.print("口座名義:");
		//名前を読み込んで代入
		String secondAccountName = standardInput.next();
		//口座番号の入力を促す
		System.out.print("口座番号:");
		//口座番号を読み込んで代入
		String secondAccountNumber = standardInput.next();
		//メソッドを呼び出して、預金残高を読み込んで代入
		long secondAccountBalance = inputLong("普通預金の残高:");
		//入力した口座名義、番号、普通預金残高を引数とするコンストラクタを呼び出し、インスタンスを生成
		Account secondAccount = new Account(secondAccountName, secondAccountNumber, secondAccountBalance);
		//定期預金の口座をもっている場合実行
		if(isYes("定期預金の口座をもっていますか? はい...1/いいえ...0:")) {
		//メソッドを呼び出して、定期預金の預金残高を読み込んで代入
		long secondAccountTimeBalance = inputLong("定期預金の残高:");
		//入力した口座名義、番号、普通預金、定期預金残高を引数とするコンストラクタを呼び出し、インスタンスを生成
		secondAccount = new TimeAccount(secondAccountName, secondAccountNumber, secondAccountBalance,
				secondAccountTimeBalance);
		}
		//メソッドを呼び出して、返却された値のラベルに飛ぶ
		switch (compBalance(firstAccount, secondAccount)) {
		//1つめと2つめの口座の預金残高の合計額が一緒の場合実行
		case FIRST_EQUAL_SECOND:
			//預金残高が同じであることを表示
			System.out.println("2人の預金残高は同額です。");
			//switch文を抜け出る
			break;
		//1つめの口座の預金残高の合計額が2つめより多かった場合実行
		case FIRST_LAGER_THAN_SECOND:
			//1人目の預金残高が2人目よりも高いことを表示
			System.out.println("1人目の預金残高は2人目よりも高いです。");
			//switch文を抜け出る
			break;
		//1つめの口座の預金残高の合計額が2つめより少なかった場合実行
		case FIRST_LESS_THAN_SECOND:
			//1人目の預金残高が2人目よりも低いことを表示
			System.out.println("1人目の預金残高は2人目よりも低いです。");
			//switch文を抜け出る
			break;
		}
	}
}
