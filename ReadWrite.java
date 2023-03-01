/**
 * 
 */
package com.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author HP
 *
 */
public class ReadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(FileInputStream fis =  new FileInputStream("Text.txt");
					FileOutputStream fos = new FileOutputStream("Text.txt",true)){
				//System.out.println(fis.available());
				System.out.println( (char)fis.read());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
