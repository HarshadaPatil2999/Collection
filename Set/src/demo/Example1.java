package demo;

import java.util.HashSet;

public class Example1 {
	
	
	static void traverseSet(HashSet<Integer>hs)
	{
		for(Integer i:hs)
		{
			System.out.println(i);
		}
	}
	
	static void average(HashSet<Integer>hs)
	{int sum=0;
		for(Integer i:hs)
		{
			sum=sum+i;
		}
		float avg=sum/hs.size();
		System.out.println(avg);
	}
	
	
	
	public static void main(String[] args) {
		
	
	HashSet<Integer>hs=new HashSet<>();
	hs.add(20);
	hs.add(80);
	hs.add(70);
	hs.add(10);
	hs.add(50);
	hs.add(30);
	hs.add(40);
	hs.add(90);
	//hs.add(40);//does not allow duplicate element.
	//System.out.println(hs);
	traverseSet(hs);
	System.out.println();
	average(hs);
	

}
}