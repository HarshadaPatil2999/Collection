package treeMap;

public class Bike2  {
	int id;
	String name,brand;
	Bike2(int id,String name,String brand)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
	}
	public String toString() 
	{
		return id+" "+name+" "+brand;
	}

}
