package assignmetonArrayList;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList<>();
		al.add(new Employee(101,"Riya",60000,new Department("HR")));
		al.add(new Employee(103,"Raj",65000,new Department("Sales")));
		al.add(new Employee(11,"Swapnil",70000,new Department("Development")));
		al.add(new Employee(14,"Pranjali",68000,new Department("Development")));
		al.add(new Employee(101,"Meenal",50000,new Department("HR")));
		System.out.println(al);
		
	}

}
