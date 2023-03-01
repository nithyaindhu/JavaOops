/**
 * 
 */
package com.oops;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class CheckingTheatres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read =  new Scanner(System.in);
		
		Theatres t = new Theatres();
		System.out.println("it will display values assigned by constructors :");
		System.out.println("theatre " + t.getTheatreName() + " details are :");
		t.displayDetails();
		Theatres t1 = new Theatres(12,"nit");
		
		System.out.println("theatre " + t1.getTheatreName() + " details are :");
		t1.displayDetails();
		
		
		System.out.print("Enter theatre id : " );
		t.setTheatreId(read.nextInt());
		read.nextLine();
		System.out.print("Enter theatre name : ");
		t.setTheatreName(read.nextLine());
		System.out.print("Enter no of Screens : ");
		t.setScreens(read.nextInt());		
		read.nextLine();
		System.out.print("Enter location : ");
		t.setLocation(read.nextLine());
		
		
		System.out.print("Enter theatre id : " );
		t1.setTheatreId(read.nextInt());
		read.nextLine();
		System.out.print("Enter theatre name : ");
		t1.setTheatreName(read.nextLine());
		System.out.print("Enter no of Screens : ");
		t1.setScreens(read.nextInt());		
		read.nextLine();
		System.out.print("Enter location : ");
		t1.setLocation(read.nextLine());
		
		System.out.println("it will display values assigned by user input given by toString :");
		System.out.println(t);
		System.out.println(t1);
		
		System.out.println("it will display values assigned by user input :");
		System.out.println("theatre " + t.getTheatreName() + " details are :");
		t.displayDetails();
		System.out.println("theatre " + t1.getTheatreName() + " details are :");
		t1.displayDetails();		
		
		read.close();
	}

}
