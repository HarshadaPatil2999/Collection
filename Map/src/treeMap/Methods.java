package treeMap;

import java.util.TreeMap;

public class Methods {
	public static void main(String[] args) {
		TreeMap<Integer,String>tm=new TreeMap<>();
		tm.put(102, "Raj");
		tm.put(10, "Rajesh");
		tm.put(1, "Meera");
		tm.put(98, "Radha");
		tm.put(123, "Anjali");
		tm.put(22, "Anuj");
		//tm.put(56, "Meenal");
		tm.put(78, "Rohan");
		
		System.out.println(tm);//always display in ascending order.
		System.out.println(tm.get(1));
		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());
	    System.out.println(tm.lastEntry());
	     System.out.println(tm.lastKey());
	     System.out.println(tm.tailMap(10,false));//display the map after 10 if we dont have 10 entry then write false 
	     System.out.println(tm.headMap(98,true));//show Before Entries.write 98 if we want 98 entry.
		System.out.println(tm.subMap(22, 78));
		System.out.println(tm.descendingMap());
		System.out.println(tm.lowerKey(22));//strictley display lower key after 22
		System.out.println(tm.higherKey(22));//strictly show higher key after 22
		System.out.println(tm.higherEntry(22));
		System.out.println(tm.lowerEntry(22));
		 System.out.println(tm.ceilingKey(56));//show greater key.if 56 is present then show 56
	     System.out.println(tm.ceilingEntry(56));
	     System.out.println(tm.floorEntry(56)); //show lower key.if key is present then it will display that value.
	     System.out.println(tm.floorKey(56));
	     System.out.println(tm.descendingKeySet());
	}

}
