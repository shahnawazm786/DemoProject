package Misc;

public class OverloadingandOVerrriding {

	// OVerriding concept is run time polymorphism
	// Overloading concept is compile polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimePolyMorph morph=new RuntimePolyMorph();
		System.out.println(morph.add(100.99, 300.99));
		System.out.println(morph.add(100.99, 300.99,89.999));
	}

}
