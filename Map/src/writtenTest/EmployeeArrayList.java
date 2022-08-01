package writtenTest;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList<>();
		al.add(new Employee(101,"Ramesh","HR",60000));
		al.add(new Employee(102,"Anjali","HR",64000));
		al.add(new Employee(11,"Rajesh","Sales",50000));
		al.add(new Employee(1,"Anjali","Sales",62000));
		al.add(new Employee(112,"Rajesh","Development",65000));
		
		Collections.sort(al);
		System.out.println(al);
		
	}

}
