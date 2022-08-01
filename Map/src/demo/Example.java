package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();//ouptup in random
		LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();//output display forword direction or retain the order of insertion.
		TreeMap<Integer,String>th=new TreeMap<>();//Ascending order
		
		hm.put(112, "ABC");
		hm.put(110, "PQR");
		hm.put(101, "MNO");
		hm.put(11, "XYZ");
		hm.put(10, "DEF");
		hm.put(15, "LMN");
		hm.put(1, "ABC");
		hm.put(16, "DEF");
		hm.put(50, "HIJ");
		System.out.println("HashMap output:"+hm);
		lhm.put(112, "ABC");
		lhm.put(110, "PQR");
		lhm.put(101, "MNO");
		lhm.put(11, "XYZ");
		lhm.put(10, "DEF");
		lhm.put(15, "LMN");
		lhm.put(1, "ABC");
		lhm.put(16, "DEF");
		lhm.put(50, "HIJ");
		System.out.println("LinkedHashMap output:"+lhm);
		th.put(112, "ABC");
		th.put(110, "PQR");
		th.put(101, "MNO");
		th.put(11, "XYZ");
		th.put(10, "DEF");
		th.put(15, "LMN");
		th.put(1, "ABC");
		th.put(16, "DEF");
		th.put(50, "HIJ");
		System.out.println("TreeMap output:"+th);
		
		
		
		
	}

}
