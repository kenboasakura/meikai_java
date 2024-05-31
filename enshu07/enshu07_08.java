package enshu07;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_08
 *概要:入力された整数a以上b未満の範囲の乱数を生成して表示
 *作成者:K.Asakura
 *作成日:2024/04/24
 */
public class enshu07_08 {

	/*関数名:random
	 *概要:入力された整数a以上b未満の乱数を生成してその値を返却するメソッド
	 *引数:乱数を生成するための入力された整数a,b//////
	 *戻り値:入力された整数aもしくはa以上b未満の範囲の乱数
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	static int random(int a, int b) {
		//Randomクラスを設定
		Random randomNumber = new Random();

		//生成された乱数を代入するための変数を初期化して宣言
		int assignmentValue = 0;
		//乱数の範囲を定めるカウントを行うために変数を初期化して宣言
		int countNumber = 0;
		//入力された整数bがaより小さい場合実行
		if (a>b) {
			//整数aを返却
			return a;
		//入力された整数aがbより小さい場合実行
		} else {
			//整数a以上b未満の乱数の範囲を生成する処理
			for (int i = a; i <b;i++) {
				//1ずつカウント
				countNumber ++;
			}
			//入力された整数a以上b未満の範囲の乱数を生成して読み込む
			assignmentValue = randomNumber.nextInt(countNumber)+a;
			//a以上b未満の乱数を返却
			return assignmentValue;
		}
	}

	/*関数名:main
	 *概要:入力された整数a以上b未満の範囲の乱数を生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//整数aの入力を促す*aは教科書準拠
		System.out.print("整数a:");
		//整数を読み込む
		int firstVariable = standardInput.nextInt();
		//整数bの入力を促す*bは教科書準拠
		System.out.print("整数b:");
		//整数を読み込む
		int secondVariable = standardInput.nextInt();
		
		//関数によって生成されたa以上b未満の乱数を表示
		System.out.println(random(firstVariable,secondVariable));

	}

}
