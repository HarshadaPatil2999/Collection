package containment;

import java.util.ArrayList;

public class Company {
	int c_id;
	String c_name;
	ArrayList<Car>car;
	
	Company(int c_id,String c_name,ArrayList<Car>car)
	{
		this.c_id=c_id;
		this.c_name=c_name;
		this.car=car;
	}
	public String toString()
	{
		return c_id+" "+c_name+" "+car;
	}

}
