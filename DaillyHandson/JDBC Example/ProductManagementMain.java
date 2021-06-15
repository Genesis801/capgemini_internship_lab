package jdbccrudexample;

import java.util.Scanner;

public class ProductManagementMain {

	public static void main(String[] args) {
		
		ProductManagementSystem pms=new ProductManagementSystem();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		pms.dbConnection();
		//pms.createTableProduct();
		
		char cont='y';
		while(cont=='y') {
			System.out.println("Enter choice:");
			System.out.println("===============================================");
			System.out.println("1.Insert Product\n2.Update\n3.Delete\n4.Get a single product\n5.Get all products\n6.Exit");

			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				pms.readProductDetails();
				pms.insertIntoProductUsingPs();
				break;
				
			case 2:
				pms.updateProductById();
				break;
			case 3:
				pms.deleteProductById();
				break;
			case 4:
				pms.getProductById();
				break;
			case 5:
				pms.getAllProducts();
				break;
			case 6:
				System.out.println("Thank You");
				System.exit(0);
				break;
				default:System.out.println("Wrong choice");
			}
			System.out.println("Do you want to continue ? (y/n)");
			cont=sc.next().trim().charAt(0);
			
		}//end while
		
		
	}//end main

}//end class
