package lab4;

public abstract class Item {
	
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	/**
	 * @param identificationNumber
	 * @param title
	 * @param numberOfCopies
	 */
	public Item(int identificationNumber, String title, int numberOfCopies) {
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	/**
	 * @return the identificationNumber
	 */
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	/**
	 * @param identificationNumber the identificationNumber to set
	 */
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the numberOfCopies
	 */
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	/**
	 * @param numberOfCopies the numberOfCopies to set
	 */
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identificationNumber;
		result = prime * result + numberOfCopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identificationNumber != other.identificationNumber)
			return false;
		if (numberOfCopies != other.numberOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", numberOfCopies="
				+ numberOfCopies + "]";
	}
	
	public void checkIn() {
		numberOfCopies+=1;
	}
	
	public void checkOut() {
		if(numberOfCopies-1<0)
		{
			numberOfCopies=1;
			System.out.println("Cannot check out...");
		}
		numberOfCopies-=1;
	}
	
	public void addItem() {
		numberOfCopies+=1;
	}
	
	public void print() {
		System.out.println("Identification Number : "+identificationNumber);
		System.out.println("Title : "+title);
		System.out.println("Number of copies : "+numberOfCopies);
	}

}