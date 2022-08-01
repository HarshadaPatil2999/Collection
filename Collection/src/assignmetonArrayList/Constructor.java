package assignmetonArrayList;

import java.util.ArrayList;

public class Constructor {
	public static void main(String[] args) {
		ArrayList al3=new ArrayList() ;
		al3.add(30);
		al3.add(3.5f);
		al3.add("abc");
		al3.add(5.5);
		al3.add(40);
		System.out.println(al3);
		
		ArrayList<Integer>al=new ArrayList<>();
		ArrayList<Integer>al2=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(500);
		System.out.println(al2);
		
		
	}

}
