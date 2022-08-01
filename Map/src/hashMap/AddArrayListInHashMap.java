package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddArrayListInHashMap {
	public static void main(String[] args) {
	
	
	ArrayList<Integer>al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(10);
	al.add(20);
	al.add(10);
	
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(Integer i:al)
	{
		if(hm.containsKey(i))
		{
			int v=hm.get(i)+1;
			hm.put(i, v);
		}
		else
			hm.put(i, 1);
	}
	
    System.out.println(hm);
}
}