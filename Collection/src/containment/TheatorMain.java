package containment;

import java.util.ArrayList;
import java.util.Arrays;

public class TheatorMain {
	public static void main(String[] args) {
		ArrayList<Theator>al=new ArrayList<>();
		
		al.add(new Theator(101,"Indira",3,50000));
		al.add(new Theator(102,"5Star",3,80000));
		al.add(new Theator(103,"NewPride",3,60000));
		al.add(new Theator(101,"Iconic",3,70000));
		System.out.println(al);
		
		Theator th[]=new Theator[al.size()];
		al.toArray(th);
		System.out.println(Arrays.toString(th));
//		for(int i=0;i<al.size();i++)
//		{
//			th[i]=al.get(i);
//		}
//		System.out.println(Arrays.toString(th));
		
		for(Theator t:th)
		{
			if(t.name.startsWith("I"))
			{
				System.out.println(t.name+" "+t.total1DayCollection);
			}
		}
		
	}

}
