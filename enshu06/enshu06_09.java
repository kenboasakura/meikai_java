package enshu06;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_09
 *概要:要素型int型の配列を作り、全要素をを1から10の乱数で埋め尽くすテキスト
 *作成者:K.Asakura
 *作成日:2024/04/17
 */
public class enshu06_09 {

	/*関数名:main
	 *概要:要素型int型の配列を作り、全要素をを1から10の乱数で埋め尽くすテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/18
	 */
	public static void main(String[] args) {
		//Randomクラスを設定
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);
		
		//10の範囲の乱数を生成するため10を定数化
		final int RANDOM_TENN = 10;
		//乱数の範囲を調整するため1を定数化
		final int TWO_DIGITS = 1;
		//要素数を表示するため変数を初期化して宣言
		int inputNumber = 0;

		//要素数に正の整数が入力されるまで実行
		do {
			//要素数の入力を促す
			System.out.print("全要素:");
			//整数を読み込む
			inputNumber = standarddInput.nextInt();
			//正の整数でなければ実行
			if (inputNumber <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数でなければループ
		} while (inputNumber <= 0);
		//入力した整数が要素数の配列を宣言
		int[] integerValue = new int[inputNumber];
		
		//要素数分ループして実行
		for(int i = 0;i < inputNumber;i++) {
			//各要素にそれぞれ乱数を代入
			integerValue[i]= randomNumber.nextInt(RANDOM_TENN)+TWO_DIGITS;
			//インデックスごとに代入された乱数を表示
			System.out.println("a["+i+"]="+integerValue[i]);
		}
		
		
		

	}

}
