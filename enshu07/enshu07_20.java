package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_20
 *概要:配列aに別途で入力した整数の要素を挿入して表示
 *作成者:K.Asakura
 *作成日:2024/05/02
 */
public class enshu07_20 {

	/*関数名:aryIns
	 *概要:配列aに別途で入力した整数の要素を挿入したものを表示するメソッド
	 *引数:配列a、挿入する構成要素の場所を表す整数、挿入する要素
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/02
	 */
	static void aryIns(int[] a, int idx, int x) {
		//後方にずらした配列を出力する処理に用いる値を定数化
		final int SHIFT_END = -1;
		//構成要素の位置が一番後ろか確認する処理で用いる値を定数化
		final int CONMA_ONE = -1;
		//中括弧の始まりを表示
		System.out.print("配列a{");
		//配列aに後に入力した要素を挿入して表示する処理
		for (int i = 0; i < a.length; i++) {
			//構成要素の場所が先頭でない場合かつ構成要素の場所が末尾でないとき実行
			if (i > 0 || i == a.length + CONMA_ONE) {
				//コンマを表示
				System.out.print(",");
			}
			//挿入する構成要素の場所を表す整数より、表示する構成要素の場所を表す整数の方が小さい場合実行
			if (i < idx) {
				//配列要素を表示
				System.out.print(a[i]);
				//挿入する構成要素の場所を表す整数と表示する構成要素の場所を表す整数が同じの場合実行
			} else if (i == idx) {
				//挿入した配列要素を表示
				System.out.print(x);
				//挿入する構成要素の場所を表す整数より、表示する構成要素の場所を表す整数の方が大きい場合実行
			} else {
				//配列要素を表示
				System.out.print(a[i + SHIFT_END]);
			}

		}
		//中括弧の終わりを表示
		System.out.println("}");

	}

	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:main
	 *概要:配列aに別途で入力した整数の要素を挿入して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/02
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

		//構成要素の位置を表す処理に用いる値を定数化
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

		//挿入する構成要素の順番に当たる整数を読み込むため変数を初期化して宣言
		int insertionIndex = 0;
		//構成要素の場所を表す整数を調整する値を定数化
		final int MUXIMUM_INDEX = -1;
		//0以上要素数未満の整数が入力させる処理
		do {
			//挿入するインデックスの入力を促す
			System.out.print("挿入するインデックス:");
			//挿入するインデックスを読み込む
			insertionIndex = standardInput.nextInt();
			//0未満要素数以上の整数が入力された場合実行
			if (insertionIndex < 0 || insertionIndex > arrayValue.length + MUXIMUM_INDEX) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください。");
			}
			//0以上要素数未満の整数が入力されるまでループ
		} while (insertionIndex < 0 || insertionIndex > arrayValue.length + MUXIMUM_INDEX);
		//挿入する整数を読み込むため変数を初期化して宣言
		int insertionValue = 0;

		//挿入する要素の入力を促す
		System.out.print("挿入する整数:");
		//挿入する要素を読み込む
		insertionValue = standardInput.nextInt();
		//配列aに別途で要素を挿入したものを表示
		aryIns(arrayValue, insertionIndex, insertionValue);

	}

}
