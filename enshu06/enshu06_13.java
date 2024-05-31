package enshu06;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_13
 *概要:配列aの全要素を配列bに逆順にコピーするテキスト
 *作成者:K.Asakura
 *作成日:2024/04/18
 */
public class enshu06_13 {

	/*関数名:main
	 *概要:配列aの全要素を配列bに逆順にコピーするテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/18
	 */
	public static void main(String[] args) {

		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);

		//要素数を表示するため変数を初期化して宣言
		int inputNumber = 0;
		//交換する処理回数を調節するため2を定数化///////
		final int SECOND_HALF = 2;
		//配列aの後半の要素のインデックスの数を調節ため1を定数化/////////
		final int EXCHANGE_OFFICIAL = 1;

		//要素数に正の整数が入力されるまで実行
		do {
			//要素数の入力を促す
			System.out.print("要素数:");
			//整数を読み込む
			inputNumber = standarddInput.nextInt();
			//正の整数でなければ実行
			if (inputNumber <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (inputNumber <= 0);

		//配列aを表す配列を生成
		int[] arrayFirst = new int[inputNumber];
		//配列bを表す配列を生成
		int[] arraySecond = new int[inputNumber];

		//要素数分の要素を入力する処理
		for (int i = 0; i < inputNumber; i++) {
			//インデックスを表示し整数の入力を促す
			System.out.print("a[" + i + "]=");
			//各要素に入力した整数を代入
			arrayFirst[i] = standarddInput.nextInt();
		}
		//要素の前半と後半の値を交換する処理
		for (int i = 0; i < inputNumber / SECOND_HALF; i++) {
			//変数を生成し、先頭側の要素を代入
			int exchangeValue = arrayFirst[i];
			//先頭側の要素に後半側の要素を代入
			arrayFirst[i] = arrayFirst[inputNumber - i - EXCHANGE_OFFICIAL];
			//先頭側と後半側の要素の値を交換
			arrayFirst[inputNumber - i - EXCHANGE_OFFICIAL] = exchangeValue;
		}

		//要素数分コピーする処理
		for (int i = 0; i < inputNumber; i++) {
			//配列aの全要素を配列bにコピー
			arraySecond[i]=arrayFirst[i];
		}
		//配列aをbにコピーしたことを表示
		System.out.println("aの全要素をbにコピーしました。");
		

		//要素数分コピーした要素を表示する処理
		for (int i = 0; i < inputNumber; i++) {
			//インデックスを表示し整数の入力を促す
			System.out.println("b[" + i + "]="+arraySecond[i]);
		}
		
		

	}

}
