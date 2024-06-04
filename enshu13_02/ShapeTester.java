package enshu13_02;
//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:ShapeTester
 *概要:表示したい直角二等辺三角形の種類を選択して最後にまとめて表示
 *作成者:K.Asakura
 *作成日:2024/05/30
 */
public class ShapeTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputRegularInteger
	 *概要:正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static int inputRegularInteger(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//正の整数を入力させる
		while (inputInteger <= 0) {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (inputInteger <= 0) {
				//正の整数の入力を促す
				System.out.println("正の整数を入力して下さい");
			}
		}
		//読み込んだ整数を返却
		return inputInteger;
	}

	/*関数名:inputSelectionNumber
	 *概要:1から引数の間の正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static int inputSelectionNumber(String stringPromptEntry, int selectionNumberCount) {
		//整数を読み込むため変数を初期化して宣言
		int selectionNumber = 0;
		//1以上引数より以下の整数を入力させる処理
		while (selectionNumber <= 0 || selectionNumber > selectionNumberCount) {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			selectionNumber = standardInput.nextInt();
			//0以下か引数より大きい整数が入力された場合実行
			if (selectionNumber <= 0 || selectionNumber > selectionNumberCount) {
				//指定された範囲内の整数の入力を促す文字列を表示
				System.out.println("1から" + selectionNumberCount + "の整数を入力して下さい");
			}
		}
		//読み込んだ整数を返却
		return selectionNumber;
	}

	/*関数名:main
	 *概要:表示したい直角二等辺三角形の種類を選択して最後にまとめて表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public static void main(String[] args) {
		//直角二等辺三角形の種類数を定数化
		final int TRIANGLE_TYPE_COUNT = 4;
		//左下が直角の二等辺三角形を表示したい時の飛び先を表すラベルを定数化
		final int DISPLAY_BOTTOM_LEFT_RIGHT_ANGLE = 1;
		//左上が直角の二等辺三角形を表示したい時の飛び先を表すラベルを定数化
		final int DISPLAY_TOP_LEFT_RIGHT_ANGLE = 2;
		//右下が直角の二等辺三角形を表示したい時の飛び先を表すラベルを定数化
		final int DISPLAY_BOTTOM_RIGHT_RIGHT_ANGLE = 3;
		//右上が直角の二等辺三角形を表示したい時の飛び先を表すラベルを定数化
		final int DISPLAY_TOP_RIGHT_RIGHT_ANGLE = 4;
		//左下が直角の二等辺三角形を表示したい場合のインデックスを定数化
		final int INDEX_BOTTOM_LEFT_RIGHT_ANGLE = 0;
		//左上が直角の二等辺三角形を表示したい場合のインデックスを定数化
		final int INDEX_TOP_LEFT_RIGHT_ANGLE = 1;
		//右下が直角の二等辺三角形を表示したい場合のインデックスを定数化
		final int INDEX_BOTTOM_RIGHT_RIGHT_ANGLE = 2;
		//右上が直角の二等辺三角形を表示したい場合のインデックスを定数化
		final int INDEX_TOP_RIGHT_RIGHT_ANGLE = 3;

		//直角二等辺三角形の個数を読み込んで代入
		int triangleCount = inputRegularInteger("直角二等辺三角形の個数:");
		//直角二等辺三角形の二等辺の長さを表す変数を初期化して宣言
		int twoEqualSidesLength = 0;
		//入力した番号によって図形を表示させるための配列を生成
		Shape triangleType[][] = new Shape[TRIANGLE_TYPE_COUNT][triangleCount];
		//表示したい図形の番号にあたる整数を格納する配列を生成
		int[] triangleDisplayArray = new int[triangleCount];
		//入力した整数分の図形の要素を読み込み、最後にまとめて表示
		for (int i = 0; i < triangleCount; i++) {
			triangleDisplayArray[i] = inputSelectionNumber("直角二等辺三角形の角の場所\n 1...左上/"
					+ "2...左下/3...右下/4...右上:",
					TRIANGLE_TYPE_COUNT);
			//選択した直角三角形の種類の二等辺の長さを読み込む
			switch (triangleDisplayArray[i]) {
			//左下が直角の二等辺三角形を表示したい時実行
			case DISPLAY_BOTTOM_LEFT_RIGHT_ANGLE:
				//二等辺の長さを読み込んで代入
				twoEqualSidesLength = inputRegularInteger("二等辺の長さ:");
				//BottomLeftIsoscelesRightTriangleクラスのインスタンスを生成
				triangleType[INDEX_BOTTOM_LEFT_RIGHT_ANGLE][i] = new BottomLeftIsoscelesRightTriangle(
						twoEqualSidesLength);
				//switch文を抜け出る
				break;
			//左上が直角の二等辺三角形を表示したい時実行
			case DISPLAY_TOP_LEFT_RIGHT_ANGLE:
				//二等辺の長さを読み込んで代入
				twoEqualSidesLength = inputRegularInteger("二等辺の長さ:");
				//TopLeftIsoscelesRightTriangleクラスのインスタンスを生成
				triangleType[INDEX_TOP_LEFT_RIGHT_ANGLE][i] = new 
						TopLeftIsoscelesRightTriangle(twoEqualSidesLength);
				//switch文を抜け出る
				break;
			//右下が直角の二等辺三角形を表示したい時実行
			case DISPLAY_BOTTOM_RIGHT_RIGHT_ANGLE:
				//二等辺の長さを読み込んで代入
				twoEqualSidesLength = inputRegularInteger("二等辺の長さ:");
				//BottomRightIsoscelesRightTriangleクラスのインスタンスを生成
				triangleType[INDEX_BOTTOM_RIGHT_RIGHT_ANGLE][i] = new BottomRightIsoscelesRightTriangle(
						twoEqualSidesLength);
				//switch文を抜け出る
				break;
			//右上が直角の二等辺三角形を表示したい時実行
			case DISPLAY_TOP_RIGHT_RIGHT_ANGLE:
				//二等辺の長さを読み込んで代入
				twoEqualSidesLength = inputRegularInteger("二等辺の長さ:");
				//TopRightIsoscelesRightTriangleクラスのインスタンスを生成
				triangleType[INDEX_TOP_RIGHT_RIGHT_ANGLE][i] = new 
						TopRightIsoscelesRightTriangle(twoEqualSidesLength);
				//switch文を抜け出る
				break;
			}

		}
		//先頭から順に選択した番号にあたる直角二等辺三角形を表示
		for (int i = 0; i < triangleCount; i++) {
			//選択した直角三角形の種類を表示
			switch (triangleDisplayArray[i]) {
			//左下が直角の二等辺三角形を表示したい時実行
			case DISPLAY_BOTTOM_LEFT_RIGHT_ANGLE:
				//左下が直角の二等辺三角形を表示
				triangleType[INDEX_BOTTOM_LEFT_RIGHT_ANGLE][i].printShape();
				//switch文を抜け出る
				break;
			//左上が直角の二等辺三角形を表示したい時実行
			case DISPLAY_TOP_LEFT_RIGHT_ANGLE:
				//左上が直角の二等辺三角形を表示
				triangleType[INDEX_TOP_LEFT_RIGHT_ANGLE][i].printShape();
				//switch文を抜け出る
				break;
			//右下が直角の二等辺三角形を表示したい時実行
			case DISPLAY_BOTTOM_RIGHT_RIGHT_ANGLE:
				//右下が直角の二等辺三角形を表示
				triangleType[INDEX_BOTTOM_RIGHT_RIGHT_ANGLE][i].printShape();
				//switch文を抜け出る
				break;
			//右上が直角の二等辺三角形を表示したい時実行
			case DISPLAY_TOP_RIGHT_RIGHT_ANGLE:
				//右上が直角の二等辺三角形を表示
				triangleType[INDEX_TOP_RIGHT_RIGHT_ANGLE][i].printShape();
				//switch文を抜け出る
				break;
			}
		}

	}

}
