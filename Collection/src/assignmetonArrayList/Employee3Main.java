package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Employee3Main {
	public static void main(String[] args) {
		ArrayList<Employee3>al=new ArrayList<>();
		al.add(new Employee3(101,"Ram","HR",67000));
		al.add(new Employee3(11,"Anuj","Sales",63000));
		al.add(new Employee3(121,"Kiran","HR",56000));
		al.add(new Employee3(12,"Anuja","Marketing",50000));
		al.add(new Employee3(1,"Sameer","HR",70000));
		al.add(new Employee3(14,"Piya","Marketing",63000));
		System.out.println(al);
		Collections.sort(al);
		System.out.println("------------After Sorting Employee ArrayList------------");
		System.out.println(al);
	}

}
