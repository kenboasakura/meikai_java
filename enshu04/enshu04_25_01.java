package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu04_25_01
 *概要:読み込んだ整数の合計と平均を求めるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/15
 */
public class enshu04_25_01 {

	/*関数名:main
	 *概要:読み込んだ整数の合計と平均を求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/15
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//文字列を表示
		System.out.println("整数を加算します。");
		//入力する整数を読み込むために変数を初期化して宣言
		int firstValue = 0;

		//正の整数を入力するまで実行
		do {
			//加算する分の入力を促す
			System.out.print("何個整数を加算しますか:");
			//整数を読み込む
			firstValue = standardInput.nextInt();
			//正の整数でなければ実行
			if (firstValue <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (firstValue <= 0);

		//合計値を出すために変数を初期化して宣言
		int totalValue = 0;
		//平均で割る数を生成
		int countNumber = 0;
		//平均値を出すために変数を初期化して宣言
		double avarageValue = 0;
		//入力した値が0の場合の数を定義
		final int OFFICIAL_NUMBER = 0;
		//1度も計算してなかった場合の数を定義
		final int OFFICIAL_COUNT = 0;
		
		//整数の合計を求める
		for (int i = 0; i < firstValue; i++) {
			//文字列を表示
			System.out.print("整数(0で終了):");
			//整数を読み込む
			int secondValue = standardInput.nextInt();
			//入力した整数が0の時実行
			if (secondValue == OFFICIAL_NUMBER) {
				//加算を終了
				break;
			}
			//入力した整数を加算
			totalValue += secondValue;
			//平均を求めるためのカウント
			countNumber++;

		}

		//平均値を実数に変換して求める
		avarageValue = ((double) totalValue / countNumber);
		//1回目で0と入力したとき実行
		if (countNumber == OFFICIAL_COUNT) {
			//合計と平均を計算できないことを表示
			System.out.println("合計と平均を計算できません。");
		//1度以上加算された場合実行
		} else {
			//合計を表示
			System.out.println("合計は" + totalValue + "です。");
			//平均を表示
			System.out.println("平均は" + avarageValue + "です。");
		}
	}
}
