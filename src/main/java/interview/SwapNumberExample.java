package interview;

public class SwapNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingThirdVariable();
	}
	static void usingThirdVariable() {
		int num1=100;
		int num2=200;
		int temp;
		System.out.println(" Value of Num1 is ->"+num1);
		System.out.println(" Value of Num2 is ->"+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(" Value of Num1 is ->"+num1);
		System.out.println(" Value of Num2 is ->"+num2);
	}
	/**
	 *  Output
	 *  Value of Num1 is ->100
 		Value of Num2 is ->200
 		Value of Num1 is ->200
 		Value of Num2 is ->100
	 */

}
