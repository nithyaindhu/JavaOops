/**
 * 
 */
package com.MovieDetail;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import com.collectionsEx.Movie2;

/**
 * @author HP
 *
 */
public class AddMovie{

	public static Scanner read = new Scanner (System.in); 
//	private String movieID;
//	private String movieTitle;
//	private String movieLanguage;
//	private String movieGenre;
//	private String movieDescription;
//	private int movieDurationInMins;
//	private String movieCountry;
//	private LocalDate movieReleaseDate;
////	private float rating;
	public static void main(String []args) {
//		Movie2 movie[] = new Movie2[5];
//		movie[0] = new Movie2("M0001","RAJA RANI","TAMIL","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.5f);
//		movie[1] = new Movie2("M0002","RAJA","TAMIL","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.0f);
//		movie[2] = new Movie2("M0003","RANI","TAMIL","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.1f);
//		movie[3] = new Movie2("M0004","LOVE TODAY","TAMIL","LOVE","LOVE TO HATE",180,"INDIA",LocalDate.now(),5.0f);
//		movie[4] = new Movie2("M0005","ROMEO JULIET","TAMIL","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.6f);
//	
		ArrayList<Movie2> movie = new ArrayList<Movie2>();
		movie.add(new Movie2("M0001","LOVE TODAY","TAMIL","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.5f));
		movie.add(new Movie2("M0002","LOVE TODAY","HINDI","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.0f));
		movie.add(new Movie2("M0003","LOVE TODAY","ENGLISH","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.1f));
		movie.add(new Movie2("M0004","LOVE TODAY","KANNADA","LOVE","LOVE TO HATE",180,"INDIA",LocalDate.now(),5.0f));
		movie.add(new Movie2("M0005","LOVE TODAY","TELUGU","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.6f));
	
	
//		movie.stream().filter(x->x.getRating()>=4).forEach(x->System.out.println(x.getMovieTitle()));
		System.out.println("Average is " + movie.stream().filter(x->x.getRating()>=4.5).map(x->x.getRating()).reduce(0.0f,(s,x)->(s+x))
				/ movie.stream().filter(x->x.getRating()>=4).count());
		System.out.println("Average for love today is " + movie.stream().filter(x->x.getMovieTitle().equalsIgnoreCase("love today")).map(x->x.getRating()).reduce(0.0f,(s,i)->(s+i))
				/ movie.stream().filter(x->x.getMovieTitle().equalsIgnoreCase("love today")).count());
		System.out.println("min average is " + movie.stream().map(x->x.getRating()).min((x,x1)->(x>=x1)?1:-1).get());
		System.out.println("max average is " + movie.stream().map(x->x.getRating()).max((x,x1)->(x>=x1)?1:-1).get());
		System.out.println("min average movie name is " + movie.stream().min((x,x1)->(x.getRating()>=x1.getRating())?1:-1).get().getMovieTitle());
		System.out.println("max average movie name is " + movie.stream().max((x,x1)->(x.getRating()>=x1.getRating())?1:-1).get().getMovieTitle());
	
		
		movie.stream().filter(x->x.getMovieTitle().matches("LOVE TODAY")).findFirst().get().setMovieTitle("HiHello");
		System.out.println(movie.stream().filter(x->x.getMovieTitle().matches("HiHello")).findFirst().get().getMovieTitle());
		movie.stream().filter(x->x.getMovieTitle().toUpperCase().matches("HIHELLO")).findFirst().ifPresent(System.out::println);
		movie.stream().filter(x->x.getMovieTitle().toUpperCase().matches("LOVE TODAY")).findAny().ifPresent(System.out::println);
		System.out.println(movie.stream().allMatch(x->x.getMovieTitle().equals("LOVE TODAY")));
	
	}
	

}
