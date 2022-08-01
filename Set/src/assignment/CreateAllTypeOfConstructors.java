package assignment;

import java.util.HashSet;
import java.util.Iterator;

public class CreateAllTypeOfConstructors {
	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<>();
		hs.add(45);
		hs.add(78);
		hs.add(87);
		hs.add(32);
		hs.add(38);
		hs.add(11);
		System.out.println(hs);
		Iterator<Integer>itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
