package demo;

import java.util.TreeSet;

public class EmployeeMain {
	static void traverseSet(TreeSet<Employee>ts)
	{
		for(Employee e:ts)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		TreeSet<Employee>ts=new TreeSet<>(new DeptComparator());
		ts.add(new Employee(103,"Meera","HR",65000));
		ts.add(new Employee(10,"Neha","IT",55000));
		ts.add(new Employee(13,"Meghana","HR",68000));
		ts.add(new Employee(55,"Anjali","Sales",45000));
		ts.add(new Employee(41,"Komal","Sales",55000));
		ts.add(new Employee(12,"Mohan","HR",60000));
		//System.out.println(ts);
		traverseSet(ts);
	
	}

}
