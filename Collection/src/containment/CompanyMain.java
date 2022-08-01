package containment;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Company>c=new ArrayList<>();
		System.out.println("Enter size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Company id,name,List of Cars");
			int c_id=sc.nextInt();
			String c_name=sc.next();
			ArrayList<Car>car=new ArrayList<>();
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter Car id,name,year,price");
				int id=sc.nextInt();
				String name=sc.next();
				int year=sc.nextInt();
				int price=sc.nextInt();
				car.add(new Car(id,name,year,price));
			}
			c.add(new Company(c_id,c_name,car));
		}
		System.out.println(c);
		for(Company c1:c)
		{
			for(Car c2:c1.car)
			{
				if(c2.year==2000 && c2.price>600000)
				{
					System.out.println(c1.c_id+" "+c1.c_name+" "+c2.name+" "+c2.year+" "+c2.price);
				}
			}
		}
		
	}

}
