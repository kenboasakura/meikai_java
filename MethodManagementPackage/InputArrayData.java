package MethodManagementPackage;

import java.util.Scanner;

public class InputArrayData {
	//Scannerクラスを設定
		static Scanner standardInput = new Scanner(System.in);

	
	static void  displayValueFactorArray (int []arrayValue) {
		
		
		for (int i = 0; i < arrayValue.length;i++) {
			System.out.println("a["+i+"]="+arrayValue[i]);
		}
		
	}
	
	static boolean isChangingFactorValue (int indexNumber, int elementNumber) {
		
		boolean ogicalValue = indexNumber < elementNumber ?true:false;
		
		return ogicalValue;
	}
	
}
