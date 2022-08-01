package assignment;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementWithLinkedList {
public static void main(String[] args) {
	Queue<String>q=new LinkedList<>();
	q.add("ABC");
	q.add("DEF");
	q.add("PQR");
	q.add("LMN");
	q.add("XYZ");
	q.add("DEF");
	System.out.println(q);
	q.add("UVW");
	System.out.println(q);
	
	q.remove("DEF");//remove only first occurrence element
	System.out.println(q);
	System.out.println(q.element());
	q.poll();
	System.out.println(q);
	for(String s:q)
	{
		if(s.equals("DEF"))//remove all occurrences in the queue.
			q.remove(s);
	}
	System.out.println(q);
	
	
	
	
}
}
