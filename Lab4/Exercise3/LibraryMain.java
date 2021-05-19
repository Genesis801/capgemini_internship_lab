import java.util.Scanner;

public class LibraryMain {
	
	public static void chooseBook() {
		Scanner sc=new Scanner(System.in);
		int identificationNumber;
		String title;
		int numberOfCopies;
		String author;
		int choice;
		char c=' ';
		System.out.print("Enter the identification number of the Book : ");
		identificationNumber=sc.nextInt();
		System.out.print("Enter the title of the Book : ");
		sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the number of copies of the Book : ");
		numberOfCopies=sc.nextInt();
		System.out.print("Enter the author of the Book : ");
		sc.nextLine();
		author=sc.nextLine();
		
		Book book = new Book(identificationNumber,title,numberOfCopies,author);
		
		while(true) {
			
			System.out.println("1. Check In");
			System.out.println("2. Check Out");
			System.out.println("3. Add Item");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
				case 1: book.checkIn();
						book.print();
						break;
				case 2: book.checkOut();
						book.print();
						break;
				case 3: book.addItem();
						book.print();
						break;
				default: System.out.println("Enter correct choice (1-3)...");
			}
			System.out.print("Do you want to continue?(y/n) ");
			sc.nextLine();
			c=sc.next().charAt(0);
			if(c=='n' || c=='N') {
				break;
			}
		}
		
		sc.close();
	}
	
	public static void chooseJournalPaper() {
		Scanner sc=new Scanner(System.in);
		int identificationNumber;
		String title;
		int numberOfCopies;
		String author;
		int year;
		int choice;
		char c=' ';
		System.out.print("Enter the identification number of the Journal Paper : ");
		identificationNumber=sc.nextInt();
		System.out.print("Enter the title of the Journal Paper : ");
		sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the number of copies of the Journal Paper : ");
		numberOfCopies=sc.nextInt();
		System.out.print("Enter the author of the Journal Paper : ");
		sc.nextLine();
		author=sc.nextLine();
		System.out.print("Enter the year of publish of the Journal Paper : ");
		year=sc.nextInt();
		
		JournalPaper jp = new JournalPaper(identificationNumber,title,numberOfCopies,author,year);
		
		while(true) {
			
			System.out.println("1. Check In");
			System.out.println("2. Check Out");
			System.out.println("3. Add Item");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
				case 1: jp.checkIn();
						jp.print();
						break;
				case 2: jp.checkOut();
						jp.print();
						break;
				case 3: jp.addItem();
						jp.print();
						break;
				default: System.out.println("Enter correct choice (1-3)...");
			}
			System.out.print("Do you want to continue?(y/n) ");
			sc.nextLine();
			c=sc.next().charAt(0);
			if(c=='n' || c=='N') {
				break;
			}
		}
		
		sc.close();
	}
	
	public static void chooseWrittenItem() {
		Scanner sc=new Scanner(System.in);
		int choice;
			System.out.println("1. Book");
			System.out.println("2. Journal Paper");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					chooseBook();
					break;
				case 2:
					chooseJournalPaper();
					break;
				default:System.out.println("Enter correct choice (1-2)...");
			}
			
		sc.close();
	}
	
	public static void chooseVideo() {
		Scanner sc=new Scanner(System.in);
		int identificationNumber;
		String title;
		int numberOfCopies;
		int runtime;
		String director;
		String genre;
		int year;
		int choice;
		char c=' ';
		System.out.print("Enter the identification number of the Video : ");
		identificationNumber=sc.nextInt();
		System.out.print("Enter the title of the Video : ");
		sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the number of copies of the Video : ");
		numberOfCopies=sc.nextInt();
		System.out.print("Enter the runtime of the Video : ");
		runtime=sc.nextInt();
		System.out.print("Enter the director of the Video : ");
		sc.nextLine();
		director=sc.nextLine();
		System.out.print("Enter the genre of the Video : ");
		//sc.nextLine();
		genre=sc.nextLine();
		System.out.print("Enter the year of publish of the Video : ");
		year=sc.nextInt();
		
		Video video = new Video(identificationNumber,title,numberOfCopies,runtime,director,genre,year);
		
		while(true) {
			
			System.out.println("1. Check In");
			System.out.println("2. Check Out");
			System.out.println("3. Add Item");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
				case 1: video.checkIn();
						video.print();
						break;
				case 2: video.checkOut();
						video.print();
						break;
				case 3: video.addItem();
						video.print();
						break;
				default: System.out.println("Enter correct choice (1-3)...");
			}
			System.out.print("Do you want to continue?(y/n) ");
			sc.nextLine();
			c=sc.next().charAt(0);
			if(c=='n' || c=='N') {
				break;
			}
		}
		
		sc.close();
	}
	public static void chooseCD() {
		Scanner sc=new Scanner(System.in);
		int identificationNumber;
		String title;
		int numberOfCopies;
		int runtime;
		String artist;
		String genre;
		int choice;
		char c=' ';
		System.out.print("Enter the identification number of the CD : ");
		identificationNumber=sc.nextInt();
		System.out.print("Enter the title of the CD : ");
		sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the number of copies of the CD : ");
		numberOfCopies=sc.nextInt();
		System.out.print("Enter the runtime of the CD : ");
		runtime=sc.nextInt();
		System.out.print("Enter the artist of the CD : ");
		sc.nextLine();
		artist=sc.nextLine();
		System.out.print("Enter the genre of the Video : ");
		//sc.nextLine();
		genre=sc.nextLine();
		
		CD video = new CD(identificationNumber,title,numberOfCopies,runtime,artist,genre);
		
		while(true) {
			
			System.out.println("1. Check In");
			System.out.println("2. Check Out");
			System.out.println("3. Add Item");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
				case 1: video.checkIn();
						video.print();
						break;
				case 2: video.checkOut();
						video.print();
						break;
				case 3: video.addItem();
						video.print();
						break;
				default: System.out.println("Enter correct choice (1-3)...");
			}
			System.out.print("Do you want to continue?(y/n) ");
			sc.nextLine();
			c=sc.next().charAt(0);
			if(c=='n' || c=='N') {
				break;
			}
		}
		
		sc.close();
	}
	
	public static void chooseMediaItem() {
		Scanner sc=new Scanner(System.in);
		int choice;
			System.out.println("1. Video");
			System.out.println("2. CD");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					chooseVideo();
					break;
				case 2:
					chooseCD();
					break;
				default:System.out.println("Enter correct choice (1-2)...");
			}
			
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm_sc=new Scanner(System.in);
		int choice1;

		System.out.println("  Welcome to Library  ");
		System.out.println("======================");
		System.out.println("1. Choose Written Item");
		System.out.println("2. Choose Media Item");
		System.out.print("Enter your choice : ");
		choice1=sm_sc.nextInt();
		switch(choice1) {
			case 1:
				chooseWrittenItem();
				break;
			case 2:
				chooseMediaItem();
				break;
				default: System.out.println("Enter correct choice (1-2)....");
			}
		
		sm_sc.close();
			
	}
	
}
