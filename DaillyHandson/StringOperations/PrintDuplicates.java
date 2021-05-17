package stringoperations;

import java.util.Scanner;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string = sc.next();
		System.out.println("The duplicate characters are : ");
		for(int i=0;i<string.length();i++)
		{
			for(int j=i+1;j<string.length();j++)
			{
				if(string.charAt(i)==string.charAt(j)) {
					System.out.print(string.charAt(j)+" ");
					break;
				}
			}
		}
		
		sc.close();
	}

}