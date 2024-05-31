package enshu10_02;

import java.util.Scanner;

/*クラス名:ExIdTester
 *概要:生成した個々のインスタンスに識別番号を作り、識別番号の個数と最後の識別番号を表示
 *作成者:K.Asakura
 *作成日:2024/05/24
 */
public class ExIdTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputDouble
	 *概要:正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static int inputRegularInteger(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//正の整数を入力させる
		while (inputInteger <= 0) {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (inputInteger <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力して下さい");
			}
		}
		//読み込んだ整数を返却
		return inputInteger;
	}

	/*関数名:inputInteger
	 *概要:0以上の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static int inputInteger(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//0以上の整数を入力させる
		do {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//負の整数が入力された場合実行
			if (inputInteger < 0) {
				//0以上の整数の入力を促す
				System.out.println("0以上の整数を入力して下さい");
			}
			//0以上の整数が入力されるまでループ
		} while (inputInteger < 0);
		//読み込んだ整数を返却
		return inputInteger;
	}

	/*関数名:isYes
	 *概要:YesかNoかを判別し、Yesの場合はtrueを、Noの場合はfalseを返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:teue,もしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
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

	/*関数名:main
	 *概要:生成した個々のインスタンスに識別番号を作り、識別番号の個数と最後の識別番号を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public static void main(String[] args) {
		//要素数を読み込んで代入
		int elementNumber = inputRegularInteger("要素数:");
		//識別番号を格納するための配列を生成
		ExId instanceArray[] = new ExId[elementNumber];
		//要素数分インスタンスを生成
		for (int i = 0; i < instanceArray.length; i++) {
			//識別番号を変更する場合実行
			if (isYes("識別番号を変更しますか? Yes...1/No...0:") == true) {
				//識別番号の増分を読み込んで静的フィールドに代入
				ExId.exstraCounter = inputRegularInteger("変更後の増分:");
			}
			//ExId型インスタンスを生成
			instanceArray[i] = new ExId();
			//各要素ごとの識別番号を取得して表示
			System.out.println("[" + i + "]の識別番号=" + instanceArray[i].getExId());
		}
		//Idクラスの静的フィールドにアクセスし、識別番号を生成した個数を表示
		System.out.println("識別番号の個数:" + ExId.idNumberCount);
		//最後の識別番号を表示
		System.out.println("最後の識別番号" + ExId.getMaxmumExId());
	}
}
