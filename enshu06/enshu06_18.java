package enshu06;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_18
 *概要:行数、各行の列数、各要素の値をキーボードから読み込んだ凹凸な二次元配列のテキスト
 *作成者:K.Asakura
 *作成日:2024/04/22
 */
public class enshu06_18 {

	/*関数名:main
	 *概要:行数、各行の列数、各要素の値をキーボードから読み込んだ凹凸な二次元配列のテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/22
	 */
	public static void main(String[] args) {

		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//行数を定めるための変数を初期化して宣言
		int firstAssginment = 0;

		//二次元配列を宣言
		int[][] arrayValue = new int[0][0];

		//正の整数を入力させるための処理
		do {
			//行数の入力を促す
			System.out.print("行数:");
			//行数を表すインデックスを読み込む
			firstAssginment = standardInput.nextInt();
			//入力した整数が0以下だった場合
			if (firstAssginment <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}
			//正の整数が入力されるまでループ
		} while (firstAssginment <= 0);

		//入力した整数分の行をもつ配列を宣言
		arrayValue = new int[firstAssginment][];
		//列を定めるための変数を初期化して宣言
		int sencondAssginment = 0;
		//入力した行分の列のインデックスを生成する処理
		for (int i = 0; i < firstAssginment; i++) {
			//正の整数を入力させるための処理
			do {
				//列数の入力を促す
				System.out.print("第" + i + "の列数:");
				//列数を読み込む
				sencondAssginment = standardInput.nextInt();
				//入力した整数が0以下だった場合
				if (sencondAssginment <= 0) {
					//正しい値の入力を促す
					System.out.println("正しい値を入力してください");
				}

				//正の整数が入力されるまでループ
			} while (sencondAssginment <= 0);
			//入力した整数分の行と列をもつ二次元配列を生成
			arrayValue[i] = new int[sencondAssginment];

		}
		//改行を出力
		System.out.println();
		//各要素に整数を入力する処理
		for (int i = 0; i < arrayValue.length; i++) {
			//各列で整数を入力する処理
			for (int j = 0; j < arrayValue[i].length; j++) {
				//要素の値の入力を促す
				System.out.print("配列[" + i + "][" + j + "]の要素の値:");
				//整数を読み込む
				arrayValue[i][j] = standardInput.nextInt();
			}

		}
		//各行で入力された要素を出力する処理
		for (int i = 0; i < arrayValue.length; i++) {
			//その列で入力された各要素を出力する処理
			for (int j = 0; j < arrayValue[i].length; j++) {
				//入力された整数を表示
				System.out.printf("%3d", arrayValue[i][j]);
			}
			//改行を出力
			System.out.println();
		}

	}

}
