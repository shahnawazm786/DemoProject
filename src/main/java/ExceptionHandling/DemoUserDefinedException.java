package ExceptionHandling;

public class DemoUserDefinedException {

	public static void main(String[] args) throws UserDefineException {
		// TODO Auto-generated method stub
		int age=10;
		if(age<18) {
			throw new UserDefineException("Age is less than 18 years");
		}
	}

}
