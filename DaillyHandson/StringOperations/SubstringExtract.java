package stringoperations;

import java.util.*;

public class SubstringExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string=sc.next();
		
		System.out.print("Enter the index from which you want to extract the substring : ");
		int index=sc.nextInt();
		
		String substr=string.substring(index-1);
		String rev="";
		for(int i=substr.length()-1;i>=0;i--) {
			rev+=substr.charAt(i);
		}
		if(substr.equals(rev))
			System.out.println("The extracted substring is palindrome.");
		else
			System.out.println("The extracted substring is not palindrome.");
		
		sc.close();
	}

}
