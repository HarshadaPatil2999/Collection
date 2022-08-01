package demo;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();//last in first out
		st.push(30);
		st.push(20);
		st.push(33);
		st.push(45);
		st.push(1);
		st.push(23);
		System.out.println(st);
		st.pop();//remove last element
		System.out.println(st);
		System.out.println(st.capacity());
		System.out.println(st.contains(2));
		System.out.println(st.peek());//last value of stack
		System.out.println(st.empty());
		System.out.println(st.indexOf(1));
		System.out.println(st.search(33));//display the index of element
		System.out.println("______Using Enumeration_______");
		
	      Enumeration<Integer>e=st.elements();//it is a fail safe.
	      while(e.hasMoreElements())
	      {
	    	  if(e.nextElement()==20)
	    		  //st.add(34);
	    		  st.addElement(34);
	    		 //st.removeElement(20);
	    	
	      }
	      System.out.println(st);
		
	}

}
