package assignmetonArrayList;

import java.util.ArrayList;

public class HetrogeniousArrayList {
	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList();//we can added any type of object inside the list.
	al.add(40);
	al.add(2.5d);
	al.add(40);
	al.add("riya");
	al.add("raj");
	al.add(3.25);
	al.add(1.2f);
	al.add(34.98);
	al.add(45);
	al.add(5.5f);
	al.add(new Student(101,"Ram"));
	al.add(new Student(103,"Meera"));
	System.out.println(al);

}
}

class Student{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public String toString()
	{
		return id+" "+name;
	}
}