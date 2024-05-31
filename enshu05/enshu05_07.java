package enshu05;

/*クラス名:enshu05_07
 *概要:0.0から1.0まで0.001おきにその値とその値の2乗を表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/16
 */
public class enshu05_07 {

	/*関数名:main
	 *概要:0.0から1.0まで0.001おきにその値とその値の2乗を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/16
	 */
	public static void main(String[] args) {

		//xとxを2乗したもののサムネイルを表示
		System.out.println("0.001ずつ増加した値 2乗したもの     ");
		//区切りを表示
		System.out.println("--------------------------------");
		//0から1000まで1おきにインクリメント
		for (int assignmentValue = 0; assignmentValue <= 1000; assignmentValue +=1) {
			//xをfloat型の変数に変換する処理
			 float integerNumber =(float)assignmentValue/1000; 
			//2乗する処理
			float squareNumber = integerNumber*integerNumber;
			//インクリメントした値とその値を2乗したものを表示
			System.out.printf("%1.7f           %1.7f\n", integerNumber, squareNumber);

		}

	}

}
