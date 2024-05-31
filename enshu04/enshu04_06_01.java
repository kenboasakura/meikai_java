package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラスヘッダ:enshu04_06_01
 *概要:List4-7を読み込んだ値が1未満であれば改行文字を出力しないようにしたテキスト
 *作成者:K.Asakura
 *作成日:2024/04/9
 */
public class enshu04_06_01 {

	/*関数名:main
	 *概要:List4-7を読み込んだ値が1未満であれば改行文字を出力しないようにしたテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/9
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促す
		System.out.print("何個*を表示しますか:");
		//整数を読み込む*nは教科書準拠
		int n = standardInput.nextInt();
		
		//整数を初期化して設定*iは教科書準拠
		int i = 0;
		//入力した整数より変数iが小さければループ
		while (i < n) {
			//*を表示
			System.out.print('*');
			//iをインクリメント
			i++;
		}
		//nが1以上であれば実行
		if (n >= 1) {
			//*を入力した整数分だけ表示
			System.out.println();
		}
		
	}

}
