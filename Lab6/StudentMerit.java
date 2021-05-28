import java.util.HashMap;
import java.util.Scanner;

public class StudentMerit {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of student:");
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		char ch='y';
		while(ch=='y') {
			System.out.println("Enter student Id:");
			int id=sc.nextInt();
			System.out.println("Enter marks obtained:");
			int marks=sc.nextInt();
			
			hm.put(id, marks);
			
			System.out.println("Do you want ot enter details of another student ? (y/n)");
			ch=sc.next().charAt(0);
		}
		HashMap<Integer, String> map=getStudents(hm);
		
		for(HashMap.Entry<Integer, String> i:map.entrySet()) {
			System.out.println("Id: "+i.getKey()+"| Medal: "+i.getValue());
		}
	}
	static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hm){
		HashMap<Integer, String> h=new HashMap<Integer, String>(); 
		
		for(HashMap.Entry<Integer, Integer> m:hm.entrySet() ) {
			if(m.getValue()>90)
				h.put(m.getKey(), "Gold");
			if(m.getValue()>=80 && m.getValue()<90)
				h.put(m.getKey(), "Silver");
			if(m.getValue()>=70 && m.getValue()<80)
				h.put(m.getKey(), "Bronze");
			if(m.getValue()<70)
				h.put(m.getKey(), "None");
		}
		return h;
	}
}
