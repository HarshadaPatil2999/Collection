package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SynchroniedArrayList {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(11);
		al.add(13);
		al.add(15);
		al.add(17);
		al.add(19);
		System.out.println(al);
		System.out.println("-----------After Sychronization List--------");
		System.out.println(Collections.synchronizedList(al));
		
	}

}
