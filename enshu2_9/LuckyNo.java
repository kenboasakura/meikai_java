package enshu2_9;

//Randomクラスを呼び出し
import java.util.Random;

/*クラスヘッダ:LuckyNo2
 *概要:0から1の実数値をランダムに生成して表示
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
class LuckyNo  {

	/*関数名:main
	 *概要:0から1の実数値をランダムに生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	 
	public static void main(String[] args) {
		//Randomクラスを設定
		Random random = new Random();
		
		//0.0から1.0未満の乱数
		double firstRandom = random.nextDouble(1);   
		//0.0から1.0未満の乱数を表示
		System.out.println(firstRandom);
		
		//0.0から10.0未満の乱数
		double secondRandom = random.nextDouble(10);   
		//0.0から10.0未満の乱数を表示
		System.out.println(secondRandom);
		
		//0.0から1.0未満の乱数
		double thirdRandom = random.nextDouble(2)-1;   
		//0.0から1.0未満の乱数を表示
		System.out.println(thirdRandom);
		
	}
		

}