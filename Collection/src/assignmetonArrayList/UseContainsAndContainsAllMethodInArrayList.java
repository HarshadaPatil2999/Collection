package assignmetonArrayList;

import java.util.ArrayList;

public class UseContainsAndContainsAllMethodInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer>arrList=new ArrayList<>();
		arrList.add(34);
		arrList.add(45);
		arrList.add(22);
		arrList.add(13);
		arrList.add(77);
		ArrayList<Integer>arrList2=new ArrayList<>();
		arrList2.add(34);
		arrList2.add(45);
		arrList2.add(22);
		arrList2.add(13);
		arrList2.add(77);
		ArrayList<Integer>arrList3=new ArrayList<>();
		arrList3.add(34);
		arrList3.add(40);
		arrList3.add(21);
		arrList3.add(33);
		arrList3.add(77);
		System.out.println(arrList);
		System.out.println(arrList.contains(34));
		System.out.println(arrList.contains(10));
		System.out.println(arrList.containsAll(arrList2));
		System.out.println(arrList.containsAll(arrList3));
		
	}

}
