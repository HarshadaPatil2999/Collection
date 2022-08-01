package containment;

public class Car {
	int id,price,year;
	String name;
	Car(int id,String name,int year,int price)
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
