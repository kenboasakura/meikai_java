package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_28
 *概要:2つの行列とその和を表示
 *作成者:K.Asakura
 *作成日:2024/05/08
 */
public class enshu07_28 {
	//Scannerクラスに変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:addMatrix
	 *概要:2つの行列の和を格納した配列を返却するメソッド
	 *引数:2つの行列
	 *戻り値:2つの行列の和
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static int[][] addMatrix(int[][] x, int[][] y) {

		//2つの行列の加算結果を格納する行列を生成
		int totalMatrix[][] = new int[x.length][];

		//行ごとに2つの行列の要素の値を加算して別の行列に代入する処理
		for (int i = 0; i < x.length; i++) {
			//引数分の行と列をもつ二次元配列を生成
			totalMatrix[i] = new int[x[i].length];
			//列ごとに2つの行列の要素の値を加算して別の行列に代入する処理
			for (int j = 0; j < x[i].length; j++) {
				//2つの行列の要素の値を加算して別の行列に代入
				totalMatrix[i][j] = x[i][j] + y[i][j];
			}
		}
		//行列の和を返却
		return totalMatrix;
	}

	/*関数名:printMatrix
	 *概要:行列の各要素を表示するメソッド
	 *引数:行列
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static void printMatrix(int[][] x) {
		//末尾のインデックスを求めるために列ごとの要素数を調整する数を定数化
		final int ADJUSTMENT_INDEX = 1;

		//行ごとに値を表示する処理
		for (int i = 0; i < x.length; i++) {
			//中括弧の始まりを表示
			System.out.print("{");
			//列ごとに値を表示する処理
			for (int j = 0; j < x[i].length; j++) {
				//各要素を少なくとも2桁の十進数で表示
				System.out.printf("%2d", x[i][j]);
				//インデックスが末尾でない場合実行
				if (j < x[i].length - ADJUSTMENT_INDEX) {
					//コンマを表示
					System.out.print(",");
				}
			}
			//中括弧の終わりを表示
			System.out.print("}");
			//改行を出力
			System.out.println();
		}
	}

	/*関数名:inputElementMatrix
	 *概要:行列の各要素に入力した整数を読み込むメソッド
	 *引数:行列、何番目の行列かを表す整数
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static void inputElementMatrix(int[][] x, int a) {
		//行ごとに入力した整数を読み込む処理
		for (int i = 0; i < x.length; i++) {
			//列ごとに入力した整数を読み込む処理
			for (int j = 0; j < x[i].length; j++) {
				//各要素に整数の入力を促す
				System.out.print("行列" + a + "[" + i + "][" + j + "]=");
				//入力された整数を読み込む
				x[i][j] = standardInput.nextInt();
			}
		}
	}

	/*関数名:main
	 *概要:2つの行列とその和を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	public static void main(String[] args) {

		//行数を読み込むため変数を初期化して宣言
		int matrixLine = 0;
		//列数を読み込むため変数を初期化して宣言
		int matrixColumn = 0;

		//正の整数が入力させる処理
		do {
			//配列の行数の入力を求める
			System.out.print("行数:");
			//入力された行数を読み込む
			matrixLine = standardInput.nextInt();
			//入力した整数が0以下の場合実行
			if (matrixLine <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力してください");
			}
			//正の整数が入力されるまでループ
		} while (matrixLine <= 0);

		//入力された要素数分の1つめの行列を生成
		int firstMatrix[][] = new int[matrixLine][];
		//入力された要素数分の2つめの行列を生成
		int secondMatrix[][] = new int[matrixLine][];

		//入力した行分の列を生成する処理
		for (int i = 0; i < matrixLine; i++) {
			//正の整数を入力させるための処理
			do {
				//各行の列数の入力を促す
				System.out.print("[" + i + "]の列数:");
				//列数を読み込む
				matrixColumn = standardInput.nextInt();
				//入力した整数が0以下だった場合
				if (matrixColumn <= 0) {
					//正しい値の入力を促す
					System.out.println("正しい値を入力してください");
				}
				//正の整数が入力されるまでループ
			} while (matrixColumn <= 0);
			//入力した整数分の行と列をもつ1つめの二次元配列を生成
			firstMatrix[i] = new int[matrixColumn];
			//入力した整数分の行と列をもつ2つめの二次元配列を生成
			secondMatrix[i] = new int[matrixColumn];
		}

		//1つめの行列を表す整数を定数化
		final int MATRIX_NUMBER_ONE = 1;
		//2つめの行列を表す整数を定数化
		final int MATRIX_NUMBER_TWO = 2;

		//1つめの行列と1番目の行列であることを表す整数を引数として、メソッドを呼び出し各要素に整数を読み込む///////
		inputElementMatrix(firstMatrix, MATRIX_NUMBER_ONE);
		//2つめの行列と2番目の行列であることを表す整数を引数として、メソッドを呼び出し各要素に整数を読み込む
		inputElementMatrix(secondMatrix, MATRIX_NUMBER_TWO);

		//1つ目の行列と表示
		System.out.println("1つ目の行列");
		//1つ目の行列をメソッドを呼び出して各要素を表示
		printMatrix(firstMatrix);
		//2つ目の行列と表示
		System.out.println("2つ目の行列");
		//2つ目の行列をメソッドを呼び出して各要素を表示
		printMatrix(secondMatrix);
		//1つ目と2つ目の行列の和と表示
		System.out.println("1つ目と2つ目の行列の和");
		//1つ目と2つ目の行列の和をメソッドを呼び出して計算し、メソッドを呼び出して各要素を表示
		printMatrix(addMatrix(firstMatrix, secondMatrix));

	}
}
