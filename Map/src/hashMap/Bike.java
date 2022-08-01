package hashMap;

public class Bike {
	int id;
	String name,colour;
	Bike(int id,String name,String colour)
	{
		this.id=id;
		this.name=name;
		this.colour=colour;
	}
	public String toString()
	{
		return id+" "+name+" "+colour;
	}

	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		Bike b=(Bike)o;
		if(this.id==b.id)
			return true;
		else
			return false;
	}
}
