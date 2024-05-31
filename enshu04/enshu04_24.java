package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_24
 *概要:	正の整数を読み込み、それが素数であるか判別するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/15
 */
public class enshu04_24 {

	/*関数名:main
	 *概要:	正の整数を読み込み、それが素数であるか判別するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/15
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//整数を入力するための変数を初期化して宣言
		int integerNumber = 0;
		
		//余りが0の定数を定義
		final int PRIME_ZERO = 0;
		//整数が1であることを定義する
		final int PRIME_FIRST = 1;
		//整数が2であることを定義する
		final int PRIME_SECOND = 2;
		

		System.out.println("素数であるか判別します。");
		//正の整数を入力するまで実行
		do {
			//正の整数の入力を促す
			System.out.print("整数n:");
			//整数を読み込む
			integerNumber = standardInput.nextInt();
			//の整数でなければ実行
			if (integerNumber <= 0) {
				//正しい数を入力するよう促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (integerNumber <= 0);

		//入力された整数が2であれば実行
		if (integerNumber == PRIME_SECOND) {
			//文字列を表示
			System.out.println(+integerNumber + "は素数です。");
			//入力された整数が1であれば実行
		} else if (integerNumber == PRIME_FIRST) {
			//文字列を表示
			System.out.println(+integerNumber + "は素数ではありません。");
		}

		//入力した整数より1低い数まで割り算をする
		for (int i = PRIME_SECOND; i < integerNumber; i++) {
			//入力した整数と1以外で割り切れるなら実行
			if (integerNumber % i == PRIME_ZERO) {
				//文字列を表示
				System.out.println(integerNumber +"は素数ではありません。");
				//計算を終了
				break;
				//入力された整数が素数であるなら実行
			} else if (integerNumber / i == PRIME_FIRST) {////////
				//文字列を表示
				System.out.println(+integerNumber + "は素数です。");
				//計算を終了
				break;
			}
		}

	}
}