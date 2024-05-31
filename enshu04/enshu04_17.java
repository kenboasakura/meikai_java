package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_17
 *概要:読み込んだ整数の約数とその個数を求めるプログラム
 *作成者:K.Asakura
 *作成日:2024/04/10
 */
public class enshu04_17 {

	/*関数名:main
	 *概要:読み込んだ整数の約数とその個数を求めるプログラム
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {

		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);
		
		//入力するための変数を初期化して宣言
		int integerValure= 0;

		//正の整数を入力させるまで実行
		do {
			//整数の入力を促す
			System.out.print("整数値:");
			//整数値を読み込む*nは教科書準拠
			integerValure = standardInput.nextInt();
			//正の整数でなければ実行
			if (integerValure <= 0) {
				//正の整数を入力するよう促す
				System.out.println("正の整数を入力してください");
			}
		//正の整数でなければループ
		} while (integerValure <= 0);
		
		//約数の個数をカウントするために変数を初期化
		int countNumber = 0;

		//iを1から初めて、入力した変数になるまでインクリメント
		for (int i = 1; i <= integerValure; i++) {

			//iは入力した変数の約数であるなら実行
			if (integerValure % i == 0) {
				//約数を出力
				System.out.println(i);
				//インクリメントした数をカウント
				countNumber++;
			}

		}
		//約数の個数を表示
		System.out.println("約数の個数は" + countNumber + "です。");
	}

}
