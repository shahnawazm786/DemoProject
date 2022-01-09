package Misc;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingExample oe=new OverridingExample();
		BaseOVerridingClass ob=new BaseOVerridingClass();
		//oe.add(100, 200);
		System.out.println(ob.add(100,200));
		System.out.println(ob.add(100, 200, 300.99));
		ParentOVerride pc=new ParentOVerride();
		BaseClassOVer bc=new BaseClassOVer();
		pc.message(); // parent message() method
		bc.message(); // in the class message() method is overriding
		FinalAttibuteClass fin=new FinalAttibuteClass();
		fin.add();
		//DemoFinalAttribute fi=new DemoFinalAttribute();
		//fi.add();
		FinalAttibuteClass fa=new FinalAttibuteClass();
		fa.add();
	}

}
