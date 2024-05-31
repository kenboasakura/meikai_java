package enshu04;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラス名:読み込んだ整数分*を表示し5個ごとに改行するテキスト
 *概要:
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
public class enshu04_16 {

	/*関数名:main
	 *概要:読み込んだ整数分*を表示し5個ごとに改行するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//*の個数を計算するため変数inttegerValueを初期化して宣言
		int inttegerValue = 0;

		//正の整数を入力させるまで実行
		do {
			//整数の入力を促す
			System.out.print("何個*を表示しますか？:");
			//整数を読み込む
			inttegerValue = standardInput.nextInt();
			//入力した整数が正の整数でなければ実行
			if (inttegerValue <= 0) {
				//整数を入力してくださいと表示
				System.out.println("正の整数を入力してください");
			}

			//入力した整数が正の整数でなければループ
		} while (inttegerValue <= 0);

		//変数iを0から始めて、入力した整数になるまでインクリメント*iは教科書準拠
		for (int i = 1; i <= inttegerValue; i++) {
			//*を出力
			System.out.print('*');
			//5つごとに改行
			if (i % 5 == 0) {
				//5つごとに改行して*を整数分表示
				System.out.println();
			}
		}
	}

}
