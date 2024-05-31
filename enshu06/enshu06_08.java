package enshu06;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_08
 *概要:double型の配列の全要素の合計値と平均値を求めるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/18
 */
public class enshu06_08 {

	/*関数名:main
	 *概要:double型の配列の全要素の合計値と平均値を求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/18
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);

		//入力する値を出力するために変数を初期化して宣言
		int inputtValue = 0;

		//要素数が正の整数でない限り実行
		do {
			//正の整数の入力を促す
			System.out.print("要素数:");
			//整数を読み込む
			inputtValue = standarddInput.nextInt();
			//正の整数でなければ実行
			if (inputtValue <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (inputtValue <= 0);

		//入力した実数を表示させる配列を生成
		double[] assighnmentDouble = new double[inputtValue];

		//要素数分ループして実行
		for (int i = 0; i < inputtValue; i++) {
			//各要素に点数の入力を促す
			System.out.print("a[" + i + "]=");
			//整数を読み込む
			assighnmentDouble[i] = standarddInput.nextDouble();
		}
		
		//合計を求めるため変数を初期化して宣言
		double totalDouble = 0;
		
		//要素数分ループして実行
		for (double i :assighnmentDouble) {
			//要素を足して代入
			totalDouble += i;
		}
		
		//合計を表示
		System.out.println("全要素の和は"+totalDouble+"です。");
		//平均を表示
		System.out.println("全要素の平均は"+(totalDouble/inputtValue)+"です。");
	}
}
		