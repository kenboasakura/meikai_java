package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_09
*概要:正の整数値nまでを読み込んで1からnまでの積を求めるテキスト
*作成者:K.Asakura
*作成日:2024/04/10
*/

public class enshu04_09 {

	/*関数名:main
	 *概要:正の整数値nまでを読み込んで1からnまでの積を求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//変数を初期化して設定*nは教科書準拠
		int n = 0;

		//whileの間実行
		do {
			//正の整数の入力を促す
			System.out.print("正の整数を入力してください:");
			//正の整数値を読み込む
			n = standardInput.nextInt();
			//正の整数でなければループ
		} while (n <= 0);

		//宣言した変数に入力した整数を代入
		int assignmentValue = n;
		//インクリメントするための変数を1にして宣言
		int productValue = 1;

		//インクリメントした整数より1少なくなるまでループ
		while (productValue < n) {
			//入力した整数にインクリメントした変数
			assignmentValue *= productValue;
			//変数をインクリメント
			productValue++;
		}

		//1からnまでの積を表示
		System.out.print("1から" + n + "までの整数の積は" + assignmentValue + "です。");
	}

}
