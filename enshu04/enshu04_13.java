package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_13
 *概要:1から入力した整数までの和を求めるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/10
 */
public class enshu04_13 {

	/*関数名:main
	 *概要:1から入力した整数までの和を求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);
		//1からnまでの和を求めます。と表示
		System.out.println("1からnまでの和を求めます。");
		//変数を初期化して宣言*nは教科書準拠
		int n = 0;

		//whileの限り実行
		do {
			//nの値の入力を促す*nは教科書準拠
			System.out.print("nの値:");
			//入力した整数を読み込む
			n = standardInput.nextInt();
			//入力した整数値が0以下であれば実行
			if(n <= 0) {
				//正の整数値の入力を促す
				System.out.println("正しい数値を入力してください");
			}
			//入力した整数が0以下ならループ
		} while (n <= 0);
		
		//変数sumを初期化して宣言*sumは教科書準拠
		int sum = 0;
		
		//変数iを1から始めて、nになるまで変数iを1インクリメント
		for(int i = 1;i <= n;i++) {
			//sumにインクリメントした数値を加える
			sum += i;
		}
		
		//1からnまでの和を表示
		System.out.println("1から" + n + "までの和は" + sum + "です。");

	}

}
