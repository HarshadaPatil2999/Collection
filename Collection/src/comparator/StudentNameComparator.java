package comparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
	
	
	public int compare(Student s1,Student s2)
	{
		if(s1.name.equals(s2.name))
		  return s1.id-s2.id;
			//return s1.marks-s2.marks;
		else
			return s1.name.compareTo(s2.name);
	}

}
