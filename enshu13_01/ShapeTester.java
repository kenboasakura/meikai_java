package enshu13_01;

//Scannerクラスをインポート
import java.util.Scanner;

/*クラス名:ShapeTester
*概要:表示したい図形を選択して表示
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
	 *概要:表示したい図形を選択して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	public static void main(String[] args) {
		//図形の種類数を定数化
		final int SHAPE_TYPE_COUNT = 4;
		//点を表示させる場合のインデックスを定数化
		final int POINT_INDEX = 0;
		//水平直線を表示させる場合のインデックスを定数化
		final int HORZLINE_INDEX = 1;
		//垂直直線を表示させる場合のインデックスを定数化
		final int VIRTLINE_INDEX = 2;
		//長方形を表示させる場合のインデックスを定数化
		final int RECTANGLE_INDEX = 3;
		//点を表示したい時の飛び先を表すラベルを定数化
		final int CASE_DISPLAY_POINT = 1;
		//水平直線を表示したい時の飛び先を表すラベルを定数化
		final int CASE_DISPLAY_HORZLINE = 2;
		//垂直直線を表示したい時の飛び先を表すラベルを定数化
		final int CASE_DISPLAY_VIRTLINE = 3;
		//長方形を表示したい時の飛び先を表すラベルを定数化
		final int CASE_DISPLAY_REACTANGLE = 4;
		//図形の個数を読み込んで代入
		int shapeCount = inputRegularInteger("図形の個数:");
		//入力した番号によって図形を表示させるための配列を生成
		Shape shapeType[][] = new Shape[SHAPE_TYPE_COUNT][shapeCount];
		//表示したい図形の番号にあたる整数を格納する配列を生成
		int[] shapeDisplayArray = new int[shapeCount];
		//入力した整数分図形の要素を入力
		for (int i = 0; i < shapeCount; i++) {
			//表示したい図形の番号にあたる整数を格納する配列に選択した番号を読み込んで代入
			shapeDisplayArray[i] = inputSelectionNumber("1...点/2...水平直線/3...垂直直線/4...長方形:", SHAPE_TYPE_COUNT);
			//表示したい図形の番号にあたる整数のラベルに飛ぶ
			switch (shapeDisplayArray[i]) {
			//点を表示させたい場合実行
			case CASE_DISPLAY_POINT:
				//Pointクラスのインスタンスを生成
				shapeType[POINT_INDEX][i] = new Point();
				//switch文を抜け出る
				break;
			//水平直線を表示させたい場合実行
			case CASE_DISPLAY_HORZLINE:
				//直線の長さを読み込んで代入
				int HorzLineLength = inputRegularInteger("直線の長さ:");
				//HorzLineクラスのインスタンスを生成
				shapeType[HORZLINE_INDEX][i] = new HorzLine(HorzLineLength);
				//switch文を抜け出る
				break;
			//垂直直線を表示させたい場合実行
			case CASE_DISPLAY_VIRTLINE:
				//直線の長さを読み込んで代入
				int VirtLineLength = inputRegularInteger("直線の長さ:");
				//VirtLineクラスのインスタンスを生成
				shapeType[VIRTLINE_INDEX][i] = new VirtLine(VirtLineLength);
				//switch文を抜け出る
				break;
			//長方形を表示させたい場合実行
			case CASE_DISPLAY_REACTANGLE:
				//長方形の幅を読み込んで代入
				int rectangleWidth = inputRegularInteger("長方形の幅:");
				//長方形の高さを読み込んで代入
				int rectangleHeight = inputRegularInteger("長方形の高さ:");
				//Rectangleクラスのインスタンスを生成
				shapeType[RECTANGLE_INDEX][i] = new Rectangle(rectangleWidth, rectangleHeight);
				//switch文を抜け出る
				break;
			}
		}
		//先頭から順に選択した番号にあたる図形を表示
		for (int i = 0; i < shapeCount; i++) {
			//表示したい図形の番号にあたる整数のラベルに飛ぶ
			switch (shapeDisplayArray[i]) {
			//点を表示させたい場合実行
			case CASE_DISPLAY_POINT:
				//点を表示
				shapeType[POINT_INDEX][i].printShape();
				//switch文を抜け出る
				break;
			//水平直線を表示させたい場合実行
			case CASE_DISPLAY_HORZLINE:
				//水平直線を表示
				shapeType[HORZLINE_INDEX][i].printShape();
				//switch文を抜け出る
				break;
			//垂直直線を表示させたい場合実行
			case CASE_DISPLAY_VIRTLINE:
				//垂直直線を表示
				shapeType[VIRTLINE_INDEX][i].printShape();
				//switch文を抜け出る
				break;
			//長方形を表示させたい場合実行
			case CASE_DISPLAY_REACTANGLE:
				//長方形を表示
				shapeType[RECTANGLE_INDEX][i].printShape();
				//switch文を抜け出る
				break;
			}
		}

	}
}
