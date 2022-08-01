package genericCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class FindOccuranceOfGivenNo {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		System.out.println(al);
		System.out.println("Enter any no");
		int n=sc.nextInt();
		
		int c=0;
		
//		for(int i=0;i<al.size();i++)
//		{
//			if(n==al.get(i))
//			{
//				c++;
//			}
//		}
//		System.out.println(c);
		for(Integer a:al)
		{
			if(n==a)
			{
				c++;
			}
		}System.out.println(c);
		
	}

}
