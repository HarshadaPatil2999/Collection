package arrayList;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList<>();
		al.add(new Employee(101,"Raj",40000));
		al.add(new Employee(111,"Sachin",30000));
		al.add(new Employee(11,"Meenal",5000));
		al.add(new Employee(113,"Sachin",15000));
		al.add(new Employee(1,"Rajesh",20000));
		al.add(new Employee(123,"Anjali",25000));
		al.add(new Employee(156,"Somesh",10000));
		System.out.println(al);
		int max=0;
		String name=" ";
		int id=0;
		for(Employee e:al)
		{
//			if(e.salary>10000)
//			{
//				System.out.println(e);
//			}
//			 if(e.name.equals("Sachin"))
//				{
//					System.out.println(e);
//				}
			if(max<e.salary)
			{
				max=e.salary;
				name=e.name;
				id=e.id;
			}
			
		}
		System.out.println(id+" "+name+" "+max);
		
	}

}
