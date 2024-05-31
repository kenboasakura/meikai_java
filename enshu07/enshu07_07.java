package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_07
 *概要:入力された段数分の*の左下が直角の直角三角形を表示
 *作成者:K.Asakura
 *作成日:2024/04/24
 */
public class enshu07_07 {

	/*関数名:putChars
	 *概要:入力された整数分の*を表示させるメソッド
	 *引数:入力された*の個数
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	static void putChars(char c, int n) {
		//各段数に対応する数だけ*を出力する処理
		while (n-- > 0) {
			//各段数に対応する数だけ*を表示
			System.out.print(c);
		}

	}

	/*関数名:main
	 *概要:入力された段数分の*の左下が直角の直角三角形を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//サムネイルを表示
		System.out.println("右下直角の三角形を表示します");

		//入力された段数を読み込むための変数を初期化して宣言
		int inputNumber = 0;
		//正の段数が入力されるまで実行
		do {
			//段数の入力を促す
			System.out.print("段数:");
			//段数を読み込む
			inputNumber = standardInput.nextInt();
			//0以下の段数が入力された場合実行
			if (inputNumber <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//0以下の段数が入力された場合ループ
		} while (inputNumber <= 0);

		//入力された段数分の*の直角三角形を表示する処理
		for (int i = 1; i <= inputNumber; i++) {
			//各段数に対応する数分の*を出力
			putChars('*', i);
			//改行を出力
			System.out.println();
		}

	}

}
