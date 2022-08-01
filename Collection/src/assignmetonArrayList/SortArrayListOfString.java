package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListOfString {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("Radha");
		al.add("Pooja");
		al.add("Anjali");
		al.add("Anuradha");
		al.add("Amit");
		al.add("Swaraj");
		al.add("Smital");
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("-------------After Sorting List-----------");
		System.out.println(al);
		
	}

}
