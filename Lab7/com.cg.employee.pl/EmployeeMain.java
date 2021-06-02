package lab_7.com.cg.employee.pl;

import java.util.Scanner;

import lab_7.com.cg.employee.service.EmployeeService;
/**
 * Main class for employee insurance by genesis
 * @author genesis
 *
 */
public class EmployeeMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		char ch='y';
		System.out.println("Welcome To Employee Insurance Scheme:");
		System.out.println("***************************************");
		EmployeeService es=new EmployeeService();
		
		while(ch=='y') {
			System.out.println("1.Create an Employee\n2.See Employee Insurance Scheme\n3.Exit\n");
			System.out.println("============================================");
			int choice=sc.nextInt();
			/**
			 * switch method implemented by Debajyoti Roy
			 */
			switch(choice) {
			case 1:
				es.getEmployeeDetails();
				es.addEmployee();
				System.out.println("Employee added Successfully");
				break;
			case 2:
				es.showEmployeedetails();
				break;
			case 3:
				System.out.println("X----------Thank You for using Employee Insurance Scheme----------X");
				ch='n';
				System.exit(0);
				break;
				default:
					System.out.println("Wrong choice");
			}
			System.out.println("Do you want to continue? (y/n)");
			ch=sc.next().trim().charAt(0);
			if(ch!='y')
				System.out.println("X----------Thank You for using Employee Insurance Scheme----------X");
		}
	}

}
