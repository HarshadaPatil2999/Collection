package containment;

public class Car2 {
	int id,price,year;
	String name;
	Car2(int id,String name,int year,int price)
	{
		this.id=id;
		this.name=name;
		this.year=year;
		this.price=price;
	}
	public String toString()
	{
		return id+" "+name+" "+year+" "+price;
	}

}
