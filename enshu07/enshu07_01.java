package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_01
 *概要:入力した整数値が負であれば-1、0であれば0、正であれば1をを表示
 *作成者:K.Asakura
 *作成日:2024/04/23
 */
public class enshu07_01 {

	/*関数名:signOf
	 *概要:入力されたint型引数nが負であれば-1を返却し、0であれば0を返却し、正であれば1を返却するメソッド
	 *引数:入力された整数n
	 *戻り値:-1.0.1
	 *作成者:K.Asakura
	 *作成日:2024/04/23
	 */
	static int signOf(int assginmentValue) {
		//戻り値を格納する変数を0を仮として宣言
		int signOf = 0;
		//入力した整数が0より小さければ実行
		if (assginmentValue > 0) {
			//1を戻り値を格納する変数に代入
			signOf = 1;
		} else if (assginmentValue < 0) {
			//-1を戻り値を格納する変数に代入
			signOf = -1;
		}
		//入力した整数が0であれば実行
		else {
			//0を戻り値を格納する変数に代入
			signOf = 0;
		}
		//整数の値に応じた1.-1.0を返却
		return signOf;
	}

	/*関数名:main
	 *概要:入力した整数値が負であれば-1、0であれば0、正であれば1をを表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/23
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);
		//整数の入力を促す*nは教科書準拠
		System.out.print("整数n:");
		//整数を読み込む
		int assginmentValue = standardInput.nextInt();
		//返却した変数を表示
		System.out.print(signOf(assginmentValue));

	}

}
