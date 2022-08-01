package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class FailFastExample {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(20);
		al.add(70);
		al.add(90);
		al.add(40);
		System.out.println(al);
		
//		for(Integer i:al)
//		{
//			if(i==20)
//				//al.add(45);
//				al.remove(i);//shows ConCurrentModificationException.
//		}
//		System.out.println(al);
		
		ListIterator<Integer>itr=al.listIterator();
		while(itr.hasNext())
		{
			if(itr.next().equals(20))
			 // itr.add(45);//it is not showing the exception.
			itr.remove();
			
		}
		System.out.println(al);
		
	}

}
