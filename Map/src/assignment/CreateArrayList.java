package assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateArrayList {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(101, "ABC");
		hm.put(102, "DEF");
		hm.put(103, "XYZ");
		hm.put(104, "PQR");
		hm.put(105, "MNO");
		System.out.println(hm);
		
		ArrayList<Integer>al=new ArrayList<>();
		for(Integer i:hm.keySet())
		{
			al.add(i);
		}
		System.out.println(al);
		
		ArrayList<String>al2=new ArrayList<>();
		for(String s:hm.values())
		{
			al2.add(s);
		}
		System.out.println(al2);
		
		 hm.putIfAbsent(104, "STU");//it is already present key so it is not added again or not change the value.
		 System.out.println(hm);
	     hm.putIfAbsent(108, "STU");//it is not present in old map.so it is added
		  System.out.println(hm);
		hm.put(104, "STV");//this method is  change the value with privious value. 
		System.out.println(hm);
		
	}

}
