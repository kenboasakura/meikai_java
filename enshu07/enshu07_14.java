package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_14
 *概要:入力された整数のビットを,操作する最底辺からn個分連続して1,0,反転した値に変えてそれぞれの整数を表示//////
 *作成者:K.Asakura
 *作成日:2024/04/30
 */
public class enshu07_14 {
	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:printBits
	 *概要:int型のビット構成を表示するメソッド
	 *引数:firstInput
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static void printBits(int assignmentValue) {
		//ビット数の上限を示すため31を定数化
		final int MUXIMUM_BITS = 31;
		//そのビットが1であるか確認するため1を定数化
		final int BINARY_NUMBER = 1;

		//入力された整数分のビット数を表示
		for (int i = MUXIMUM_BITS; i >= 0; i--) {
			//整数の値に応じて0か1を表示
			System.out.print(((assignmentValue >>> i & BINARY_NUMBER) == BINARY_NUMBER) ? '1' : '0');

		}
	}

	/*関数名:setN
	 *概要:入力した整数のビットを、操作する最底辺からn個分連続して1にして値を返却するメソッド
	 *引数:入力した整数、操作したいビットの最底辺の位、連続して値を変更する個数
	 *戻り値:操作するビットの最底辺からn個連続して1に変更した値
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static int setN(int integerValue, int inputBits, int continueInteger) {
		//シフトする数1を定数化
		final int SHIFT_ONE = 1;
		//n分の1を代入するため変数を初期化して宣言
		int firstAssignment = 0;
		//連続して代入した値を最底辺分左にシフトするための変数を初期化して宣言
		int secondAssignment = 0;

		//n個分連続して1を代入する処理
		for (int i = 0; i < continueInteger; i++) {
			//1ずつ左にシフト
			firstAssignment = firstAssignment << SHIFT_ONE;
			//1ずつインクリメント//////////
			firstAssignment++;
		}
		//ビット構成に1を連続して代入したものをx分左にシフト/////
		secondAssignment = firstAssignment << inputBits ;
		//入力した整数と1をn分左にシフトした値で論理和を生成
		int thirdAssignment = integerValue | secondAssignment;
		//操作するビットの最底辺からn個連続して1に変更した値を返却
		return thirdAssignment;
	}

	/*関数名:resetN
	 *概要:入力した整数のビットを、操作する最底辺からn個分連続して0にして値を返却するメソッド
	 *引数:入力した整数、操作したいビットの最底辺の数、連続して値を変更する個数
	 *戻り値:操作するビットの最底辺xからn個連続して0に変更した値
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static int resetN(int integerValue, int inputBits, int continueInteger) {

		//シフトする数1を定数化
		final int SHIFT_ONE = 1;
		//n分の1を代入するため変数を初期化して宣言
		int firstAssignment = 0;
		//連続して代入した値を最底辺分左にシフトするための変数を初期化して宣言
		int secondAssignment = 0;

		//n個分連続して1を代入する処理
		for (int i = 0; i < continueInteger; i++) {
			//1ずつ左にシフト
			firstAssignment = firstAssignment << SHIFT_ONE;
			//1をプラスして代入
			firstAssignment++;
		}
		//1を連続して代入したものをx分左にシフトし補数を演算
		secondAssignment = ~(firstAssignment << inputBits);
		//入力した整数と1を連続して代入したものをx分左にシフトし補数を演算した値で論理積を生成
		int thirdAssignment = integerValue & secondAssignment;
		//操作するビットの最底辺xからn個連続して0に変更した値を返却
		return thirdAssignment;

	}

	/*関数名:inverseN////////
	 *概要:入力した整数のビットを、操作する最底辺からn個分連続して反転して値を返却するメソッド
	 *引数:入力した整数、操作したいビットの最底辺の数、連続して値を変更する個数
	 *戻り値:操作するビットの最底辺xからn個連続して反転した値
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static int inverseN(int integerValue, int inputBits, int continueInteger) {

		//シフトする数1を定数化
		final int SHIFT_ONE = 1;
		//n分の1を代入するため変数を初期化して宣言
		int firstAssignment = 0;
		//連続して代入した値を最底辺分左にシフトするための変数を初期化して宣言
		int secondAssignment = 0;

		//n個分連続して1を代入する処理
		for (int i = 0; i < continueInteger; i++) {
			//1ずつ左にシフト
			firstAssignment = firstAssignment << SHIFT_ONE;
			//1をプラスして代入
			firstAssignment++;
		}

		//1を連続して代入したものをn分左にシフトし補数を演算
		secondAssignment = ~(firstAssignment << inputBits);
		//入力した整数の補数を演算したものと、1を連続して代入したものをn分左にシフトし補数を演算した値で排他的論理和を生成
		int thirdAssignment = ~integerValue ^ secondAssignment;
		//操作するビットの最底辺xからn個連続して反転した値を返却
		return thirdAssignment;

	}

	/*関数名:main
	 *概要:入力された整数のビットを,操作する最底辺からn個分連続して1,0,反転した値に変えてそれぞれの整数を表示//////
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	public static void main(String[] args) {
		//整数の入力を促す
		System.out.print("整数:");
		//入力された整数を読み込む
		int firstInput = standardInput.nextInt();
		//入力した整数の変更したいビットの最底辺を読み込むために変数を初期化して宣言
		int secondInput = 0;
		//入力した整数のビットを最底辺から何個連続して値を変更するか読み込むために変数を初期化して宣言
		int thirdInput = 0;
		//ビット数の上限を示すため31を定数化
		final int MUXIMUM_BITS = 31;
		//ビット構成の最底辺1を定数化
		final int MOST_BASE = 1;
		//ビット構成の値を変更する式で調整するため-1を定数化
		final int BITS_AJUSTMENT = 1;
		//正の整数でなおかつ31以下の値を入力させる処理
		do {
			//整数の入力を促す
			System.out.print("ビット表記にしたときの操作したい最底辺  x  :");
			//入力された整数を読み込む
			secondInput = standardInput.nextInt();
			//0以下または31より上の値が入力された場合実行
			if (secondInput < 0 || secondInput > MUXIMUM_BITS) {
				//正しい値の入力を促す
				System.out.println("0から31の値を入力して下さい");
			}
			//1以上でなおかつ31以下の値を入力するまでループ
		} while (secondInput < 0 || secondInput > MUXIMUM_BITS);

		//正の整数でなおかつ31以下の値を入力させる処理
		do {
			//整数の入力を促す
			System.out.print("連続して値を変更する個数  n :");
			//入力された整数を読み込む
			thirdInput = standardInput.nextInt();
			//0以下または31より上の値が入力された場合実行
			if (thirdInput <= 0 || thirdInput > MUXIMUM_BITS+BITS_AJUSTMENT - secondInput) {
				//正しい値の入力を促す
				System.out.println(MOST_BASE + "から" + (MUXIMUM_BITS+BITS_AJUSTMENT - secondInput) + "の値を入力して下さい");
			}
			//正の整数でなおかつ31以下の値を入力するまでループ
		} while (thirdInput <= 0 || thirdInput > MUXIMUM_BITS+BITS_AJUSTMENT - secondInput );

		//入力した整数のビット構成を表示
		System.out.println("ビット構成↓ ");
		printBits(firstInput);
		//改行を出力
		System.out.println();

		//連続して変更する値を1にした整数を表示
		System.out.print("値を1にしたときの整数:" + setN(firstInput, secondInput, thirdInput) + "\n");
		//連続して変更する値を1にした整数のビット構成を表示
		System.out.println("ビット構成↓ ");
		printBits(setN(firstInput, secondInput, thirdInput));
		//改行を出力
		System.out.println();

		//連続して変更する値を0にした整数を表示
		System.out.print("値を0にしたときの整数:" + resetN(firstInput, secondInput, thirdInput) + "\n");
		//連続して変更する値を0にした整数のビット構成を表示
		System.out.println("ビット構成↓ ");
		printBits(resetN(firstInput, secondInput, thirdInput));
		//改行を出力
		System.out.println();

		//連続して変更する値を反転した整数を表示
		System.out.print("値を反転したときの整数:" + inverseN(firstInput, secondInput, thirdInput) + "\n");
		//連続して変更する値を反転した整数のビット構成を表示
		System.out.println("ビット構成↓ ");
		printBits(inverseN(firstInput, secondInput, thirdInput));

	}

}
