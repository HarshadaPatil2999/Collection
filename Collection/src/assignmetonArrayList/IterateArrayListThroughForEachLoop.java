package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListThroughForEachLoop {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("-------Using Foreach Loop------------");
		for(Integer i:al)
		{
			System.out.print(i+" ");
		}System.out.println();
		System.out.println("----------Using Iterator-----------");
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
