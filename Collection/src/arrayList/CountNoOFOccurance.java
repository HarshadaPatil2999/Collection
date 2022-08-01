package arrayList;

import java.util.ArrayList;

public class CountNoOFOccurance {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(40);
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{int cnt=0;
			for(int j=0;j<al.size();j++)
			{
				
				if(al.get(i)==al.get(j) && j<i)
				{
					break;
				}
			else if(al.get(i)==al.get(j) && j>=i)
				{
					cnt++;
					
				}
			}
			if(cnt!=0)
			{
				
				System.out.println(al.get(i)+" "+cnt);
			}
		}
	}

}
