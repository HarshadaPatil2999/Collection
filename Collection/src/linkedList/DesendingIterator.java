package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class DesendingIterator {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<Integer>();
		ll.add(50);
		ll.add(20);
		ll.add(60);
		ll.add(40);
		ll.add(55);
		ll.add(10);
		ll.add(30);
		ll.add(70);
		ll.add(80);
		
	System.out.println(ll);
		
		Iterator<Integer>itr=ll.descendingIterator();//from bottom to top reversing
		System.out.println("Last to First Sequence");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
		
	}

}
