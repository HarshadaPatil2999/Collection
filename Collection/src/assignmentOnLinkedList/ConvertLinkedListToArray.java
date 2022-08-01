package assignmentOnLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ConvertLinkedListToArray {
public static void main(String[] args) {
	LinkedList<Integer>ll=new LinkedList<>();
	ll.add(60);
	ll.add(70);
	ll.add(10);
	ll.add(90);
	ll.add(30);
	ll.add(50);
	ll.add(20);
	System.out.println(ll);
	int arr[]=new int [ll.size()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=ll.get(i);
	}
	//System.out.println(Arrays.toString(arr));
	
	Integer a[]=new Integer[ll.size()];
	ll.toArray(a);
	//System.out.println(Arrays.toString(a));
	ArrayList<Integer>al=new ArrayList<>(Arrays.asList(a)); 
	System.out.println(al);
}
}
