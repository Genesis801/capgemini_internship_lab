package stringoperations;

import java.util.Scanner;

public class MaximumOccuringCharacter {
	final static int ascii_size=256;
	
	// function to find maximum occuring character in a string s
	public static char MaxOccurChar(String s) {
		int count[]=new int[ascii_size];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
		for(int i=0;i<s.length();i++) {
			if(max<count[s.charAt(i)]) {
				max=count[s.charAt(i)];
				result = s.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // creation of Scanner class
		System.out.print("Enter the string : ");
		String string=sc.next();
		
		System.out.println("Maximum occuring character in the string is '"+MaxOccurChar(string)+"'.");
		
		sc.close();
	}

}