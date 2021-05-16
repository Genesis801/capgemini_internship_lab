package lab_3;

import java.util.*;
public class IntegerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line of integer with one space in between:");
		String s=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(s," ");
		String str;
		int n,sum=0;
		while(st.hasMoreTokens())
		{
			str=st.nextToken();
			n=Integer.parseInt(str);
			System.out.println(n+"");
			sum=sum+n;
		}
		System.out.println("Total sum = "+sum);
		sc.close();
	}

}
