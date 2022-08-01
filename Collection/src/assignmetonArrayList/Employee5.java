package assignmetonArrayList;

public class Employee5 implements Comparable<Employee5> {
	int id,salary;
	String name,dept;
	Employee5(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
public String toString() {
	return id+" "+name+" "+dept+" "+salary;
}
public int compareTo(Employee5 e)
{
	if(this.salary<e.salary)
		return -1;
	else if(this.salary>e.salary)
		return 1;
	else
		 this.name.compareTo(e.name);
	        return -1;
}

}
