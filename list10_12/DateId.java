package list10_12;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class DateId {

	private static int counter;

	private int id;

	static {
		//プログラムを実行した日付に設定されたインスタンスを生成
		GregorianCalendar todayDate = new GregorianCalendar();
		//年を表すint型のフィールドを宣言して実行時の年で初期化
		int yearNumber = todayDate.get(YEAR);
		//月を表すint型のフィールドを宣言して実行時の月で初期化
		int monthNumber = todayDate.get(MONTH) + 1;
		//日を表すint型のフィールドを宣言して実行時の日付で初期化
		int dateNumber = todayDate.get(DATE);

		counter = yearNumber * 1000000 + monthNumber * 10000 + dateNumber * 100;
	}

	public DateId (){
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
	
	
}
