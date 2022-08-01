package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListOfWeekDays {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("Sun");
		al.add("Mon");
		al.add("Tue");
		al.add("Wed");
		al.add("Thu");
		al.add("Fri");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Tue");
		al.add("Wed");
		al.add("Thu");
		al.add("Mon");
		al.add("Mon");
		al.add("Tue");
		al.add("Wed");
		al.add("Thu");
		al.add("Wed");
		
		HashMap<String,Integer>hm=new HashMap<>();
		for(String s:al)
		{
			if(hm.containsKey(s))
			{
				int v=hm.get(s)+1;
				hm.put(s, v);
			}
			else
				hm.put(s, 1);
		}
		
		System.out.println(hm);
		
	}

}
