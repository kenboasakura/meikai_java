package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

public class list07_14 {

	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	static void printArray(int[][] x) {

		//行列の
		int matrixmaximumColumnValue = 0;

		matrixmaximumColumnValue = x[0].length;

		for (int i = 0; i < x.length; i++) {
			if (matrixmaximumColumnValue < x[i].length) {
				matrixmaximumColumnValue = x[i].length;
			}

		}

		//桁数を算出するための処理に用いる、割られる数を定数化
		final int CALCULATE_DIGITS_NUMBER = 10;
		//行列の絶対値を求めるため、仮引数と同じ要素数の行列を生成
		int absoluteIntegerMatrix[][] = new int[x.length][];
		//新しい行列の各要素に行列の絶対値を代入
		for (int i = 0; i < x.length; i++) {
			absoluteIntegerMatrix[i] = new int[x[i].length];
			//新しい行列の各要素に行列の絶対値を代入
			for (int j = 0; j < x[i].length; j++) {
				//各要素の値が0より小さければ実行
				if (x[i][j] < 0) {
					//要素の値に10を乗算した値を反転して代入
					absoluteIntegerMatrix[i][j] = 10 * -x[i][j];
					//各要素の値が0より大きければ実行
				} else {
					//要素の値を代入
					absoluteIntegerMatrix[i][j] = x[i][j];
				}
				
			}
		}

		int maximumVerticalColumnArray[] = new int[matrixmaximumColumnValue];

		//列ごとに値を表示する処理

		//行列の絶対値の縦列の最大値を求めて代入
		for (int j = 0; j < matrixmaximumColumnValue; j++) {
			Inner:
			//縦列の最大値を代入
			for (int k = 0; k < x.length; k++) {
				//各列の構成要素を表す整数が、各列の要素数と同じになった場合実行
				if (j > x[k].length - 1) {
					continue Inner;
				}
				//最大値より、その場所に位置する行列の要素の値が大きい場合実行
				if (maximumVerticalColumnArray[j] < absoluteIntegerMatrix[k][j]) {
					//行列の要素の値を代入
					maximumVerticalColumnArray[j] = absoluteIntegerMatrix[k][j];
				}
			}
		}
		int absoluteIntegerMatrixDigits[][]=new int [x.length][];
		
		for (int i = 0; i < x.length;i++) {
			absoluteIntegerMatrixDigits[i]=new int [x[i].length];
			for (int j = 0;j < x[i].length;j++) {
				for (int k = absoluteIntegerMatrix[i][j];k > 0;) {
					k = k / CALCULATE_DIGITS_NUMBER;
					absoluteIntegerMatrixDigits[i][j]++;
				}
			}
		}
		

		//各縦列の要素の値の桁数を求めるため、仮引数と同じ要素数の行列を生成
		int verticalColumnMaximumDigitsValue[] = new int[matrixmaximumColumnValue];
		//行列の列分各縦列の要素の値の桁数を求める
		for (int i = 0; i < matrixmaximumColumnValue; i++) {
			//各縦列の要素の値の桁数を求める
			for (int j = maximumVerticalColumnArray[i]; j > 0;) {
				//各要素の値を10で割った値を代入
				j = j / CALCULATE_DIGITS_NUMBER;
				//各の要素の値の桁数を1ずつ増加
				verticalColumnMaximumDigitsValue[i]++;
			}
		}
		//行ごとに値を表示する処理
		for (int i = 0; i < x.length; i++) {
			
			//列ごとに値を表示する処理
			for (int j = 0; j < x[i].length; j++) {
				//各要素の値を表示
				System.out.print(x[i][j]);
				for (int k = 0; k < verticalColumnMaximumDigitsValue[j] - absoluteIntegerMatrixDigits[i][j]+1; k++) {
					//スペースを出力
					System.out.print(" ");
				}

			}
			//改行を出力
			System.out.println();
		}

	}

	public static void main(String[] args) {

		//二次元配列の行数を読み込むため変数を初期化して宣言
		int matrixLine = 0;
		//二次元配列の列数を読み込むため変数を初期化して宣言
		int matrixColumn = 0;

		//正の整数が入力させる処理
		do {
			//二次元配列の行数の入力を求める
			System.out.print("二次元配列の行数:");
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
		int originalMatrix[][] = new int[matrixLine][];

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
			originalMatrix[i] = new int[matrixColumn];
		}

		//行ごとに値を表示する処理
		for (int i = 0; i < originalMatrix.length; i++) {
			//列ごとに値を表示する処理
			for (int j = 0; j < originalMatrix[i].length; j++) {
				//各要素に整数の入力を促す
				System.out.print("行列[" + i + "][" + j + "]=");
				//入力された整数を読み込む
				originalMatrix[i][j] = standardInput.nextInt();
			}
		}

		printArray(originalMatrix);

	}

}
