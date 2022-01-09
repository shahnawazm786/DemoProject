package Misc;

public class RuntimePolyMorph {
	// polymorphism is concept to allow language to create more than one method 
	// parameters
	// attribute of the parameters
	// number of parameter
	
	public double add(float x,double y) {
		return x+y;
	}
	public double add( double x,double y) {
		return x+y;
	}
	public double add( double x,double y,double z) {
		return x+y+z;
	}

}
