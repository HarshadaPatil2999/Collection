package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayListEventNo1To50 {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		al.add(10);
		al.add(12);
		al.add(14);
		al.add(16);
		al.add(18);
		al.add(20);
		al.add(22);
		al.add(24);
		al.add(26);
		al.add(28);
		al.add(30);
		al.add(32);
		al.add(34);
		al.add(36);
		al.add(38);
		al.add(40);
		al.add(42);
		al.add(44);
		al.add(46);
		al.add(48);
		al.add(50);
		
				Iterator<Integer>itr=al.iterator();
				while(itr.hasNext())
				{
					System.out.print(itr.next()+" ");
				}
		
	}

}
