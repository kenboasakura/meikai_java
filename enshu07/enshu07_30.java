package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_30
 *概要:入力した整数3つと入力した要素数と要素をもつ配列を作成し、1つめと2つめの整数の最小値、3つの整数の最小値、配列の最小値を表示
 *作成者:K.Asakura
 *作成日:2024/05/09
 */
public class enshu07_30 {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:min
	 *概要:2つの整数の最小値を求めて返却するメソッド
	 *引数:2つの整数
	 *戻り値:最小値
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	static int min(int a, int b) {
		//2つの整数の最小値を返却
		return a < b ? a : b;
	}

	/*関数名:min
	 *概要:3つの整数の最小値を求めて返却するメソッド
	 *引数:3つの整数
	 *戻り値:最小値
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	static int min(int a, int b, int c) {
		//最小値として1つめの整数を代入
		int minimumValue = a;
		//最初に代入した値よりも小さい場合に2つめの整数を代入
		if (b < minimumValue)
			//2つめの整数を代入
			minimumValue = b;
		//最初に代入した値よりも小さい場合に3つめの整数を代入
		if (c < minimumValue)
			//3つめの整数を代入
			minimumValue = c;
		//最小値を返却
		return minimumValue;
	}

	/*関数名:min
	 *概要:配列の最小値を求めて返却するメソッド
	 *引数:3つの整数
	 *戻り値:最小値
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	static int min(int a[]) {
		//最小値として先頭の要素の値を代入
		int minimumValue = a[0];
		//配列の最小値を求めて代入
		for (int i = 0; i < a.length; i++) {
			//最小値よりも現在の場所にある要素の値が小さい場合実行
			if (a[i] < minimumValue) {
				//最小値として要素の値を代入
				minimumValue = a[i];
			}
		}
		//最小値を返却
		return minimumValue;
	}

	/*関数名:main
	 *概要:入力した整数3つと入力した要素数と要素をもつ配列を作成し、1つめと2つめの整数の最小値、3つの整数の最小値、配列の最小値を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/09
	 */
	public static void main(String[] args) {

		//1つめの整数の入力を促す
		System.out.print("1つめの整数:");
		//入力された整数を読み込む
		int firstIntegerValue = standardInput.nextInt();
		//2つめの整数の入力を促す
		System.out.print("2つめの整数:");
		//入力された整数を読み込む
		int secondIntegerValue = standardInput.nextInt();
		//3つめの整数の入力を促す
		System.out.print("3つめの整数:");
		//入力された整数を読み込む
		int thirdIntegerValue = standardInput.nextInt();
		//要素数を入力させるための変数を初期化して宣言
		int elementValue = 0;
		//正の整数を入力させる
		while (elementValue <= 0) {
			//要素数の入力を促す
			System.out.print("配列の要素数:");
			//入力された整数を読み込む
			elementValue = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (elementValue <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力して下さい");
			}
		}
		//入力された要素数をもつ配列を生成
		int arrayValue[] = new int[elementValue];
		//各要素に入力された整数を代入
		for (int i = 0; i < arrayValue.length; i++) {
			//各要素に整数の入力を促す
			System.out.print("配列[" + i + "]=");
			//入力された整数を読み込む
			arrayValue[i] = standardInput.nextInt();
		}

		//1つめと2つめの入力された整数を引数としてメソッドを呼び出し、2つの整数の最小値を表示
		System.out.println("1つめと2つめの整数の最小値は" + min(firstIntegerValue, secondIntegerValue) + "です。");
		//入力された3つの整数を引数としてメソッドを呼び出し、3つの整数の最小値を表示
		System.out.println("3つのの整数の最小値は" + min(firstIntegerValue, secondIntegerValue, thirdIntegerValue) + "です。");
		//入力された要素をもつ配列を引数としてメソッドを呼び出し、配列の最小値を表示
		System.out.println("配列の最小値は" + min(arrayValue) + "です。");
	}

}
