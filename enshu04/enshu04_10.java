package enshu04;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:List4-11を読み込んだ値が1未満であれば改行文字が出力しないようにしたテキスト
 *概要:enshu04_10
 *作成者:K.Asakura
 *作成日:2024/04/10
 */
public class enshu04_10 {

	/*関数名:main
	 *概要:List4-11を読み込んだ値が1未満であれば改行文字が出力しないようにしたテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/4
	 */
	public static void main(String[] args) {
		//Scannerクラスを設定
		Scanner standardInput = new Scanner(System.in);
		
		//*の個数を計算するための変数nの宣言*nは教科書準拠
		int n = 0;
		
		//whileの限り実行
		do {
			//何個*を表示しますか:と表示
			System.out.print("何個*を表示しますか:");
			//*の個数を計算する変数を読み込む
			n = standardInput.nextInt();
			//正の整数でなければ実行
			if(n <= 0) {
				//正の整数値の入力を促す
				System.out.println("正しい数値を入力してください");
				}
		//正の整数でなければループ
		}while (n <= 0);
	
		//変数iを0から始めて1ずつインクリメントしながら入力した整数分ループ
		for (int i = 0; i < n; i++) {
			//*を表示
			System.out.print("*");
		}
		//入力した整数が1以上であれば実行
		if(n>=1) {
			//入力した整数分の*を表示
			System.out.println();
		}
	}

}
