/**
 * 
 */
package com.links;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author HP
 *
 */
public class CreateDeleteMove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path pathd = Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\text.txt");
		Path paths = Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\JAVA\\text.txt");
		try {
			Files.delete(pathd);
			//Files.move(paths, pathd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File newFile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\text.txt");
		System.out.println(newFile.exists());
			
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		File newRenameFile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\texting\\hi");
		//newFile.renameTo(newRenameFile);
		newRenameFile.mkdirs();
		Path pathss = Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\texting\\hi");
		try {
			Files.deleteIfExists(pathss);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
