package genericCollection;

import java.util.ArrayList;

public class FindAverageOfMarks {
	public static void main(String[] args) {
		
		ArrayList<Float> al=new ArrayList<>();
		
		al.add(67.5f);
		al.add(77.2f);
		al.add(80.4f);
		al.add(56.1f);
		al.add(60.0f);
		System.out.println(al);
		//System.out.println(al.size());
		Float sum=0.0f;
		for(int i=0;i<al.size();i++)
		{
			sum=sum+al.get(i);
		}
		Float avg=sum/al.size();
		System.out.println(avg);
	}

}
