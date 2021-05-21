package com.capgemini.registeruser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegisterUserTest {

public static RegisterUser ru;
	
	@BeforeAll
	public static void setUp() {
		ru=new RegisterUser("Deb","Roy","0967413242","username_admin","admin-password");
	}
	
	@BeforeEach
	public void setUpForTest() {
  }
	
	@Test
	public void testContact() {
		RegisterUser ru=new RegisterUser("Deb","Roy","09674132442","username_admin","admin-password");
		assertNotNull(ru);
		
    RegisterUser ruOne = new RegisterUser();
		assertNull(ruOne);
	}
	
	@Test
	public void testGetters() {
		assertEquals("Deb",ru.getFirstName());
		assertEquals("Roy",ru.getLastName());
		assertEquals("0967413242",ru.getMobileNo());
		assertNotEquals("9674132442",ru.getMobileNo());
		assertEquals("username_admin",ru.getUserName());
		assertEquals("admin-password",ru.getPassword());
	}
	
	@Test
	public void testValidateFirstName() {
		
    assertSame("First Name is valid", ru.validateFirstName(ru.getFirstName()));
		assertNotSame(null,ru.validateFirstName(ru.getFirstName()));
	}
	
	@Test
	public void testValidateLastName() {
		
    assertSame("Last Name is valid", ru.validateLastName(ru.getLastName()));
		assertNotSame(null,ru.validateLastName(ru.getLastName()));
	}
	
	@Test
	public void testValidateMobileNo() {
		assertNotSame("mobileNo cannot be less than 10 digits", ru.validateMobileNo(ru.getMobileNo()));
		assertNotSame(null, ru.validateMobileNo(ru.getMobileNo()));
		assertNotSame("mobileNo can contain only digits", ru.validateMobileNo(ru.getMobileNo()));
		assertNotSame("mobileNo should start with 0", ru.validateMobileNo(ru.getMobileNo()));
		assertSame("Mobile number is valid",  ru.validateMobileNo(ru.getMobileNo()));
		assertSame("mobileNo can contain only digits",  ru.validateMobileNo("s123456780"));
		assertSame("mobileNo should start with 0",  ru.validateMobileNo("9674132422"));
	}
	
	@Test
	public void testValidateUserName() {

    assertNotSame("username is valid", ru.validateUserName(ru.getUserName()));
		assertNotSame("username must contain - or _", ru.validateUserName(ru.getUserName()));
		assertSame("username must contain - or _",  ru.validateUserName("username"));
	}
	
	@Test
	public void testValidatePassword() {
    
		assertNotSame("password is valid", ru.validatePassword(ru.getPassword()));
		assertNotSame("password must be contain more than 8 characters and less than 16 characters", ru.validatePassword(ru.getPassword()));
		assertSame("password is valid",  ru.validatePassword("password1234"));
	}
	
	@Test
	public void testDisplayDetails() {
    
		assertEquals(new String("The details of the user = Deb Roy 0967413242 username_admin admin-password"),ru.displayDetails());
		assertNotEquals(new String("The details of the user = Deb Roy 0967413242 username_admin admin-password"),ru.displayDetails());
	}
	
	@AfterEach
	public void stopThis() {
		System.out.println("this method is annoted with @AfterEach to execute as first method in the test class RegisterUserTest");
	}
	
	@AfterAll
	public static void stopAll() {
		System.out.println("this method is annoted with @AfterAll to execute as first method in the test class RegisterUserTest");
		ru=null;
	}

}
