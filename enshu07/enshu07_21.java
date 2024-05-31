package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_21
 *概要:配列aとbの全要素の値を交換して表示
 *作成者:K.Asakura
 *作成日:2024/05/02
 */
public class enshu07_21 {

	/*関数名:aryExchng
	 *概要:配列aとbの全要素の値を交換して返却するメソッド
	 *引数:配列a、配列b
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/02
	 */
	static void aryExchng(int[] a, int[] b) {

		//各要素を交換する回数を求めるための変数を初期化して宣言
		int indexExchangeValue = 0;
		//各要素を交換するための変数を初期化して宣言
		int exchangeElement = 0;
		//インデックスの個数を調整する処理に用いる整数を定数化
		final int ADJUSTMENT_VALUE = -1;
		//要素数が小さいほうを代入
		indexExchangeValue = a.length < b.length ? a.length : b.length;
		//小さいほうの要素数分配列aとbの同じ順番の要素をを交換する処理
		for (int i = 0; i < indexExchangeValue; i++) {
			//交換するための変数に配列要素aを代入
			exchangeElement = a[i];
			//違う配列で同じ順番に位置する配列要素aに配列要素bを代入
			a[i] = b[i];
			//違う配列で同じ順番に位置する配列要素aとbの値を交換
			b[i] = exchangeElement;
		}
		//中括弧の始まりを表示
		System.out.print("配列a{");
		//配列aの要素数分値を表示する処理
		for (int i = 0; i < a.length; i++) {
			//各要素の値を表示
			System.out.print(a[i]);
			//構成要素が末尾でない場合実行
			if (i != a.length + ADJUSTMENT_VALUE) {
				//コンマを表示
				System.out.print(",");
			}
		}
		//中括弧の終わりを表示
		System.out.println("}");

		//中括弧の始まりを表示
		System.out.print("配列b{");
		//配列bの要素数分値を表示する処理
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			//構成要素が末尾でない場合実行
			if (i != b.length + ADJUSTMENT_VALUE) {
				//コンマを表示
				System.out.print(",");
			}
		}
		//中括弧の終わりを表示
		System.out.println("}");
	}

	/*関数名:main
	 *概要:配列aとbの全要素の値を交換して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/02
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
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

		//配列bの要素数を読み込むために変数を初期化して宣言
		int secondInput = 0;

		//要素数に正の整数を入力させる処理
		do {
			//要素数の入力を促す
			System.out.print("配列bの要素数:");
			//要素数を読み込む
			secondInput = standardInput.nextInt();
			//入力した整数が0以下の場合実行
			if (secondInput <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力してください");
			}
			//正の整数が入力されるまでループ
		} while (secondInput <= 0);

		//配列bを生成
		int[] secondArray = new int[secondInput];
		//配列bに各要素を入力させる処理
		for (int i = 0; i < secondArray.length; i++) {
			//配列bの各インデックスを表示
			System.out.print("a[" + i + "]:");
			//配列要素を読み込む
			secondArray[i] = standardInput.nextInt();
		}

		//要素数が小さいほうの要素数分配列要素を交換した配列aとbを表示
		aryExchng(firstArray, secondArray);

	}

}
