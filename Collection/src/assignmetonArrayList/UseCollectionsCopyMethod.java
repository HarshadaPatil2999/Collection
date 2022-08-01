package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class UseCollectionsCopyMethod {
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
		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(1000);
		al2.add(2000);
		al2.add(3000);
		al2.add(4000);
		System.out.println(al2);
		Collections.copy(al, al2);
		System.out.println(al);
		
	}

}
