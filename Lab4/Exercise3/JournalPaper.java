package lab4;

public class JournalPaper extends WrittenItem{
	
	private int year;
	
	public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author, int year) {
		super(identificationNumber,title,numberOfCopies,author);
		this.year=year;
	}
	
	@Override
	public int getIdentificationNumber() {
		return super.getIdentificationNumber();
	}
	
	@Override
	public String getTitle() {
		return super.getTitle();
	}
	
	@Override
	public int getNumberOfCopies() {
		return super.getNumberOfCopies();
	}
	
	@Override
	public String getAuthor() {
		return super.getAuthor();
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Year of Publish : "+year);
	}
}