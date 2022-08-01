package assignmetonArrayList;

import java.util.ArrayList;

public class ShowClearAndRemoveAllMethod {
	public static void main(String[] args) {
		
		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(10);
		al2.add(200);
		al2.add(30);
		al2.add(400);
		al2.add(500);
		al2.add(400);
		System.out.println(al2);
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		//al2.clear();// Display blank Array.
		 al2.addAll(al);
		System.out.println(al2);
		
		al2.removeAll(al);// Display blank Array. 
		System.out.println(al2);
	}

}
