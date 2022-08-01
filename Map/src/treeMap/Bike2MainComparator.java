package treeMap;

import java.util.TreeMap;

public class Bike2MainComparator {
	public static void main(String[] args) {
//		TreeMap<Bike2,Integer>tm=new TreeMap<>(new Bike2IdComparator());
//		tm.put(new Bike2(105,"Apachertr","TVS"), 100000);
//		tm.put(new Bike2(101,"StarCity","TVS"), 60000);
//		tm.put(new Bike2(111,"SP125","Honda"), 650000);
//		tm.put(new Bike2(122,"MT-15","Yamha"), 140000);
//		tm.put(new Bike2(104,"Platina100","Bajaj"), 40000);
//		tm.put(new Bike2(104,"Platina100","Bajaj"), 40000);
//		System.out.println(tm);
		TreeMap<Bike2,Integer>tm=new TreeMap<>(new Bike2BrandComparator());
		tm.put(new Bike2(105,"Apachertr","TVS"), 100000);
		tm.put(new Bike2(101,"StarCity","TVS"), 60000);
		tm.put(new Bike2(111,"SP125","Honda"), 650000);
		tm.put(new Bike2(122,"MT-15","Yamha"), 140000);
		tm.put(new Bike2(104,"Platina100","Bajaj"), 40000);
		tm.put(new Bike2(104,"Platina100","Bajaj"), 40000);
		System.out.println(tm);
		
	}

}
