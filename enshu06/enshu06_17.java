package enshu06;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_17
 *概要:6人の2科目の点数を読み込んで、各科目ごとの平均と学生ごとの平均点を求めるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/22
 */
public class enshu06_17 {

	/*関数名:main
	 *概要:6人の2科目の点数を読み込んで、各科目ごとの平均と学生ごとの平均点を求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/22
	 */
	public static void main(String[] args) {

		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//テストを受けた人数6を定数化
		final int HUMAN_VALUE = 6;
		//テストの科目数2を定数化
		final int INDIVIDUAL_AVERAGE = 2;
		//各個人の番号を調整ため1を定数化
		final int STUDENT_NUMBER = 1;
		//国語の合計と平均を求める処理に用いる式の調整をするため0を定数化
		final int JAPANESE_NUMBER = 0;
		//数学の合計と平均を求める処理に用いる式の調整をするため1を定数化
		final int MATH_NUMBER = 1;

		//行列firstArrayを生成
		int[][] firstArray = new int[HUMAN_VALUE][INDIVIDUAL_AVERAGE];

		//テスト　結果と表示
		System.out.println("テスト結果");
		//各個人の国語と数学を入力するための処理
		for (int i = 0; i < HUMAN_VALUE; i++) {
			//各個人の番号を表示
			System.out.println("出席番号" + (i + STUDENT_NUMBER) + "番");
			//各個人の成績を入力する処理
			for (int j = 0; j < INDIVIDUAL_AVERAGE; j++) {
				//始めに国語の点数を入力させるための処理
				if (j == 0) {
					//正の整数を入力させるための処理
					do {
						//国語の点数の入力を促す
						System.out.print("国語:");
						//整数を読み込む
						firstArray[i][j] = standardInput.nextInt();
						//入力した整数が負の数だった場合
						if (firstArray[i][j] < 0) {
							//正しい値の入力を促す
							System.out.println("正しい値を入力してください");
						}
						//正の整数が入力されるまでループ
					} while (firstArray[i][j] < 0);
				} else {
					//正の整数を入力させるための処理
					do {
						System.out.print("数学:");
						firstArray[i][j] = standardInput.nextInt();
						//入力した整数が負の数だった場合
						if (firstArray[i][j] < 0) {
							//正しい値の入力を促す
							System.out.println("正しい値を入力してください");
						}
						//正の整数が入力されるまでループ
					} while (firstArray[i][j] < 0);
				}

			}
		}

		//国語の合計を表示するため変数を初期化して宣言
		int japaneseVallue = 0;
		//6人分の合計の点数を出す
		for (int i = 0; i < HUMAN_VALUE; i++) {
			//各要素を加算して代入
			japaneseVallue += firstArray[i][JAPANESE_NUMBER];
		}
		//国語の平均点を表示
		System.out.println("国語の平均は" + ((double) japaneseVallue / (double) HUMAN_VALUE) + "です。");

		//数学の合計を表示するため変数を初期化して宣言
		int mathValue = 0;
		//6人分の合計の点数を出す
		for (int i = 0; i < HUMAN_VALUE; i++) {
			//各要素を加算して代入
			mathValue += firstArray[i][MATH_NUMBER];
		}
		//国語の平均点を表示
		System.out.println("数学の平均は" + ((double) mathValue / (double) HUMAN_VALUE) + "です。");

		//行列の行数を6行分生成
		for (int i = 0; i < HUMAN_VALUE; i++) {
			int totalValue = 0;
			//行列の列数2列分を生成
			for (int j = 0; j < INDIVIDUAL_AVERAGE; j++) {
				//点数を加算して代入
				totalValue += firstArray[i][j];
			}
			//次の人の結果を表示するため改行
			System.out.println(
					"出席番号" + (i + STUDENT_NUMBER) + "番の平均は" + ((double) totalValue / (double) INDIVIDUAL_AVERAGE)
							+ "点です");
		}

	}

}
