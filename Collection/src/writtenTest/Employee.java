package writtenTest;

import java.util.LinkedList;

public class Employee {
	int id;
	String name,dept;
	
	
	Employee(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
public String toString() 
{
	return id+" "+name+" "+dept;
}

}

	
