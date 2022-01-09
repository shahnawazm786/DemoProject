package Misc;

public class DemoFinallyArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=0,c;
		try {
			System.out.println("Try block");
			c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException ae) {
			System.out.println("Exception Occured");
			ae.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block executed");
		}

	}

}
