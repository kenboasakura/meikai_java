package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_11
 *概要:正の整数値を読み込み、0までカウントダウンを行うテキスト
 *作成者:K.Asakura
 *作成日:2024/04/10
 */
public class enshu04_11 {

	/*関数名:main
	 *概要:正の整数値を読み込み、0までカウントダウンを行うテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//カウントダウンします。と表示
		System.out.println("カウントダウンします・");
		//変数を初期化して宣言*xは教科書準拠
		int x = 0;

		//whileの限り実行
		do {
			//文字列を表示
			System.out.print("正の整数値:");
			//入力した整数値が0以下であれば実行
			x = standardInput.nextInt();
			//正の整数値の入力を促す
			if(x <= 0) {
				//正の整数値の入力を促す
				System.out.println("正しい数値を入力してください");
			}
			//入力した整数値が0以下であればループ
		} while (x <= 0);
		
		//変数を入力した整数から始めて、1デクリメントしながら0になるまでループ
		for(int assignmentValue = x; assignmentValue >= 0; assignmentValue-- ) {
			//入力した整数から0までカウントダウンしたものを改行して表示
			System.out.println(assignmentValue);
		}

	}

}
