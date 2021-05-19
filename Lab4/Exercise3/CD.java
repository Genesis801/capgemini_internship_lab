package lab4;

public class CD extends MediaItem{
	
	private String artist;
	private String genre;
	/**
	 * @param identificationNumber
	 * @param title
	 * @param numberOfCopies
	 * @param runtime
	 * @param artist
	 * @param genre
	 */
	public CD(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
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
	
	@Override
	public void print() {
		super.print();
		System.out.println("Artist : "+artist);
		System.out.println("Genre : "+genre);
	}
	

}