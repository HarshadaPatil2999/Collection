package writtenTest;

public class Item {
	int id,quantity;
	double price;
	String name;
	Item(int id,String name,double price,int quantity)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public String toString()
	{
		return id+" "+name+" "+price+" "+quantity;
	}
	

}
