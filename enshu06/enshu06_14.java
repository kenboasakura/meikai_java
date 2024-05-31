package enshu06;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_14
 *概要:月を1から12の数値として表示してその英語表現を入力させる英単語学習プログラム
 *作成者:K.Asakura
 *作成日:2024/04/19
 */
public class enshu06_14 {

	/*関数名:main
	 *概要:月を1から12の数値として表示してその英語表現を入力させる英単語学習プログラム
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/19
	 */
	public static void main(String[] args) {

		//Randomクラスを設定
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);

		//英語を表示する配列を生成
		String[] monthString = {
				//要素ごとに月の英語表記を代入
				"January", "February", "March", "April", "May", "June", "Jury", "August", "September", "October",
				"November", "December"
		};

		//呼び出した月のインデックスの数を格納するために初期化して宣言
		int countNumber = 0;
		//再度行うかの処理をするための変数を初期化して宣言
		int returnNumber = 0;
		//0から12の範囲の乱数を生成するため12を定数化
		final int RANDOM_NUMBER = 12;
		//配列の要素と当てる月の数を一致させるため1を定数化
		final int ADJUSTMENT_NUMBER = 1;
		//正しい値を入力させるため1を定数化
		final int January = 1;
		//正しい値を入力させるため12を定数化
		final int December = 12;

		

		//文字列を表示
		System.out.println("英語の月名を入力してください");
		//文字列を表示
		System.out.println("なお、先頭は大文字で2文字目以降は小文字でお願いします。");
		//英単語学習プログラムが終了するまで実行
		do {
			//////
			//月の数値を格納している配列からを乱数と同じインデックスの月を呼び出す
			int monthNumber = randomNumber.nextInt(RANDOM_NUMBER);
			//連続して同じ月が表示されないようにする処理
			if (monthNumber == countNumber) {
				//ループの始めに戻る
				continue;
			}

			//問題を表示
			System.out.println("問題:" + monthString[monthNumber]);

			//正解になるまで実行
			while (true) {
				System.out.print("何月かな:");
				//入力した整数を読み込む
				int inputNumber = standarddInput.nextInt();
				//正解の時実行
				if (inputNumber == monthNumber + ADJUSTMENT_NUMBER) {
					//ルールを終了
					break;
				}
				//0以下もしくは13以上の整数が入力された場合実行
				else if (inputNumber < January || inputNumber > December) {
					//正しい値の入力を促す
					System.out.println("正しい値を入力してください");
					//ルールの最初に戻る
					continue;
				}
				//不正解の時実行
				else {
					//違うと表示
					System.out.println("違います。");
					//ルールの最初に戻る
					continue;
				}

			}
			//正解と表示
			System.out.println("正解です。");
			//0か1の整数が入力されるまで実行
			do {
				//もう一度行うか尋ねる
				System.out.print("もう一度行いますか？:1..Yes/0..No");
				//整数値を読み込む
				returnNumber = standarddInput.nextInt();
				//0か1以外の整数が入力された場合実行
				if (returnNumber != 0 && returnNumber != 1) {
					//正しい値の入力を促す
					System.out.println("正しい値を入力してください");
				}
				//0か1以外の整数が入力された場合ループ
			} while (returnNumber != 0 && returnNumber != 1);

			//呼び出した月のインデックスの数を変数に代入して保存
			countNumber = monthNumber;
			//もう一度行う場合ループ
		} while (returnNumber == 1);

	}

}
