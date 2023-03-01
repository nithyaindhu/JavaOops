/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
public class Admin extends User {
	public enum type {ADMIN,OFFICER,CUSTOMER;}
	private type userType = type.ADMIN;
	
	public void setUserType(String utype)
	{
		switch(utype) {
		case "admin":
			userType = type.ADMIN;
			break;
		case "employee":
			userType = type.OFFICER;
			break;
		case "customer":
			userType = type.CUSTOMER;
			break;
		}
	}
	public void displayUserType()
	{
		System.out.println("Usert type : "+ userType);
	}
}
