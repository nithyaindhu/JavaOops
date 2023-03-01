/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
public class Admin extends InheritPerson{
	String userType;
	Admin()
	{
		userType = "Administrator";
		emailId ="N@123";
	}
	
	public void getUserType()
	{
		System.out.println("user type : "+userType);
	}
}
