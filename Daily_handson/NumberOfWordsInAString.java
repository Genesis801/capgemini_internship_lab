package stringoperations;

import java.util.*;
public class NumberOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string=sc.nextLine();
		String words[]=string.split(" ");
		System.out.printf("\nThere are %d words in the string.",words.length);
		
		sc.close();
	}

}