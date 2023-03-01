/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class CheckingTestTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		TaxOnSalary tax1 = new TaxOnSalary();
		System.out.print("Enter salary : ");
		tax1.inputSalary(read.nextDouble());
		
		System.out.println("tax is "+tax1.calculateTax());
		
		TaxOnSalary tax2 = new TaxOnSalary(true);
		System.out.print("Enter salary : ");
		tax2.inputSalary(read.nextDouble());
		
		System.out.println("tax is "+tax2.calculateTax());
		TaxOnSalary tax3 = new TaxOnSalary();
		System.out.print("Enter salary : ");
		tax1.inputSalary(read.nextDouble());
		
		System.out.println("tax is "+tax1.calculateTax());
		
		TaxOnSalary tax4 = new TaxOnSalary();
		System.out.print("Enter salary : ");
		tax2.inputSalary(read.nextDouble());
		
		System.out.println("tax is "+tax2.calculateTax());
		TaxOnSalary tax5 = new TaxOnSalary();
		System.out.print("Enter salary : ");
		tax1.inputSalary(read.nextDouble());
		
		System.out.println("tax is "+tax1.calculateTax());
		
		TaxOnSalary tax6 = new TaxOnSalary();
		System.out.print("Enter salary : ");
		tax2.inputSalary(read.nextDouble());
		
		System.out.println("tax is "+tax2.calculateTax());
		
		read.close();
	}

}
