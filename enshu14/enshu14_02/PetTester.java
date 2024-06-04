package enshu14.enshu14_02;

//Scannerクラスのインポート
import java.util.Scanner;

/*クラス名:PetTester
 *概要:着せ替えが可能なロボットの自己紹介を表示
 *作成者:K.Asakura
 *作成日:2024/06/02
 */
public class PetTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputSelectionNumber
	 *概要:0から引数未満の正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型),入力させる範囲(int型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static int inputSelectionNumber(String stringPromptEntry, int selectionNumberCount) {
		//入力を促す文字列の整数の範囲を調節するため、引かれる数を定数化
		final int ADJUSTMENT_RANGE = 1;
		//整数を読み込むため変数を初期化して宣言
		int selectionNumber = 0;
		//0以上引数より以下の整数を入力させる処理
		do {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			selectionNumber = standardInput.nextInt();
			//0未満か引数より大きい整数が入力された場合実行
			if (selectionNumber < 0 || selectionNumber > selectionNumberCount - ADJUSTMENT_RANGE) {
				//指定された範囲内の整数の入力を促す文字列を表示
				System.out.println("0から" + (selectionNumberCount - ADJUSTMENT_RANGE) + "の整数を入力して下さい");
			}
			//0以上引数未満の整数が入力されるまでループ
		} while (selectionNumber < 0 || selectionNumber > selectionNumberCount - ADJUSTMENT_RANGE);
		//読み込んだ整数を返却
		return selectionNumber;
	}

	/*関数名:main
	 *概要:着せ替えが可能なロボットの自己紹介を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/06/02
	 */
	public static void main(String[] args) {
		//家事の種類の数を定数化
		final int HOUSEWORK_CATEGORY = 3;
		//ペットの名前の入力を促す
		System.out.print("ペットの名前:");
		//ペットの名前を読み込む
		String robotPetName = standardInput.next();
		//主人の名前の入力を促す
		System.out.print("主人の名前:");
		//主人の名前を読み込む
		String masterName = standardInput.next();
		//着たい色の入力を促す
		System.out.print("0...黒/1...赤/2...緑/3...青/4...ヒョウ柄/0から4以外...無地:");
		//着たい色にあたる整数を読み込んで代入
		int skinNumber = standardInput.nextInt();
		//SkinableRobotPetクラスのインスタンスを生成
		SkinableRobotPet myPet = new SkinableRobotPet(robotPetName, masterName, skinNumber);
		//生成したインスタンスの自己紹介を表示
		myPet.introduceName();
		//着せ替えを変更することを表示
		System.out.println("着せ替えを変更します!");
		//着たい色の入力を促す
		System.out.print("0...黒/1...赤/2...緑/3...青/4...ヒョウ柄/0から4以外...無地:");
		//変更する着たい色にあたる整数を読み込んで代入
		int changeSkinNumber = standardInput.nextInt();
		//変更した色を表示
		myPet.changeSkin(changeSkinNumber);
		//生成したインスタンスの自己紹介を表示
		myPet.introduceName();
		//行いたい家事に当たる番号を読み込んで代入
		int houseworkNumber = inputSelectionNumber("0...掃除/1...洗濯/2...炊事:", HOUSEWORK_CATEGORY);
		//行いたい家事を表示
		myPet.houseworkSelection(houseworkNumber);
	}

}
