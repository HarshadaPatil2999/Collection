package assignmetonArrayList;

import java.util.ArrayList;

public class InsertMoreThanOneElementAtPerticularPosition {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(20);
		al.add(50);
		al.add(70);
		System.out.println(al);
		al.set(2, 45);
		System.out.println(al);
		al.set(2, 55);
		System.out.println(al);
		al.set(2, 86);
		System.out.println(al);
//		al.remove(2);
//		System.out.println(al);
		
		
	}

}
