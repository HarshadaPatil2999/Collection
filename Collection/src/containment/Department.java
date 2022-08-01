package containment;

import java.util.ArrayList;

public class Department {
	int id;
	String dname;
	ArrayList<Employee>emp;

	Department(int id,String dname,ArrayList<Employee>emp)
	{
		this.id=id;
		this.dname=dname;
		this.emp=emp;
	}
	
	public String toString()
	{
		return id+" "+dname+" "+emp;
	}
	
}
class Employee{
	int eid,salary;
	String name;
	
	Employee(int eid,String name,int salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		
	}
	public String toString()
	{
		return eid+" "+name+" "+salary;
	}
	
}