package writtenTest;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<>();
		al.add(new Student(101,"Pooja",12));
		al.add(new Student(11,"Kiran",18));
		al.add(new Student(4,"Anuja",20));
		al.add(new Student(1,"Shweta",11));
		al.add(new Student(16,"Sushama",16));
		al.add(new Student(23,"Ira",13));
		
		Collections.sort(al, new SortingWithRoll_noComarator());
		System.out.println(al);
		Collections.sort(al, new SortingWithNameComparator());
		System.out.println(al);
		Collections.sort(al, new SortingWithAgeComparator());
		System.out.println(al);
		
	}

}
