package assignmetonArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class TraverseArrayListInReverseUsingListIterator {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		System.out.println("Traverse ArrayList in Reverse Direction");
		ListIterator<Integer>ll=al.listIterator(al.size());
		while(ll.hasPrevious())
		{
			System.out.print(ll.previous()+" ");
		}
	}

}
