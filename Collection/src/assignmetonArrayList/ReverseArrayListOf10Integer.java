package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseArrayListOf10Integer {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(20);
		al.add(45);
		al.add(11);
		al.add(1);
		al.add(15);
		al.add(20);
		al.add(46);
		al.add(21);
		al.add(110);
		al.add(19);
		System.out.println(al);
//		System.out.println("Asending Order");
//		Collections.sort(al);
//		System.out.println(al);
//		System.out.println("Desending Order");
//		Collections.reverse(al);
//		System.out.println(al);
		ListIterator<Integer>ll=al.listIterator(al.size());
		while(ll.hasPrevious())
		{
			System.out.print(ll.previous()+" ");
		}
		
	}

}
