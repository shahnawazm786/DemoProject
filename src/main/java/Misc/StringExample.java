package Misc;

public class StringExample {

	public static void main(String[] args) {
		String name="Java Program";
		System.out.println(name);
		name=name+" From India"; // name=new String("From India"); 
		System.out.println(name);
		StringBuilder sb=new StringBuilder();
		sb.append("name");
		sb.append("java");
		sb.append("India");
		System.out.println(sb.toString());
		

	}

}
