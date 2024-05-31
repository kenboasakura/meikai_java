package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_24
 *概要:配列aから入力した整数のインデックスの要素を削除して表示
 *作成者:K.Asakura
 *作成日:2024/05/07
 */
public class enshu07_24 {

	/*関数名:arrayRmvOf
	 *概要:関数mainでの配列aから入力した整数のインデックスの要素を削除した配列を返却するメソッド
	 *引数:配列a、削除するインデックス
	 *戻り値:配列aから入力した整数のインデックスの要素を削除した配列
	 *作成者:K.Asakura
	 *作成日:2024/05/07
	 */
	static int[] arrayRmvOf(int[] a, int idx) {

		//配列の長さを求めるカウントを行うため変数を初期化して宣言
		int countNumber = 0;
		//構成要素の場所を表す整数を初期化して宣言
		int indexNumber = 0;
		//入力されたインデックスを削除し、削除したインデックスの後の要素を1つ前にずらした配列aの長さをもつ配列を生成
		int[] delectionElementProcesArray = new int[a.length];
		//配列aから入力した整数のインデックスの要素を削除する処理
		for (int i = 0; i < a.length; i++) {
			//削除する構成要素の場所でない場合実行
			if (idx != i) {
				//配列aの各要素を代入
				delectionElementProcesArray[indexNumber] = a[i];
				//配列の長さをインクリメント
				countNumber++;
				//インデックスをインクリメント
				indexNumber++;
			}
		}
		//配列aから入力した整数のインデックスの要素を削除した配列を生成
		int[] delectionElementArray = new int[countNumber];
		//配列aから入力した整数のインデックスの要素を削除した配列を新しい配列に代入する処理
		for (int i = 0; i < delectionElementArray.length; i++) {
			//各要素を代入
			delectionElementArray[i] = delectionElementProcesArray[i];
		}
		//配列aから入力した整数のインデックスの要素を削除した配列を返却
		return delectionElementArray;

	}

	/*関数名:main
	 *概要:配列aから入力した整数のインデックスの要素を削除して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/07
	 */
	public static void main(String[] args) {

		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

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

		//削除するインデックスを読み込むため変数を初期化して宣言
		int delectionIndex = 0;
		//インデックスの個数を調整する処理に用いる数を定数化
		final int ADJUSTMENT_VALUE = -1;
		//0以上配列の長さ未満の整数を入力させる処理
		do {
			//削除するインデックスの入力を促す
			System.out.print("削除するインデックス:");
			//削除するインデックスを読み込む
			delectionIndex = standardInput.nextInt();
			//0未満もしくは配列の長さより大きい整数が入力された場合実行
			if (delectionIndex < 0 || delectionIndex > firstArray.length + ADJUSTMENT_VALUE) {
				//0以上配列の長さ未満の整数を促す
				System.out.println("0以上" + (firstArray.length + ADJUSTMENT_VALUE) + "以下の整数を入力して下さい");
			}
			//0以上配列の長さ未満の整数が入力されるまでループ
		} while (delectionIndex < 0 || delectionIndex > firstArray.length + ADJUSTMENT_VALUE);

		//新しく生成した配列に返却された配列を代入
		int[] secondArray = arrayRmvOf(firstArray, delectionIndex);
		//要素数が一つのみであることを表す整数を定数化
		final int ELEMENT_ONLY_CASE = 1;
		//要素数が1のみの場合実行
		if (firstInput == ELEMENT_ONLY_CASE) {
			//配列aの全要素が削除されたことを表示
			System.out.println("配列の全要素を削除しました。");
		}

		//要素数が2以上の場合
		else {
			//中括弧の始まりを表示
			System.out.print("{");
			//配列aから入力したインデックスの要素を削除した配列を表示する処理
			for (int i = 0; i < secondArray.length; i++) {
				//各要素を表示
				System.out.print(secondArray[i]);
				//インデックスが末尾でない場合実行
				if (i != secondArray.length + ADJUSTMENT_VALUE) {
					//コンマを表示
					System.out.print(",");
				}
			}
			//中括弧の終わりを表示
			System.out.print("}");
		}

	}

}
