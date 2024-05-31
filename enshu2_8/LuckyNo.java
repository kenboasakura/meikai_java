package enshu2_8;

//Randomクラスを呼び出し
import java.util.Random;
//Scannerクラスを呼び出し
import java.util.Scanner;


/*クラスヘッダ:LuckyNo
 *概要: 入力した整数値+-5をランダムに生成するテキスト
 *作成者:K.Asakura
作成日:2024/04/4
 */
class LuckyNo  {

	/*関数名:main
	 *概要:入力した整数値+-5をランダムに生成するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);
		
		//キーボードに整数値を入力を促す
		System.out.print("整数値:");
		
		//入力した整数値読み込む
		int intNumber = standardInput.nextInt();
		
		//乱数を生成
		Random randomNumber = new Random();
		
		//読み込んだ値+-5の乱数を生成
		int luckyNumber = randomNumber.nextInt(11)-5+intNumber;
		
		//変数を表示
		System.out.println(luckyNumber);
		
		
		
		
		
	}
		

}