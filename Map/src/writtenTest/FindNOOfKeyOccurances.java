package writtenTest;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNOOfKeyOccurances {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nashik");
		al.add("Pune");
		
		System.out.println(al);
		
		HashMap<String,Integer>hm=new HashMap<>();
		
		for(String s:al)
		{
			if(hm.containsKey(s))
			{
				int i=hm.get(s)+1;
				hm.put(s, i);
			}
			else
				hm.put(s, 1);
		}
	       System.out.println(hm);
		
		
	}

}
