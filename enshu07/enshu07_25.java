package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_25
 *概要:配列aから、入力された整数であるインデックスの要素を先頭とし、入力された整数分の要素を連続して削除した配列を表示
 *作成者:K.Asakura
 *作成日:2024/05/07
 */
public class enshu07_25 {

	/*関数名:arrayRmvOfN
	 *概要:配列から、入力された整数のインデックスの要素を先頭とし、入力された整数分の要素を連続して削除した配列を返却するメソッド
	 *引数:配列、削除する先頭の要素のインデックス、連続して削除する個数
	 *戻り値:配列から、入力された整数のインデックスの要素を先頭とし、入力された整数分の要素を連続して削除した配列
	 *作成者:K.Asakura
	 *作成日:2024/05/07
	 */
	static int[] arrayRmvOfN(int[] a, int idx, int n) {

		//配列の長さを求めるカウントを行うため変数を初期化して宣言
		int countNumber = 0;
		//構成要素の場所を表す整数を初期化して宣言
		int indexNumber = 0;
		//順番をスキップする数を調整する式に用いる整数を定数化
		final int ADJUSTMENT_SKIP_VALUE = -1;
		//入力されたインデックスの要素を先頭とし、入力された整数分連続して要素を削除した配列の長さをもつ新たな配列を生成
		int[] delectionElementProcesArray = new int[a.length];
		//配列から、入力された整数のインデックスの要素を先頭とし、入力された整数分の要素を連続して削除した配列を生成する処理
		for (int i = 0; i < a.length; i++) {
			//削除するインデックスでない場合実行
			if (idx != i) {
				//配列の各要素を代入
				delectionElementProcesArray[indexNumber] = a[i];
				//配列の長さをインクリメント
				countNumber++;
				//インデックスをインクリメント
				indexNumber++;
				//削除する先頭の要素である場合実行
			} else {
				//n個分配列aの順番をスキップする
				i += n + ADJUSTMENT_SKIP_VALUE;
			}
		}
		//カウントされた分の長さをもつ配列の生成
		int[] delectionElementArray = new int[countNumber];
		//配列aから、入力された整数のインデックスの要素を先頭とし、入力された整数分の要素を連続して削除した配列を新しい配列に代入する処理
		for (int i = 0; i < delectionElementArray.length; i++) {
			//各要素を代入
			delectionElementArray[i] = delectionElementProcesArray[i];
		}
		//配列aから入力した整数のインデックスの要素を削除した配列を返却
		return delectionElementArray;

	}

	/*関数名:main
	 *概要:配列aから、入力された整数であるインデックスの要素を先頭とし、入力された整数分の要素を削除した配列を表示
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
			System.out.print("配列Xの要素数:");
			//要素数を読み込む
			firstInput = standardInput.nextInt();
			//入力した整数が0以下の場合実行
			if (firstInput <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力してください");
			}
			//正の整数が入力されるまでループ
		} while (firstInput <= 0);

		//配列Xを生成
		int[] firstArray = new int[firstInput];
		//配列Xに各要素を入力させる処理
		for (int i = 0; i < firstArray.length; i++) {
			//配列Xの各インデックスを表示
			System.out.print("X[" + i + "]:");
			//配列要素を読み込む
			firstArray[i] = standardInput.nextInt();
		}

		//削除するインデックスを読み込むため変数を初期化して宣言
		int delectionFirstIndex = 0;
		//インデックスの個数を調整する式に用いる数を定数化
		final int ADJUSTMENT_INDEX_VALUE = -1;
		//0以上配列の長さ未満の整数を入力させる処理
		do {
			//削除する先頭のインデックスの入力を促す
			System.out.print("削除する先頭のインデックス:");
			//削除するインデックスを読み込む
			delectionFirstIndex = standardInput.nextInt();
			//0未満配列の長さ以上の整数が入力された場合実行
			if (delectionFirstIndex < 0 || delectionFirstIndex > firstArray.length + ADJUSTMENT_INDEX_VALUE) {
				//0以上配列の長さ未満の整数を促す
				System.out.println("0以上" + (firstArray.length + ADJUSTMENT_INDEX_VALUE) + "以下の整数を入力して下さい");
			}
			//0以上配列の長さ未満の整数が入力されるまでループ
		} while (delectionFirstIndex < 0 || delectionFirstIndex > firstArray.length + ADJUSTMENT_INDEX_VALUE);

		//連続して削除する要素の個数を読み込むため変数を初期化して宣言
		int dilectionContinueIndex = 0;

		//1以上要素数からインデックスのを引いた整数以下の値を入力させる処理
		do {
			//連続して削除する要素の個数の入力を促す
			System.out.print("削除する要素の個数:");
			//連続して削除する要素の個数を読み込む
			dilectionContinueIndex = standardInput.nextInt();
			///0以下要素数からインデックスのを引いた整数より上の値が入力された場合実行
			if (0 >= dilectionContinueIndex
					|| firstArray.length - delectionFirstIndex < dilectionContinueIndex) {
				//1以上要素数からインデックスを引いた数以下の値の入力を促す
				System.out.println("1以上" + (firstArray.length - delectionFirstIndex) + "以下の整数を入力してください");
			}
			//1以上要素数からインデックスのを引いた数以下の値が入力されるまでループ
		} while (0 >= dilectionContinueIndex || firstArray.length - delectionFirstIndex < dilectionContinueIndex);

		//返却された配列を新しく生成した配列に代入
		int[] secondArray = arrayRmvOfN(firstArray, delectionFirstIndex, dilectionContinueIndex);

		//配列aの構成要素数分要素が削除される場合実行
		if (firstArray.length == dilectionContinueIndex) {
			//すべての要素が削除されたことを表示
			System.out.println("すべての要素が削除されました");
			//そうでない場合実行
		} else {
			//中括弧の始まりを表示
			System.out.print("{");
			//配列Xから入力したインデックスの要素を削除した配列を表示する処理
			for (int i = 0; i < secondArray.length; i++) {
				//各要素を表示
				System.out.print(secondArray[i]);
				//インデックスが末尾でない場合実行
				if (i != secondArray.length + ADJUSTMENT_INDEX_VALUE) {
					//コンマを表示
					System.out.print(",");
				}
			}
			//中括弧の終わりを表示
			System.out.print("}");
		}

	}

}
