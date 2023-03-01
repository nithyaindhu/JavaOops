/**
 * 
 */
package com.Strings;
import java.util.*;
/**
 * @author HP
 *
 */
public class CharFreqOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String string = read.nextLine();
		int occurences[] ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
		string = string.toUpperCase();
		for(int i = 0 ; i<string.length();i++) {
			occurences[string.charAt(i) - 65]++;
		}
		for(int i = 0 ; i<26;i++) {
			if(occurences[i]==0) {
				continue;
			}
			else {
				System.out.println((char)(i+65) +" "+occurences[i] + " times ");
			}
		}
		read.close();
	}

}
