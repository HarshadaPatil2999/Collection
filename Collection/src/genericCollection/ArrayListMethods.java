package genericCollection;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al.add(2, 60);
		System.out.println(al);
//		al.clear();
//		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		ArrayList<Integer>al1=new ArrayList<>();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(100);
		al2.add(20);
		al2.add(300);
		al2.add(400);
		al2.add(500);
	al.addAll(al1);
	System.out.println(al);
//	al.removeAll(al2);
//	System.out.println(al);
	System.out.println(al.equals(al2));
	System.out.println(al.contains(20));
	al.retainAll(al1);
	System.out.println(al);
	
	System.out.println(al.get(0));
	System.out.println(al.isEmpty());
	System.out.println(al.indexOf(200));
	al.addAll(al);
	System.out.println(al);
	System.out.println(al.indexOf(200));
	System.out.println(al.lastIndexOf(200));
	al.set(3, 60);
	System.out.println(al);
	
	
	
	}

}
