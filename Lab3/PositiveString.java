package lab_3;

import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		
		boolean res=checkPositive(s);
		if(res==true)
			System.out.println("Positive String");
		else
			System.out.println("Not a positive string");
		
		sc.close();
	}
	static boolean checkPositive(String s)
	{
		boolean b=true;
		for(int i=0;i<s.length()-1;i++)
		{
			if((int)s.charAt(i)>(int)(s.charAt(i+1)))
			{
				b=false;
				break;
			}
			else
				continue;
		}
		if(b==false)
			return false;
		else
			return true;
	}
}
