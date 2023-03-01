/**
 * 
 */
package com.MovieDetail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 * @author HP
 *
 */
public class Search {
	public static Scanner read = new Scanner(System.in);
	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void searchMovieByTitle(String title,FileInputStream fr,ObjectInputStream objr) throws ClassNotFoundException, IOException {
		while(fr.available()>0) {
			Movie m =(Movie) objr.readObject();
			if(m.getMovieTitle().equalsIgnoreCase(title)) {
				m.displayMovieDetails();
			}
		}
	}
	public static void searchMovieByGenre(String genre,FileInputStream fr,ObjectInputStream objr) throws IOException, ClassNotFoundException {
		while(fr.available()>0) {
			Movie m =(Movie) objr.readObject();
			if(m.getMovieGenre().equalsIgnoreCase(genre)) {
			m.displayMovieDetails();
			}
		}
	}
	public static void searchMovieByLanguage(String language,FileInputStream fr,ObjectInputStream objr) throws ClassNotFoundException, IOException {
		
		while(fr.available()>0) {
			Movie m =(Movie) objr.readObject();
			if(m.getMovieLanguage().equalsIgnoreCase(language)) {
			m.displayMovieDetails();
			}
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		int option;
		FileInputStream fr = null;
		fr = new FileInputStream("Movies.ser");
		ObjectInputStream objr = null;
		objr = new ObjectInputStream(fr);
		do {
			System.out.println("+++++++++++SEARCH++++++++++++");
			System.out.println("1.Search by Title\n2.Search by Genre\n3.Search by Language\4.Exit");
			System.out.println("+++++++++++++++++++++++++++++");
			System.out.print("Enter your option : ");
			switch(option = read.nextInt()) {
			case 1:
				read.nextLine();
				System.out.print("Enter movie title to search : ");
				searchMovieByTitle(read.nextLine(),fr,objr);
				break;
			case 2:
				read.nextLine();
				System.out.print("Enter movie genre to search : ");
				searchMovieByGenre(read.nextLine(),fr,objr);
				break;
			case 3:
				read.nextLine();
				System.out.print("Enter movie Language to search : ");
				searchMovieByLanguage(read.nextLine(),fr,objr);
				break;
			case 4:
				break;
			}
		}while(option!=4);
		objr.close();
		fr.close();
	}

}
