package lab4;

public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private int year;
	/**
	 * @param identificationNumber
	 * @param title
	 * @param numberOfCopies
	 * @param runtime
	 * @param director
	 * @param genre
	 * @param year
	 */
	public Video(int identificationNumber, String title, int numberOfCopies, int runtime, String director, String genre,
			int year) {
		super(identificationNumber, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Director : "+director);
		System.out.println("Genre : "+genre);
		System.out.println("Year of Release : "+year);
	}

}