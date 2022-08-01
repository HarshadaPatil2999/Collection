package comparator;

import java.util.Comparator;

public class StudentDeptComparator implements Comparator<Student> {
	
	public int compare(Student s1,Student s2)
	{
		if(s1.dept.equals(s2.dept))
		{//return s1.id-s2.id;
			if(s1.marks<s2.marks)
				return -1;
			else if(s1.marks>s2.marks)
			return 1;
			else
				//return 0;
				return s1.name.compareTo(s2.name);
		}
		
		else
			return s1.dept.compareTo(s2.dept);
		
	}

}
