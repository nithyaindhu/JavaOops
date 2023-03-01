/**
 * 
 */
package com.collectionsEx;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.MovieDetail.Movie;

/**
 * @author HP
 *
 */
public class AddMovie2{

	public static Scanner read = new Scanner (System.in); 
	private static int id = 1;  		
	
	public static  Movie2 addMovie(){
		Movie2 movie = new Movie2();
		System.out.println("Enter Movie Details : ");
		//System.out.print("Movie ID : " ); movie.setMovieID(read.nextLine());
		System.out.print("Movie Title : " ); movie.setMovieTitle(read.nextLine());
		movie.setMovieID(movie.getMovieTitle()+"00"+ id++);
		System.out.print("Movie Language : "); movie.setMovieLanguage(read.nextLine());
		System.out.print("Movie Genre : "); movie.setMovieGenre(read.nextLine());
		System.out.print("Movie Description : "); movie.setMovieDescription(read.nextLine());
		System.out.print("Movie Duration in Minutes : "); movie.setMovieDurationInMins(read.nextInt());
		read.nextLine();
		System.out.print("Movie Country : "); movie.setMovieCountry(read.nextLine());
		System.out.print("Movie release Date : "); 
		String date = read.nextLine();
		String format =  "yyyy-MM-dd";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		LocalDate rdate = LocalDate.parse(date,formatter);
		movie.setMovieReleaseDate(rdate);
		System.out.print("Movie Rating : "); movie.setRating(read.nextFloat());
		read.nextLine();
		return movie;
	}
	
	public static void MovieMenu(String []args) {
		ArrayList<Movie2> movieList = new ArrayList<Movie2>();
		int option;
		do {
			System.out.println("++++++++++MENU++++++++++\n1.Add Movie\n2.Display Movie\n3.Exit");
			System.out.print("Enter your option : ");
			switch(option = read.nextInt()) {
			case 1:
				read.nextLine();
				do {
					movieList.add(addMovie());
					System.out.println("Enter yes / no to continue adding movie details!!!");
				}while(read.nextLine().equalsIgnoreCase("yes"));
				break;
			case 2:
				for(Movie2 m : movieList) {
					m.displayMovieDetails();
				}
				break;
			case 3:
				break;				
			}
			
		}while(option!=3);
	}
	

}
