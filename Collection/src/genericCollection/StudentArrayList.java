package genericCollection;

import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<>();
		
		al.add(new Student(101,"riya","elect",67));
		al.add(new Student(102,"raj","entc",70));
		al.add(new Student(103,"piya","computer",67));
		al.add(new Student(104,"rohan","computer",77));
		al.add(new Student(105,"meera","elect",60));
		al.add(new Student(106,"minal","computer",60));
		al.add(new Student(101,"priya","elect",63));
		//System.out.println(al);
//		for(Student s:al)
//		{
//			System.out.println(s);
//		}
		for(Student s:al)
		{if(s.dept.equals("computer") && s.mark>60)
			System.out.println(s);
		}
	}

}
