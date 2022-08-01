package demo;


import java.util.HashMap;
import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<Integer,String>ht=new Hashtable<>();//it is a legacy class it is synchronized.
		ht.put(112, "ABC");//performance is slow
		ht.put(110, "PQR");
		ht.put(101, "MNO");
		ht.put(11, "XYZ");
		ht.put(10, "DEF");
		ht.put(15, "LMN");
		ht.put(1, "ABC");
		ht.put(16, "DEF");
		System.out.println(ht);
		
		
	}

}
