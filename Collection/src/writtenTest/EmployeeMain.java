package writtenTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Employee>ll=new LinkedList<Employee>();
	
		
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		    for(int i=0;i<size;i++)
		    {
			System.out.println("Enter id,name,dept");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			ll.add(new Employee(id,name,dept));
			}
		    
		    System.out.println(ll);
		    
			String dept=" ";
			for(int i=0;i<ll.size();i++)
			{
				if(ll.get(i).id==10)
				{
					dept=ll.get(i).dept;
				}
			}
			
			
			ListIterator<Employee>itr=ll.listIterator();
			while(itr.hasNext())
			{
				Employee e=itr.next();
				if(e.dept.equals(dept))
				{
					itr.remove();
					
				}
				
			}
			System.out.println(ll);
		
			
		
		
		
				
	}

}
