package enshu08;

//Scannerクラスを呼び出す
import java.util.Scanner;

/*クラス名:HumanInformation
 *概要:名前、身長、体重を読み込んでそれを反復して表示
 *作成者:K.Asakura
 *作成日:2024/05/15
 */
public class HumanInformation {
	/*関数名:main
	 *概要:名前、身長、体重を読み込んでそれを反復して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/15
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定
		Scanner standardInput = new Scanner(System.in);

		//身長を読み込むための変数を初期化して宣言
		double heightValue = 0;
		//体重を読み込むための変数を初期化して宣言
		double weightValue = 0;
		//名前の入力を促す
		System.out.print("名前:");
		//名前を読み込む
		String IndividualName = standardInput.next();
		//0より大きな実数を入力させる
		while (heightValue <= 0) {
			//身長の入力を促す
			System.out.print("身長(cm):");
			//身長を読み込む
			heightValue = standardInput.nextDouble();
			//入力した値が0以下の場合実行
			if (heightValue <= 0) {
				//0より大きな値を入力させる
				System.out.println("0より大きな値を入力してください");
			}
		}
		//0より大きな実数を入力させる
		while (weightValue <= 0) {
			//体重の入力を促す
			System.out.print("体重(kg):");
			//体重を読み込む
			weightValue = standardInput.nextDouble();
			//入力した値が0以下の場合実行
			if (weightValue <= 0) {
				//0より大きな値を入力させる
				System.out.println("0より大きな値を入力してください");
			}
		}

		//個人のデータを格納したインスタンスの生成
		Human humanInformation = new Human(IndividualName, heightValue, weightValue);

		//名前をインスタンスメソッドを呼び出して表示
		System.out.println(humanInformation.getHumanName() + "さんの身長、体重を表示します。");
		//身長をインスタンスメソッドを呼び出して表示
		System.out.println("身長は" + humanInformation.getHumanHeight() + "cm");
		//体重をインスタンスメソッドを呼び出して表示
		System.out.println("体重は" + humanInformation.getHumanWeight() + "kg");
	}
}
