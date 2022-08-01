package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DisplayMethods {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(112, "ABC");
		hm.put(110, "PQR");
		hm.put(101, "MNO");
		hm.put(11, "XYZ");
		hm.put(10, "DEF");
		hm.put(15, "LMN");
		hm.put(1, "ABC");
		hm.put(16, "DEF");
		hm.put(50, "HIJ");
		
		System.out.println(hm);
		
		for(Integer i:hm.keySet())//display key set only
		{
			//System.out.println(i+" "+hm.get(i));
			System.out.print(i+" ");
		}
		System.out.println();
		for(String s:hm.values())//display only value set 
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("-----Map Entry-------");
		for(Map.Entry<Integer, String>entry:hm.entrySet())//display both keyset and value.
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println();
		System.out.println("---Iterator----");
		
		Iterator itr=hm.entrySet().iterator();//by using iterator we can display key and value .
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----Iterator with Map Entry-----");
		Iterator<Map.Entry<Integer, String>> itr1=hm.entrySet().iterator();//iterater with map.entry for display separately key and value.
		while(itr1.hasNext())
		{
			Map.Entry<Integer, String> ent=itr1.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		
	}

}
