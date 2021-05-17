package stringoperations;

import java.util.*;

public class NonRepeatingCharacters {
	
	// function calculate frequency of a given character in a string
	public static int frequencyCount(char c,String s) {
		int count=0;
		char chr[]=s.toCharArray();
		for(char i : chr) {
			if(i==c) {
				count++;
			}
		}
		return count;
	}
	
	// function to find non repeating characters in a string
	public static String findNonRepeatingCharacters(String s) {
		char chr[]=s.toCharArray();
		String res="";
		for(char c : chr) {
			if(frequencyCount(c, s)==1)
			{
				res+=c;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // creation of Scanner class
		System.out.print("Enter the string : ");
		String string=sc.next();
		System.out.println("The non repeating characters are : "+findNonRepeatingCharacters(string));
		sc.close();
	}

}
