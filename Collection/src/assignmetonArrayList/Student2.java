package assignmetonArrayList;

public class Student2 implements Comparable<Student2> {
	int id,marks;
	String name;
	Student2(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
	
	public int compareTo(Student2 s)
	{
		
		//return 0;//display list as it is.
		return -1;//display list reverse order.
		//return 1; //display list as it is
		
	}

}
