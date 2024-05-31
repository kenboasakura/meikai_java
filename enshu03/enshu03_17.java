package enshu03;

//Randomクラスの呼び出し
import java.util.Random;

/*クラスヘッダ:enshu03_17
*概要:ランダムにグーチョキパーを表示するテキスト
*作成者:K.Asakura
*作成日:2024/04/4
*/
public class enshu03_17 {

	/*関数名:main
	 *概要:ランダムにグーチョキパーを表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Randomクラスを設定
		Random randomHand = new Random();  
		
		//0から2のいずれかの乱数を生成するための宣言
		final int RANDOM_TWO = 3;
		
		///0から2のいずれかの乱数を生成
		int handNumber = randomHand.nextInt(RANDOM_TWO);
		
		//読み込んだ乱数の飛び先のラベル
		switch (handNumber) {  
		//文字列を表示
		case 0 : System.out.print("グー"); 
				 //この文を抜け出る
				 break;
		//文字列を表示
		case 1 : System.out.print("チョキ"); 
				 //この文を抜け出る
		 		 break;
		//文字列を表示
		case 2 : System.out.print("パー"); 
				 //この文を抜け出る
		 		 break;
		
		}
		
		
		
	}

}
