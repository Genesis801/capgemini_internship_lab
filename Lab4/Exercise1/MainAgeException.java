import java.util.Scanner;

public class MainAgeException {

	public static void validateAge(int age) throws AgeException
	{
		if(age<16)
			throw new AgeException("Age should be above 15 years.");
		else
			System.out.println("Valid Age.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter Age : ");
			int age=sc.nextInt();
			validateAge(age);
		}catch(AgeException e)
		{
			System.out.println("Error : "+e);
		}
		sc.close();

	}

}
