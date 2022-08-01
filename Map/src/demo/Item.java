package demo;

public class Item {
	int id,cost;
	String name,company;
	
	Item(int id,String company,String name,int cost)
	{
		this.id=id;
		this.company=company;
		this.name=name;
		this.cost=cost;
		
	}
	public String toString()
	{
		return id+" "+company+" "+name+" "+cost;
	}

}
