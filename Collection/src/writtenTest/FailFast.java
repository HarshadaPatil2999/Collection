package writtenTest;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailFast {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(10);
		System.out.println(al);
		
		
		for(Integer i:al)
		{
			if(i==10)
			al.add(100);
			//al.remove(i);
		}
		System.out.println(al);
//		ListIterator<Integer>ll=al.listIterator();
//		while(ll.hasNext())
//		{
//			if(ll.next()==10)
//			ll.remove();
//		}
		
	}

}
