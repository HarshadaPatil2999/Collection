package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SortTheArrayListWithOutUsingSortMethod {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(23);
		al.add(2);
		al.add(43);
		al.add(1);
		al.add(80);
		System.out.println(al);
		     
		  Integer a[]=new Integer[al.size()];
		  al.toArray(a);
		 // System.out.println(Arrays.toString(a));
		  for(int i=0;i<al.size();i++)
		  {
			  for(int j=i+1;j<al.size();j++)
			  {
				  if(a[i]>a[j])
				  {
					  int temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
			  }
			  System.out.print(a[i]+" ");
		  }
		  
	   
			
		
			
		
		
		
	}

}
