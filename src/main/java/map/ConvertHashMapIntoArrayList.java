package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

import map.EnumInHashTableExample.Color;

public class ConvertHashMapIntoArrayList {
	public enum Color{RED,YELLOW,GREEN,BLUE}
	static Hashtable<Color,String> enumColor=new Hashtable<Color,String>();
	static Hashtable<String,String> table=new Hashtable<String,String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumHashTable();
		convertArrayList();
		convertArrayList1();
	}
	public static void enumHashTable() {
	
		enumColor.put(Color.RED, "Red Color");
		enumColor.put(Color.GREEN, "Green Color");
		enumColor.put(Color.YELLOW, "Yellow Color");
		enumColor.put(Color.BLUE, "Blue Color");
		
	
		table.put("FirstName", "Mohmmad");
		table.put("LastName","Shahnawaz");
		table.put("Email", "kazonline@gmail.com");
	}
	public static void convertArrayList() {
		Collection<String> c=enumColor.values();
		ArrayList<String> arr=new ArrayList<String>(c);
		for(String s: arr) {
			System.out.println(s);
		}
		
		}
	public static void convertArrayList1() {
		Set<String> s=table.keySet(); 
		ArrayList<String> arr=new ArrayList<String>(s);
		System.out.println(arr);
		
	}

}
