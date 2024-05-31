package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_22
 *概要:配列aと同じ配列(要素数とすべての要素の値が同じ)を生成して表示
 *作成者:K.Asakura
 *作成日:2024/05/07
 */
public class enshu07_22 {

	/*関数名:arrayClone
	 *概要:配列aと同じ配列(要素数とすべての要素の値が同じ)を生成して返却するメソッド
	 *引数:配列a
	 *戻り値:配列aと同じ要素数と要素をもつ配列
	 *作成者:K.Asakura
	 *作成日:2024/05/07
	 */
	static int[] arrayClone(int[] a) {
		//配列aと同じ長さの配列を生成
		int[] copyArray = new int[a.length];
		//配列aと同じ値を各要素に代入する処理
		for (int i = 0; i < a.length; i++) {
			//各要素に同じ順番の構成要素を代入
			copyArray[i] = a[i];

		}
		//代入した配列を返却
		return copyArray;

	}

	/*関数名:main
	 *概要:配列aと同じ配列(要素数とすべての要素の値が同じ)を生成して表示
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

		//インデックスの個数を調整する式に用いる数を定数化
		final int ADJUSTMENT_VALUE= -1;
		
		//コピーした配列を表示しますと表示
		System.out.println("コピーした配列を表示します。");
		//配列aと同じ値と要素数をもった配列を表示するため配列を生成
		int[] secondArray = arrayClone(firstArray);
		//中括弧の始まりを表示
		System.out.print("{");
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
