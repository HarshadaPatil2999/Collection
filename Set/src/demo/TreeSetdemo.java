package demo;

import java.util.TreeSet;

public class TreeSetdemo {
	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<>();//ascending order .internal structure same as treemap
		ts.add(12);
		ts.add(56);
		ts.add(33);
		ts.add(20);
		ts.add(16);
		ts.add(1);
		//ts.add(null);it does not allow the null element .
		ts.add(12);//it can not display duplicate element.
		System.out.println(ts);
		System.out.println(ts.pollFirst());//remove lowest element from set.
		System.out.println(ts.ceiling(32));//display equal or greater element
		System.out.println(ts.floor(32));//display equal or lower element
		System.out.println(ts.clone());//display set as it is.
		System.out.println(ts.pollLast());//remove last element from set.
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		ts.remove(12);
		System.out.println(ts);
		System.out.println(ts.descendingSet());//display in descending order
		System.out.println(ts.first());
	}

}
