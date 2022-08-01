package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable {
	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList<>();
		al.add(new Employee(101,"Raj","HR",60000));
		al.add(new Employee(67,"Swati","IT",50000));
		al.add(new Employee(1,"Anjali","HR",60000));
		al.add(new Employee(105,"Meera","Account",80000));
		al.add(new Employee(150,"Monan","Sales",70000));
		al.add(new Employee(10,"Ravina","IT",70000));
		al.add(new Employee(11,"Rajesh","HR",80000));
		al.add(new Employee(112,"Pooja","Sales",40000));
		al.add(new Employee(103,"Meenal","HR",30000));
		System.out.println(al);
		//Collections.sort(al);//for user defined class we can not sort directly.1st we implement the Comparable interface with that class
		                          //and create a int type method of compare to with class object ref.
		
		Collections.sort(al);
		//Collections.reverse(al);
		System.out.println(al);
	}

}
