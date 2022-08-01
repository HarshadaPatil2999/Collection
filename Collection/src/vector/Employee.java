package vector;

import java.util.Iterator;
import java.util.Vector;

public class Employee {
	
	int id,salary;
	String name,dept;
	Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}
	
	public static void main(String[] args) {
		Vector<Employee> v=new Vector<>();
		System.out.println(v.capacity());
		v.add(new Employee(101,"Raj","HR",20000));
		v.add(new Employee(123,"Ram","Sales",5000));
		v.add(new Employee(114,"Rajesh","HR",15000));
		v.add(new Employee(145,"Anjali","HR",10000));
		v.add(new Employee(19,"Sonali","Sales",4000));
		v.add(new Employee(1,"Swapnil","Production",3000));
		System.out.println(v);
		
		
		
		Iterator<Employee> itr=v.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			if(e.salary<5000)
				itr.remove();
			
		}
		System.out.println(v);
		
		
	}

}
