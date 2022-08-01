package comparable;

public class Employee implements Comparable<Employee> {
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
		/*
		 * if(this.id<e.id) return -1; else if(this.id>e.id) return 1; else return 0;//for Ascending order id
		 */
//		if(this.id<e.id) return 1;
//		else if(this.id>e.id) return -1; //for Descending order id
//		else return 0;
		
//		if(this.salary<e.salary)
//			return -1;
//		else if(this.salary>e.salary)
//			return 1;
//		else
			
	//return this.name.compareTo(e.name);
		//return 0;
		
		
		if(this.salary<e.salary)
			return -1;
		else if(this.salary>e.salary)
			return 1;
		
		else
//			if(this.id<e.id) 
//				return -1; 
//			else if(this.id>e.id) 
//				return 1;
//			else
		  return this.name.compareTo(e.name);
		
		
	}
	
	
}
