package assignmetonArrayList;

public class Employee {
	int id,salary;
	String name;
	Department d;
	Employee(int id,String name,int salary,Department d)
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


class Department{
	
	String dname;
	Department(String dname)
	{
		this.dname=dname;
	}
	public String toString()
	{
		return dname;
	}
}