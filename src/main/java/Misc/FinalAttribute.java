package Misc;

public class FinalAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Final and Finally
		// final is keyword used to make the variable constant 
		final String webUrl="https://www.google.com";
		System.out.println(webUrl);
		//webUrl="https://www.hotmail.com";
	}

}

class FinalExampleWithMethod{
	public final void Message() { // Once you add final attribute with method then you can't override
		System.out.println("Final method message()");
	}
}
//class DemoFinal extends FinalExampleWithMethod{
//	public void Message() {
//		
//	}
//}

final class FinalAttibuteClass{
	public void add() {
		System.out.println("Add method()");
	}
}
class DemoFinalAttribute extends FinalAttribute
{
	public void add() {
		System.out.println("Add method() in DemoFinalAttribute");
	}
}
