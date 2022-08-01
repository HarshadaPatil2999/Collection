package demo;

import java.util.Comparator;

public class DeptComparator implements Comparator<Employee> {

	public int compare(Employee e1,Employee e2)
	{
		if(e1.dept.equals(e2.dept))
			return e1.id-e2.id;
		else
			return e1.dept.compareTo(e2.dept);
	}
}
