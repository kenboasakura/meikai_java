package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_16
 *概要:配列の最小値を求めて表示
 *作成者:K.Asakura
 *作成日:2024/05/01
 */
public class enshu07_16 {
	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:minOf
	 *概要:配列の最小値を算出するメソッド
	 *引数:各要素の整数
	 *戻り値:配列内の最小値
	 *作成者:K.Asakura
	 *作成日:2024/05/01
	 */
	static int minOf(int[] firstArray) {
		//最小値を算出するための変数を初期化して宣言
		int minimumValue = firstArray[0];
		//最小値を算出する処理
		for (int i = 0; i < firstArray.length; i++) {
			//その配列要素が以前の配列要素より小さければ実行
			if (firstArray[i] < minimumValue)
				//その要素を代入
				minimumValue = firstArray[i];
		}
		//最小値を返却
		return minimumValue;
	}

	/*関数名:main
	 *概要:配列の最小値を求めて表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/01
	 */
	public static void main(String[] args) {
		//要素数を読み込むため変数を初期化して宣言
		int elementCount = 0;

		//正の整数が入力されるまで実行
		while (elementCount <= 0) {
			//要素数の入力を促す
			System.out.print("要素数:");
			//要素数を読み込む
			elementCount = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (elementCount <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください。");
			}
		}
		//入力した整数分の要素数をもつ配列を生成
		int[] arrayValue = new int[elementCount];
		//各要素に入力した整数を代入する処理
		for (int i = 0; i < elementCount; i++) {
			//各要素の入力を促す
			System.out.print("配列a[" + i + "]:");
			//要素を読み込む
			arrayValue[i] = standardInput.nextInt();
		}
		//最小値を表示
		System.out.println("最小値は" + minOf(arrayValue) + "です。");
	}

}
