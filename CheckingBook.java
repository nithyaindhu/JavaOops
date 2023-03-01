/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class CheckingBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Author author = new Author("Nithya","Mururgan","nithyaindhu007@gmail.com");
		
		Book book = new Book("nm007","All is Well",author,10999,10);
		System.out.println(book);
		read.close();
		
	}

}
