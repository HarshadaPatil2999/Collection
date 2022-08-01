package vector;

import java.util.Vector;

public class Example {
	public static void main(String[] args) {
		Vector <Integer>v=new Vector<>();
		v.add(23);
		v.add(45);
		v.add(2, 56);
		v.addElement(67);
		System.out.println(v);
	}

}
