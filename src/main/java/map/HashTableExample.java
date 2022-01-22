package map;
import java.util.*;
//Map key value pair data set <Key,Value>
//Key - Uniquely indentity
//Value - Duplicate allow
//Null value and Null Key 
//enterySet() - fetch record

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashTable();
	}
	public static void hashTable() {
		Hashtable<String,String> table=new Hashtable<String,String>();
		table.put("FirstName", "Mohmmad");
		table.put("LastName","Shahnawaz");
		table.put("Email", "kazonline@gmail.com");
		
		// Add duplicate key
		table.put("FirstName", "Mohammad1");
		
		// Add duplicate value
		table.put("FirstName1", "Mohammad");
		
		// Add null into the key
		//table.put(null, "99900"); // HashTable is not allowed any null key
		
		// Add null into the value
		//table.put("Phone", null); // HashTable is not allowed any null value as well
		
		// Data fetch
		for(Map.Entry<String, String> tb:table.entrySet()) {
			System.out.println("Key -> "+tb.getKey() + "  Value -> "+tb.getValue());
		}

	}
}
