package hashMap;

public class Employee2 {
	int id;
	String name,dept;
	Employee2(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+name+" "+dept;
	}
	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		Employee2 e=(Employee2)o;
		if(this.id==e.id)
			return true;
		else
			return false;
	}

}
