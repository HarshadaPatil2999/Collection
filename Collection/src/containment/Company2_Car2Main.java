package containment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Company2_Car2Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Company2>c=new ArrayList<>();
		ArrayList<Car2>car=null;
		System.out.println("Enter size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Company id,name,List of Cars");
			int c_id=sc.nextInt();
			String c_name=sc.next();
			 car= new ArrayList<>();
			for(int j=0;j<3;j++)
			{    
				System.out.println("Enter Car id,name,year,price");
				int id=sc.nextInt();
				String name=sc.next();
				int year=sc.nextInt();
				int price=sc.nextInt();
			car.add(new Car2(id,name,year,price));
			}
			c.add(new Company2(c_id,c_name,car));
		}
		System.out.println(c);
		
		int y=0;
		
		
//		for(int i=0;i<c.size();i++)
//		{
//			Company2 c1=c.get(i);
//			for(int j=0;j<c1.car.size();j++)
//			{ 
//				if(c1.car.get(j).id==105)
//				{
//					y=c1.car.get(i).year;
//				}
//			}
//		}
		
		
		for(Company2 c1:c)
		{
			for(Car2 c2:c1.car)
			{
				if(c2.id==105)
				{
					y=c2.year;
					
				}
			}
		}
		
		
		Iterator<Company2>itr=c.iterator();
		
		while(itr.hasNext())
		{  Company2 cd=itr.next();
		
			
		Iterator<Car2>itr2=cd.car.iterator();
			
		   while(itr2.hasNext())
		{
			Car2 d=itr2.next();
			  if(y==d.year)
			  {
				itr2.remove();
			  }
		}
		
		
	   }
		System.out.println(c);

}
}
