package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class OrdersMain {
	public static void main(String[] args) {
		ArrayList<Orders>al=new ArrayList<>();
		al.add(new Orders(101,"Pune",120,"Delivered"));
		al.add(new Orders(104,"Mumbai",100,"Pending"));
		al.add(new Orders(11,"Kolhapur",145,"Pending"));
		al.add(new Orders(1,"Sangli",200,"Delivered"));
		al.add(new Orders(21,"Satara",150,"Pending"));
		al.add(new Orders(21,"Satara",150,"Pending"));
		al.add(new Orders(11,"Kolhapur",145,"Pending"));
		System.out.println(al);
		
		HashMap<String,Integer>hm=new HashMap<>();

		
		for(Orders o:al)
		{ // if(o.status.equals("Pending"))
			if(o.status.contains("Pending"))
			{
			     if(hm.containsKey(o.city))
				{
					int v=hm.get(o.city)+1;
					hm.put(o.city, v);
				}
			     else
						hm.put(o.city, 1);
			}
			
			
		}
		System.out.println(hm);
	}

}
