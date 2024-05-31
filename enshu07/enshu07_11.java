package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:整数を左右にシフトした値が2のべき乗での乗算や除算が等しくなることを確認する
 *概要:
 *作成者:K.Asakura
 *作成日:2024/04/25
 */
public class enshu07_11 {
	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:printBits
	 *概要:int型のビット構成を表示するメソッド
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/25
	 */
	static void printBits(int x) {
		//二進数の上限を示すため31を定数化
		final int MUXIMUM_BITS = 31;
		//二進数の1を表す1を定数化
		final int BINARY_NUMBER = 1;

		//入力された整数分のビット数を表示
		for (int i = MUXIMUM_BITS; i >= 0; i--) {
			//右へ論理シフト
			System.out.print(((x >>> i & BINARY_NUMBER) == BINARY_NUMBER) ? '1' : '0');
		}

	}

	/*関数名:main
	 *概要:先に入力した整数を後に入力した整数分左右にシフトし、それぞれの整数を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/25
	 */
	public static void main(String[] args) {
		//整数の入力を促す
		System.out.print("整数:");
		//入力された整数を読み込む
		int firstInput = standardInput.nextInt();
		//シフトするビット数を整数で入力させる
		System.out.print("シフトするビット数:");
		//入力された移動分の整数を読み込む
		int srcondInput = standardInput.nextInt();

		//左にシフトした値を確かめるために最初に入力した整数を代入
		int firstAssignment = firstInput;
		//右にシフトした値を確かめるために最初に入力した整数を代入
		int seconAssignment = firstInput;

		//2のべき乗の乗算を行う処理///////////
		for (int i = 0; i < srcondInput; i++) {
			//入力した整数に2を乗じて代入
			firstAssignment = firstAssignment * 2;
		}
		//2のべき乗の除算を行う処理//////////
		for (int i = 0; i < srcondInput; i++) {
			//入力した整数に2を徐してて代入
			seconAssignment = seconAssignment / 2;
		}

		//入力された整数のビット数を表示
		System.out.print("整数   = ");
		printBits(firstInput);
		//最初に入力された整数のビット数をのちに入力した整数分左にシフト
		System.out.print("\nx << n = ");
		printBits(firstInput << srcondInput);
		//改行を出力
		System.out.println();
		//左にシフトした値を表示
		System.out.print("左にシフトした値:" + (firstInput << srcondInput));

		//最初に入力された整数のビット数をのちに入力した整数分左にシフト
		System.out.print("\nx >> n = ");
		printBits(firstInput >> srcondInput);
		//改行を出力
		System.out.println();
		//右にシフトした値を表示
		System.out.print("右にシフトした値:" + (firstInput >> srcondInput));
		//改行を出力
		System.out.println();

		//入力した整数の2のべき乗での乗算した数の値を表示
		System.out.print("2のべき乗での乗算の値:" + firstAssignment);
		//改行を出力
		System.out.println();

		//入力した整数の2のべき乗での除算した数の値を表示
		System.out.print("2のべき乗での除算の値:" + seconAssignment);
		//改行を出力
		System.out.println();

	}

}
