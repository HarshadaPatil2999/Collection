package assignmetonArrayList;

import java.util.ArrayList;

public class AddUniqueElements {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sun");
		al.add("Tue");
		al.add("Wed");
		al.add("Mon");
		
		ArrayList<String>al2=new ArrayList<>();
		for(int i=0;i<al.size();i++)
		{int cnt=0;
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)) && j<i)
				{
					break;
				}
				else if(al.get(i).equals(al.get(j)) && j>=i)
				{
					cnt++;
				}
			}
			if(cnt!=0)
			{
				al2.add(al.get(i));
			}
		}
		System.out.println(al2);
	}

}
