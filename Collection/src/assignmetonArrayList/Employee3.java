package assignmetonArrayList;

public class Employee3 implements Comparable<Employee3>{
	int id,salary;
	String name,dept;
	Employee3(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
public String toString() {
	return id+" "+name+" "+dept+" "+salary;
}
public int compareTo(Employee3 e)
{
	return this.name.compareTo(e.name);
	
}
}
