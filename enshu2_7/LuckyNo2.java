package enshu2_7;

import java.util.Random;

/*クラスヘッダ:LuckyNo1
*概要:-9から-1のラッキーナンバーを乱数で生成して表示
*作成者:K.Asakura
*作成日:2024/04/4
*/
class LuckyNo2  {

	/*関数名:main
	 *概要:-9から-1のラッキーナンバーを乱数で生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		Random random = new Random();
		
		//-9から-1の乱数
		int luckyNumber = random.nextInt(9)-9;   
		
		//ラッキーナンバーを表示
		System.out.println("今日のラッキーナンバーは"+ luckyNumber +"です。");
		
	}
		

}