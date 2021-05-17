package stringoperations;

import java.util.Scanner;
public class CharacterSymbolOrDigit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string=sc.next();
		string=string.toLowerCase();
		try {
		System.out.print("Enter the index : ");
		int i=sc.nextInt();
		if(string.charAt(i-1)>=97 && string.charAt(i-1)<=122)
			System.out.printf("\nIndex %d contains an alphabet.",i);
		else if(string.charAt(i-1)>=48 && string.charAt(i-1)<=57)
			System.out.printf("\nIndex %d contains a digit.",i);
		else
			System.out.printf("\nIndex %d contains a symbol.",i);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of Bounds");
		}
		
		sc.close();
		
	}

}