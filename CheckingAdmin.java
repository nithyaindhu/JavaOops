/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class CheckingAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Admin admin = new Admin();
		admin.setUserType(("admin").toLowerCase());
		admin.setPersonDetails("Nithya", "Namakkal", "nithyaindhu007@gmail.com", 965986330, Gender.FEMALE);
		admin.setUserDetails(1, "Nithya@12345");
		admin.displayPersonDetails();
		admin.displayUserDetails();
		admin.displayUserType();
		read.close();

	}

}
