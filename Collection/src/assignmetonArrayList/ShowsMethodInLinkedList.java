package assignmetonArrayList;

import java.util.LinkedList;

public class ShowsMethodInLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(60);
		ll.add(70);
		ll.add(10);
		ll.add(90);
		ll.add(30);
		ll.add(50);
		ll.add(20);
		ll.add(80);
		System.out.println(ll);
		ll.addFirst(66);
		System.out.println(ll);
		ll.addLast(78);
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		//System.out.println(ll.element());
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		//System.out.println(ll.peek());
		//System.out.println(ll.poll());
		
	}

}
