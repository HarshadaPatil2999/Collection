package genericCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Student2ArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Student2>s1=new ArrayList<>();
		
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter id,name,dept");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			
			 ArrayList<Integer>a=new ArrayList<>();
			 for(int j=0;j<5;j++)
			 {
				 System.out.println("Enter marks");
				 int m=sc.nextInt();
				 a.add(m);
				 
			 }
			 
			 s1.add(new Student2(id,name,dept,a));
			 
	}	
		
			for(Student2 s:s1)
			{
				System.out.println(s);
			}
			
		
		
		
		
	}

}
