/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class CheckingEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Employee e = new Employee(1,"Sri");
		e.displayEmployeeDetails();
		Employee e1 = new Employee(4,"nit");
		e1.displayEmployeeDetails(); // static menthod cant access non static members
		read.close();
		
	}
}
