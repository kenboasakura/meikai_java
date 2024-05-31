package enshu2_7;

//Randomクラスを呼び出し
import java.util.Random;

/*クラスヘッダ:LuckyNo1
 *概要:１から９の乱数を生成して表示
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
class LuckyNo1  {

	/*関数名:main
	 *概要:１から９の乱数を生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Randomクラスを設定
		Random randomNumber = new Random();
		
		//1から9の乱数
		int firstRandom = randomNumber.nextInt(9)+1;   
		//firstRandomを表示
		System.out.println(firstRandom);
		
		//-9から-1の乱数
		int seconRandom = randomNumber.nextInt(9)-9;   
		//seconRandomを表示
		System.out.println(seconRandom);
		
		//10から99の乱数
		int thirdRandom = randomNumber.nextInt(90)+10;   
		//thirdRandomを表示
		System.out.println(thirdRandom);
	}
		

}
