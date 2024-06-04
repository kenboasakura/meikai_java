package enshu15;
//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:enshu15_02
 *概要:文字列を読み込んで、1文字ずつ文字コードを表示
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class enshu15_02 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:main
	 *概要:文字列を読み込んで、1文字ずつ文字コードを表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//文字の入力を促す
		System.out.print("文字列:");
		//文字を読み込んで代入
		String inputString = standardInput.nextLine();
		//読み込んだ文字列を表示
		System.out.println("入力された文字:" + inputString);
		//読み込んだ文字の文字コードを1つずつ表示
		for (int i = 0; i < inputString.length(); i++) {
			//char型の変数を生成し、文字列をchar型にして代入
			char charValue = inputString.charAt(i);
			//文字コードの変数を生成
			int charCode = (int) charValue;
			//1文字ずつ文字コードを表示
			System.out.println("文字:" + charValue + "の文字コード:" + charCode);
		}

	}

}
