package writtenTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CombinedLinkedListTogether {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		System.out.println(ll);
		
		LinkedList<Integer>ll1=new LinkedList<>();
		ll1.add(11);
		ll1.add(22);
		ll1.add(33);
		ll1.add(44);
		System.out.println(ll1);
		
		LinkedList<Integer>ll2=new LinkedList<>();
		
		for(int i=0;i<ll.size();i++)
		{
			ll2.add(ll.get(i));
			
			if(i<ll1.size())
			{
				ll2.add(ll1.get(i));
			}
			
		}
		System.out.println(ll2);
}
}