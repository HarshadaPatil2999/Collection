package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Student2Main {
	public static void main(String[] args) {
		ArrayList<Student2>al=new ArrayList<>();
		al.add(new Student2(101,"Raj",89));
		al.add(new Student2(10,"Ram",56));
		al.add(new Student2(1,"Anjali",69));
		al.add(new Student2(14,"Sonal",74));
		al.add(new Student2(11,"Kiran",67));
		System.out.println(al);
		System.out.println("-----------After Sorting---------");
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
