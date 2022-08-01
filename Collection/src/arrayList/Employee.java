package arrayList;

public class Employee {
	int id,salary;
	String name;
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

}
