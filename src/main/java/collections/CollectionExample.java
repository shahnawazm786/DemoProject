package collections;

import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exampleArrayListUsingListInterface();
		int gt=greatestNumber();
		System.out.println("Greatest number is "+gt);
		List<Integer> lInteger=new ArrayList<Integer>();
		lInteger.add(100);
		lInteger.add(700);
		lInteger.add(500);
		lInteger.add(1000);
		lInteger.add(9900);
		lInteger.add(-100);
		lInteger.add(0);
		//gt=greatestNumber(lInteger);
		System.out.println("Greatest number is "+gt);
		exampleStack();
		exampleVector();
		linkedListExample();
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
	
	public static int greatestNumber(List<Integer> listInt) {
		int gt=listInt.indexOf(0);
		Iterator<Integer> itr=listInt.iterator();
		while(itr.hasNext()) {
			int lvariable=(Integer)itr.next();
			if(gt<lvariable) {
				gt=lvariable;
			}
		}
		return gt;
		
	}

	public static void exampleStack() {
		List<String> lStack=new Stack<String>();
		Stack<String> s=new Stack<String>();
		//ArrayList alist=new ArrayList(20);
		lStack.add("Kolkatta");
		lStack.add("Delhi");
		lStack.add("Mumbai");
		for(String s1: lStack) {
			System.out.println(s1);
		}
		// Lifo 
		s.push("Kolkatta");
		s.push("Delhi");
		s.push("Hydrabad");
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		/*Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}*/
		
		//System.out.println(s.peek());
		//System.out.println(s.peek());
	}
	
	public static void exampleVector() {
		List<Integer> lVec=new Vector<Integer>();
		lVec.add(100);
		lVec.add(200);
		lVec.add(300);
		lVec.add(400);
		Iterator<Integer> itr=lVec.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void linkedListExample() {
		List<String> lList=new LinkedList<String>();
		lList.add("Kolkatta");
		lList.add("Mumbai");
		lList.add("Delhi");
		lList.add("Patna");
		Iterator itr=lList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
