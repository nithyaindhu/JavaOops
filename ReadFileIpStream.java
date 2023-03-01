/**
 * 
 */
package com.Files;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author HP
 *
 */
import java.util.Scanner;
public class ReadFileIpStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try {
			FileOutputStream write = new FileOutputStream("Text.txt",true);
			char input;
			//do{
				input = sc.next().charAt(0) /* + System.lineSeparator() */;
//				if(input.substring(0,2).equals("-1")) {
//					
//					break;
//				}
				//byte b[] = input.getBytes();
				try {
					write.write((byte)(input));
					//write.write(System.lineSeparator().getBytes());
					//write.close();
				} catch (IOException e) {
					System.out.println(e);
				}
			//}while(true);			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		try {
			//FileInputStream read = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\PROGRAM\\JAVA\\Text.txt");
			FileInputStream read = new FileInputStream("Text.txt");
			int a = read.read();
			while(a!=-1) {
				System.out.print((char)a);
				a = read.read();
			}
			read.close();
		}catch(Exception ee) {
			System.out.println(ee);
		}
		
	}
}
