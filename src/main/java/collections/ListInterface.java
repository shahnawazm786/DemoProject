package collections;
import java.util.*;
public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListExample();
		List linkedList=new LinkedList();
		List vList=new Vector();
		List lStatck=new Stack();
		
		
	}
	public static void arrayListExample() {
		List aList=new ArrayList();
		aList.add("Delhi");
		aList.add("Kolkatta");
		aList.add("Chennai");
		aList.add("Mumbai");
		aList.add("Patna");
		Iterator itr=aList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
