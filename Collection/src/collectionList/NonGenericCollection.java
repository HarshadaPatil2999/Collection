package collectionList;

import java.util.ArrayList;import java.util.Arrays;

public class NonGenericCollection {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(40);
		a1.add(2.5);
		a1.add("riya");
		a1.add("raj");
		a1.add(3.25);
		a1.add(1.2f);
		a1.add(34);
		a1.add(45);
		a1.add(5.5f);
		a1.add(new Stud(101,"priya",67));
		a1.add(new Stud(102,"minal",77));
		System.out.println(a1);
//		for(int i=0;i<a1.size();i++)
//		{
//			System.out.print(a1.get(i)+" ");
//		}
		
//		for(Object o:a1)
//		{
//			System.out.print(o+" ");
//		}
		for(Object o:a1)
			{
			String s=o.getClass().getName();
			//System.out.println(o.getClass());
			//System.out.println(s);
			//if(s.equalsIgnoreCase("java.lang.Integer"))//for int value only class
			//if(s.equalsIgnoreCase("java.lang.String"))//for string class only
		//	if(s.equals("java.lang.Float"))
			if(s.equalsIgnoreCase("collectionList.Stud"))//for object of  any array there class means package name.(dot) 
				                                          //respective classname
				//	if(s.equals("java.lang.Double"))
				System.out.println(o);
		    }
		
		
	}

	

}
