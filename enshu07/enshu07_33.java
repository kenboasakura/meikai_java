package enshu07;

//Scannerクラスを呼び出す
import java.util.Scanner;

/*クラス名:enshu07_33
 *概要:入力された要素数と要素の値をもつ1次元配列と2次元配列を表示
 *作成者:K.Asakura
 *作成日:2024/05/14
 */
public class enshu07_33 {
	//Scannerクラスに変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:printArray
	 *概要:各要素の間に1文字分スペースを空けて配列の各要素を表示するメソッド
	 *引数:配列
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static void printArray(int[] x) {

		//配列の値を表示
		for (int i = 0; i < x.length; i++) {
			//各要素の値を表示
			System.out.print(x[i]);
			//スペースを出力
			System.out.print(" ");
		}
	}

	/*関数名:printArray
	 *概要:各列の先頭が揃うように行列の各要素を表示するメソッド
	 *引数:行列
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/08
	 */
	static void printArray(int[][] x) {

		//各行の要素数を比較したうちの最大値を求めるため、変数を初期化して宣言
		int matrixMaximumColumnValue = 0;
		//各行の要素数を比較したうちの最大値を求める
		for (int i = 0; i < x.length; i++) {
			//最大値よりその行の列側の要素数が大きい場合実行
			if (matrixMaximumColumnValue < x[i].length) {
				//その行の要素数を代入
				matrixMaximumColumnValue = x[i].length;
			}
		}
		//仮引数と同じ要素数をもつ行列を生成
		int assignmentRegularIntegerMatrix[][] = new int[x.length][];
		//要素の値の符号が-の場合、要素の値の桁数を1桁増やすための数を定数化
		final int SINGLE_DIGITS_INCREASE = 10;
		//各行の各要素に、各要素の値が正の整数ならばその値を、負の整数ならその値に10を乗算して反転した値を代入
		for (int i = 0; i < x.length; i++) {
			//仮引数と同じ要素数をもつ2次元配列を生成
			assignmentRegularIntegerMatrix[i] = new int[x[i].length];
			//各列の各要素に、各要素の値が正の整数ならばその値を、負の整数ならその値に10を乗算して反転した値を代入
			for (int j = 0; j < x[i].length; j++) {
				//各要素の値が0より小さければ実行
				if (x[i][j] < 0) {
					//要素の値に10を乗算した値を反転して代入
					assignmentRegularIntegerMatrix[i][j] = SINGLE_DIGITS_INCREASE * -x[i][j];
					//各要素の値が0より大きければ実行
				} else {
					//要素の値を代入
					assignmentRegularIntegerMatrix[i][j] = x[i][j];
				}
			}
		}
		//縦列の要素の値の最大値を求める
		//各列の要素の最大値を格納する配列を生成
		int maximumVerticalColumnArray[] = new int[matrixMaximumColumnValue];
		//行列の縦列の最大値を求めて代入
		for (int j = 0; j < matrixMaximumColumnValue; j++) {
			//縦列の最大値を代入
			Inner:for (int k = 0; k < x.length; k++) {
				//各列のインデックスが、各列の要素数以上になった場合実行
				if (j >= x[k].length) {
					//内側のラベルの動作を末尾へスキップ
					continue Inner;
				}
				//最大値より、その場所に位置する行列の要素の値が大きい場合実行
				if (maximumVerticalColumnArray[j] < assignmentRegularIntegerMatrix[k][j]) {
					//行列の要素の値を代入
					maximumVerticalColumnArray[j] = assignmentRegularIntegerMatrix[k][j];
				}
			}
		}
		//桁数を算出するために用いる、割られる数を定数化
		final int CALCULATE_DIGITS = 10;
		//行列の各要素の値の桁数を代入するため、引数の行列と同じ要素数をもつ行列を生成
		int matrixDigitsNumber[][] = new int[x.length][];
		//各行に各要素の値の桁数を代入
		for (int i = 0; i < x.length; i++) {
			//引数の行列の列側の要素数をもつ2次元配列を生成
			matrixDigitsNumber[i] = new int[x[i].length];
			//各列に各要素の値の桁数を代入
			for (int j = 0; j < x[i].length; j++) {
				//行列の桁数を求める
				for (int k = assignmentRegularIntegerMatrix[i][j]; k > 0;) {
					//代入された値を10で割る
					k = k / CALCULATE_DIGITS;
					//桁数を1ずつ増加
					matrixDigitsNumber[i][j]++;
				}
			}
		}
		//各縦列の最大値である要素の値の桁数を求めるため、仮引数の列側の要素数の最大値を要素数にもつ配列を生成
		int verticalColumnMaximumDigitsValue[] = new int[matrixMaximumColumnValue];
		//各縦列の最大値である要素の値の桁数を代入
		for (int i = 0; i < matrixMaximumColumnValue; i++) {
			//各縦列の最大値である要素の値の桁数を求める
			for (int j = maximumVerticalColumnArray[i]; j > 0;) {
				//各要素の値を10で割った値を代入
				j = j / CALCULATE_DIGITS;
				//各の要素の値の桁数を1ずつ増加
				verticalColumnMaximumDigitsValue[i]++;
			}
		}
		//各列の数値の先頭をそろえる処理に用いる、各列の先頭をそろえた後1文字分スペースを出力する数を定数化
		final int OUTPUT_ONE_CHARACTER_SPACE = 1;
		//行ごとに値を表示
		for (int i = 0; i < x.length; i++) {
			//列ごとに値を表示
			for (int j = 0; j < x[i].length; j++) {
				//各要素の値を表示
				System.out.print(x[i][j]);
				//各列の数値の先頭をそろえるようにスペースを空ける
				for (int k = 0; k < verticalColumnMaximumDigitsValue[j] - matrixDigitsNumber[i][j] + OUTPUT_ONE_CHARACTER_SPACE; k++) {
					//スペースを出力
					System.out.print(" ");
				}
			}
			//改行を出力
			System.out.println();
		}
	}

	/*関数名:main
	 *概要:入力された要素数と要素の値をもつ1次元配列と2次元配列を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/14
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		//配列の要素数を読み込むため変数を初期化して宣言
		int arrayElementValue = 0;

		//正の整数を入力させる
		do {
			//配列の要素数の入力を求める
			System.out.print("配列の要素数:");
			//入力された要素数を読み込む
			arrayElementValue = standardInput.nextInt();
			//入力した整数が0以下の場合実行
			if (arrayElementValue <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力してください");
			}
			//正の整数が入力されるまでループ
		} while (arrayElementValue <= 0);
		//入力された要素数をもつ配列を生成
		int integerArray[] = new int[arrayElementValue];

		//配列の各要素に整数を入力させる
		for (int i = 0; i < integerArray.length; i++) {
			//各要素に整数の入力を促す
			System.out.print("配列[" + i + "]=");
			//入力された整数を読み込む
			integerArray[i] = standardInput.nextInt();
		}

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

		//入力された要素数をもつ行列を生成
		int integerMatrix[][] = new int[matrixLine][];

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
			//入力した整数が要素数の二次元配列を生成
			integerMatrix[i] = new int[matrixColumn];
		}

		//行ごとに値を読み込む
		for (int i = 0; i < integerMatrix.length; i++) {
			//列ごとに値を読み込む
			for (int j = 0; j < integerMatrix[i].length; j++) {
				//各要素に整数の入力を促す
				System.out.print("行列[" + i + "][" + j + "]=");
				//入力された整数を読み込む
				integerMatrix[i][j] = standardInput.nextInt();
			}
		}

		//1次元配列と表示
		System.out.println("1次元配列");
		//入力された要素数と要素をもつ1次元配列を引数としてメソッドを呼び出し、配列の要素を表示
		printArray(integerArray);
		//改行を出力
		System.out.println();
		//2次元配列と表示
		System.out.println("2次元配列");
		//入力された要素数と要素をもつ2次元配列を引数としてメソッドを呼び出し、行列の要素を表示
		printArray(integerMatrix);
	}

}
