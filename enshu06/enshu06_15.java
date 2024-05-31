package enshu06;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_15
 *概要:曜日を表示してその英語表現を入力する英単語学習プログラム
 *作成者:K.Asakura
 *作成日:2024/04/19
 */
public class enshu06_15 {

	/*関数名:main
	 *概要:曜日を表示してその英語表現を入力する英単語学習プログラム
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
		//解答内容を格納するための配列を生成
		String[] weekdayEnglishString = {
				//各曜日の英語を代入
				"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"
		};
		//問題を表示するための配列を生成
		String[] weekdayJapaneseString = {
				//各曜日の日本語を代入
				"月", "火", "水", "木", "金", "土", "日"
		};

		//呼び出した曜日のインデックスの数を格納するために初期化して宣言
		int countNumber = 0;
		//再度行うかの処理をするための変数を初期化して宣言
		int returnNumber = 0;
		//0から7の範囲の乱数を生成するため7を定数化
		final int RANDOM_NUMBER = 7;

		//英単語学習プログラムが完全に終了するまで実行
		do {

			//問題文を表示
			System.out.println("英語の曜日名を小文字で入力してください");
			//当てるべき曜日をランダムに配列から選び出す。
			int weekNmber = randomNumber.nextInt(RANDOM_NUMBER);/////
			//正解になるまで実行
			while (true) {
				System.out.print(weekdayJapaneseString[weekNmber] + "曜日:");
				//入力した英語を読み込む
				String weekString = standarddInput.next();
				//正解の時実行
				if (weekString.equals(weekdayEnglishString[weekNmber])) {
					//ゲームを終了
					break;
				}
				//不正解と表示
				System.out.println("不正解です。");
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

			//呼び出した曜日のインデックスの数を変数に代入して保存
			countNumber = weekNmber;
			//もう一度行う場合ループ
		} while (returnNumber == 1);

	}

}
