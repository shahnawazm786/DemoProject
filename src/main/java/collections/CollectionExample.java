package collections;

import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exampleArrayListUsingListInterface();
		int gt=greatestNumber();
		System.out.println("Greatest number is "+gt);
	}
	
	// List interface - interface 
	// ArrayList
	// Vector
	// Stack
	// LinkedList
	// List<T>
	public static void exampleArrayListUsingListInterface() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);//current 
		list.add(new Integer(100));//
		list .add(200);
		// to fetch data from the collection
		// Iterator interface
		Iterator itr=list.iterator();
		//hasNext() and next()
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static int greatestNumber() {
		int[] array= {16,100,45,89,34,-7,90};
		int greatest=array[0];
		for(int ctr=1;ctr<array.length;ctr++) {
		if(greatest<array[ctr]) {
			greatest=array[ctr];
		}
		}
	return greatest;	
	}

}
