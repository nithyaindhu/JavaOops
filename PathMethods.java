/**
 * 
 */
package com.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author HP
 *
 */
public class PathMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\JAVA\\Text.txt");
		Path normalizedPath = p1.normalize();
		Path p2 =  Paths.get("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\JAVA\\Text.txt");
		System.out.println("Normalized path "+ normalizedPath);
		Path subPath = p1.subpath(1, 5);
		System.out.println("SubPath is "+subPath);
		System.out.println(p1.getFileName());
		System.out.println(p1.getParent());
		System.out.println(p1.getNameCount());
		System.out.println(p1.getRoot());
		System.out.println(p1.isAbsolute());
		System.out.println(p1.toAbsolutePath());
		System.out.println(p1.toUri());
		System.out.println(p1.equals(p2));
		Integer a = new Integer(5);
		Integer b = a;
		Integer c = new Integer(5);
		int d = c;
		
		System.out.println((a==b )+ " "+ (a==c) + " "+a.equals(b));
		System.out.println((a==d)+ " "+ (a==b) + " "+a.equals(d));
		}

}
