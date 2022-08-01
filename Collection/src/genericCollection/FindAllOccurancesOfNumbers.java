package genericCollection;

import java.util.ArrayList;

public class FindAllOccurancesOfNumbers {
	public static void main(String[] args) {
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
		
		for(int i=0;i<al.size();i++)
		{int c=0;
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i)==al.get(j) && j<i)
				{
					break;
				}
				
				if(al.get(i)==al.get(j) && j>=i)
				{
					c++;
				}
			}
			if(c!=0)
			System.out.println(al.get(i)+" "+c);
		}
	}

}
