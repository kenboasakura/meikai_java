package enshu09_01;

//Scannerクラスを呼び出す
import java.util.Scanner;

/*クラス名:HumanTest
 *概要:各個人の身長、体重、BMIを表示
 *作成者:K.Asakura
 *作成日:2024/05/20
 */
public class HumanTest {

	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputRegularInteger
	 *概要:正の整数を入力させるメソッド
	 *引数:なし
	 *戻り値:入力された正の整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	static int inputRegularInteger() {
		//入力した整数を読み込むため変数を初期化して宣言
		int inputDataValue = 0;
		//0以上の整数を入力させる
		while (inputDataValue <= 0) {
			//人数の入力を促す
			System.out.print("何人?:");
			//整数の入力を促す
			inputDataValue = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (inputDataValue <= 0) {
				//0より大きい数値を入力してくださいと表示
				System.out.println("0より大きい数値を入力してください");
			}
		}
		//入力したデータを返却
		return inputDataValue;
	}

	/*関数名:inputRegularDouble
	 *概要:正の実数を入力させるメソッド
	 *引数:整数(int型)
	 *戻り値:入力された正の実数(double型)
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	static double inputRegularDouble(int x) {
		//人のデータの入力を促す文字列を格納した配列を生成
		String[] inputDoubleData = {
				"身長:", "体重:"
		};
		//入力した実数を読み込むため変数を初期化して宣言
		double inputDataValue = 0;
		//0以上の実数を入力させる
		while (inputDataValue <= 0) {
			//配列の中から各データの入力を促す文字列を表示
			System.out.print(inputDoubleData[x]);
			//実数の入力を促す
			inputDataValue = standardInput.nextDouble();
			//0以下の実数が入力された場合実行
			if (inputDataValue <= 0) {
				//0より大きい数値を入力してくださいと表示
				System.out.println("0より大きい数値を入力してください");
			}
		}
		//入力したデータを返却
		return inputDataValue;
	}

	/*関数名:main
	 *概要:各個人の身長、体重、BMIを表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public static void main(String[] args) {

		//cmの値をメートルの値にするため、割られる数を定数化
		final int CORRECT_TO_METRIC = 100;
		//身長が格納されている場所を表す整数を定数化
		final int HEIGHT_VALUE_INDEX = 0;
		//体重が格納されている場所を表す整数を定数化
		final int WEIGHT_VALUE_INDEX = 1;

		//人数を読み込む
		int elementNumber = inputRegularInteger();
		//各個人の名前を格納する配列を生成
		String humanName[] = new String[elementNumber];
		//各個人の身長を格納する配列を生成
		double heightValue[] = new double[elementNumber];
		//各個人の体重を格納する配列を生成
		double weightValue[] = new double[elementNumber];
		//各個人のBMIを格納する配列を生成
		double bodyMathIndexValue[] = new double[elementNumber];

		//各個人のデータを格納するインスタンスと配列を生成(配列生成後に値を代入)
		Human[] humanDataFirstArray = new Human[elementNumber];

		//その人の各データを読み込む
		for (int i = 0; i < elementNumber; i++) {
			//人数の入力を促す
			System.out.print(i + "番の名前は?:");
			//各個人の名前を読み込む
			humanName[i] = standardInput.next();
			//メソッドを呼び出して各個人の身長を代入
			heightValue[i] = inputRegularDouble(HEIGHT_VALUE_INDEX);
			//メソッドを呼び出して各個人の体重を代入
			weightValue[i] = inputRegularDouble(WEIGHT_VALUE_INDEX);
			//各個人のBMIを代入
			bodyMathIndexValue[i] = weightValue[i]
					/ (heightValue[i] / CORRECT_TO_METRIC * heightValue[i] / CORRECT_TO_METRIC);
			//配列に各個人のデータを代入
			humanDataFirstArray[i] = new Human(humanName[i], heightValue[i], weightValue[i], bodyMathIndexValue[i]);
		}
		//1から順番に表示するために、インデックスに加える数を定数化
		final int DISPLAY_NUMBER = 1;
		//各個人のデータを表示
		for (int i = 0; i < humanDataFirstArray.length; i++) {
			//各個人のデータを表示
			System.out.println("番号[" + (i+DISPLAY_NUMBER) + "] \n名前:" + humanDataFirstArray[i].getHumanName() + "\n身長:"
					+ humanDataFirstArray[i].getHumanHeight() + "cm\n体重:"
					+ humanDataFirstArray[i].getHumanWeight() + "kg\nBMI:"
					+ humanDataFirstArray[i].getHumanBodyMathIndex());
		}

		//配列生成時に要素を初期化したものを表示しますと表示
		System.out.println("配列生成時に要素を初期化したものを表示します。");
		//aさんの身長を定数化
		final double FIRST_HUMAN_HEIGHT = 165;
		//aさんの体重を定数化
		final double FIRST_HUMAN_WEIGHT = 55;
		//aさんのBMIを定数化
		final double FIRST_HUMAN_BODY_MATH_INDEX = 20.2;
		//bさんの身長を定数化
		final double SECOND_HUMAN_HEIGHT = 170;
		//bさんの体重を定数化
		final double SECOND_HUMAN_WEIGHT = 60;
		//bさんのBMIを定数化
		final double SECOND_HUMAN_BODY_MATH_INDEX = 20.76;
		//cさんの身長を定数化
		final double THIRD_HUMAN_HEIGHT = 175;
		//cさんの体重を定数化
		final double THIRD_HUMAN_WEIGHT = 65;
		//cさんのBMIを定数化
		final double THIRD_HUMAN_BODY_MATH_INDEX = 21.22;

		;
		//各個人のデータを格納するインスタンスと配列を生成(配列生成時に値を代入)
		Human[] humanDataSecondArray = {
				new Human("a", FIRST_HUMAN_HEIGHT, FIRST_HUMAN_WEIGHT, FIRST_HUMAN_BODY_MATH_INDEX),
				new Human("b", SECOND_HUMAN_HEIGHT, SECOND_HUMAN_WEIGHT, SECOND_HUMAN_BODY_MATH_INDEX),
				new Human("c", THIRD_HUMAN_HEIGHT, THIRD_HUMAN_WEIGHT, THIRD_HUMAN_BODY_MATH_INDEX)
		};
		//各個人のデータを表示
		for (int i = 0; i < humanDataSecondArray.length; i++) {
			//各個人のデータを表示
			System.out.println("番号[" + (i+DISPLAY_NUMBER) + "] \n名前:" + humanDataSecondArray[i].getHumanName() + "\n身長:"
					+ humanDataSecondArray[i].getHumanHeight() + "cm\n体重:"
					+ humanDataSecondArray[i].getHumanWeight() + "kg\nBMI:"
					+ humanDataSecondArray[i].getHumanBodyMathIndex());
		}

	}
}
