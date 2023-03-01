/**
 * 
 */
package com.links;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author HP
 *
 */
public class Move {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path pathd = Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\text.txt");
		Path paths = Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\text.txt");
//		try {
//			Files.copy(paths, pathd);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Files.move(paths, pathd, StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Files.move(paths, pathd, StandardCopyOption.ATOMIC_MOVE);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			Files.move(paths, pathd, StandardCopyOption.COPY_ATTRIBUTES);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
