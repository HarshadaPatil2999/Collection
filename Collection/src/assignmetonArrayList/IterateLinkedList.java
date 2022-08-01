package assignmetonArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(60);
		ll.add(70);
		ll.add(10);
		ll.add(90);
		ll.add(30);
		ll.add(50);
		ll.add(20);
		System.out.println(ll);
		Iterator<Integer>itr=ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
