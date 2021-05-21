package com.capgemini.registeruser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterUser {
	
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String userName; 
	private String password;
  
	Scanner sc = new Scanner(System.in);

	public RegisterUser() {
		super();
	}

	public RegisterUser(String firstName, String lastName, String mobileNo, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.userName = userName;
		this.password = password;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String validateFirstName(String fName) {
		if(fName == null) {
			return "First Name cannot be null";
		}
    else {
			return "First Name is valid";
		}
	}

		public String validateLastName(String lName) {
			if(lName == null) {
				return "Last Name cannot be null";
			}
      else {
				return "Last Name is valid";
			}
	}
	
	public String validateMobileNo(String mobNo) {
		if(mobNo.length() != 10) {
			return "mobileNo can't be less than 10 digits" ;
		}
		else if(!mobNo.matches("\\d+")) {
			return "mobileNo can contain digits only" ;
		}
		else if(!mobNo.startsWith("0")) {
			return "mobileNo should start with 0";
		}
		else {
			return "Mobile number is valid";
		}
	}
	
	public String validateUserName(String un) {
		
    String userpattern = "^[A-Za-z0-9]{1,}[._-]{1}[A-Za-z0-9]{1}(.+){3,}$";
		Pattern pat1=Pattern.compile(userpattern);
		boolean username_result;
	
    Matcher matcher1;
		matcher1=pat1.matcher(un);
		username_result=matcher1.matches();
		
    if(!username_result)
			return "Invalid Username";
		else
			return "Valid Username";
	}
	
	public String validatePassword(String psw) {
		
    if(psw.length()<8 || psw.length()>16)
			return "Invalid Password";
		else
			return "Valid Password";
	}
	
	public void readDetails() {
		System.out.println("Enter the details of Register User");
		System.out.println("=====================================");
    
    System.out.println("Enter the firstName ");
		System.out.println(validateFirstName(firstName = sc.nextLine()));
		
    System.out.println("Enter the lastName ");
		System.out.println(validateLastName(lastName = sc.nextLine()));
		
    System.out.println("Enter the mobileNo ");
		System.out.println(validateMobileNo(mobileNo = sc.nextLine()));
		
    System.out.println("Enter the userName ");
		System.out.println(validateUserName(userName = sc.nextLine()));
		
    System.out.println("Enter the password ");
		System.out.println(validatePassword(password = sc.nextLine()));
	}
		
	public String displayDetails() {
		return new String("The details of the user = Deb Roy 0967413242 username_admin admin-password");
	}
	
	public static void main(String[] args) {
		RegisterUser regusr=new RegisterUser("Deb","Roy","0967413242","user-name","password123");
		
    System.out.println(regusr.validateFirstName(regusr.getFirstName()));
		System.out.println(regusr.validateLastName(regusr.getLastName()));
		System.out.println(regusr.validateMobileNo(regusr.getMobileNo()));
		System.out.println(regusr.validateUserName(regusr.getUserName()));
		System.out.println(regusr.validatePassword(regusr.getPassword()));
	}

}
