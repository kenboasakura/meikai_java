package enshu03;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu03_18
*概要:整数を読みこんで対応する季節を表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_18 {

	/*関数名:main
	 *概要:整数を読みこんで対応する季節を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);
		
		//整数の入力を促す
		System.out.print("1から12までの整数値を入力:");
		
		//整数を表示
		int monthNumber = standarddInput.nextInt();   
		
		//読み込んだ整数の飛び先のラベル
		switch (monthNumber) {
		
			//3の時に実行
			case 3 : 
			//4の時に実行
			case 4 :
			//5の時に実行
			case 5 : System.out.print("春");
					//この文を抜け出る
					 break;
			
			//6の時に実行
			case 6 : 
			//7の時に実行
			case 7 :
			//8の時に実行
			case 8 : System.out.print("夏");
					//この文を抜け出る
					 break;
					 
			//9の時に実行
			case 9 : 
			//10の時に実行
			case 10 :
			//11の時に実行
			case 11 : System.out.print("秋");
					//この文を抜け出る
					 break;
		
			//12の時に実行
			case 12 : 
			//の時に実行
			case 1 :
			//2の時に実行
			case 2 : System.out.print("冬");
					//この文を抜け出る
					 break;
			//どのラベルも一致しない場合に実行
			default: System.out.print("正しい値を入力してください");
					//この文を抜け出る
					 break;
		
		
		}
	} 
}
