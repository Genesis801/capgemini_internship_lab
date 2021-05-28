import java.util.HashMap;
import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=sc.nextInt();
		
		char a[]=new char[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.next().charAt(0);
		}
		
		HashMap<Character, Integer> map=checkFreq(a);
		
		System.out.println("Result:");
		for(HashMap.Entry<Character, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}

	static HashMap<Character, Integer> checkFreq(char[] a){
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char c:a) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		return map;
	}

}
