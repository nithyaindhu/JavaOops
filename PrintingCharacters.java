/**
 * 
 */
package com.Strings;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class PrintingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.print("Enter String : ");
		String string =  read.nextLine();
		for(int i =0 ; i<string.length(); i++) {
			if((string.charAt(i)>='A'&&string.charAt(i)<='Z') 
					|| (string.charAt(i)>='a'&&string.charAt(i)<='z')) {
				System.out.print(string.charAt(i));	
			}			
		}
		read.close();
	}

}
