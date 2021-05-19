package lab4;

public abstract class MediaItem extends Item{
	
	private int runtime;

	/**
	 * @param identificationNumber
	 * @param title
	 * @param numberOfCopies
	 * @param runtime
	 */
	public MediaItem(int identificationNumber, String title, int numberOfCopies, int runtime) {
		super(identificationNumber, title, numberOfCopies);
		this.runtime = runtime;
	}

	/**
	 * @return the runtime
	 */
	public int getRuntime() {
		return runtime;
	}

	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Runtime : "+runtime);
	}

}