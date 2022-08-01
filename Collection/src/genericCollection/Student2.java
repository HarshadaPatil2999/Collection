package genericCollection;

import java.util.ArrayList;

public class Student2 {
	int id,mark;
	String name,dept;
	ArrayList<Integer>marks;
	Student2(int id,String name,String dept,ArrayList<Integer>marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	
public String toString()
{
	return id+" "+name+" "+dept+" "+marks;
}

}
