package assignmetonArrayList;

import java.util.ArrayList;

public class ReplaceElecmentAtPerticularPosition {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(60);
		al.add(80);
		System.out.println(al);
		al.set(3, 64);
		System.out.println(al);
	}

}
