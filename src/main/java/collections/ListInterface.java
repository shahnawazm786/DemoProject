package collections;
import java.util.*;
public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListExample();
		arrayList();
		linkedListExample();
		listVector();
		listStack();
		//List linkedList=new LinkedList();
		//List vList=new Vector();
		//List lStatck=new Stack();
		dQueueExample();
		dQueueArray();
		hashSetExample();
		linedHashSetExample();
		mapExample();
		hashMapExample();
		liknedHashMapExample();

	}
	public static void arrayListExample() {
		List<String> aList=new ArrayList<String>();
		aList.add("Delhi");
		aList.add("Kolkatta");
		aList.add("Chennai");
		aList.add("Mumbai");
		aList.add("Patna");
		Iterator<String> itr=aList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void arrayList() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Delhi");
		list.add("Kolkatta");
		list.add("Chennai");
		list.add("Mumbai");
		list.add("Patna");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void linkedListExample() {
		List<String> linkedList=new LinkedList<String>();
		linkedList.add("Hello");
		linkedList.add("Java");
		linkedList.add("Example");
		linkedList.add("Oracle");
		linkedList.add("Operating System");
		linkedList.add("C#");
		Iterator<String> itr=linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	public static void listVector() {
		List<String> vList=new Vector<String>();
		vList.add("Hello");
		vList.add("Java");
		vList.add("Example");
		vList.add("Practice");
		Iterator<String> itr=vList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void listStack() {
		List<String> lStack=new Stack<String>();
		lStack.add("Hello");
		lStack.add("Java");
		lStack.add("Example");
		lStack.add("Example");
		Iterator itr=lStack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		Stack<String> stack=new Stack<String>();
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");
		stack.push("Five");
		Iterator itr1=stack.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
	public static void dQueueExample() {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Arman");  
		queue.add("Shahnawaz");  
		queue.add("Mohammad");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  
	public static void dQueueArray() {
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Shahnawaz");  
		deque.add("Mohammad");  
		deque.add("Nawaj");  
		//Traversing elements  
		for (String str : deque) {  
			System.out.println(str);  
		}  
	}
	public static void hashSetExample() {
		HashSet<String> set=new HashSet<String>();  
		set.add("Mohammad");  
		set.add("Shah");  
		set.add("Nawaj");  
		set.add("Abdul Rahman");  
		set.add("Mohammad");
		set.add(null);
		set.add("Mohammad1");
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}
	public static void linedHashSetExample() {
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Mohammad");  
		set.add("Shah");  
		set.add("Nawaz");  
		set.add("Mohammad");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}
	public static void treeSetExample() {
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Mohammad");  
		set.add("Shah");  
		set.add("Nawaj");  
		set.add("Mohammad");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}
	public static void mapExample() {
		Map<String, Integer> hm
		= new HashMap<String, Integer>();

		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> me :
			hm.entrySet()) {

			// Printing keys
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}
	public static void hashMapExample() {
		Map<String, Integer> map = new HashMap<String,Integer>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Iterating over Map
		for (Map.Entry<String, Integer> e : map.entrySet())
		{
			// Printing key-value pairs
			System.out.println(e.getKey() + " "
					+ e.getValue());
		}
	}

	public static void liknedHashMapExample() {
		Map<String, Integer> map = new LinkedHashMap<String,Integer>();

		// Inserting pair entries in above Map
		// using put() method
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Iterating over Map
		for (Map.Entry<String, Integer> e : map.entrySet())
		{
			// Printing ket-value pairs
			System.out.println(e.getKey() + " "
					+ e.getValue());
		}
	}
}


