package enshu15;
//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:enshu15_03
 *概要:文字列1から2の文字列を探索し、探索した文字列に揃うように文字列を表示
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class enshu15_03 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:main
	 *概要:文字列1から2の文字列を探索し、探索した文字列に揃うように文字列を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//文字列1の入力を促す
		System.out.print("文字列1:");
		//文字を読み込んで代入
		String firstString = standardInput.nextLine();
		//文字列2の入力を促す
		System.out.print("文字列2:");
		//文字を読み込んで代入
		String secondString = standardInput.nextLine();
		//文字列1を表示
		System.out.println("文字列1:" + firstString);
		//文字列2に文字列1が含まれているかを検索
		int indexNumber = firstString.indexOf(secondString);
		//文字列2が文字列1に含まれる場合
		if (indexNumber != -1) {
			//文字列2と表示
			System.out.print("文字列2:");
			//一致する部分が揃うように空白を出力
			for (int i = 0; i < indexNumber; i++) {
				//空白を出力
				System.out.print(' ');
			}
			//文字列2を表示
			System.out.print(secondString);
		}//文字列2が文字列1に含まれない場合
		else {
			//文字列2は文字列1に含まれないことを表示
			System.out.println("文字列2は文字列1に含まれません");
		}
	}

}
