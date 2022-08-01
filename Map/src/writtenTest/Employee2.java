package writtenTest;

import java.util.ArrayList;

public class Employee2 implements Comparable<Employee2> {
	int id,salary;
	String name,dept;
	Profile pr;
	Employee2(int id,String name,String dept,int salary,Profile pr )
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.pr=pr;
		
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary+" "+pr;
	}
	
	public int compareTo(Employee2 e)
	{
		if(this.pr.country.equals(e.pr.country))
			return this.pr.state.compareTo(e.pr.state);
		else
		return this.pr.country.compareTo(e.pr.country);
		
	}


}
