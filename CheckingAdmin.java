/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
public class CheckingAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		admin.setDetails("Nithya", "1/126, Namakkal", "nithyaindur007@gmail.com",96598633 ,"Female" );
		//admin.userType="Admin";
		admin.displayDetails();
		admin.getUserType();
	}

}
