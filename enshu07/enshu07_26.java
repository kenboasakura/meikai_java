package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_26
 *概要:配列aから入力された整数のインデックスの要素に入力された整数を挿入した配列を表示
 *作成者:K.Asakura
 *作成日:2024/05/07
 */
public class enshu07_26 {

	/*関数名:arrayInsOf
	 *概要:配列から入力された整数のインデックスの要素に入力された整数を挿入した配列を返却するメソッド
	 *引数:配列、挿入するインデックス、挿入する整数
	 *戻り値:配列から入力された整数のインデックスの要素に整数xを挿入した配列
	 *作成者:K.Asakura
	 *作成日:2024/05/07
	 */
	static int[] arrayInsOf(int[] a, int idx, int x) {
		//カウントするために変数を初期化して宣言
		int countNumber = 0;
		//配列から入力された整数のインデックスの要素に入力された整数を挿入した配列の長さを調整するための数を定数化
		final int SHIFT_END = 1;
		//配列より1大きい要素数をもった配列の生成
		int[] insertionArray = new int[a.length + SHIFT_END];
		//配列から入力された整数のインデックスの要素に入力された整数を挿入した配列を生成する処理
		for (int i = 0; i < a.length + SHIFT_END; i++) {
			//挿入するインデックスの場合実行
			if (idx == i) {
				//入力された要素を代入
				insertionArray[i] = x;
				//配列の全要素を後方にずらすためカウント
				countNumber++;
				//挿入するインデックスでない場合実行
			} else {
				//配列、もしくは配列をずらした要素を代入
				insertionArray[i] = a[i - countNumber];
			}
		}
		//配列から、入力された整数のインデックスの要素に整数xを挿入した配列を返却
		return insertionArray;

	}

	/*関数名:main
	 *概要:配列aから入力された整数のインデックスの要素に入力された整数を挿入した配列を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/07
	 */
	public static void main(String[] args) {
		try (//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in)) {
			//配列aの要素数を読み込むために変数を初期化して宣言
			int firstInput = 0;

			//要素数に正の整数を入力させる処理
			do {
				//要素数の入力を促す
				System.out.print("配列aの要素数:");
				//要素数を読み込む
				firstInput = standardInput.nextInt();
				//入力した整数が0以下の場合実行
				if (firstInput <= 0) {
					//正の整数の入力を促す
					System.out.println("正の整数を入力してください");
				}
				//正の整数が入力されるまでループ
			} while (firstInput <= 0);

			//配列aを生成
			int[] firstArray = new int[firstInput];
			//配列aに各要素を入力させる処理
			for (int i = 0; i < firstArray.length; i++) {
				//配列aの各インデックスを表示
				System.out.print("a[" + i + "]:");
				//配列要素を読み込む
				firstArray[i] = standardInput.nextInt();
			}

			//挿入するインデックスを読み込むため変数を初期化して宣言
			int insertionPosition = 0;

			//インデックスの末尾を表す式に用いる数を定数化
			final int ADJUSTMENT_INDEX_VALUE = -1;

			//0以上配列の長さ未満の整数を入力させる処理
			do {
				//挿入するインデックスの入力を促す
				System.out.print("挿入するインデックス:");
				//挿入するインデックスを読み込む
				insertionPosition = standardInput.nextInt();
				if (insertionPosition < 0 || insertionPosition > firstArray.length + ADJUSTMENT_INDEX_VALUE) {
					//0以上配列の長さ未満の整数を促す
					System.out.print("0以上" + (firstArray.length + ADJUSTMENT_INDEX_VALUE) + "以下の整数を入力して下さい");
				}
				//0以上配列の長さ未満の整数が入力されるまでループ
			} while (insertionPosition < 0 || insertionPosition > firstArray.length + ADJUSTMENT_INDEX_VALUE);

			//挿入する要素を読み込むために変数を初期化して宣言
			int insertionElementValue = 0;
			//挿入する整数の入力を促す
			System.out.print("挿入する整数:");
			//挿入する整数を読み込む
			insertionElementValue = standardInput.nextInt();

			//新しく生成された配列に返却された配列を代入
			int[] secondArray = arrayInsOf(firstArray, insertionPosition, insertionElementValue);

			//中括弧の始まりを表示
			System.out.print("{");
			//返却された配列を表示する処理
			for (int i = 0; i < secondArray.length; i++) {
				//各要素を表示
				System.out.print(secondArray[i]);
				//インデックスが末尾でない場合実行
				if (i != secondArray.length + ADJUSTMENT_INDEX_VALUE) {
					//コンマを表示
					System.out.print(",");
				}
			}
		}

		//中括弧の終わりを表示
		System.out.print("}");

	}

}
