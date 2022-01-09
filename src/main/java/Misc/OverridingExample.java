package Misc;

public class OverridingExample {
	public double add(int x,int y) {
		return x+y;
	}

	
}
class BaseOVerridingClass extends OverridingExample{
	public double add(int x,int y,double z) {
		return x+y+z;
	}
}

class ParentOVerride{
	public void message() {
		System.out.println("MEssage from Parent class -> message()");
	}
}
class BaseClassOVer extends ParentOVerride{
	public void message() {
		System.out.println("MEssage from child class -> message()");
	}	
}
