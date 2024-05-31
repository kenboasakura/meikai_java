package enshu2_7;

import java.util.Random;
import java.util.Scanner;

/*クラスヘッダ:LuckyNo3
*概要:１０から９９のラッキーナンバーを乱数で生成して表示
*作成者:K.Asakura
*作成日:2024/04/4
*/
class LuckyNo3  {

	/*関数名:main
	 *概要:１０から９９のラッキーナンバーを乱数で生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		Scanner standardInput= new Scanner(System.in);
		Random random =new Random();
		
		//整数値を受け取る
		System.out.print("整数値：");
		//整数値の表示
		int a = standardInput.nextInt();
		
		//整数値に+-5の範囲の乱数を生成
		int luckyNumber= random.nextInt(10)-5+a;
		//ラッキーナンバーを表示
		System.out.println("その値のラッキーナンバーは"+luckyNumber+"です。");
		
		
	}
		

}