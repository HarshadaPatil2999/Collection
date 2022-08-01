package assignmentOnLinkedList;

import java.util.LinkedList;

public class RemoveElement {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(60);
		ll.add(70);
		ll.add(10);
		ll.add(55);
		ll.add(90);
		ll.add(30);
		ll.add(50);
		ll.add(20);
		System.out.println(ll);
		LinkedList<Integer>ll2=new LinkedList<>();
		ll2.add(600);
		ll2.add(700);
		ll2.add(100);
		ll2.add(550);
		ll2.add(900);
		ll2.add(300);
		System.out.println(ll2);
		ll.remove(4);
		System.out.println(ll);
//		ll.removeAll(ll);
//		System.out.println(ll);
		ll.addAll(ll2);
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		ll.set(3, 22);
		System.out.println(ll);
		System.out.println(ll.contains(ll2));
		System.out.println(ll.equals(ll2));
		System.out.println(ll.containsAll(ll2));
		
		
		
	}

}
