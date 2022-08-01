package assignmetonArrayList;

import java.util.ArrayList;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		ArrayList<Character>ch=new ArrayList<>();
		ch.add('d');
		ch.add('g');
		ch.add('h');
		ch.add('d');
		ch.add('d');
		ch.add('h');
		ch.add('g');
		
		System.out.println(ch);
		for(int i=0;i<ch.size();i++)
		{int cnt=0;
			for(int j=0;j<ch.size();j++)
			{
				if(ch.get(i)==ch.get(j)&& j<i)
				{
					break;
				}
				if(ch.get(i)==ch.get(j)&& j>=i)
				{
					cnt++;
				}
				
			}
			if(cnt!=0)
			{
				System.out.println(ch.get(i));
			}
		}
		
		
	}

}
