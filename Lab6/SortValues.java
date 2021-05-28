import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SortValues {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		char ch='y';
		while(ch=='y') {
			System.out.println("Enter Key:");
			int key=sc.nextInt();
			
			System.out.println("Enter value:");
			int val=sc.nextInt();
			
			map.put(key,val);
			
			System.out.println("Do you want to insert another record ? (y/n)");
			ch=sc.next().trim().charAt(0);
		}
		List<Integer> list=getValues(map);
		
		System.out.println("The List after sorting the values are:");
		int k=0;
		for(@SuppressWarnings("unused") int i:list) {
			System.out.print(list.get(k++)+" ");
		}
		System.out.println();
	}
	static List<Integer> getValues(HashMap<Integer, Integer> map){
		List<Integer> l=new ArrayList<Integer>();
		
		for(HashMap.Entry<Integer,Integer> m:map.entrySet()) {
			l.add(m.getValue());
		}
		Collections.sort(l);
		return l;
	}

}
