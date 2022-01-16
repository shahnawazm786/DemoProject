package collections;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomeClassListExample ce=new CustomeClassListExample();
		ce.empno=100;
		ce.ename="Stevene";
		ce.salary=28900.99f;
		CustomeClassListExample ce1=new CustomeClassListExample(); 
		ce1.empno=101;
		ce1.ename="John";
		ce1.salary=6000.99f;
		List<CustomeClassListExample> employeeList=new ArrayList<CustomeClassListExample>();
		employeeList.add(ce1);
		employeeList.add(ce);
		for(CustomeClassListExample c:employeeList) {
			System.out.println(c.empno);
			System.out.println(c.ename);
			System.out.println(c.salary);
		}
	}

}
