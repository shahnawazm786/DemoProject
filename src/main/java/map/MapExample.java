package map;

import java.util.HashMap;
import java.util.Map;


// Map key value pair data set <Key,Value>
// Key - Uniquely indentity
// Value - Duplicate allow
// Null value and Null Key 
// enterySet() - fetch record
// not synchronized
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMap();
	}
	// not in ordered
	public static void hashMap() {
	HashMap<String,String> data=new HashMap<String,String>();
	data.put("FirstName", "Mohmmad");
	data.put("LastName","Shahnawaz");
	data.put("Email", "kazonline@gmail.com");
	// Add null key into hashMap
	data.put(null, "Delhi");
	data.put(null, "Shaheen Bagh");
	//Add null value
	data.put("Location", null);
	data.put("Pin", null);
	
	// Add duplicate key
	data.put("Phone", "123456789");
	data.put("Phone", "9999999999");
	
	// Add duplicate value
	data.put("Mobile", "9999");
	data.put("Mobile1", "9999");
	//fetch data
	for(Map.Entry<String,String> m:data.entrySet()) {
		System.out.println("Key -> "+m.getKey()+"    Value ->"+m.getValue() ); // Show key
		//System.out.println(m.getValue());
	}
	}
	/*
	# FirstName - Mohmmad
	# LastName -Shahnawaz
	#Emal - kazonline@gmail.com
*/
}
