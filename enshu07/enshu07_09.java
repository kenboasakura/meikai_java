package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_09
 *概要:正の整数を読み込み、0や負の整数を読み込んだら再入力させる
 *作成者:K.Asakura
 *作成日:2024/04/24
 */
public class enshu07_09 {

	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	//クラス全体に入力するための変数を初期化して宣言
	static int inputValue = 0;

	/*関数名:readPlusInt
	 *概要:正の整数を入力さその値を返却し、0や負の整数を読み込んだら再入力させるメソッド
	 *引数:なし
	 *戻り値:入力された正の整数
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	static int readPlusInt() {
		//正の整数が入力されるまで実行
		do {
			//正の整数値の入力を促す
			System.out.print("正の整数値:");
			//整数を読み込む
			inputValue = standardInput.nextInt();
			//正の整数でなければループ
		} while (inputValue <= 0);
		//入力された整数を返却
		return inputValue;
	}

	/*関数名:main
	 *概要:正の整数を読み込み、0や負の整数を読み込んだら再入力させる
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	public static void main(String[] args) {

		//返却された整数が正しいか確認する
		System.out.print("返却された整数="+readPlusInt());
	}

}
