package hashMap;

import java.util.HashMap;

public class Employee2Main {
	public static void main(String[] args) {
		
		HashMap<Employee2,Integer>hm=new HashMap<>();
		hm.put(new Employee2(101,"Raj","HR"), 60000);
		hm.put(new Employee2(102,"Rajesh","Sales"), 65000);
		hm.put(new Employee2(104,"Anjali","HR"), 55000);
		hm.put(new Employee2(105,"Meenal","Sales"), 70000);
		hm.put(new Employee2(104,"Anjali","HR"), 55000);
		hm.put(new Employee2(105,"Meera","Sales"), 60000);
		
		
		System.out.println(hm);
	}

}
