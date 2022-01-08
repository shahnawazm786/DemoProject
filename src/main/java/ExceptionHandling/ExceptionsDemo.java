package ExceptionHandling;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		System.out.println(100+200);
		System.out.println(100>50);
		System.out.println(200<60);
		System.out.println(3000/100);
		System.out.println(2000%7);
		System.out.println("Line 13");
		System.out.println("Line 14");
		System.out.println("Line 15");
		String name=null;
		System.out.println(name.length()); // line 17 occured Exception 
		System.out.println("Line 18");
		System.out.println("Line 19");

	}
	// Type of Exception in Java
	// Checked Exception -> Compile time error
	// Unchecked Exception -> Runtime 
	// Error -> Compile time 

}
