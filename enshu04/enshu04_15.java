package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_15
 *概要:身長と標準体重の対応表を表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/9
 */
public class enshu04_15 {

	/*関数名:main
	 *概要:身長と標準体重の対応表を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/9
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//低い身長の変数を初期化して宣言
		int lowHeight = 0;
		//高い身長の変数を初期化して宣言
		int highHeight = 0;
		//増分の変数を初期化して宣言
		int incrementalNumber = 0;

		//whileの条件を満たすなら実行
		do {
			//低いほうの身長の入力を促す
			System.out.print("何㎝から:");
			//低いほうの身長の整数値を読み込む
			lowHeight = standardInput.nextInt();
			//正の整数値でなければ実行
			if (lowHeight <= 0) {
				//正の整数を入力するよう促す
				System.out.println("正の整数を入力してください");
			}
			//正の整数でなければループ
		} while (lowHeight <= 0);

		//whileの条件を満たすなら実行
		do {
			//高いほうの身長の入力を促す
			System.out.print("何㎝まで:");
			//高いほうの身長の整数値を読み込む
			highHeight = standardInput.nextInt();
			//正の整数値でなければ実行
			if (highHeight <= 0) {
				//正の整数を入力するよう促す
				System.out.println("正の整数を入力してください");
			} else if (highHeight <= lowHeight) {
				//正しい値を入力するよう促す
				System.out.println("前に入力したものより高い身長を入力してください");
			}
			//先に入力した整数より後に入力した整数が小さい場合と正の整数でなければループ
		} while (lowHeight <= 0 || highHeight <= lowHeight);

		//whileの限り実行
		do {
			//増分の入力を促す
			System.out.print("何㎝ごと:");
			//増分の整数値を読み込む
			incrementalNumber = standardInput.nextInt();
			//正の整数でなければ実行
			if (incrementalNumber <= 0) {
				//正しい値を入力するよう促す
				System.out.println("正の整数を入力してください");
			}
			//正の整数でなければループ
		} while (incrementalNumber <= 0);

		//公式の値に代入するためにfinalintを宣言
		final int WEIGHT_FORMULA = 100;
		//公式の値に代入するためにfinaldoubleを宣言
		final double WEIGHT_DOUBLE = 0.9;

		//標準体重を示す値として変数を初期化して宣言
		double weightdouble = 0;
		int weightNumber = 0;

		//身長と標準体重を1行ずつ表示
		System.out.println("身長 標準体重");
		//変数weightNmberを低い身長から始めて高い身長になるまでインクリメント
		for (int heightNmber = lowHeight; heightNmber <= highHeight; heightNmber += incrementalNumber) {
			
			//1で割り切れる場合実行
			if ((heightNmber - WEIGHT_FORMULA) * WEIGHT_DOUBLE % 1 == 0) {
				//標準体重を計算し、小数を整数に変換
				weightNumber = (int) ((heightNmber - WEIGHT_FORMULA) * WEIGHT_DOUBLE);
				//身長と標準体重を表示
				System.out.println(+heightNmber + "  " +weightNumber );
			//1で割り切れない場合実行
			} else {
				//身長と標準体重を表示
				System.out.println(+heightNmber + "  " + (heightNmber - WEIGHT_FORMULA) * WEIGHT_DOUBLE);
			}

		}

	}

}
