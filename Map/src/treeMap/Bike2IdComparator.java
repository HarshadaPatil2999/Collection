package treeMap;

import java.util.Comparator;

public class Bike2IdComparator implements Comparator<Bike2> {
	public int compare(Bike2 b1,Bike2 b2)
	{
		return b1.id-b2.id;
	}

}
