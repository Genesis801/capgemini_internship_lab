package stringoperations;

import java.util.*;

public class RemoveGivenCharacter {

	// function to remove a given character from a string
	public static String remove(String s,char k)
	{
		s=s.replace(k, ' ');
		String res="";
		char ch[]=s.toCharArray();
		for(char c : ch) {
			if(c!=' ')
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
		System.out.print("Enter the character to be removed : ");
		char ch=sc.next().charAt(0);
		System.out.printf("New String after removing '%c' is %s.",ch,remove(string,ch));
		
		sc.close();
	}

}