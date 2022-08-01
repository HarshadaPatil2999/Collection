package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Employee5MainArrayList {
public static void main(String[] args) {
	ArrayList<Employee5>al=new ArrayList<>();
	
	al.add(new Employee5(101,"Mayur","HR",67000));
	al.add(new Employee5(11,"Anuja","Sales",63000));
	al.add(new Employee5(121,"Kiran","HR",56000));
	al.add(new Employee5(12,"Meenal","Development",80000));
	al.add(new Employee5(1,"Sameer","HR",80000));
	al.add(new Employee5(14,"Pankaj","Marketing",63000));
	System.out.println(al);
	Collections.sort(al);
	
	System.out.println("------------After Sorting Employee ArrayList------------");
	System.out.println(al);
}
}
