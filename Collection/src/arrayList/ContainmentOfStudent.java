package arrayList;

import java.util.ArrayList;

public class ContainmentOfStudent {
	public static void main(String[] args) {
		ArrayList<Integer> s1=new ArrayList<>();
		s1.add(85);
		s1.add(80);
		s1.add(60);
		s1.add(50);
		s1.add(50);
		
		ArrayList<Integer> s2=new ArrayList<>();
		s2.add(60);
		s2.add(65);
		s2.add(70);
		s2.add(45);
		s2.add(60);
		
		ArrayList<Integer> s3=new ArrayList<>();
		s3.add(50);
		s3.add(60);
		s3.add(70);
		s3.add(88);
		s3.add(67);
		
		ArrayList<Student3> al=new ArrayList<>();
		al.add(new Student3(101,"Riya","Comp",s1));
		al.add(new Student3(102,"Raj","IT",s2));
		al.add(new Student3(103,"Priya","Comp",s3));
		
		
//		for(Student3 s:al)
//		{int sum=0;
//			for(Integer i:s.marks)
//			{
//				sum=sum+i;
//			}
//			double percentage=sum/s.marks.size();
//			
//			System.out.println(s.id+" "+s.name+" "+s.dept+" "+sum+" "+percentage);
//		}
		
		
		for(Student3 s:al)
		{
			int sum=0;
			for(Integer i:s.marks)
			{
				sum+=i;
			}
			double percentage=sum/s.marks.size();
			if(percentage>65)
				System.out.println(s.name+" "+percentage);
		}
		
		
	}

}
