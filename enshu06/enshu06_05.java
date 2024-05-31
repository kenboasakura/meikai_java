package enshu06;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_05
 *概要:個々の要素の値を読み込み各要素の値を表示するテキスト
 *作成者:K.Asakura
 *作成日:2024/04/17
 */
public class enshu06_05 {

	/*関数名:main
	 *概要:個々の要素の値を読み込み各要素の値を表示するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/17
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);
		
		//入力する値を出力するために変数を初期化して宣言
		int assignmentValue = 0;
		
		//要素数が正の整数でない限り実行
		do {
		//正の整数の入力を促す
		System.out.print("要素数:");
		//整数を読み込む
		assignmentValue = standarddInput.nextInt();
		//正の整数でなければ実行
		if(assignmentValue<=0) {
			//正しい値の入力を促す
			System.out.println("正しい値を入力してください");
		}
		//正の整数でなければループ
		}while(assignmentValue<=0);
		
		//配列を生成
		int[] scoreValue = new int [assignmentValue];
		
		//要素数分ループして実行
		for (int i =0;i < assignmentValue;i++) {
			//各要素に点数の入力を促す
			System.out.print("a["+i+"]=");
			//整数を読み込む
			scoreValue[i]=standarddInput.nextInt();
			}
		//入力した配列の初期化子の区切りを作るため1を定数化
		final int DELIMITER_ONE = 1;
		
		//初期化子の前段階の部分を表示
		System.out.print("scoreValue = {");
		//要素数分ループして実行
		for (int j =0;j < assignmentValue;j++) {
			//最後の要素以外で実行
			if(j!= assignmentValue-DELIMITER_ONE) {
				//コンマで区切りを表示
			System.out.print(+scoreValue[j]+",");
			}
			//最後の要素で実行
			else {
				//初期化子の最後の部分を表示
				System.out.print(+scoreValue[j]+"}");
			}
		}
		
	}

}
