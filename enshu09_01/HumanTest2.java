package enshu09_01;


/*クラス名:HumanTest
 *概要:個々のデータを表示(配列生成後に要素に値を代入するパターン)
 *作成者:K.Asakura
 *作成日:2024/05/20
 */
public class HumanTest2 {

	/*関数名:main
	 *概要::個々のデータを表示(配列生成時に要素に値を代入するパターン)
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/20
	 */
	public static void main(String[] args) {
		//各個人のデータを格納するインスタンスと配列を生成(配列生成時に値を代入)
		Human[] secondArray = {
				new Human("a", 165, 55, 20.2),
				new Human("b", 170, 60, 20.76),
				new Human("c", 175, 65, 21.22)
		};
		//各個人のデータを表示
		for (int i = 0; i < secondArray.length; i++) {
			//その番号にあたる人のデータを表示
			System.out.println("番号[" + i + "] 名前:" + secondArray[i].getHumanName() + "\n身長:"
					+ secondArray[i].getHumanHeight() + "cm\n体重:"
					+ secondArray[i].getHumanWeight() + "kg\nBMI:" + secondArray[i].getHumanBodyMathIndex());
		}

	}

}
