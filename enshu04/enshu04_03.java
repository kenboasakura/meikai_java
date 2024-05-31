package enshu04;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu04_02
* 概要:読み込んだ２つの整数を小さい順にし、小さい数から大きい数までの全整数を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/08
*/
public class enshu04_03 {

	/*関数名:main
	 *概要:読み込んだ２つの整数を小さい順にし、小さい数から大きい数までの全整数を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促す
		System.out.print("整数A:");
		//整数を読み込む
		int firstIntegral = standardInput.nextInt();
		//整数の入力を促す
		System.out.print("整数B:");
		//整数を読み込む
		int secondIntegral = standardInput.nextInt();

		//maximumValueに大きい数を代入
		int maximumValue = firstIntegral;
		//minimumValueに小さい数を代入
		int minimumValue = secondIntegral;
		//整数AがBより小さい場合実行

		//整数BがAより大きければ実行
		if (minimumValue > maximumValue) {
			//整数Aを空白の変数に保存
			int assignmentValue = maximumValue;
			//整数Bの値を整数Aの値に代入
			maximumValue = minimumValue;
			//保存していた整数Aの値を整数Bに代入
			minimumValue = assignmentValue;
		}

		//値を加えるためのfinal変数の宣言
		final int ADDTICT_NUMBER = 1;
		//変数に小さいほうの値を代入	
		int scoreValue = minimumValue;
		
		//whileの限り実行
		do {
			//整数を表示
			System.out.print(scoreValue);
			//整数に１を足した値を代入
			scoreValue = scoreValue + ADDTICT_NUMBER;
			//小さいほうの整数が大きいほうの整数と同じになるまでループ
		} while (scoreValue != maximumValue);
		//大きい整数を表示
		System.out.print(maximumValue);

	}
}
