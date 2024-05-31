package enshu06;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_06
 *概要:テストの点数の合計、平均、最高、最低点を表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/17
 */
public class enshu06_06 {

	/*関数名:main
	 *概要:テストの点数の合計、平均、最高、最低点を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/17
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);

		//入力する値を出力するために変数を初期化して宣言
		int assignmentValue = 0;

		//正の整数でない限り実行
		do {
			//テストした人数分の入力を促す
			System.out.print("テストを受けた人数:");
			//整数を読み込む
			assignmentValue = standarddInput.nextInt();
			//正の整数でなければ実行
			if (assignmentValue <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (assignmentValue <= 0);

		//配列を生成
		int[] scoreValue = new int[assignmentValue];
		//合計点を出すために変数を初期化して宣言/////
		int totalScore = 0;
		//要素数分テストの結果を入力する処理
		for (int i = 0; i < assignmentValue; i++) {
			//正の整数でない限り実行
			do {
				//各要素にテストの点数の入力を促す
				System.out.print((i + 1) + "番の点数:");
				//整数を読み込む
				scoreValue[i] = standarddInput.nextInt();
				//正の整数でなければ実行
				if (scoreValue[i] < 0) {
					//正しい値の入力を促す
					System.out.println("正しい値を入力してください");
				}
				//正の整数でなければループ
			} while (scoreValue[i] < 0);
			
			//入力した成績をプラスして代入
			totalScore += scoreValue[i];
		}

		//最大値を求めるための配列を初期化して宣言
		int maximumScore = scoreValue[0];

		//最大値を求めるために走査
		for (int j = 1; j < scoreValue.length; j++) {
			//最大値を更新する処理
			if (scoreValue[j] > maximumScore) {
				//最大値としてその値に代入
				maximumScore = scoreValue[j];
			}
		}

		//最小値を求めるための配列を初期化して宣言
		int minimumScore = scoreValue[0];

		//最小値を求めるために走査
		for (int k = 1; k < scoreValue.length; k++) {
			//最小値を更新する処理
			if (scoreValue[k] < minimumScore) {
				//最小値としてその値に代入
				minimumScore = scoreValue[k];

			}
		}
		
		//合計点を表示
		System.out.println("合計点は"+totalScore+"です。");
		//平均点を表示
		System.out.println("平均点は"+(double)totalScore/(double)assignmentValue+"です。");
		//最高点を表示
		System.out.println("最高点は"+maximumScore+"です。");
		//最低点を表示
		System.out.println("最低点は"+minimumScore+"です。");

	}

}
