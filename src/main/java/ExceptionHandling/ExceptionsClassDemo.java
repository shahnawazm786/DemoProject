package ExceptionHandling;

public class ExceptionsClassDemo {

	public static void waits() throws  InterruptedException{
		System.out.println("Demo of Exception");
		Thread.sleep(2000);
		System.out.println("Thread slept for 2 second");
	}
	public static void main(String[] args) throws  InterruptedException{
		// TODO Auto-generated method stub
		waits();
	}
	

}
