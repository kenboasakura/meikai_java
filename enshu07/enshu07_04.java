package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_04
 *概要:1からnまでの全整数の和を求めて表示
 *作成者:K.Asakura
 *作成日:2024/04/24
 */
public class enshu07_04 {
	/*関数名:main
	 *概要:1からnまでの全整数の和を求めて返却するメソッド
	 *引数:整数n
	 *戻り値:1からnまでの全整数の和
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	static int sumUp(int inputNumber) {
		//戻り値を格納する変数に0をいったん代入
		int sumUp = 0;
		//入力された整数が0の時実行
		if (inputNumber == 0||inputNumber==1) {
			//1を代入
			sumUp = 1;

			//入力した値が0以上だった場合
		} else if (inputNumber != 0 && inputNumber != 1 && inputNumber > 0) {

			//1からnまでの全整数の和を求める処理
			for (int i = 0; i < inputNumber; i++) {
				//1ずつ加算する処理
				sumUp += i+1;
			}

		}

		//1からnまでの前整数の値の和を返却
		return sumUp;
	}

	/*関数名:main
	 *概要:1からnまでの全整数の和を求めて表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		int inputNumber = 0;
		//正の整数が入力されるまで実行
		do {
			//整数の入力を促す*nは教科書準拠
			System.out.print("整数n:");
			//整数を読み込む
			inputNumber = standardInput.nextInt();
			//返却した変数を表示
			System.out.print(sumUp(inputNumber));
			//0以下の整数が入力された場合実行
			if (inputNumber <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//0以下の整数が入力された場合ループ
		} while (inputNumber <= 0);

	}

}
