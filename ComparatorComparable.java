/**
 * 
 */
package com.collectionsEx;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class MovieSortByName implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 o1, Movie2 o2) {
		String string1 = o1.movieTitle;
		String string2 = o2.movieTitle;
		return string1.compareTo(string2);
	}
	
}
class MovieSortByRating implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 o1, Movie2 o2) {
		if(o1.getRating()>o2.getRating()) {
			return 1;
		}
		else  {
			return -1;
		}
		//return 0;
		//return (int) (o1.getRating()-o2.getRating());
	}
	
}
/**
 * @author HP
 *
 */
public class ComparatorComparable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<Movie2> movies = new PriorityQueue<Movie2>(new MovieSortByRating());
		//LinkedList<Movie2> movies = new LinkedList<Movie2>();


		movies.add(new Movie2("M0001","ALOVE TODAY","TAMIL","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.5f));
		movies.add(new Movie2("M0002","BLOVE TODAY","HINDI","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.0f));
		movies.add(new Movie2("M0003","SLOVE TODAY","ENGLISH","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.1f));
		movies.add(new Movie2("M0004","CLOVE TODAY","KANNADA","LOVE","LOVE TO HATE",180,"INDIA",LocalDate.now(),5.0f));
		movies.add(new Movie2("M0005","ALOVE TODAY","TELUGU","LOVE","HATE TO LOVE",180,"INDIA",LocalDate.now(),4.6f));
		
		movies.forEach(System.out::println);
		System.out.println(movies.comparator());
		//Collections.sort(movies,new MovieSortByName());
		//Collections.sort(movies,new MovieSortByRating());
		 //Comparator comp = movies.comparator();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		while(!movies.isEmpty()) {
			System.out.println(movies.poll());
		}

		System.out.println(movies.comparator());
	}

}
