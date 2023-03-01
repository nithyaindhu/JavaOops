/**
 * 
 */
package com.links;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author HP
 *
 */
public class HardSoft {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path pathLink = Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\JAVA\\Text.txt");
		Path link = Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\Text.txt");
		try {
			Files.createSymbolicLink(link, pathLink);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}
//		try {
//			Files.createLink(link, pathLink); //hard link
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}
	}

}
