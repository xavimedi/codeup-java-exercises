package movies;

public class Movie{

	private String name;
	private String category;

	public Movie(String name, String category){
		this.name = name;
		this.category = category;
	}

	public String movieTitle(){
		return this.name;
	}

	public String movieCategory(){
		return this.category;
	}
}
