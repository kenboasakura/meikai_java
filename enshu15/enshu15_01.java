package enshu15;

//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:enshu15_01
 *概要:文字を読み込んでその文字を逆から表示
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class enshu15_01 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:main
	 *概要:文字を読み込んでその文字を逆から表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//末尾のインデックスを調節するために引かれる整数を定数化
		final int ADJUSTMENT_INDEX = 1;
		//文字の入力を促す
		System.out.print("文字列:");
		//文字を読み込んで代入
		String inputString = standardInput.nextLine();
		//文字列を逆順から表示する
		for (int i = inputString.length() - ADJUSTMENT_INDEX; i >= 0; i--) {
			//各要素の文字列を表示
			System.out.println("文字列[" + i + "]:" + inputString.charAt(i));
		}

	}

}
