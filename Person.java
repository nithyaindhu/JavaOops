/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
enum Gender{MALE,FEMALE;}
public class Person {
	private String name;
	private String address;
	private String emailId;
	private long mobileNumber;
	private Gender gender;
	
	public void setPersonDetails(String name, String address, String emailId,long mobileNumber, Gender gender) {
		this.name = name;
		this.address = address;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	public void displayPersonDetails() {
		System.out.println("Name : "+ name);
		System.out.println("Address : "+ address);
		System.out.println("Email id : "+ emailId);
		System.out.println("Mobile Number : "+ mobileNumber);
		System.out.println("Gender : "+ gender);
	}
}
