/**
 * 
 */
package com.Strings;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class Replace {

	/**
	 * @param args
	 */
	public static String fun(String string){
		
		string =  string.replace('a', 'z');
		return string;

	}
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		String string = read.nextLine();
		string =(fun(string));
		System.out.println(string);
	}

}
