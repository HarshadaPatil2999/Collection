package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	public static void main(String[] args) {
		Integer arr[]= {10,70,47,90,60,37,20};
		
		ArrayList<Integer>al=new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);
		
		int a[]= {1,2,3,4,7,9};
		
		ArrayList<Integer>al2=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			al2.add(a[i]);
		}
		System.out.println(al2);
	}

}
