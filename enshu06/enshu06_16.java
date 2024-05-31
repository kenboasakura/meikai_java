package enshu06;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_16
 *概要:4行3列と3行4列の行列の積を求めるテキスト
 *作成者:K.Asakura
 *作成日:2024/04/22
 */
public class enshu06_16 {

	/*関数名:main
	 *概要:4行3列と3行4列の行列の積を求めるテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/22
	 */
	public static void main(String[] args) {

		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//行数aの行数4を定数化
		final int FOUR_ROW = 4;
		//行列aの列数3を定数化
		final int THREE_COLUMN = 3;
		//行列bの行数3を定数化
		final int THREE_ROW = 3;
		//行列bの列数4を定数化
		final int FOUR_COLUMN = 4;

		//行列aを生成
		int[][] firstArray = new int[FOUR_ROW][THREE_COLUMN];
		//行列bを生成
		int[][] secondArray = new int[THREE_ROW][FOUR_COLUMN];
		//行列aと行列bを乗算した行列cを生成
		int[][] thirdArray = new int[FOUR_ROW][FOUR_COLUMN];

		//行列aと表示
		System.out.println("行列a:");
		//行列の行数を4行分生成
		for (int i = 0; i < FOUR_ROW; i++) {
			//行列の列数3列分を生成
			for (int j = 0; j < THREE_COLUMN; j++) {
				//インデックスと入力した整数を表示
				System.out.print("a["+i+"]["+j+"]=");
				//行列に入力した変数を代入
				firstArray[i][j] = standardInput.nextInt();
			}
			
		}

		//行列bと表示
		System.out.println("行列b:");
		//行列の行数を3行分生成
		for (int i = 0; i < THREE_ROW; i++) {
			//行列の列数4列分を生成
			for (int j = 0; j < FOUR_COLUMN; j++) {
				//インデックスと入力した整数を表示
				System.out.print("b["+i+"]["+j+"]=");
				//行列に入力した変数を代入
				secondArray[i][j] = standardInput.nextInt();
				
			}
			
		}

		//4×3の行列と3×4の行列の乗算処理
		for (int i = 0; i < FOUR_ROW; i++) {
			//cの配列の(0.0)から行をインクリメントし、aとbの配列を乗算して加算
			for (int j = 0; j < FOUR_COLUMN; j++) {
				//cの配列の(0.0)から列をインクリメントし、aとbの配列を乗算して加算
				for (int k = 0; k < THREE_ROW; k++) {
					//各要素を乗算し、加算して代入
					thirdArray[i][j] += firstArray[i][k] * secondArray[k][j];
				}
			}
		}
		//行列cと表示
		System.out.println("行列c:");
		//各行の要素を表示する処理
		for (int i = 0; i < FOUR_ROW; i++) {
			//中括弧の始まりを表示
			System.out.print("{");
			//各要素を表示する処理
			for (int j = 0; j < FOUR_COLUMN; j++) {
				//行列aとbの乗算の結果を表示
				System.out.printf("%4d", thirdArray[i][j]);
			}
			//中括弧の終わりを表示
			System.out.print("}");
			//改行を出力
			System.out.println();
		}

	}

}
