package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class TheaterMain {
	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Theater>al2=new ArrayList<>();
		
		System.out.println("Enter size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter :Therator id,name,MovieList");
			int T_id=sc.nextInt();
			String T_name=sc.next();
			ArrayList<Movie>al=new ArrayList<>();
			for(int j=0;j<3;j++)
			{
			System.out.println("Enter :Movie id,name,rating,Box Office Collection");
				int id=sc.nextInt();
				String name=sc.next();
				int rating=sc.nextInt();
				int boxOfficeCollection=sc.nextInt();
			al.add(new Movie(id,name,rating,boxOfficeCollection));
				Collections.sort(al);
			}
			al2.add(new Theater(T_id,T_name,al));
		}
		
		System.out.println(al2);
		

}
}