package comparator;

import java.util.ArrayList;


public class Theator   {
	int T_id;
	String T_name;
	ArrayList<Movie>al;
	
	Theator(int T_id,String T_name,ArrayList<Movie>al)
	{
		this.T_id=T_id;
		this.T_name=T_name;
		this.al=al;
	}
	public String toString()
	{
		return T_id+" "+T_name+" "+al;
	}
	
	
}
