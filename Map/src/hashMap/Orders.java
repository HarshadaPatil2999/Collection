package hashMap;

public class Orders {
	int id,total;
	String city,status;
	Orders(int id,String city,int total,String status)
	{
		this.id=id;
		this.city=city;
		this.total=total;
		this.status=status;
		
	}
	public String toString()
	{
		return id+" "+city+" "+total+" "+status;
	}

}
