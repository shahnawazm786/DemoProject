package map;
import java.util.*;
public class EnumInHashTableExample {

	public enum Color{RED,YELLOW,GREEN,BLUE}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumHashTable();
		System.out.println("Out put of Hash Map using Enum");
		enumHashMap();
	}
	public static void enumHashTable() {
		Hashtable<Color,String> enumColor=new Hashtable<Color,String>();
		enumColor.put(Color.RED, "Red Color");
		enumColor.put(Color.GREEN, "Green Color");
		enumColor.put(Color.YELLOW, "Yellow Color");
		enumColor.put(Color.BLUE, "Blue Color");
		for(Map.Entry<Color, String> c:enumColor.entrySet()) {
			System.out.println("Keys -> "+c.getKey() +"  Value -> "+c.getValue());
		}
		
	}
	public static void enumHashMap() {
		HashMap<Color,String> enumColor=new HashMap<Color,String>();
		enumColor.put(Color.RED, "Red Color");
		enumColor.put(Color.GREEN, "Green Color");
		enumColor.put(Color.YELLOW, "Yellow Color");
		enumColor.put(Color.BLUE, "Blue Color");
		for(Map.Entry<Color, String> c:enumColor.entrySet()) {
			System.out.println("Keys -> "+c.getKey() +"  Value -> "+c.getValue());
		}
	}

}
