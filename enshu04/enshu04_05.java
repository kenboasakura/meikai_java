package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu04_05
*概要:List4-5のx--を--xに変更した場合のテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu04_05 {

	/*関数名:main
	 *概要:List4-5のx--を--xに変更した場合のテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//文字列を表示
		System.out.println("カウントダウンします・");
		//変数を初期化して宣言*xは教科書準拠
		int x = 0;

		//whileの限り実行
		do {
			//文字列を表示
			System.out.print("正の整数値:");
			//入力した整数を読み込む
			x = standardInput.nextInt();
			//入力した整数値が０以上であればループ
		} while (x <= 0);

		//入力した整数が0以上であればループ
		while (x >= 0) {
			//入力した整数を表示したのちデクリメント
			System.out.println(--x);
		}

	}

}