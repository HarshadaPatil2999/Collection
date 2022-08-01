package assignmetonArrayList;

import java.util.ArrayList;

public class ShowsArraySizeDynamicallyChanges {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(3, 40);
		al.add(50);
		System.out.println(al);
		System.out.println("Size of Array List:"+al.size());
		al.add(60);
	    al.add(70);
		al.add(80);
		al.add(90);
		System.out.println("Size After add object:"+al.size());
		System.out.println(al);
		
	}

}
