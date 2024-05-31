package enshu07;

import java.util.Scanner;

/*クラス名:enshu07_29
 *概要:入力された行列と同じ行列を生成して表示
 *作成者:K.Asakura
 *作成日:2024/05/08
 */
public class enshu07_29 {
	/*関数名:arrayClone
	 *概要:行列と同じ行列(要素数とすべての要素の値が同じ)を生成して返却するメソッド
	 *引数:行列
	 *戻り値:行列と同じ要素数と要素の値をもつ行列
	 *作成者:K.Asakura
	 *作成日:2024/05/07
	 */
	static int[][] arrayClone2(int[][] a) {
		//行列と同じ長さの行列を生成
		int[][] copyMatrix = new int[a.length][a[0].length];
		//行列と同じ値を各要素に代入する処理
		for (int i = 0; i < a.length; i++) {
			//各列に同じ値を各要素に代入する処理
			for (int j = 0; j < a[i].length; j++) {
				//各要素に同じ順番の要素の値を代入
				copyMatrix[i] = a[i];
			}
		}
		//代入した行列を返却
		return copyMatrix;
	}

	/*関数名:printMatrix
	 *概要:行列の各要素を表示するメソッド
	 *引数:行列
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static void printMatrix(int[][] x) {
		//末尾のインデックスを求めるために列ごとの要素数を調整する数を定数化/////////
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

	/*関数名:main
	 *概要:入力された行列と同じ行列を生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

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

		//入力された要素数分の行列を生成
		int realMatrix[][] = new int[matrixLine][];

		//入力した行分の列を生成する処理
		for (int i = 0; i < matrixLine; i++) {
			//正の整数を入力させる
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
			//入力した整数が要素数の二次元配列を生成
			realMatrix[i] = new int[matrixColumn];
		}

		//行ごとに値を読み込む処理
		for (int i = 0; i < realMatrix.length; i++) {
			//列ごとに値を読み込む処理
			for (int j = 0; j < realMatrix[i].length; j++) {
				//各要素に整数の入力を促す
				System.out.print("行列[" + i + "][" + j + "]=");
				//入力された整数を読み込む
				realMatrix[i][j] = standardInput.nextInt();
			}
		}
		//行列を表示しますと表示
		System.out.println("行列を表示します。");
		//行列を表示
		printMatrix(realMatrix);

		//コピーした行列を表示しますと表示
		System.out.println("コピーした行列を表示します。");
		//返却されたコピーした行列を表示
		printMatrix(arrayClone2(realMatrix));

	}

}
