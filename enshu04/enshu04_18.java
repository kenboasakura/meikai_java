package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_18
 *概要:読み込んだ整数の2乗値を表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/11
 */
public class enshu04_18 {
	/*関数名:main
	 *概要:読み込んだ整数の2乗値を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/11
	 */
	public static void main(String[] args) {

		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//入力するための変数を初期化して宣言
		int integerValue = 0;

		//正の整数を入力させるまで実行
		do {
			//整数の入力を促す
			System.out.print("nの値:");
			//整数値を読み込む*nは教科書準拠
			integerValue = standardInput.nextInt();
			//正の整数でなければ実行
			if (integerValue <= 0) {
				//正の整数を入力するよう促す
				System.out.println("正の整数を入力してください");
			}
		//正の整数でなければループ
		} while (integerValue <= 0);

		//squareNumberを1から初めて、入力した整数になるまで1ずつインクリメント
		for (int squareNumber = 1; squareNumber <= integerValue; squareNumber++) {
			//インクリメントした数とその数に2乗したものを改行しながら表示
			System.out.println(+squareNumber + "の2乗は" + squareNumber*squareNumber);
		}

	}
}
