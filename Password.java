/**
 * 
 */
package com.Strings;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class Password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String fName,lName;
		do {
		fName = read.nextLine();
		}while(fName.length()<4);
		do{
		lName = read.nextLine();
		}while(lName.length()<4);
		System.out.println(fName.substring(0,3)
				+lName.substring((lName.length()-3),lName.length())+((fName.length()+lName.length())));

	}

}
