package demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class Methods {
	public static void main(String[] args) {
		//Queue qe=new PriorityQueue<>();
		PriorityQueue<Integer>qe1=new PriorityQueue<>();//first in first out.
//front	end	
		qe1.add(23);//linear structure.internal structure may be array or linked list.
		qe1.add(31);//add element from rear end and remove element from front end.
		qe1.add(33);//duplicate elements are allowed.
		qe1.add(1);
		qe1.add(25);
		qe1.add(31);
		qe1.add(11);
		qe1.add(41);
//rear end
		System.out.println(qe1);
		System.out.println(qe1.isEmpty());
		System.out.println(qe1.element());//show head element .bt queue is empty it throw noSuchElement Exception
		System.out.println(qe1.peek());//show head element .bt queue is empty it show null.
		qe1.remove();//remove element does not return element
		System.out.println(qe1);
		System.out.println("poll the element is:"+qe1.poll());//return the element
		System.out.println(qe1);
	}

}
