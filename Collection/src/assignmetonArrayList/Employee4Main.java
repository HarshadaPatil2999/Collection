package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Employee4Main {
	public static void main(String[] args) {
		
		ArrayList<Employee4>al=new ArrayList<>();
		al.add(new Employee4(101,"Mayur","HR",67000));
		al.add(new Employee4(11,"Anuja","Sales",63000));
		al.add(new Employee4(121,"Kiran","HR",56000));
		al.add(new Employee4(12,"Meenal","Development",80000));
		al.add(new Employee4(1,"Sameer","HR",70000));
		al.add(new Employee4(14,"Pankaj","Marketing",63000));
		System.out.println(al);
		Collections.sort(al,new DeptComparator() );
		System.out.println("------------After Sorting Employee ArrayList------------");
		System.out.println(al);
	}

}
