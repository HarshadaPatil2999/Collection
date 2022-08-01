package genericCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayAssociatedMethods {
	public static void main(String[] args) {
		
ArrayList<Integer>al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Iterator:");//always traversing forword direction.used for all collection 
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("ListIterator in forword:");
		ListIterator<Integer>litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		System.out.println("List Iterator reverse :");
		
		litr=al.listIterator(al.size());
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+" ");
		}
		
	}

}
