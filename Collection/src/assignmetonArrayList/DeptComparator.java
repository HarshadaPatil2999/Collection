package assignmetonArrayList;

import java.util.Comparator;

public class DeptComparator implements Comparator<Employee4>{

	
	public int compare(Employee4 e1,Employee4 e2)
	{
		if(e1.dept.equals(e2.dept))
			return e1.id-e2.id;
		else
			return e1.dept.compareTo(e2.dept);
	}
}
