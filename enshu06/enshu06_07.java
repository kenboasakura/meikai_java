package enshu06;

//Randomクラスの呼び出し
import java.util.Random;
//Scannerクラスの呼び出し
import java.util.Scanner;

/*クラス名:enshu06_07
 *概要:探索するキー値と同じ値の要素が複数存在する場合最も末尾に位置する要素を探索するテキスト
 **作成者:K.Asakura
 *作成日:2024/04/17
 */
public class enshu06_07 {

	/*関数名:main
	 *概要:探索するキー値と同じ値の要素が複数存在する場合最も末尾に位置する要素を探索するテキスト
	 *引数:なし
	 *戻り値:なし
	 *作成者:K.Asakura
	 *作成日:2024/04/17
	 */
	public static void main(String[] args) {
		//Randomクラスを設定
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定
		Scanner standarddInput = new Scanner(System.in);

		//要素数を宣言するため12を定数化
		final int ELEMENT_COUNT = 12;
		//乱数の範囲を宣言するために10を定数化
		final int RANDOM_RANGE = 10;
		//逆から線型検索を行うための公式に使うため1を定数化
		final int REVERSE_SARCH = 1;
		//配列を宣言
		int[] scoreNumber = new int[ELEMENT_COUNT];

		//要素数分ループして実行
		for (int j = 0; j < ELEMENT_COUNT; j++) {
			//各要素ごとに乱数を生成
			scoreNumber[j] = randomNumber.nextInt(RANDOM_RANGE);
		}

		//配列aの初期化子の前段階を表示
		System.out.print("配列aの全要素の値\n{");
		//要素数分ループして実行
		for (int j = 0; j < ELEMENT_COUNT; j++) {
			//各要素の乱数を表示
			System.out.print(scoreNumber[j] + " ");
		}
		//配列aの初期化子の後段階を表示
		System.out.println("}");
		
		//探索に使う変数を初期化して宣言
		int keyNumber = 0;

		//0未満10以上の整数の限り実行
		do {
			//探す数値の入力を促す
			System.out.print("探す数値:");
			//整数を読み込む
			keyNumber = standarddInput.nextInt();
			//0未満10以上の整数の場合実行
			if (keyNumber < 0 || keyNumber > 9) {
				//正しい値の入力を促す
				System.out.println("正しい値を入力してください");
			}

			//0未満10以上の整数の限りループ
		} while (keyNumber < 0 || keyNumber > 9);

		//for分線型検索を行うための変数iを初期化して宣言
		int i = 0;
		//逆側から線型検索
		for (i = ELEMENT_COUNT - REVERSE_SARCH; i >= 0; i--) {

			//探す整数と一致したら実行
			if (scoreNumber[i] == keyNumber) {
				//線型検索を終了
				break;
			}

		}
		//数字が見つかった場合実行
		if (i >= 0) {
			//その数字の場所を表示
			System.out.println("それはscoreNumber[" + i + "]にあります。");
			//数字が見つからなかった場合
		} else {
			//見つからなかったことを表示
			System.out.println("それはありません。");
		}

	}

}
