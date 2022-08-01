package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Employee2Main {
	public static void main(String[] args) {
		ArrayList<Employee2>al=new ArrayList<>();
		al.add(new Employee2(101,"Riya",60000,new Department2("HR")));
		al.add(new Employee2(103,"Raj",65000,new Department2("Sales")));
		al.add(new Employee2(11,"Swapnil",70000,new Department2("Development")));
		al.add(new Employee2(14,"Pranjali",68000,new Department2("Development")));
		al.add(new Employee2(101,"Meenal",50000,new Department2("HR")));
		
		System.out.println(al);
		ArrayList<Employee2>al2=new ArrayList<>();
		al2.add(new Employee2(1,"Swarupa",63000,new Department2("Marketing")));
		al2.add(new Employee2(3,"Rajesh",70000,new Department2("Sales")));
		al2.add(new Employee2(2,"Swapnali",59000,new Department2("Development")));
//		al2.add(new Employee2(8,"Prajwal",67000,new Department2("Development")));
//		al2.add(new Employee2(10,"Manisha",34000,new Department2("HR")));
		System.out.println(al2);
		
		Collections.copy(al, al2);
		System.out.println(al);
	}

}
