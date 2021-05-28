import java.util.HashMap;
import java.util.Scanner;

public class GetSquares {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		
		int n=sc.nextInt();
		int a[]=new int[n];
		
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		HashMap<Integer, Integer> map=getSquares(a);
		
		for(HashMap.Entry<Integer, Integer> m:map.entrySet()) {
			System.out.println("Number: "+m.getKey()+"| Square: "+m.getValue());
		}
	}
	static HashMap<Integer, Integer> getSquares(int[] a){
		HashMap<Integer,Integer> res=new HashMap<Integer, Integer>();
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			res.put(a[i], a[i]*a[i]);
		}
		
		return res;
	}
}
