package com.capgemini.collectionsdemo;
/**
 * 
 * @author genesis
 *Create a class called Customer (cid,custname,age,dob,email,mobilenumber)
using arraylist create list of customers
and while reading the data for the customer validate age(!=0,<0,>100,only digits)
                                                                      validatemobilenumber
                                                                       validateemail
                                                                   cid cannot be zero or null or negativevalue and only digits
                                                                   custname should contain only character
 */

//import java.util.*;
public class Customer {
	private int cId;
	private String cName;
	private int age;
	private String c_Dob;
	private String email;
	private String mobNum;
	
	public Customer() {
		super();
	}

	public Customer(int cId, String cName, int age, String c_Dob, String email, String mobNum) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.age = age;
		this.c_Dob = c_Dob;
		this.email = email;
		this.mobNum = mobNum;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getC_Dob() {
		return c_Dob;
	}

	public void setC_Dob(String c_Dob) {
		this.c_Dob = c_Dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	
	public String toString(int i) {
		return "Customer "+i+":[ cutomer id: "+this.getcId()+" | customer name: "+this.getcName()+
				" | Age: "+this.getAge()+" |Date Of Birth: "+this.getC_Dob()+" | email: "+this.getEmail()+
				" | Mobile: "+this.getMobNum();
	}
}
