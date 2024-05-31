package enshu10_01;

import java.util.Scanner;

/*クラス名:IdTester
 *概要:生成した個々のインスタンスに識別番号を作り、識別番号の個数と最後の識別番号を表示
 *作成者:K.Asakura
 *作成日:2024/05/23
 */
public class IdTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputDouble
	 *概要:正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/22
	 */
	static int inputInteger(String stringPromptEntry) {
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

	/*関数名:main
	 *概要:生成した個々のインスタンスに識別番号を作り、識別番号の個数と最後の識別番号を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/23
	 */
	public static void main(String[] args) {
		//要素数を読み込んで代入
		int elementNumber = inputInteger("要素数:");
		//識別番号を格納するための配列を生成
		Id instanceArray[] = new Id[elementNumber];
		//要素数分インスタンスを生成
		for (int i = 0; i < instanceArray.length; i++) {
			//Id型インスタンスを生成
			instanceArray[i] = new Id();
		}
		//各要素ごとに識別番号を取得して表示
		for (int i = 0; i < instanceArray.length; i++) {
			//各要素ごとの識別番号を取得して表示
			System.out.println("[" + i + "]の識別番号=" + instanceArray[i].getId());
		}
		//Idクラスの静的フィールドにアクセスし、識別番号を生成した個数を表示
		System.out.println("識別番号の個数:" + Id.counterNumber);
		//最後の識別番号を表示
		System.out.println("最後の識別番号" + Id.getMaxId());
	}

}
