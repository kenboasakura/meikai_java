package MethodManagementPackage;

import java.util.Scanner;

import enshu10_04.Day;

public class MethodManagementClass {
	//Scannerクラスを設定
	static Scanner standardInput = new Scanner(System.in);

	public static void main(String[] args) {
		//日付2の入力を促す文字列を表示
		System.out.println("日付2の年、月、日を入力してください");
		//年の入力を促す
		System.out.print("年:");
		//日付の年を読み込んで代入
		int secondYearNumber = standardInput.nextInt();
		//月の入力を促す
		System.out.print("月:");
		//日付の月を読み込んで代入
		int secondMonthNumber = standardInput.nextInt();
		//日の入力を促す
		System.out.print("日:");
		//メソッドを呼び出して日付の日を読み込んで代入
		int secondDateNumber = standardInput.nextInt();
		//日付2のデータを格納したインスタンスの生成
		Day secondDayInstance = new Day(secondYearNumber, secondMonthNumber, secondDateNumber);
	}
}
