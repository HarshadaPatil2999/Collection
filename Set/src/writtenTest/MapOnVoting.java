package writtenTest;

import java.util.HashMap;
import java.util.Map;

public class MapOnVoting {
	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<>();
		hm.put("675849320912", "BJP");
		hm.put("675432189065", "ShivSena");
		hm.put("453212345643", "Congress");
		hm.put("123456789087", "NCP");
		hm.put("564756483894", "BJP");
		hm.put("232312214565", "BJP");
		hm.put("667765678798", "Others");
		hm.put("545634432332", "ShivSena");
		hm.put("445556621346", "BJP");
		hm.put("787659087656", "Congress");
		hm.put("877890876543", "NCP");
		hm.put("694554434212", "ShivSena");
		System.out.println(hm);
		
		HashMap<String,Integer>hm1=new HashMap<>();
		
		for(Map.Entry<String, String>ent:hm.entrySet())
		{
			String s=ent.getValue();
			
			if(hm1.containsKey(s))
			{
				int v=hm1.get(s)+1;
				hm1.put(s, v);
			}
			else
				hm1.put(s, 1);
		}
			
			System.out.println(hm1);
		
		
}
}