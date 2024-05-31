package enshu05;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu05_01
 *概要:読み込んだ10進数リテラルを8進数と16進数で表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/15
 */
public class enshu05_01 {

	/*関数名:main
	 *概要:読み込んだ10進数リテラルを8進数と16進数で表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/15
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//変数を初期化して宣言
		int integerNumber = 0;

		//正の整数の入力を促す
		System.out.print("整数:");
		//整数を読み込む
		integerNumber = standardInput.nextInt();
		//8進数はと表示
		System.out.print("8進数は");
		//8進数の整数リテラルを表示
		System.out.printf("%o", integerNumber);
		//ですと表示
		System.out.println("です。");
		//16進数はと表示
		System.out.print("16進数は");
		//16進数の整数リテラルを表示
		System.out.printf("%x", integerNumber);
		//ですと表示
		System.out.println("です。");
	}

}
