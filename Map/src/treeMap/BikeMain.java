package treeMap;

import java.util.TreeMap;

public class BikeMain {
	public static void main(String[] args) {
		TreeMap<Bike,Integer>tm=new TreeMap<>();
		tm.put(new Bike(105,"Apachertr","TVS"), 100000);
		tm.put(new Bike(101,"StarCity","TVS"), 60000);
		tm.put(new Bike(111,"SP125","Honda"), 650000);
		tm.put(new Bike(122,"MT-15","Yamha"), 140000);
		tm.put(new Bike(104,"Platina100","Bajaj"), 40000);
		tm.put(new Bike(104,"Platina100","Bajaj"), 40000);
		System.out.println(tm);
		
	}

}
