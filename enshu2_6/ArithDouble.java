package enshu2_6;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:ArithDouble
 *概要:三角形の面積を求めるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
public class ArithDouble {

	/*関数名:main
	 *概要:三角形の面積を求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);
		
		//「三角形の面積を求めます。」と表示
		System.out.println("三角形の面積を求めます。") ;
		
		//底辺の値の入力を促す
		System.out.print("底辺:");   
		//trianglebaseに実数値を読み込む
		double trianglebase = standardInput.nextDouble();   
		
		//高さの値の入力を促す
		System.out.print("高さ:");   
		//trianglehighに実数値を読み込む
		double trianglehigh = standardInput.nextDouble();   
		
		//三角形の面積を計算して表示
		System.out.println("面積は"+(trianglebase*trianglehigh)/2+"です。");    
		

	}

}
