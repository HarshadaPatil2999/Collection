package demo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class LinkedSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer>ls=new LinkedHashSet<>();//display output as per insertion
		ls.add(20);//internal structure is same as linked hash map.
		ls.add(60);//it only accept the key.
		ls.add(50);
		ls.add(80);
		ls.add(66);
		ls.add(12);
		ls.add(12);//duplicate element is not allowed
		ls.add(null);
		ls.add(null);//only one null element is allowed.
		System.out.println(ls);
	  
	}

}
