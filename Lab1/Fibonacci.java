package lab_1;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		a=1; b=1;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(n+"th Fibonacci term is = "+c);
		
		System.out.println("Do you want to perform a recursive way ?");
		String str=sc.next();
		int f;
		
		if(str.equals("yes"))
		{
			f=fibo(n);
			System.out.println("Using recursive way the term is ");
			System.out.println(f);
		}
		else
			System.out.println("End of program");
	}
	
	static int fibo(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}

}
