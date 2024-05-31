package MethodManagementPackage;

import java.util.Scanner;

public class BooleanMethod {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);
	
	/*関数名:isYes
	 *概要:YesかNoかを判別し、Yesの場合はtrueを、Noの場合はfalseを返却するメソッド
	 *引数:入力を促す文字列(String型)
	 *戻り値:teue,もしくはfalse(boolean型)
	 *作成者:K.Asakura
	 *作成日:2024/05/24
	 */
	static boolean isYes(String stringPromptEntry) {
		//整数を読み込むため変数を初期化して宣言
		int inputInteger = 0;
		//Yesの場合に入力される整数を定数化
		final int WHEN_YES = 1;
		//Noの場合に入力される整数を定数化
		final int WHEN_NO = 0;
		//0か1の整数を入力させる
		do {
			//入力を促す文字列を表示
			System.out.print(stringPromptEntry);
			//整数を読み込む
			inputInteger = standardInput.nextInt();
			//0か1以外の整数が入力された場合実行
			if (inputInteger != WHEN_NO && inputInteger != WHEN_YES) {
				//0か1の整数を入力させる文字列を表示
				System.out.println("0か1の整数を入力してください");
			}
			//0か1の整数を入力されるまでループ
		} while (inputInteger != WHEN_NO && inputInteger != WHEN_YES);
		//1が入力された場合trueを、そうでなければfalseを代入
		boolean logicalValue = inputInteger == WHEN_YES ? true : false;
		//論理値を返却
		return logicalValue;

	}
	
}
