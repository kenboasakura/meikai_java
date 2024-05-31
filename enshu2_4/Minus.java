package enshu2_4;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:Minus
 *概要: 読み込んだ整数値に１０を減じた、加えた整数を表示させるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
public class Minus {

	/*関数名:main
	 *概要:読み込んだ整数値に１０を減じた、加えた整数を表示させるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスをに変数を設定
		Scanner standardInput=new Scanner(System.in);
	
		//整数値の入力を促す
		System.out.print("整数値:");
		//読み込んだ整数値を読み込む
		int intNumber =standardInput.nextInt();   

		//受け取った整数値に１０を加した数値を表示
		System.out.println("10を加えた値は"+(intNumber+10)+"です。");
		//受け取った整数値に１０を減じた数値を表示
		System.out.println("10を減じた値は"+(intNumber-10)+"です。");
		

	}

}
