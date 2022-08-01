package assignment;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertStringHashSetIntoStringArray {
	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
		hs.add("ABC");
		hs.add("DEF");
		hs.add("GHF");
		hs.add("LMN");
		hs.add("PQR");
		hs.add("XYZ");
		System.out.println(hs);
		
		String s[]=new String[hs.size()];
		hs.toArray(s);
		
		System.out.println(Arrays.toString(s));
		
		for(String s1:hs)
		{
			System.out.print(s1+" ");
		}
	
		
		
		
	}

}
