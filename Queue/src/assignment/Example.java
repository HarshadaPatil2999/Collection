package assignment;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example {
	public static void main(String[] args) {
		Queue <Integer> q=new PriorityQueue<>();
		q.add(45);
		q.add(56);
		q.add(87);
		q.add(98);
		q.add(66);
		System.out.println(q);
		Iterator<Integer>itr=q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
