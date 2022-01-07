package ExceptionHandling;

public class ExceptionClassDemo1 {

	public static void  Waits() {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	public static void NumberDivideByZeroException() {
		int a=100,b=0,c;
		try{
		c=a/b;}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Try catch example");
		Waits();
		System.out.println("After 3 seconds - message displayed");
		NumberDivideByZeroException();
	}
	
}
