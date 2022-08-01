package writtenTest;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemArrayList {
	public static void main(String[] args) {
		ArrayList<Item>al=new ArrayList<>();
		al.add(new Item(101,"Parle-G",10.00,10));
		al.add(new Item(101,"Parle-G",10.00,4));
		al.add(new Item(101,"Parle-G",10.00,2));
		al.add(new Item(103,"GoodDay",5.00,15));
		al.add(new Item(103,"GoodDay",5.00,10));
		al.add(new Item(112,"DairyMilk",15.00,10));
		al.add(new Item(112,"DairyMilk",15.00,5));
		al.add(new Item(144,"SonPapadi",30.00,6));
		al.add(new Item(144,"SonPapadi",30.00,3));
		al.add(new Item(124,"Oreo",30.00,5));
		
		System.out.println(al);
		
		HashMap<String,Integer>hm=new HashMap<>();
		
		for(Item i:al)
		{ 
			if(hm.containsKey(i.name))
			{
				int sum=hm.get(i.name) + i.quantity;
				hm.put(i.name, sum);
			}
			else
				hm.put(i.name, i.quantity);
			
		}
		System.out.println(hm);
			

}
}
