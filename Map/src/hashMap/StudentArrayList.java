package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<>();
		al.add(new Student(101,"Raj","Comp",76));
		al.add(new Student(102,"Ram","Comp",66));
		al.add(new Student(104,"Rajesh","Comp",86));
		al.add(new Student(11,"Piya","Elect",76));
		al.add(new Student(12,"Meena","Elect",86));
		al.add(new Student(16,"Anjali","Comp",86));
		al.add(new Student(18,"Keshma","Elect",56));
		al.add(new Student(1,"Swaranjali","IT",77));
		al.add(new Student(2,"Meghana","IT",76));
		al.add(new Student(45,"Rakesh","Mech",69));
		al.add(new Student(10,"Rupali","Entc",78));
		al.add(new Student(22,"Kavita","Entc",76));
		al.add(new Student(25,"Radhika","Civil",70));
		
		HashMap<String,Integer>hm=new HashMap<>();
		
		for(Student s:al)
		{
			if(hm.containsKey(s.dept))
			{
				int i=hm.get(s.dept)+1;
				hm.put(s.dept, i);
			}
			else
				hm.put(s.dept, 1);
		}
		System.out.println(hm);
		
	}

}
