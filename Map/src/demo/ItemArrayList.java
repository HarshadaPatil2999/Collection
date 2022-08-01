package demo;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemArrayList {
	public static void main(String[] args) {
		ArrayList<Item>al=new ArrayList<>();
		al.add(new Item(1002,"Nestle","Maggi",5));
		al.add(new Item(1002,"Nestle","Coffee",10));
		al.add(new Item(1044,"ParleAgro","Frooti",10));
		al.add(new Item(1046,"ParleAgro","Fizz",20));
		al.add(new Item(1234,"Britannia","GoodDay",5));
		al.add(new Item(123,"Cadbury","DairyMilkSilk",60));
		al.add(new Item(128,"Cadbury","Oreo",30));
		al.add(new Item(1005,"Amul","Panner",160));
		al.add(new Item(1234,"Amul","IceCream",30));
		System.out.println(al);
		HashMap<String,Integer>hm=new HashMap<>();
		for(Item i:al)
		{
			if(hm.containsKey(i.company))
			{
				int v=hm.get(i.company)+1;
				hm.put(i.company, v);
			}
			else
				hm.put(i.company, 1);
		}
		System.out.println(hm);
	}

}
