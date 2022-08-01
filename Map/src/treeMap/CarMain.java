package treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CarMain {
	public static void main(String[] args) {
		TreeMap<Integer,Car>tm=new TreeMap<>();
		tm.put(1001, new Car("Creta","Hundai",2020,2000000));
		tm.put(1012, new Car("Etios","Toyota",2013,2500000));
		tm.put(1019, new Car("Swift","Maruti",2015,1200000));
		tm.put(1002, new Car("Alto","Maruti",2018,1500000));
		tm.put(1021, new Car("Fortuner","Toyota",2020,1000000));
		tm.put(1021, new Car("Fortuner","Toyota",2020,1000000));
		System.out.println(tm);
		System.out.println("-----KeySet----");
		for(Integer i:tm.keySet())
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----ValueSet-----");
		for(Car c:tm.values())
		{
			System.out.println(c+" ");
		}
		System.out.println();
		System.out.println("------By Iterator-------");
		Iterator itr=tm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("------By Using MapEntery-----");
		for(Map.Entry<Integer, Car>ent:tm.entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		
	}

}
