package enshu13_03;

import java.util.Scanner;

public class PlayerTester {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:inputSelectionNumber
	 *概要:0から引数未満の間の正の整数を入力させて返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:入力した整数(int型)
	 *作成者:K.Asakura
	 *作成日:2024/05/30
	 */
	static int inputSelectionNumber(String stringPromptEntry, int selectionNumberCount) {
		//整数を読み込むため変数を初期化して宣言
		int selectionNumber = 0;
		do {
			//受け取った入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			selectionNumber = standardInput.nextInt();
			//0未満か引数以上の整数が入力された場合実行
			if (selectionNumber < 0 || selectionNumber >= selectionNumberCount) {
				//指定された範囲内の整数の入力を促す文字列を表示
				System.out.println("0から" + selectionNumberCount + "の整数を入力して下さい");
			}
		}//0以上引数未満の整数を入力させる処理
		while (selectionNumber < 0 || selectionNumber >= selectionNumberCount);
		//読み込んだ整数を返却
		return selectionNumber;
	}

	public static void main(String[] args) {
		
		final int 
		
		int selectHand = inputSelectionNumber("");

	}

}
