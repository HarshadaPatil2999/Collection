package demo;

import java.util.HashMap;

public class Methods {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		HashMap<Integer,String>hm1=new HashMap<>();
		hm.put(112, "ABC");
		hm.put(110, "PQR");
		hm.put(101, "MNO");
		hm.put(11, "XYZ");
		hm.put(10, "DEF");
		hm.put(15, "LMN");
		hm.put(1, "ABC");
		hm.put(16, "DEF");
		hm.put(50, "HIJ");
		
		hm1.put(1000, "ABCD");
		hm1.put(1100, "PQRS");
		hm1.put(1010, "MNOP");
		hm1.put(1111, "WXYZ");
		hm1.put(1011, "DEFG");
		System.out.println(hm);
		System.out.println(hm.containsKey(101));
		System.out.println(hm.get(15));
		System.out.println(hm.hashCode());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsValue("PQR"));
		hm.put(16, "LTR");
		System.out.println(hm);
		hm.remove(1);
		System.out.println(hm);
		System.out.println(hm.size());
//	       hm.clear();
//	       System.out.println(hm);
	       hm.remove(110,"PQR");
	       System.out.println(hm);
	       hm.putAll(hm1);
	       System.out.println(hm);
	}

}
