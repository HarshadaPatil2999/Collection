package comparator;

public class Movie implements Comparable<Movie>
	
{
	int id,boxOfficeCollection,rating;
	String name;
	
	Movie(int id,String name,int rating,int boxOfficeCollection )
	{
		this.id=id;
		this.name=name;
		this.rating=rating;
		this.boxOfficeCollection=boxOfficeCollection;
	}
	public String toString()
	{
		return id+" "+name+" "+rating+" "+boxOfficeCollection;
	}
	
	public int compareTo(Movie m)
	{
		if(this.rating<m.rating)
			return -1;
		else if(this.rating>m.rating)
			return 1;
		else
			return 0;
	}

}
