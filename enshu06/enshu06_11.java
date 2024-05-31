package enshu06;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_11
 *概要:異なる要素が同じ値をもたないように配列の用素をの順序を逆順に並びかえたテキスト
 *作成者:K.Asakura
 *作成日:2024/04/18
 */
public class enshu06_11 {

	/*関数名:main
	 *概要:異なる要素が同じ値をもたないように配列の用素をの順序を逆順に並びかえたテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/18
	 */
	public static void main(String[] args) {

		//Randomクラスを設定
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);

		//1から10の範囲の乱数を生成するため90を定数化
		final int RANDOM_TENN = 10;
		//乱数の式に代入するため1を定数化
		final int ADDITION_NUMBER = 1;
		//コンマを表示する処理を行う公式のために1を定数化
		final int COMMA_NUMBER = 1;
		//カウントするため1を定数化
		final int COUNT_NUMBER = 1;
		//要素数を表示するため変数を初期化して宣言
		int inputNumber = 0;

		//要素数に1から10の正の整数が入力されるまで実行
		do {
			//要素数の入力を促す
			System.out.print("全要素:");
			//整数を読み込む
			inputNumber = standarddInput.nextInt();
			//1から10の正の整数でなければ実行
			if (inputNumber <= 0 || inputNumber >= 11) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//1から10の正の整数でなければループ
		} while (inputNumber <= 0 || inputNumber >= 11);
		//入力した整数が要素数の配列を宣言
		int[] integerValue = new int[inputNumber];

		//{を表示
		System.out.print("{");
		//要素数分ループして実行
		for (int i = 0; i < inputNumber; i++) {
			//カウントする数を初期化
			int countNumber = 0;
			//各要素にそれぞれ乱数を代入
			integerValue[i] = randomNumber.nextInt(RANDOM_TENN) + ADDITION_NUMBER;

			//要素数分ループして実行
			for (int j = 0; j < inputNumber; j++) {
				//後の要素が先の要素と同じ値があった場合実行
				if (j < i && integerValue[i] == integerValue[j]) {
					//カウントを1増やす
					countNumber += COUNT_NUMBER;
					//インデックスを一つやり直す処理
					i -= COUNT_NUMBER;
					//if文を終了
					break;
				}
			}
			//カウントされた場合
			if (countNumber == COUNT_NUMBER) {
				//最初からやり直す
				continue;
			}

			//インデックスごとに代入された乱数を表示
			System.out.print(+integerValue[i]);
			//次にインデックスが続く場合表示
			if (i < inputNumber - COMMA_NUMBER) {
				//コンマを表示
				System.out.print(",");
			}

		}
		//}を表示
		System.out.print("}");
	}

}
