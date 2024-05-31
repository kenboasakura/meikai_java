package enshu06;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:クラス数、各クラスの人数・全員の点数を読み込み、合計と平均を求めるテキスト
 *概要:enshu06_19
 *作成者:K.Asakura
 *作成日:2024/04/22
 */
public class enshu06_19 {

	/*関数名:main
	 *概要:クラス数、各クラスの人数・全員の点数を読み込み、合計と平均を求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/22
	 */
	public static void main(String[] args) {

		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//クラスの数を表すための変数を初期化して宣言
		int classValue = 0;
		//個人の点数を表すため変数を初期化して宣言
		int scoreValue = 0;
		//クラスの人数を表す変数を初期化して宣言
		int humanValue = 0;
		//式を調整するため1を定数化
		final int ADJUSTMENT_NUMBER =1;
		
		//正の整数が入力されるまで実行
		do {
			//クラス数の入力を促す
			System.out.print("クラス数:");
			//行数を表すインデックスを読み込む
			classValue = standardInput.nextInt();
			//0以下の数が入力された場合実行
			if (classValue <= 0) {
				//正しい値の入力を促す
				System.out.print("正しい値を入力してください");
			}
			//正の整数が入力されるまでループ
		} while (classValue <= 0);

		//入力されたクラス数の成績を求める配列を生成
		int[][] arrayValue = new int[classValue][];

		//入力したクラス分の各クラスの人数を入力する処理
		for (int i = 0; i < classValue; i++) {

			//各クラスの人数を入力させる処理
			do {
				//各クラスの人数の入力を促す
				System.out.print((i + 1) + "組の人数:");
				//各クラスの人数を読み込む
				humanValue = standardInput.nextInt();
				//0以下の数が入力された場合実行
				if (humanValue <= 0) {
					//正しい値の入力を促す
					System.out.print("正しい値を入力してください");
				}
				//正の整数が入力されるまでループ
			} while (humanValue <= 0);

			//各クラスの各個人の成績を求める配列を生成
			arrayValue[i] = new int[humanValue];

			//クラスの人数分各個人の点数を入力する処理
			for (int j = 0; j < humanValue; j++) {

				//各個人の成績を入力させる処理
				do {
					//それぞれのクラスの各個人の人数の入力を促す
					System.out.print((i + ADJUSTMENT_NUMBER) + "組" + (j + ADJUSTMENT_NUMBER) + "番の点数:");
					//各クラスの人数を読み込む
					arrayValue[i][j] = standardInput.nextInt();
					//0未満の数が入力された場合実行
					if (arrayValue[i][j] < 0) {
						//正しい値の入力を促す
						System.out.print("正しい値を入力してください");
					}
					//0以上の点数が入力されるまでループ
				} while (arrayValue[i][j] <= 0);

			}

		}

		//サムネイルを表示
		System.out.println(" 組 |   合計   平均");
		//仕切りを表示
		System.out.println("----+----------------");
		//各クラスの合計を出すため配列を生成
		int[] totalValue = new int[arrayValue.length];
		//各クラスの平均を出すため配列を生成
		double[] averageValue = new double[arrayValue.length];
		//クラスの数分各クラスの合計と平均を算出する処理
		for (int i = 0; i < arrayValue.length; i++) {
			//各クラスの合計と平均を算出する処理
			for (int j = 0; j < arrayValue[i].length; j++) {
				//各クラスの各個人の点数を加算して代入
				totalValue[i] += arrayValue[i][j];
				//各クラスの平均を代入
				averageValue[i] = (double)totalValue[i] / (j + 1);

			}
			//クラスごとの合計と平均を表示
			System.out.println("  " + (i + ADJUSTMENT_NUMBER) + " |    " + totalValue[i] + "     " + averageValue[i] + "");

		}
		//仕切りを表示
		System.out.println("----+----------------");
		//全体の合計を出すために変数を初期化して宣言
		int allTotalScore = 0;
		//全体の平均をだすために実数を初期化して宣言
		double allAverageScore = 0;
		//全体の合計人数を数えるため変数を初期化して宣言
		int countNumber = 0;

		//全体の合計を算出する処理
		for (int i = 0; i < arrayValue.length; i++) {
			//各クラスの合計を算出する処理
			for (int j = 0; j < arrayValue[i].length; j++) {
				//各個人の点数を加算して代入
				allTotalScore += arrayValue[i][j];
				//合計の人数をカウント
				countNumber ++;
			}
			
		}
		//全体の合計の点数を全体の人数分で割って全体の平均値を算出
		allAverageScore = (double)allTotalScore/countNumber;
		//全体の合計と平均を表示
		System.out.println("-計-|    " + allTotalScore + "     " +allAverageScore + "  ");

	}

}
