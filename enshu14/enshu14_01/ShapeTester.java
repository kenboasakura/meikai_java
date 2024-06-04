package enshu14.enshu14_01;

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
	 *概要:0から引数未満の間の正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)、選択範囲(int型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static int inputSelectionNumber(String stringPromptEntry, int selectionNumberCount) {
		//整数を読み込むため変数を初期化して宣言
		int selectionNumber = 0;
		//範囲を調節するため引かれる整数を定数化
		final int RANGE_ADJUSTMENT = 1;
		//0以上引数未満の整数を入力させる処理
		do {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			selectionNumber = standardInput.nextInt();
			//0未満か引数以上の整数が入力された場合実行
			if (selectionNumber < 0 || selectionNumber > selectionNumberCount- RANGE_ADJUSTMENT) {
				//指定された範囲内の整数の入力を促す文字列を表示
				System.out.println("0から" + (selectionNumberCount - RANGE_ADJUSTMENT) + "の整数を入力して下さい");
			}
		} //0以上引数未満の整数が入力されるまでループ
		while (selectionNumber < 0 || selectionNumber > selectionNumberCount- RANGE_ADJUSTMENT);
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
		final int SHAPE_TYPE_COUNT = 5;
		//点を表示させる場合のインデックスを定数化
		final int POINT_INDEX = 0;
		//水平直線を表示させる場合のインデックスを定数化
		final int HORIZONTALLIN_INDEX = 1;
		//垂直直線を表示させる場合のインデックスを定数化
		final int VIRTICALLINE_INDEX = 2;
		//長方形を表示させる場合のインデックスを定数化
		final int RECTANGLE_INDEX = 3;
		//平行四辺形を表示させる場合のインデックスを定数化
		final int PARALLELOGRAM_INDEX = 4;
		//点を表示したい時の飛び先を表すラベルを定数化
		final int DISPLAY_POINT = 0;
		//水平直線を表示したい時の飛び先を表すラベルを定数化
		final int DISPLAY_HORIZONTALLINE = 1;
		//垂直直線を表示したい時の飛び先を表すラベルを定数化
		final int DISPLAY_VIRTICALLINE = 2;
		//長方形を表示したい時の飛び先を表すラベルを定数化
		final int DISPLAY_REACTANGLE = 3;
		//平行四辺形を表示したい時の飛び先を表すラベルを定数化
		final int DISPRAY_PARALLELOGRAM = 4;

		//図形の個数を読み込んで代入
		int shapeCount = inputRegularInteger("図形の個数:");
		//入力した番号によって図形を表示させるための配列を生成
		Shape shapeType[][] = new Shape[SHAPE_TYPE_COUNT][shapeCount];
		//表示したい図形の番号にあたる整数を格納する配列を生成
		int[] shapeDisplayArray = new int[shapeCount];
		//入力した整数分図形の要素を入力
		for (int i = 0; i < shapeCount; i++) {
			//表示したい図形の番号にあたる整数を格納する配列に選択した番号を読み込んで代入
			shapeDisplayArray[i] = inputSelectionNumber("0...点/1...水平直線/2...垂直直線/3...長方形/4...平行四辺形:", SHAPE_TYPE_COUNT);
			//表示したい図形の番号にあたる整数のラベルに飛ぶ
			switch (shapeDisplayArray[i]) {
			//点を表示させたい場合実行
			case DISPLAY_POINT:
				//Pointクラスのインスタンスを生成
				shapeType[POINT_INDEX][i] = new Point();
				//switch文を抜け出る
				break;
			//水平直線を表示させたい場合実行
			case DISPLAY_HORIZONTALLINE:
				//直線の長さを読み込んで代入
				int horizontalLineLength = inputRegularInteger("直線の長さ:");
				//HorzLineクラスのインスタンスを生成
				shapeType[HORIZONTALLIN_INDEX][i] = new HorzLine(horizontalLineLength);
				//switch文を抜け出る
				break;
			//垂直直線を表示させたい場合実行
			case DISPLAY_VIRTICALLINE:
				//直線の長さを読み込んで代入
				int verticalLineLength = inputRegularInteger("直線の長さ:");
				//VirtLineクラスのインスタンスを生成
				shapeType[VIRTICALLINE_INDEX][i] = new VirtLine(verticalLineLength);
				//switch文を抜け出る
				break;
			//長方形を表示させたい場合実行
			case DISPLAY_REACTANGLE:
				//長方形の幅を読み込んで代入
				int rectangleWidth = inputRegularInteger("長方形の幅:");
				//長方形の高さを読み込んで代入
				int rectangleHeight = inputRegularInteger("長方形の高さ:");
				//Rectangleクラスのインスタンスを生成
				shapeType[RECTANGLE_INDEX][i] = new Rectangle(rectangleWidth, rectangleHeight);
				//switch文を抜け出る
				break;
			//平行四辺形を表示させたい場合実行
			case DISPRAY_PARALLELOGRAM:
				//平行四辺形の幅を読み込んで代入
				int parallelogramWidth = inputRegularInteger("平行四辺形の幅:");
				//平行四辺形の高さを読み込んで代入
				int parallelogramHeight = inputRegularInteger("平行四辺形の高さ:");
				//Parallelogramクラスのインスタンスを生成
				shapeType[PARALLELOGRAM_INDEX][i] = new Parallelogram(parallelogramWidth, parallelogramHeight);
				//switch文を抜け出る
				break;
			}
		}
		//先頭から順に選択した番号にあたる図形を表示
		for (int i = 0; i < shapeCount; i++) {
			//表示したい図形の番号にあたる整数のラベルに飛ぶ
			switch (shapeDisplayArray[i]) {
			//点を表示させたい場合実行
			case DISPLAY_POINT:
				//点を表示
				shapeType[POINT_INDEX][i].printShape();
				//switch文を抜け出る
				break;
			//水平直線を表示させたい場合実行
			case DISPLAY_HORIZONTALLINE:
				//水平直線を表示
				shapeType[HORIZONTALLIN_INDEX][i].printShape();
				//switch文を抜け出る
				break;
			//垂直直線を表示させたい場合実行
			case DISPLAY_VIRTICALLINE:
				//垂直直線を表示
				shapeType[VIRTICALLINE_INDEX][i].printShape();
				//switch文を抜け出る
				break;
			//長方形を表示させたい場合実行
			case DISPLAY_REACTANGLE:
				//長方形を表示
				shapeType[RECTANGLE_INDEX][i].printShape();
				//インタフェースのメソッドを呼び出して長方形の面積を表示
				System.out.println("長方形の面積:" + ((Plane2D) shapeType[RECTANGLE_INDEX][i]).getArea());
				//switch文を抜け出る
				break;
			//長方形を表示させたい場合実行
			case DISPRAY_PARALLELOGRAM:
				//平行四辺形を表示
				shapeType[PARALLELOGRAM_INDEX][i].printShape();
				//インタフェースのメソッドを呼び出して平行四辺形の面積を表示
				System.out.println("平行四辺形の面積:" + ((Plane2D) shapeType[PARALLELOGRAM_INDEX][i]).getArea());
				//switch文を抜け出る
				break;
			}
		}

	}
}
