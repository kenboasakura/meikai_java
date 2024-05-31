package enshu06;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_04
 *概要:配列の全要素に乱数を代入して縦向きの棒グラフを表示
 *作成者:K.Asakura
 *作成日:2024/04/16
 */
public class enshu06_04 {

	/*関数名:main
	 *概要:配列の全要素に乱数を代入して縦向きの棒グラフを表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/16
	 */
	public static void main(String[] args) {
		//Randomクラスを設定
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);

		//整数を入力するため
		int firstAssignment = 0;
		//10の範囲の*を表示するためfinaiintを宣言
		final int RANDOM_TEN = 10;
		//1から10個までの*を表示するためfinaiintを宣言
		final int RANDOM_ONE = 1;
		//グラフの高さを示すためfinaiintを宣言
		final int GRAPH_HEIGHT = 10;
		//インデックスを割るために10を定数化
		final int QUOTIENT_TEN = 10;

		//要素数に正の整数が入力されるまで実行
		do {
			//要素数の入力を促す
			System.out.print("全要素:");
			//整数を読み込む
			firstAssignment = standarddInput.nextInt();
			//正の整数でなければ実行
			if (firstAssignment <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (firstAssignment <= 0);
		//入力した整数が要素数の配列を宣言
		int[] scoreValue = new int[firstAssignment];

		//要素分の配列を宣言
		for (int i = 0; i < firstAssignment; i++) {
			//各配列変数に乱数を代入
			scoreValue[i] = randomNumber.nextInt(RANDOM_TEN + RANDOM_ONE);
		}

		//棒グラフの高さを*を用いて表示
		for (int a = 0; a < GRAPH_HEIGHT; a++) {
			//配列変数の個数によって*を表示
			for (int b = 0; b < firstAssignment; b++) {
				//高さがその数に届いていれば実行
				if (a >= GRAPH_HEIGHT - scoreValue[b]) {
					//*を出力
					System.out.print("* ");
					//高さがその数に届いていなければ実行
				} else {
					//空白を出力
					System.out.print("  ");
				}

			}
			//文字列を改行
			System.out.println();
		}
		//要素数分の区切りを表示
		for (int i = 1; i < firstAssignment; i++) {
			//区切りを出力
			System.out.print("--");
		}
		//区切りを出力
		System.out.print("-");
		
		//文字列を改行
		System.out.println();
		//インデックスを1つずつ表示する処理
		for (int i = 0; i < firstAssignment; i++) {
			
				//インデックスを10で割った剰余を表示
				System.out.print(i % QUOTIENT_TEN+" ");
			
		}

	}
}
