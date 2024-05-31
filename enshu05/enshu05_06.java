package enshu05;

/*クラス名:enshu05_06
 *概要:float型の変数を0.0から1.0まで0.001ずつ増やす様子と
 int型の変数を0から1000までインクリメントした値を1000で割って求めるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/16
 */
public class enshu05_06 {

	/*関数名:main
	 *概要:float型の変数を0.0から1.0まで0.001ずつ増やす様子と
	int型の変数を0から1000までインクリメントした値を1000で割って求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/16
	 */
	public static void main(String[] args) {
		//floatとintを表示
		System.out.println("  float       int   "); 
		//区切りを表示
		System.out.println("--------------------------------"); 
		//float型の変数を1.0まで0.001ずつ増やす式とint型の変数を0から1000まで1ずつ増やす式
		for (float x = 0.0F, i = 0; x <= 1.0F && i <= 1000; x += 0.001F, i++) {
			//int型のインクリメントした変数を1000で割ったもの
			float y = (float) i / 1000;
			//float型とint型の増加過程を表示
			System.out.printf("%1.7f   %1.7f\n",x,y);
			
			
		}
	

	}

}
