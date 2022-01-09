package Misc;

public class DemoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exception 
		// throw , throws and try catch , finally
		// Garbage collection 
		FinallyClass fc=null;
		try {
		fc=new FinallyClass();
		fc.showMessage();
		fc=null;// disposing the object
		System.out.println("Statement in try block");
		}catch(Exception ex) {
			fc.showMessage();
			System.out.println("Statement in catch block");
		}
		finally {
			fc=null;
			System.out.println("Executing at the last");
			fc.showMessage();
		}
		
		
	}

}

 class FinallyClass
{
	void showMessage() {
		System.out.println("Java Finally");
		System.out.println("Java Finally");
		System.out.println("Java Finally");
		System.out.println("Java Finally");
		System.out.println("Java Finally");
		System.out.println("Java Finally");
		System.out.println("Java Finally");
	}
}
