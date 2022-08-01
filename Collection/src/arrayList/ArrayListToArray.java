package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(20);
		al.add(70);
		al.add(90);
		al.add(40);
		Collections.sort(al);//Ascending order
		Collections.reverse(al);//first Ascending order and then reverse i.e.Descending order
		
		int arr[]=new int[al.size()];
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		}
		System.out.println(Arrays.toString(arr));
		Integer al2[]=new Integer[al.size()];
		al.toArray(al2);
		System.out.println(Arrays.toString(al2));
	}

}
