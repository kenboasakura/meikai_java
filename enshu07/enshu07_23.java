package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_23
 *概要:検索した値と同じ配列内の整数のインデックスを先頭から順に表示
 *作成者:K.Asakura
 *作成日:2024/05/07
 */
public class enshu07_23 {

	/*関数名:arraySrchIdx
	 *概要:検索した値と同じ配列内の整数のインデックスを先頭から順に格納する配列を返却するメソッド
	 *引数:配列a、入力された検索する要素
	 *戻り値:検索する要素のインデックスを先頭から格納した配列
	 *作成者:K.Asakura
	 *作成日:2024/05/07
	 */
	static int[] arraySrchIdx(int[] a, int x) {

		//配列の長さを求めるカウントを行うため変数を初期化して宣言
		int countNumber = 0;
		//構成要素の場所を表す整数を初期化して宣言
		int indexNumber = 0;
		//検索した値と同じ要素を探すため配列を生成
		int[] searchArray = new int[a.length];

		//検索した値と同じ配列内の整数を探してそのインデックスを別の配列に格納する処理
		for (int i = 0; i < a.length; i++) {
			//検索した値と要素が一致していた時
			if (x == a[i]) {
				//インデックスを代入
				searchArray[indexNumber] = i;
				//配列の長さを表す変数をインクリメント
				countNumber++;
				//インデックスを表す変数をインクリメント
				indexNumber++;
			}
		}
		//検索した値と同じ全要素のインデックスを格納した配列の生成
		int[] storingIndexArray = new int[countNumber];
		//配列に配列aのインデックスを先頭から順に代入する処理
		for (int i = 0; i < countNumber; i++) {
			//インデックスを代入
			storingIndexArray[i] = searchArray[i];
		}
		//代入したインデックスを返却
		return storingIndexArray;

	}

	/*関数名:main
	 *概要:検索した値と同じ全要素のインデックスを先頭から順に表示
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

		//配列a内の要素を探すための変数を初期化して宣言
		int keyNumber = 0;
		//検索する配列内の整数の入力を促す
		System.out.print("探す配列a内の整数:");
		//検索する要素を読み込む
		keyNumber = standardInput.nextInt();

		//配列aと同じ値と要素数をもった配列を表示するため配列を生成
		int[] secondArray = arraySrchIdx(firstArray, keyNumber);
		//インデックスの個数を調整する処理に用いる数を定数化
		final int ADJUSTMENT_VALUE = -1;

		//検索した要素が配列にない場合
		if (secondArray.length == 0) {
			//検索した値がないことを表示
			System.out.print("検索した値はありません");
			//検索した値が配列にある場合
		} else {
			//中括弧の始まりを表示
			System.out.print("{");
			//検索した値である要素のインデックスを先頭から順に並べた配列を表示する処理
			for (int i = 0; i < secondArray.length; i++) {
				//検索した値の構成要素の場所を表す整数を表示
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
