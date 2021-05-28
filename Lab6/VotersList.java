import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.util.List;

public class VotersList {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		
		char ch='y';
		while(ch=='y') {
			
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			System.out.println("Enter age:");
			int age=sc.nextInt();
			
			hm.put(id, age);
			
			System.out.println("Do you wanna add another name: (y/n)?");
			ch=sc.next().trim().charAt(0);
		}
		List<Integer> list=votersList(hm);
		
		System.out.println("The valid Id's which is eligible for voting is");
		int j=0;
		for(@SuppressWarnings("unused") int i:list)
			System.out.println(list.get(j++));
	}
	static List<Integer> votersList(HashMap<Integer, Integer> hm) {
		List<Integer> l=new ArrayList<Integer>();
		
		for(HashMap.Entry<Integer,Integer> m: hm.entrySet()) {
			if(m.getValue()>=18) {
				l.add(m.getKey());
			}
		}
		return l;
		
	}
}
