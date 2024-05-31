package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_18
 *概要:配列aから入力されたインデックスの要素を削除して表示
 *作成者:K.Asakura
 *作成日:2024/05/01
 */
public class enshu07_18 {
	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:aryRmv
	 *概要:配列aから入力されたインデックスの要素を削除して表示するメソッド
	 *引数:配列a、削除する構成要素の位置にあたる整数
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/01
	 */
	static void aryRmv(int[] firstArray, int indexNumber) {
		final int LAST_INDEX = -1;
		//中括弧の始まりを表示
		System.out.print("配列a{");
		//配列aから,入力された構成要素の場所を示す整数の要素を削除した配列を表示する処理
		for (int i = 0; i < firstArray.length; i++) {
			//配列aから削除する構成要素の場所を示す整数ではない時実行
			if (i != indexNumber) {
				//配列要素とコンマを表示
				System.out.print(firstArray[i] + ",");
				//配列aから削除する構成要素の場所を示す整数と同じのとき実行
			} else if (i == indexNumber && i != firstArray.length) {
				//ループを繰り返す
				continue;
			}
		}
		//末尾要素と中括弧の終わりを表示
		System.out.println(firstArray[firstArray.length + LAST_INDEX] + "}");
	}

	/*関数名:main
	 *概要:配列aから入力されたインデックスの要素を削除して表示
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
			System.out.print("a[" + i + "]:");
			//要素を読み込む
			arrayValue[i] = standardInput.nextInt();
		}

		//構成要素の場所の途中を表す処理に用いる値を定数化
		final int CONTINUE_INDEX = 1;
		//中括弧の始まりを表示
		System.out.print("配列a{");
		//配列aを表示する処理
		for (int i = 0; i < arrayValue.length; i++) {
			//各要素を表示
			System.out.print(arrayValue[i]);
			//構成要素の場所が末尾でない場合実行
			if (i < arrayValue.length - CONTINUE_INDEX) {
				//コンマを表示
				System.out.print(",");
			}
		}
		//中括弧の終わりを表示
		System.out.println("}");

		//削除する構成要素の場所を表す整数を読み込むため変数を初期化して宣言
		int delectionIndex = 0;
		//要素数が1しかないことを表す値を定数化
		final int ONLY_ONE = 1;
		//0以上要素数未満の整数を入力させる処理
		do {
			//削除するイ構成要素の場所を表す整数の入力を促す
			System.out.print("削除するインデックス:");
			//削除する構成要素の場所を表す整数を読み込む
			delectionIndex = standardInput.nextInt();
			//0未満要素数以上の整数が入力された場合実行
			if (delectionIndex < 0 || delectionIndex >= arrayValue.length) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください。");
			}
			//0以上要素数未満の整数が入力されるまでループ
		} while (delectionIndex < 0 || delectionIndex >= arrayValue.length);

		//要素数が1の場合実行
		if (elementCount == ONLY_ONE) {
			//構成要素を削除したことを表示
			System.out.println("インデックスを削除したため構成要素がなくなりました。");
			//構成要素が2以上の場合実行
		} else {
			//入力した構成要素の場所を表す整数にあたる要素を削除した配列を表示
			aryRmv(arrayValue, delectionIndex);
		}

	}

}
