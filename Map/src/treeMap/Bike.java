package treeMap;

public class Bike implements Comparable<Bike> {
	int id;
	String name,brand;
	Bike(int id,String name,String brand)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
	}
	public String toString() 
	{
		return id+" "+name+" "+brand;
	}
	public int compareTo(Bike b)
	{
		return this.id-b.id;//for we take key as a object of class then is sorting with comparable.
		//return this.name.compareTo(b.name);
	}
	
	
	
	
//	public int hashCode() //hash code and equals method is not mandatory.
//	{
//		return id;
//	}
//	public boolean equals(Object o)
//	{
//		Bike b=(Bike)o;
//		if(this.id==b.id)
//			return true;
//		else
//			return false;
//	}

}
