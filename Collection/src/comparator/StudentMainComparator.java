package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class StudentMainComparator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student>al=new ArrayList<>();
		System.out.println("Enter size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter :id,name,dept,marks");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int marks=sc.nextInt();
			al.add(new Student(id,name,dept,marks));
		}
		System.out.println(al);
		
		//Collections.sort(al, new StudentDeptComparator());
		Collections.sort(al, new StudentNameComparator());
		System.out.println(al);
		
	}


}
