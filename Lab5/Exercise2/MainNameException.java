import java.util.Scanner;

public class NameExceptionMain {
	
	public static void validateName(String name) throws NameException {
		String nme[]=name.split(" ");
		if(nme[0].length()==0)
			throw new NameException("First Name can't be blank.");
		else if(nme.length<2)
			throw new NameException("Last Name can't be blank.");
		else
			System.out.println("Name is Valid");
			
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter the name : ");
			String name=sc.nextLine();
			validateName(name);
		}
		catch(NameException e) {
			System.out.println("Error: "+e);
		}
		
		sc.close();
	}

}
