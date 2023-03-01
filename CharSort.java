/**
 * 
 */
package com.Strings;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class CharSort {
	public static void sorting (String[] string) {
		
		for( int i = 0 ; i<=string.length-1; i++) {
			for(int j = i+1; j<string.length ; j++) {
				if(string[i].compareTo(string[j])>0) {
					String temp = string[i];
					string[i] = string[j];
					string[j] = temp;
				}
			}			
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("Enter array size : ");
		int arraySize = read.nextInt();
		read.nextLine();
		System.out.println("Enter Array Elements : ");
		String string[] = new String[arraySize];
		
		for(int i = 0 ; i<arraySize ; i++) {
			string[i] = read.nextLine();
		}
		
		sorting(string);
		for(int i = 0 ; i<arraySize ; i++) {
			System.out.println(string[i]);
		}

	}

}
