package assignmetonArrayList;

import java.util.ArrayList;

public class Employee2 {
	int id,salary;
	String name;
	Department2 d;
	Employee2(int id,String name,int salary,Department2 d )
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.d=d;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+" "+d;
	}

}


class Department2{
	
	String dname;
	Department2(String dname)
	{
		this.dname=dname;
	}
	public String toString()
	{
		return dname;
	}

}
