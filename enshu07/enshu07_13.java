package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_13
 *概要:整数のnビット目を操作してそれぞれの値を表示
 *作成者:K.Asakura
 *作成日:2024/04/30
 */
public class enshu07_13 {
	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:set
	 *概要:整数のnビット目を1にした値を返却するメソッド
	 *引数:入力させた整数、操作したいビットの位
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static int set(int integerValue, int inputBits) {
		//ビット目に代入する値1を定数化
		final int OPERATION_ONE = 1;
		//最下位ビットに1を代入
		int firstAssignment = OPERATION_ONE;
		//1を代入したものをn分左にシフト
		int secondAssignment = firstAssignment << inputBits;
		//入力した整数と1をn分左にシフトした値で論理和を生成
		int thirdAssignment = integerValue | secondAssignment;
		//生成した論理和を返却
		return thirdAssignment;

	}

	/*関数名:reset
	 *概要:整数のnビット目を0にした値を返却するメソッド
	 *引数:入力させた整数、操作したいビットの位
	 *戻り値:整数のnビット目を0にした値
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static int reset(int integerValue, int inputBits) {
		//ビット目に代入する値1を定数化
		final int OPERATION_ONE = 1;
		//最下位ビットに1を代入
		int firstAssignment = OPERATION_ONE;
		//1を代入したものをn分左にシフトし補数を演算
		int secondAssignment = ~(firstAssignment << inputBits);
		//入力した整数と、1を代入したものをn分左にシフトし補数を演算した値で論理積を生成
		int thirdAssignment = integerValue & secondAssignment;
		//生成した論理積を返却
		return thirdAssignment;
	}

	/*関数名:inverse
	 *概要:整数のnビット目を0にした値を返却するメソッド
	 *引数:入力させた整数、操作したいビットの位
	 *戻り値:整数のnビット目を0にした値
	 *作成者:K.Asakura
	 *作成日:2024/04/30
	 */
	static int inverse(int integerValue, int inputBits) {
		//ビット構成に代入する値1を定数化
		final int OPERATION_ONE = 1;
		//最下位ビットに1を代入
		int firstAssignment = OPERATION_ONE;
		//1を代入したものをn分左にシフトし補数を演算
		int secondAssignment = ~(firstAssignment << inputBits);
		//入力した整数の補数を演算したものと、1を代入したものをn分左にシフトし補数を演算した値で排他的論理和を生成
		int thirdAssignment = ~integerValue ^ secondAssignment;
		//生成した排他的論理和を返却
		return thirdAssignment;

	}

	/*関数名:printBits
	 *概要:int型のビット構成を表示するメソッド
	 *引数:入力した整数とそれぞれビットを操作した整数
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
			//右へ論理シフト
			System.out.print(((assignmentValue >>> i & BINARY_NUMBER) == BINARY_NUMBER) ? '1' : '0');

		}
	}

	/*関数名:main
	 *概要:整数のnビット目を操作してそれぞれの値を表示
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
		//nビット目を操作する整数を読み込むため変数を初期化して宣言
		int secondInput = 0;
		//ビット数の上限を示す31を定数化
		final int MUXIMUM_BITS = 31;

		//0以上でなおかつ31以下の値を入力させる処理
		do {
			//整数の入力を促す
			System.out.print("操作したいビットの位:");
			//入力された整数を読み込む
			secondInput = standardInput.nextInt();
			//負の整数または31より上の値が入力された場合実行
			if (secondInput < 0 || secondInput > MUXIMUM_BITS) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力して下さい");
			}
			//0以上でなおかつ31以下の値を入力するまでループ
		} while (secondInput < 0 || secondInput > MUXIMUM_BITS);

		//入力した整数のビット構成を表示
		System.out.println("ビット構成↓ ");
		printBits(firstInput);
		//改行を出力
		System.out.println();

		//nビット目を1にして返却した値を表示
		System.out.println("nビット目を1した値:" + set(firstInput, secondInput));
		//nビット目を1にして返却した値のビット構成を表示
		System.out.println("ビット構成↓ ");
		printBits(set(firstInput, secondInput));
		//改行を出力
		System.out.println();

		//nビット目を0にして返却した値を表示
		System.out.println("nビット目を0した値:" + reset(firstInput, secondInput));
		//nビット目を0にして返却した値のビット構成を表示
		System.out.println("ビット構成↓ ");
		printBits(reset(firstInput, secondInput));
		//改行を出力
		System.out.println();

		//nビット目を反転して返却した値を表示
		System.out.println("nビット目を反転した値:" + inverse(firstInput, secondInput));
		//nビット目を反転して返却した値のビット構成を表示
		System.out.println("ビット構成↓ ");
		printBits(inverse(firstInput, secondInput));
		//改行を出力
		System.out.println();

	}

}
