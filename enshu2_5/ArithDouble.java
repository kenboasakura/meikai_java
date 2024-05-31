package enshu2_5;

//Scannerクラスを呼び出し
import java.util.Scanner;

/*クラスヘッダ:ArithDouble
 *概要:xとyの合計と平均値を表示させるテキスト
 *作成者:K.Asakura
作成日:2024/04/4
 */
public class ArithDouble {

	/*関数名:main
	 *概要:xとyの合計と平均値を表示させるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standaedInput = new Scanner(System.in);
		
		//文字を表示
		System.out.println("xとyを加減乗除します。");
		
		//xの値の入力を促す*xは教科書準拠
		System.out.print("xの値:");   
		//xに実数値を読み込む
		double x =standaedInput.nextDouble();  
		
		//yの値の入力を促す*yは教科書準拠
		System.out.print("yの値:");   
		//yに実数値を読み込む
		double y =standaedInput.nextDouble();  
		
		//xとyの合計値を表示
		System.out.println("合計は"+x+y+"です。");   
		//xとyの平均値を表示
		System.out.println("平均は"+(x+y)/2+"です。"); 

	}

}

