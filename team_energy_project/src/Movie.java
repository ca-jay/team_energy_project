import java.util.HashMap;

class Movie{
	
	public String name; 
	
	public String genre; 
	
	public int released; 
	
	public String[] cast; 
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setReleased(int released) {
		this.released = released;
	}
	
	public void setCast(String[] cast) {
		this.cast = cast;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public int getReleased() {
		return this.released;
	}
	
	public String[] getCast() {
		return this.cast;
	}
	
	
	
	public void displayMovie() {
		
		System.out.println("Movie: " + this.getName());
		System.out.println("Genre: " + this.getGenre());
		System.out.println("Released: " + this.getReleased());
		System.out.println("Cast: " + this.getCast());
	}
	
	
	
	public void setQuestions(HashMap<String, Boolean> map) {
				
		Questions movie = new Questions(); 	
		movie.setAttributes(map);
	
	}
	
	


	
}

