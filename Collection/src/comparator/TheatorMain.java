package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TheatorMain  {
	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Theator>al2=new ArrayList<>();
		ArrayList<Movie>al=null;
		System.out.println("Enter size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter :Therator id,name,MovieList");
			int T_id=sc.nextInt();
			String T_name=sc.next();
			al=new ArrayList<>();
			for(int j=0;j<3;j++)
			{
			System.out.println("Enter :Movie id,name,rating,Box Office Collection");
				int id=sc.nextInt();
				String name=sc.next();
				int rating=sc.nextInt();
				int boxOfficeCollection=sc.nextInt();
			al.add(new Movie(id,name,rating,boxOfficeCollection));
				
			}
			al2.add(new Theator(T_id,T_name,al));
		}
		
		System.out.println(al2);
		
		Iterator<Theator>itr=al2.iterator();
		
		while(itr.hasNext())
		{   
			Theator t=itr.next();
			
			Collections.sort(t.al);
			
//			Iterator<Movie>itr1=t.al.iterator();
//			
//			while(itr1.hasNext())
//			{
//				itr1.next();
//			}
		}
		
		System.out.println(al2);
	}
	
	

}
