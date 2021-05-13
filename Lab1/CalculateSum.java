
import java.util.*;
public class CalculateSum {
	
	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum=sum+i;
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum;
		sum=calculateSum(n);
		System.out.println("Sum of numbers divisible by 3 or 5 is ="+sum);
	}

}
