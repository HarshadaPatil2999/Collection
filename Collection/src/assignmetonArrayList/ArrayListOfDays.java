package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfDays {
	public static void main(String[] args) {
		//ArrayList<String>al=new ArrayList<String>();
		ArrayList<String>al2=new ArrayList<>();
		al2.add("Sunday");
		al2.add("Monday");
	    al2.add("Thuesday");
		al2.add("Wendsday");
		al2.add("Thursday");
		al2.add("Friday");
		al2.add("Saturday");
		
		for(int i=0;i<al2.size();i++)
		{
			if(al2.get(i).length()>7)
			{
				al2.remove("i");
			}
			else
				System.out.println(al2.get(i));
		}
		//System.out.println(al);
		
	}

}
