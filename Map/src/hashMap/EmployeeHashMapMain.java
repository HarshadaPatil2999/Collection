package hashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMapMain {
	public static void main(String[] args) {
		
		HashMap<Integer,Employee>hm=new HashMap<>() ;//display  Randomly
		hm.put(101, new Employee("Riya","HR",50000));
		hm.put(110, new Employee("Mera","Sales",40000));
		hm.put(104, new Employee("Piya","HR",54000));
		hm.put(114, new Employee("Sonal","Development",60000));
		hm.put(100, new Employee("Minal","Sales",52000));
		hm.put(113, new Employee("Riyaj","Marketing",60000));
		hm.put(116, new Employee("Anjali","Development",58000));
		hm.put(121, new Employee("Pooja","Sales",38000));
		hm.put(115, new Employee("Anuja","Marketing",45000));
		hm.put(117, new Employee("Payal","HR",59000));
		hm.put(119, new Employee("Swarali","HR",62000));
		System.out.println(hm);
		
		for(Map.Entry<Integer, Employee>ent:hm.entrySet())
		{  //  System.out.println(ent.getKey()+" "+ent.getValue().name+" "+ent.getValue().dept+" "+ent.getValue().salary);//if we do not overrident the public String to String method then write whole value data
			if(ent.getValue().dept.equals("HR"))
				System.out.println(ent.getKey()+" "+ent.getValue());
			//System.out.println(ent.getKey()+" "+ent.getValue().name);
		//System.out.println(ent.getKey()+" "+ent.getValue().name+" "+ent.getValue().dept+" "+ent.getValue().salary);
		}
		
	}

}
