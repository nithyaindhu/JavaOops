/**
 * 
 */
package com.Strings;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class DelayMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String string = read.nextLine();
		int spaceCount = 0, index=0;
		for(int i = 0; i<string.length();i++) {
			if(string.charAt(i)== ' ') {
				spaceCount++;
				if(spaceCount ==2) {
					index = i;
					break;
				}
			}
		}
		//System.out.println(index);
		if(spaceCount<2) {
			System.out.println(string);
		}
		else {
			System.out.println(string.substring(0,index)+"\n...Please Wait\n"+string.substring(index+1,string.length()));
		}
		read.close();
	}

}
