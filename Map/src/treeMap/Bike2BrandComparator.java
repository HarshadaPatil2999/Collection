package treeMap;

import java.util.Comparator;

public class Bike2BrandComparator  implements Comparator<Bike2> {
	public int compare(Bike2 b1,Bike2 b2)
	{
		if(b1.brand.equals(b2.brand))
			//return b1.name.compareTo(b2.name);
			return b1.id-b2.id;
		else
		return b1.brand.compareTo(b2.brand);//only we return brand then it not display the same brand name
	}

}
