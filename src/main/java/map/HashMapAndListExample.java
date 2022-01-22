package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapAndListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapAndList();
	}
	public static void hashMapAndList() {
		HashMap<Integer,List<String>> map=new HashMap<Integer,List<String>>();
		List<String> data=new ArrayList<String>();
		data.add("Kolkatta");
		data.add("Mumbai");
		data.add("Delhi");
		data.add("Chennai");
		map.put(1, data);
		data=new ArrayList<String>();
		data.add("West Bengal");
		data.add("Maharashtra");
		data.add("New Delhi");
		data.add("Tamilnaddu");
		map.put(2, data);
		for(Map.Entry<Integer, List<String>> m:map.entrySet()) {
			System.out.print("Key -> " +m.getKey());
			System.out.print("   Value -> "+m.getValue());
			System.out.println();
		}
	}

}
