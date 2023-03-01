/**
 * 
 */
package com.oops;

import java.util.Scanner;

/**
 * @author HP
 *
 */
public class CheckingTheatresArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read =  new Scanner(System.in);
		
		System.out.print("Enter the no of theatres : ");
		int noOfTheatres = read.nextInt();
		Theatres t[]= new Theatres[noOfTheatres];
		for(int i=0 ; i< noOfTheatres; i++)
		{
			t[i] = new Theatres();
			System.out.print("Enter theatre id : " );
			t[i].setTheatreId(read.nextInt());
			read.nextLine();
			System.out.print("Enter theatre name : ");
			t[i].setTheatreName(read.nextLine());
			System.out.print("Enter no of Screens : ");
			t[i].setScreens(read.nextInt());		
			read.nextLine();
			System.out.print("Enter location : ");
			t[i].setLocation(read.nextLine());
		}
		for(int i=0 ; i< noOfTheatres; i++)
		{
			System.out.println("theatre " + t[i].getTheatreName() + " details are :");
			t[i].displayDetails();
		}
		read.close();
	}

}
