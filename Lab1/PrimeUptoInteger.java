package lab_1;

import java.util.*;
public class PrimeUptoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an integer upto which prime numbers to be printed");
		int num=sc.nextInt();
		
		for(int i=2;i<=num;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.println(i);
			else
				continue;
		}
	}

}
