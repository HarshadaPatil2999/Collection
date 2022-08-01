package assignmetonArrayList;

import java.util.ArrayList;

public class PrintSublist {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(60);
		al.add(15);
		al.add(20);
		al.add(40);
		al.add(70);
		al.add(50);
		System.out.println(al);
		System.out.println(al.subList(2, 7));
	}

}
