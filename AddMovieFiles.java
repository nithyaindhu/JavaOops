package com.MovieDetail;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddMovieFiles {
	public static Scanner read = new Scanner (System.in); 
	private static int id = 1;
		
	
	public static  Movie addMovie(){
		Movie movie = new Movie();
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
		return movie;
	}
	
	public static void main(String []args) throws IOException, ClassNotFoundException {
		
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		int option;
		do {
			System.out.println("++++++++++MENU++++++++++\n1.Add Movie\n2.Display Movie\n3.Exit");
			System.out.print("Enter your option : ");
			option = read.nextInt();
			if(option == 1) {
				FileOutputStream fw = null;
				fw = new FileOutputStream("Movies.ser",true);
				ObjectOutputStream objw = null;
				objw = new ObjectOutputStream(fw);
				objw.reset();
				read.nextLine();
				do {
					movieList.add(addMovie());
					//Movie m = addMovie();
					//objw.writeObject(m);					
					System.out.println("Enter yes / no to continue adding movie details!!!");
				}while(read.nextLine().equalsIgnoreCase("yes"));
				for(Movie m : movieList) {
					objw.writeObject(m);
				}
				objw.close(); 
				fw.close();
			}
			else if(option == 2) {
				FileInputStream fr = null;
				fr = new FileInputStream("Movies.ser");
				ObjectInputStream objr = null;
				objr = new ObjectInputStream(fr);
				while(fr.available()>0) {
					Movie m =(Movie) objr.readObject();
					m.displayMovieDetails();
				}
				objr.close();
				fr.close();
			}
			
			
			
		}while(option!=3);
	}
	
}
