package writtenTest;

import java.util.Comparator;

public class Student  {
	int roll_no,age;
	String name;
	
	Student(int roll_no,String name,int age)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return roll_no+" "+name+" "+age;
	}
	

}
