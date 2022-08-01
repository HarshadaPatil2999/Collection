package treeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(67, "Anjali");
		hm.put(89, "Poonam");
		hm.put(77, "Meenal");
		HashMap<Integer,String>hm1=new HashMap<>();
		hm1.put(88, "Arati");
		hm1.put(76, "Geeta");
		hm1.put(69, "Komal");
		
		TreeMap<Integer,HashMap<Integer,String>>tm=new TreeMap<>();
		tm.put(101,hm );
		tm.put(104, hm1);
		
		System.out.println(tm);
		
		for(Integer i:tm.keySet())
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(HashMap h:tm.values())
		{
			
			System.out.println(h+" ");
			
		}
		System.out.println();
		System.out.println("----Iterator------");
		
		Iterator itr=tm.entrySet().iterator();
		while(itr.hasNext())
		{  
			System.out.println(itr.next());
		}
		System.out.println("----Map Entry-----");
		
		for(Map.Entry<Integer, HashMap<Integer,String>>ent:tm.entrySet())
		{          System.out.println(ent.getKey()+" ");
			//System.out.println(ent.getKey()+" "+ent.getValue());
			for(Map.Entry<Integer, String>en:ent.getValue().entrySet())
			{
				System.out.println(en.getKey()+" "+en.getValue());
			}
		}
		System.out.println();
		System.out.println("---Iterator with Map Entry------");
		Iterator<Map.Entry<Integer, HashMap<Integer,String>>>itr1=tm.entrySet().iterator();
		while(itr1.hasNext())
		{
			Map.Entry<Integer, HashMap<Integer,String>>e1=itr1.next();
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
		
		
	}

}
