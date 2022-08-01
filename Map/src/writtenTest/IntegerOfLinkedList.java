package writtenTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class IntegerOfLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(1);
		ll.add(4);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(1);
		ll.add(4);
		System.out.println(ll);
		
		LinkedList<String>ll1=new LinkedList<>();
		HashMap<String,Integer>hm=new HashMap<>();
		
		for(int i=0;i<ll.size();i++)
		{
		  switch(ll.get(i))
		  
		{
		
	    case 1: ll1.add("One");
	     break;
		case 2:ll1.add("Two");
		break;
		case 3:ll1.add("Three");
		break;
		case 4:ll1.add("Four");
		break;
		
	    }
		
		}
		for(String s:ll1)
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
