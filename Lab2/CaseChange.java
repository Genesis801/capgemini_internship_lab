package lab_2;

import java.util.*;
public class CaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		sortStrings(s,n);
	}
	static void sortStrings(String s[],int n)
	{
		String str[]=new String[n];
		Arrays.sort(s);
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
			//str[i]=s[i].toUpperCase(s[i]);
		}
	}
}
