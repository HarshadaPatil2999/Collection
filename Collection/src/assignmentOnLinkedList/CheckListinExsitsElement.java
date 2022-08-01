package assignmentOnLinkedList;

import java.util.LinkedList;

public class CheckListinExsitsElement {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(60);
		ll.add(70);
		ll.add(10);
		ll.add(55);
		ll.add(90);
		ll.add(30);
		ll.add(90);
		ll.add(10);
		
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
		{
			for(int j=i+1;j<ll.size();j++)
			{
			
			 if(ll.get(i)==ll.get(j) )
			{
				System.out.println(ll.get(i));
				
			}
			}
				
		}
		
	}

}
