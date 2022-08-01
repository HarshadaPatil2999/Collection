package assignmetonArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ConversionOfArrayListToArrayOrViseVarsa {
	public static void main(String[] args) {
		ArrayList<String>al2=new ArrayList<>();
		al2.add("Sunday");
		al2.add("Monday");
	    al2.add("Thuesday");
		al2.add("Wendsday");
		al2.add("Thursday");
		al2.add("Friday");
		al2.add("Saturday");
		System.out.println(al2);
		System.out.println("-------------After Coverting ArrayList into Array----------");
         al2.toArray();
        // System.out.println(al2);
         for(String s:al2)
         {
		    System.out.print(s+" ");
         }
         System.out.println();
         
         String arr[]= {"Jan","Feb","Mar","Apl","May","June","July"};
         System.out.println(Arrays.toString(arr));
         System.out.println();
         ArrayList<String>str=new ArrayList<>(Arrays.asList(arr));
         System.out.println("----------After Converting Arrayy into Array List-----------");
         System.out.println(str);
         
	}

}
