package ExceptionHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

	public static void ThrowsExample() {
		int a=100,b=0,c;
		if(b==0) {
			throw new ArithmeticException("B is zero");
		}
	}

	public static void ThrowsCheckedException() throws IOException{

		BufferedWriter bw=new BufferedWriter(new FileWriter("src/test/resources/Drivers/my.txt"));
		bw.write("Hello");
		bw.write("Dear I am java programming");
		bw.close();

	}
	/*public static void ThrowCheckedException() {
		int a=100;
		if(a==100) 
			throw new IOException("Checked Exception");
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Try catch example");
		Waits();
		System.out.println("After 3 seconds - message displayed");
		//NumberDivideByZeroException();
		//ThrowsExample();
		/*		try{
		ThrowCheckedException();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
		 */	
	}	

}
