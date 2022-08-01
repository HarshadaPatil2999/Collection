package assignmentOnLinkedList;

import java.util.LinkedList;

public class DisplayElementAndPosition {
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
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i)+" "+ll.indexOf(ll.get(i)));
			
		}
	}

}
