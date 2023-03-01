/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class InheritEmployee extends Person {
	private String empDesignation;
	private int empId;
	Scanner read = new Scanner(System.in);
	void setData(String empDes,int empId) {
		this.empDesignation = empDes;
		this.empId = empId;
		System.out.print("Enter name : ");
		setName(read.nextLine());
		System.out.print("Enter Age : ");
		setAge(read.nextInt());
		System.out.print("Enter Height in Meters : ");
		setHeightInM(read.nextDouble());
		System.out.print("Enter Weight in kg : ");
		setWeightInKg(read.nextDouble());
		read.nextLine();
		System.out.print("Enter gender : ");
		setGender(read.nextLine());
		read.close();
	}
	void displayData()
	{
		System.out.println("Employee name is "+empDesignation);
		System.out.println("Employee id is "+empId);
	}
}
