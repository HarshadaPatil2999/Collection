package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainmentStudent3UserInput {
	public static void main(String[] args) {
		
		ArrayList<Student3>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter :id,name,dept");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			
			ArrayList<Integer>s1=new ArrayList<>();
			for(int j=0;j<5;j++)
			{
				System.out.println("Enter marks");
				int m=sc.nextInt();
				s1.add(m);
			}
			al.add(new Student3(id,name,dept,s1));
		}
		
		for(Student3 s:al)
		{
			System.out.println(s);
		}
//		for(Student3 s:al)
//		{
//			int sum=0;
//			for(Integer i:s.marks)
//			{
//				sum+=i;
//			}
//			double percentage=sum/s.marks.size();
//			if(percentage>60)
//			System.out.println(s.id+" "+s.name+" "+s.dept+" "+percentage);
//		}
	}

}
