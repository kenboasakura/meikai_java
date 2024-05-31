package enshu06;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_12
 *概要:配列の並びをシャッフルするテキスト
 *作成者:K.Asakura
 *作成日:2024/04/18
 */
public class enshu06_12 {

	/*関数名:main
	 *概要:配列の並びをシャッフルするテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/18
	 */
	public static void main(String[] args) {

		//Randomクラスを設定
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

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

		//要素数に正の整数が入力されるまで実行
		do {
			//要素数の入力を促す
			System.out.print("全要素:");
			//整数を読み込む
			inputNumber = standardInput.nextInt();
			//正の整数でなければ実行
			if (inputNumber <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (inputNumber <= 0);
		//入力した整数が要素数の配列を宣言
		int[] integerValue = new int[inputNumber];

		//要素数分ループして実行
		for (int i = 0; i < inputNumber; i++) {
			//1から10の範囲の乱数を代入
			integerValue[i] = randomNumber.nextInt(RANDOM_TENN) + ADDITION_NUMBER;
			//インデックスと代入した乱数を表示
			System.out.println("a[" + i + "]=" + integerValue[i]);

		}
		
		//値をシャッフルすることを表示
		System.out.println("値をシャッフルします。");

		//配列aのインデックスを表す配列を生成
		int[] indexNumber = new int[inputNumber];

		
	
		//要素数分ループして実行
		for (int i = 0; i < inputNumber; i++) {
			//カウントする数を初期化
			int countNumber = 0;
			//各要素にそれぞれ乱数を代入
			
			//インデックスを表す数に変数を代入
			indexNumber[i] = randomNumber.nextInt(RANDOM_TENN);

			//要素数分ループして実行
			for (int j = 0; j < inputNumber; j++) {
				//後の要素が先の要素と同じ値があった場合実行
				if (j < i && indexNumber[i] == indexNumber[j]) {
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
			System.out.println("a[" + indexNumber[i] + "]=" + integerValue[indexNumber[i]]);

		}

	}

}
