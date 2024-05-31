package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_27
 *概要:2つの行列の要素数が等しくなければ3つめの行列にfalseを、等しければ3つめの行列にtrueと行列aとbを加算したものを表示
 *作成者:K.Asakura
 *作成日:2024/05/08
 */
public class enshu07_27 {
	//Scannerクラスに変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:addMatrix
	 *概要:行列の要素数が等しくなければにfalseを、等しければtrueとそれぞれの行列を加算した値を返却するメソッド
	 *引数:3つの行列
	 *戻り値:true、もしくはfalse
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {

		//論理型の変数にfalseを代入して宣言
		boolean logicalValue = false;
		Outer:
		//3つの行列の行数が同じ場合実興
		if (x.length == y.length && y.length == z.length && z.length == x.length) {
			//行分2つの行列の要素の値を加算し別の行列に代入する処理
			for (int i = 0; i < x.length; i++) {
				//行列の列数が同じ場合実行
				if (x[i].length == y[i].length && y[i].length == z[i].length && z[i].length == x[i].length) {
					//列分2つの行列の要素の値を加算し別の行列に代入する処理
					for (int j = 0; j < x[i].length; j++) {
						//2つの行列の和を代入
						z[i][j] = x[i][j] + y[i][j];
					}
				} //行列の列数が違う場合実行
				else {
					//論理値にfalseを代入
					logicalValue = false;
					//Outerから抜け出す
					break Outer;
				}
				//論理値にtrueを代入
				logicalValue = true;
			}
		}
		//代入された論理値を返却
		return logicalValue;
	}

	/*関数名:printMatrix
	 *概要:行列の要素を表示するメソッド
	 *引数:行列
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static void printMatrix(int[][] x) {
		//列ごとの末尾のインデックスを求めるために列ごとの要素数を調整する数を定数化
		final int ADJUSTMENT_INDEX = -1;

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
	 *概要:行列の各要素に入力した整数を読み込んで表示するメソッド
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

	/*関数名:inoutMatrixLine
	 *概要:行列の行数を読み込んで返却するメソッド
	 *引数:何番目の行列かを表す整数
	 *戻り値:行数
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static int inputMatrixLine(int a) {
		//行数を読み込むための変数を初期化して宣言
		int matrixLine = 0;

		//正の整数が入力させる処理
		do {
			//行列の行数の入力を求める
			System.out.print("行列" + a + "の行数:");
			//入力された行数を読み込む
			matrixLine = standardInput.nextInt();
			//入力した整数が0以下の場合実行
			if (matrixLine <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力してください");
			}
			//正の整数が入力されるまでループ
		} while (matrixLine <= 0);
		//読み込んだ行数を返却
		return matrixLine;
	}

	/*関数名:main
	 *概要:2つの行列の要素数が等しくなければ3爪の行列にfalseを、等しければ3つめの行列にtrueと行列aとbを加算したものを表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	public static void main(String[] args) {

		//1つめの行列を表す整数を定数化
		final int MATRIX_NUMBER_ONE = 1;
		//2つめの行列を表す整数を定数化
		final int MATRIX_NUMBER_TWO = 2;
		//3つめの行列を表す整数を定数化
		final int MATRIX_NUMBER_THREE = 3;
		//1つめの行列の行数を表す整数を初期化して宣言
		int firstMarixLine = 0;
		//1つめの行列の列数を表す整数を初期化して宣言
		int firstMatrixColumn = 0;
		//2つめの行列の行数を表す整数を初期化して宣言
		int secondMarixLine = 0;
		//2つめの行列の列数を表す整数を初期化して宣言
		int secondMatrixColumn = 0;
		//3つめの行列の行数を表す整数を初期化して宣言
		int thirdMarixLine = 0;
		//3つめの行列の列数を表す整数を初期化して宣言
		int thirdMatrixColumn = 0;
		//行数を表す変数に返却された値を代入
		firstMarixLine = inputMatrixLine(MATRIX_NUMBER_ONE);
		//入力された整数分の行数をもつ1つめの行列を生成
		int firstMatrix[][] = new int[firstMarixLine][];
		//入力した行分の列を生成する処理
		for (int i = 0; i < firstMarixLine; i++) {
			//正の整数を入力させるための処理
			do {
				//各行の列数の入力を促す
				System.out.print("行列1の[" + i + "]の列数:");
				//列数を読み込む
				firstMatrixColumn = standardInput.nextInt();
				//入力した整数が0以下だった場合
				if (firstMatrixColumn <= 0) {
					//正しい値の入力を促す
					System.out.println("正しい値を入力してください");
				}
				//正の整数が入力されるまでループ
			} while (firstMatrixColumn <= 0);
			//入力した整数分の行と列をもつ1つめの二次元配列を生成
			firstMatrix[i] = new int[firstMatrixColumn];
		}

		//行数を表す変数に返却された値を代入
		secondMarixLine = inputMatrixLine(MATRIX_NUMBER_TWO);
		//入力された整数分の行数をもつ2つめの行列を生成
		int secondMatrix[][] = new int[secondMarixLine][];
		//入力した行分の列を生成する処理
		for (int i = 0; i < secondMarixLine; i++) {
			//正の整数を入力させるための処理
			do {
				//各行の列数の入力を促す
				System.out.print("行列2の[" + i + "]の列数:");
				//列数を読み込む
				secondMatrixColumn = standardInput.nextInt();
				//入力した整数が0以下だった場合
				if (secondMatrixColumn <= 0) {
					//正しい値の入力を促す
					System.out.println("正しい値を入力してください");
				}
				//正の整数が入力されるまでループ
			} while (secondMatrixColumn <= 0);
			//入力した整数分の行と列をもつ2つめの二次元配列を生成
			secondMatrix[i] = new int[secondMatrixColumn];
		}

		//行数を表す変数に返却された値を代入
		thirdMarixLine = inputMatrixLine(MATRIX_NUMBER_THREE);
		//入力された整数分の行数をもつ3つめの行列を生成
		int thirdMatrix[][] = new int[thirdMarixLine][];
		//入力した行分の列を生成する処理
		for (int i = 0; i < thirdMarixLine; i++) {
			//正の整数を入力させるための処理
			do {
				//各行の列数の入力を促す
				System.out.print("行列3の[" + i + "]の列数:");
				//列数を読み込む
				thirdMatrixColumn = standardInput.nextInt();
				//入力した整数が0以下だった場合
				if (thirdMatrixColumn <= 0) {
					//正しい値の入力を促す
					System.out.println("正しい値を入力してください");
				}
				//正の整数が入力されるまでループ
			} while (thirdMatrixColumn <= 0);
			//入力した整数分の行と列をもつ3つめの二次元配列を生成
			thirdMatrix[i] = new int[thirdMatrixColumn];
		}

		//1つめの行列と1番目の行列であることを表す整数を引数として、各要素に整数を読み込むメソッドを呼び出す
		inputElementMatrix(firstMatrix, MATRIX_NUMBER_ONE);
		//2つめの行列と2番目の行列であることを表す整数を引数として、各要素に整数を読み込むメソッドを呼び出す
		inputElementMatrix(secondMatrix, MATRIX_NUMBER_TWO);

		//1つ目の行列と表示
		System.out.println("1つ目の行列");
		//1つ目の行列をメソッドを呼び出して各要素を表示
		printMatrix(firstMatrix);
		//2つ目の行列と表示
		System.out.println("2つ目の行列");
		//2つ目の行列をメソッドを呼び出して各要素を表示
		printMatrix(secondMatrix);
		//3つ目の行列と表示
		System.out.println("3つ目の行列");
		//返却された論理値がtrueなら表示
		if (addMatrix(firstMatrix, secondMatrix, thirdMatrix) == true) {
			//1つ目と2つ目の行列の和をメソッドを呼び出して各要素を表示
			printMatrix(thirdMatrix);
		} else {
			//加算は行われませんでしたと表示
			System.out.println("要素数が違うため行列は表示されません。");
		}
	}

}
