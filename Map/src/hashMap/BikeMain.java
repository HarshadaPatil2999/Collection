package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BikeMain {
	public static void main(String[] args) {
		
		
		HashMap<Bike,Integer>hm=new HashMap<>();
		hm.put(new Bike(101,"Pulsor","Blue"), 72000);
		hm.put(new Bike(144,"Platina","Red"), 75000);
		hm.put(new Bike(123,"Unicorn","Red"), 76000);
		hm.put(new Bike(156,"RoyalEnfield","White"), 150000);
		hm.put(new Bike(111,"Splender","Black"), 67000);
		hm.put(new Bike(101,"Passion","Grey"), 75000);
		hm.put(new Bike(123,"Unicorn","Red"), 80000);
		
		//System.out.println(hm);
//		for(Map.Entry<Bike, Integer>ent: hm.entrySet())
//		{
//				System.out.println(ent.getKey()+" "+ent.getValue());	
//		}
		Iterator<Map.Entry<Bike, Integer>>itr=hm.entrySet().iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry<Bike, Integer>ent=itr.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
	}

}
