import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		System.out.println("Enter the array elements:");
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int ss=secondSmallest(a,n);
		System.out.println("Second smallest element is: "+ss);
		sc.close();
	}
	static int secondSmallest(int[] a,int n) {
		int ss;
		Arrays.sort(a);
		ss=a[1];
		return ss;
	}
}
