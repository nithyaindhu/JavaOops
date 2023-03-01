/**
 * 
 */
package com.Files;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author HP
 *
 */
public class ReaderWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\text.txt");
				FileWriter fw = new FileWriter(args[1],true)){
			int  i ;
			do{
				fw.write(i =fr.read());
				if(i == -1) {
					fw.write(System.lineSeparator());
				}
			}while(i!=-1);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
