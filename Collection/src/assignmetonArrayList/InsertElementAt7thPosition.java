package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class InsertElementAt7thPosition {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		
		System.out.println(al);
		al.add(7, 101);//add element at 7th position.
		System.out.println(al);
		al.set(7, 66); //insert element at 7th position
		System.out.println(al);
		
		
	}

}
