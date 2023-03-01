/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
public class User extends Person{
	private int userId;
	private String userPassword;
	//private boolean isUser  ;
	
	public void setUserDetails(int userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	public void displayUserDetails() {
		System.out.println("User id : "+ userId);
	}
	
	public boolean checkUser(User user)
	{
		if(userId == user.userId)
		{
			if(userPassword.equals(user.userPassword))
			{
				return true;
			}
		}
		return false;
	}
}
