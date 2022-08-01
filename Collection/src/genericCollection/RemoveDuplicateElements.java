package genericCollection;

import java.util.ArrayList;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		
			
			ArrayList<Integer> al=new ArrayList<>() ;
				
				al.add(10);
				al.add(20);
				al.add(30);
				al.add(40);
				al.add(50);
				al.add(60);
				al.add(10);
				al.add(20);
				al.add(30);
				al.add(10);
				al.add(20);
				al.add(30);
				System.out.print(al+" ");
				System.out.println();
				ArrayList<Integer> al1=new ArrayList<>();
				for(int i=0;i<al.size();i++)
				{
					 int cnt=0;
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
						
						//System.out.println(al.get(i));
						al1.add(al.get(i));
					}
			   }
				System.out.println(al1);
	}

}
