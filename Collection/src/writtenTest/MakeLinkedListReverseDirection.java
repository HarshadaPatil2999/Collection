package writtenTest;

import java.util.LinkedList;
import java.util.ListIterator;

public class MakeLinkedListReverseDirection {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(70);
		ll.add(30);
		ll.add(40);
		ll.add(80);
		ll.add(50);
		ll.add(60);
		System.out.println("Forword Direction:");
		System.out.println(ll);
		System.out.println("Reverse Direction:");
	
		
		ListIterator<Integer>itr=ll.listIterator(ll.size());
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" ");
		}
	}

}
