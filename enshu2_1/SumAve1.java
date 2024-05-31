package enshu2_1;

/*クラスヘッダ:SumAve1
 *概要:二つの変数xとyの合計と平均を表示
 *作成者:K.Asakura
 *作成日:2024/04/4
 */
public class SumAve1 {

	/*関数名:main
	 *概要:二つの変数xとyの合計と平均を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//xはint型の変数*xは教科書準拠
		int x = 0;    
		//yはint型の変数*yは教科書準拠
		int y = 0;     
		
		//xに6.3を代入
		x=6.3;     
		//yに1.8を代入
		y=1.8;     
		
		//xの値を表示*小数なのでエラーが起こる
		System.out.println("xの値は"+x+"です。");
		//yの値を表示*小数なのでエラーが起こる
		System.out.println("yの値は"+y+"です。");
		//合計を表示*小数なのでエラーが起こる
		System.out.println("合計は"+(x+y)+"です。");
		//平均を表示*小数なのでエラーが起こる
		System.out.println("平均は"+(x+y)/2+"です。");

	}

}
