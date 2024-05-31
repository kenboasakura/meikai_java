package enshu07;

//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu07_17
 *概要:	末尾側から配列要素を検索して表示
 *作成者:K.Asakura
 *作成日:2024/05/01
 */
public class enshu07_17 {
	//クラス全体にScannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	/*関数名:linearSreachR
	 *概要:逆側から線型検索を行うメソッド
	 *引数:各要素の整数、入力した探す値
	 *戻り値:インデックスにあたる数または-1
	 *作成者:K.Asakura
	 *作成日:2024/05/01
	 */
	static int linearSreachR(int[] firstArray, int keyNumber) {
		//逆から線型検索を行うための公式に使うため1を定数化
		final int REVERSE_SARCH = 1;
		//検索失敗の際の値-1を定数化
		final int SERCH_FAILURE = -1;

		//インデックスを代入するために変数に-1を代入して宣言
		int indexNumber = SERCH_FAILURE;//////
		//逆から線型検索する処理
		for (int i = firstArray.length - REVERSE_SARCH; i >= 0; i--) {
			//探す整数と一致したら実行
			if (firstArray[i] == keyNumber) {
				//そのインデックスに当たる数を代入
				indexNumber = i;
				//線型検索を終了
				break;
			}

		}
		//インデックスの数もしくは-1を返却
		return indexNumber;

	}

	/*関数名:main
	 *概要:	末尾側から配列要素を検索して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/05/01
	 */
	public static void main(String[] args) {
		//要素数を読み込むため変数を初期化して宣言
		int elementCount = 0;
		//検索失敗の際の値-1を定数化
		final int SERCH_FAILURE = -1;

		//正の整数が入力されるまで実行
		while (elementCount <= 0) {
			//要素数の入力を促す
			System.out.print("要素数:");
			//要素数を読み込む
			elementCount = standardInput.nextInt();
			//0以下の整数が入力された場合実行
			if (elementCount <= 0) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください。");
			}
		}
		//入力した整数分の要素数をもつ配列を生成
		int[] arrayValue = new int[elementCount];
		//各要素に入力した整数を代入する処理
		for (int i = 0; i < elementCount; i++) {
			//各要素の入力を促す
			System.out.print("配列a[" + i + "]:");
			//要素を読み込む
			arrayValue[i] = standardInput.nextInt();
		}
		//探す値の入力を促す
		System.out.print("探す値:");
		//探す値を読み込む
		int keyNumber = standardInput.nextInt();
		//配列から探す値に入力された整数を逆から線型検索
		int indexNumber = linearSreachR(arrayValue, keyNumber);
		//-1が返却された場合
		if (indexNumber == SERCH_FAILURE) {///////
			//値が存在しないことを表示
			System.out.println("その値の要素は存在しません。");
			//インデックスに当たる数が返却された場合
		} else {
			//その要素があるインデックスを表示
			System.out.println("その値は配列a[" + indexNumber + "]にあります。");
			
		}
	}

}
