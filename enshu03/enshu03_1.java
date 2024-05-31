package enshu03;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_1
 *概要:読み込んだ整数値が正の値か判別するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
public class enshu03_1 {

	/*関数名:main
	 *概要:読み込んだ整数値が正の値か判別するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput= new Scanner(System.in);
		
		//整数値の入力を促す
		System.out.print("整数値:");
		//整数値を読み込む
		int intNumber = standardInput.nextInt();
		
		
		//読み込んだ整数値がtrueの時表示
		if (intNumber>0) {
			System.out.print("その絶対値は"+intNumber+"です。");
		//読み込んだ整数値がflseの時表示
		} else if (intNumber<0){
			System.out.print("その絶対値は"+-intNumber+"です。");
		}
		

	}

}