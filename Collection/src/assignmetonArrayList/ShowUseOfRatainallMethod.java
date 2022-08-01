package assignmetonArrayList;

import java.util.ArrayList;

public class ShowUseOfRatainallMethod {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(10);
		al2.add(200);
		al2.add(30);
		al2.add(400);
		al2.add(50);
		al2.add(400);
		System.out.println(al2);
		ArrayList<Integer>al3=new ArrayList<>();
		al3.add(100);
		al3.add(200);
		al3.add(300);
	    al3.add(500);
		al3.add(400);
		System.out.println(al3);
		al.retainAll(al2);
		System.out.println(al);//display only element which are common in both list.
		al.retainAll(al3);
		System.out.println(al);//there are no common elements in both list so output is empty.
		
		
		
		
	}

}
