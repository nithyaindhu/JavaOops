/**
 * 
 */
package com.Strings;

import java.util.Arrays;
/**This program implements an application which encrypts and decrypts the given string
 * @author Nithya
 * @since 5/12/2022
 */
import java.util.Scanner;
public class EncryptionDecryption {

	public static String encryption(String string) {
		String temp = "";
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i) =='y') {
				temp += 'a';
			}
			else if(string.charAt(i) =='Y') {
				temp += 'A';
			}
			else if(string.charAt(i) =='z') {
				temp += 'b';
			}
			else if(string.charAt(i) =='Z') {
				temp += 'B';
			}
			else {
				temp += (char)((int)string.charAt(i)+2);
			}
		}
		return temp;
	}
	
	public static String decryption(String string) {
		String temp = "";
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i) =='a') {
				temp += 'y';
			}
			else if(string.charAt(i) =='A') {
				temp += 'Y';
			}
			else if(string.charAt(i) =='b') {
				temp += 'z';
			}
			else if(string.charAt(i) =='B') {
				temp += 'Z';
			}
			else {
				temp += (char)((int)string.charAt(i)-2);
			}
		}
		return temp;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// asking users to enter what he/she want to do
		int option;
		do {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string = read.nextLine();
		System.out.println("==========MENU==========");
		System.out.println("1.Encrypt\n2.Decrypt\n3.Exit");
		System.out.println("========================");
		System.out.print("Enter your option : ");
		option = read.nextInt();
		System.out.println("========================");
		
		switch(option) {
		case 1:
			string = encryption(string);
			break;
		case 2:
			string  = decryption(string);
			break;
		case 3:
			break;
		}
		System.out.println(string);
		}while(option!=3);
	}

}
