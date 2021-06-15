package jdbccrudexample;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductManagementSystem {
	
	
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);
	public Connection dbConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}//close of db connection method
	
	public void createTableProduct() {
		try {
			stmt=con.createStatement();
			String createTable="create table product(pid number primary key, pname varchar2(20),price number(10,2) )";
			int i=stmt.executeUpdate(createTable);
			
			if(i ==0) {
				System.out.println("Table created Successfully");
			}
			else
			{
				System.out.println("Table not created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//End of creating data
	
	public void insertIntoProduct() {
		try {
			stmt=con.createStatement();
			String insertData="insert into product values(102, 'pencil', 10.00)";
			int i=stmt.executeUpdate(insertData);
			
			if(i !=0) {
				System.out.println("Item inserted Successfully");
			}
			else
			{
				System.out.println("Item not inserted Successfully");
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					stmt.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
	}//End of Inserting data
	public void readProductDetails() {
		System.out.println("Enter product details:");
		
		System.out.println("Enter product id");
		productId=sc.nextInt();
		
		System.out.println("Enter product name");
		productName=sc.next();
		
		System.out.println("Enter product price");
		productPrice=sc.nextFloat();
		
	}
	
	int productId;
	String productName;
	float productPrice;
	public void insertIntoProductUsingPs() {
		try {
			String insertData="insert into product values(?,?,?)";
			
			pstmt=con.prepareStatement(insertData);
			pstmt.setInt(1, productId);
			pstmt.setString(2, productName);
			pstmt.setFloat(3, productPrice);
			
			int i=pstmt.executeUpdate();
			
			if(i !=0) {
				System.out.println("Item inserted Successfully");
			}
			else
			{
				System.out.println("Item not inserted Successfully");
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					pstmt.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
	}//Inserting data using Prepared Statemrnt ended
	
	public void getAllProducts() {
		try{
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("select * from product");
			while(rs.next())
			{
				System.out.println("==================================================");
				System.out.println("PID"+"\t\t"+"PNAME"+"\t\t"+"Price");
				
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void getProductById() {
		try{
			String getProduct="select * from product where pid =?";
			pstmt=con.prepareStatement(getProduct);
			
			System.out.println("Enter product id:");
			int id=sc.nextInt();
			pstmt.setInt(1,id);
			rs=pstmt.executeQuery();
			System.out.println("==================================================");
			System.out.println("PID"+"\t\t"+"PNAME"+"\t\t"+"Price");
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));

		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void updateProductById() {
		try{
			String getProduct="update product set price =? where pid=?";
			pstmt=con.prepareStatement(getProduct);
			
			System.out.println("Enter product price:");
			float price=sc.nextFloat();
			pstmt.setFloat(1,price);
			
			System.out.println("Enter product id:");
			int id=sc.nextInt();
			pstmt.setInt(2,id);
			

			int i=pstmt.executeUpdate();
			

			if(i !=0) {
				System.out.println("Item Updated Successfully");
			}
			else
			{
				System.out.println("Item not Updated Successfully");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void deleteProductById() {
		try{
			String getProduct="delete from product where pid=?";
			pstmt=con.prepareStatement(getProduct);
			
			System.out.println("Enter product id:");
			int id=sc.nextInt();
			pstmt.setInt(1,id);
			

			int i=pstmt.executeUpdate();
			

			if(i !=0) {
				System.out.println("Item Deleted Successfully");
			}
			else
			{
				System.out.println("Item not Deleted Successfully");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
