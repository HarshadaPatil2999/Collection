package containment;

public class Theator {
	int id,total1DayCollection,noOfMovies;
	String name;
	
	Theator(int id,String name,int noOfMovies,int total1DayCollection)
	{
		this.id=id;
		this.name=name;
		this.noOfMovies=noOfMovies;
		this.total1DayCollection=total1DayCollection;
	}
	public String toString()
	{
		return id+" "+name+" "+noOfMovies+" "+total1DayCollection;
	}

}
