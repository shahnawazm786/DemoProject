package ExceptionHandling;

public class HandleUserDefined {

	
	
	public static void main(String[] args) //throws AgeException {
	{
		// TODO Auto-generated method stub
//		int age=14;
//		if(age<18) {
//			throw new AgeException("You are under age for this marraige program");
//		}
		usingTryCatch();
	}
	
	public static void usingTryCatch() {
		int age=15;
		try {
			if(age<18) {
				throw new AgeException("Below Age");
			}
			else {
				System.out.println("You are eligible for voting");
			}
		}catch(AgeException ae) {
			ae.printStackTrace();
		}
	}

}
