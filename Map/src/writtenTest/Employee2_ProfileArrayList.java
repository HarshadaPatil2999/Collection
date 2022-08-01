package writtenTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee2_ProfileArrayList {
	public static void main(String[] args) {
		
		
			ArrayList<Employee2>al=new ArrayList<>();
			al.add(new Employee2(101,"Ramesh","HR",60000,new Profile("Maharashtra","India")));
			al.add(new Employee2(102,"Jon","HR",74000,new Profile("England","Uk")));
			al.add(new Employee2(11,"Rajesh","Sales",50000,new Profile("Gujarat","India")));
			al.add(new Employee2(1,"Jacklin","Sales",85000,new Profile("Queensland","Australia")));
			al.add(new Employee2(112,"Liu","Development",65000,new Profile("Hunan","China")));
			System.out.println(al);
			
			Collections.sort(al);
			System.out.println("After Sorting");
			System.out.println(al);
		
	}

}
