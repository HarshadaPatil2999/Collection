package writtenTest;

public class Employee implements Comparable<Employee> 
{
	int id,salary;
	String name,dept;
	
	Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}
	public int compareTo(Employee e)
	{
		if(this.name.equals(e.name))
		return this.id-e.id;
		else
			return this.name.compareTo(e.name);
	}

}
