/**
 * 
 */
package com.Strings;

/**This program implements an application which encrypts and decrypts the given string
 * @author Nithya
 * @since 5/12/2022
 */
import java.util.Scanner;
public class EncryptionDecryptionR {

	public static StringBuilder encryption(StringBuilder string) {

		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i) =='y') {
				string.replace(i,i+1,"a");
			}
			else if(string.charAt(i) =='Y') {
				string.replace(i,i+1,"A");
			}
			else if(string.charAt(i) =='z') {
				string.replace(i,i+1,"b");
			}
			else if(string.charAt(i) =='Z') {
				string.replace(i,i+1,"B");
			}
			else {
				int s =((int)string.charAt(i)+2);
				string.replace(i,i+1,String.valueOf((char)s));
			}
			//System.out.println(string);
		}
		return string;
	}
	
	public static StringBuilder decryption(StringBuilder string) {

		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i) =='a') {
				string.replace(i,i+1,"y");
			}
			else if(string.charAt(i) =='A') {
				string.replace(i,i+1,"y");
			}
			else if(string.charAt(i) =='b') {
				string.replace(i,i+1,"z");
			}
			else if(string.charAt(i) =='B') {
				string.replace(i,i+1,"Z");
			}
			else {
				int s =((int)string.charAt(i)-2);
				string.replace(i,i+1,String.valueOf((char)s));
			}
			//System.out.println(string);
		}
		return string;
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
		StringBuilder string = new StringBuilder(read.nextLine());
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
