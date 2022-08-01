package assignment;

import java.util.HashMap;

public class CreateNewMap {
	public static void main(String[] args) {
		HashMap<Integer,Character>hm=new HashMap<>();
		hm.put(1, 'a');
		hm.put(2, 'b');
		hm.put(3, 'c');
		hm.put(4, 'b');
		hm.put(5, 'a');
		hm.put(6, 'a');
		System.out.println(hm);
		
		HashMap<Character,Integer>hm1=new HashMap<>();
		for(Character c:hm.values())
		{
			if(hm1.containsKey(c))
			{
				int i=hm1.get(c)+1;
				hm1.put(c, i);
			}
			else
				hm1.put(c, 1);
		}
		System.out.println(hm1);
		
	}

}
