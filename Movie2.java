/**
 * 
 */
package com.collectionsEx;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author HP
 *
 */
public class Movie2 implements Comparable<Movie2>{
	public String movieID;
	public String movieTitle;
	public String movieLanguage;
	public String movieGenre;
	public String movieDescription;
	public int movieDurationInMins;
	public String movieCountry;
	public LocalDate movieReleaseDate;
	public float rating;
	
	
	/**
	 * @param movieID
	 * @param movieTitle
	 * @param movieLanguage
	 * @param movieGenre
	 * @param movieDescription
	 * @param movieDurationInMins
	 * @param movieCountry
	 * @param movieReleaseDate
	 * @param rating
	 */
	Movie2(){
		
	}
	public Movie2(String movieID, String movieTitle, String movieLanguage, String movieGenre,
			String movieDescription, int movieDurationInMins, String movieCountry, LocalDate movieReleaseDate,
			float rating) {
		this.movieID = movieID;
		this.movieTitle = movieTitle;
		this.movieLanguage = movieLanguage;
		this.movieGenre = movieGenre;
		this.movieDescription = movieDescription;
		this.movieDurationInMins = movieDurationInMins;
		this.movieCountry = movieCountry;
		this.movieReleaseDate = movieReleaseDate;
		this.rating = rating;
	}
	/**
	 * @return the movieID
	 */
	public String getMovieID() {
		return movieID;
	}
	/**
	 * @return the movieTitle
	 */
	public String getMovieTitle() {
		return movieTitle;
	}
	/**
	 * @return the movieLanguage
	 */
	public String getMovieLanguage() {
		return movieLanguage;
	}
	/**
	 * @return the movieGenre
	 */
	public String getMovieGenre() {
		return movieGenre;
	}
	/**
	 * @return the movieDescription
	 */
	public String getMovieDescription() {
		return movieDescription;
	}
	/**
	 * @return the movieDurationInMins
	 */
	public int getMovieDurationInMins() {
		return movieDurationInMins;
	}
	/**
	 * @return the movieCountry
	 */
	public String getMovieCountry() {
		return movieCountry;
	}
	/**
	 * @return the movieReleaseDate
	 */
	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}
	/**
	 * @param movieID the movieID to set
	 */
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	/**
	 * @param movieTitle the movieTitle to set
	 */
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	/**
	 * @param movieLanguage the movieLanguage to set
	 */
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	/**
	 * @param movieGenre the movieGenre to set
	 */
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	/**
	 * @param movieDescription the movieDescription to set
	 */
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	/**
	 * @param movieDurationInMins the movieDurationInMins to set
	 */
	public void setMovieDurationInMins(int movieDurationInMins) {
		this.movieDurationInMins = movieDurationInMins;
	}
	/**
	 * @param movieCountry the movieCountry to set
	 */
	public void setMovieCountry(String movieCountry) {
		this.movieCountry = movieCountry;
	}
	/**
	 * @param movieReleaseDate the movieReleaseDate to set
	 */
	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	
	/**
	 * @return the rating
	 */
	public float getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void displayMovieDetails() {
		System.out.println("Movie Name : " + movieID);
		System.out.println("Movie Title : " + movieTitle);
		System.out.println("Movie Language : "+ movieLanguage);
		System.out.println("Movie Genre : "+ movieGenre);
		System.out.println("Movie Description : "+ movieDescription);
		System.out.println("Movie Duration in Minutes : "+ movieDurationInMins);
		System.out.println("Movie Country : "+ movieCountry);
		System.out.println("Movie release Date : "+ movieReleaseDate);
		System.out.println("Movie rating : " + rating);
	}
	@Override
	public String toString() {
		return "Movie2 [movieID=" + movieID + ", movieTitle=" + movieTitle + ", movieLanguage=" + movieLanguage
				+ ", movieGenre=" + movieGenre + ", movieDescription=" + movieDescription + ", movieDurationInMins="
				+ movieDurationInMins + ", movieCountry=" + movieCountry + ", movieReleaseDate=" + movieReleaseDate
				+ ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Movie2 o) {
//		if {
//			return 1;
//		}
//		else 
		return Float.compare(this.rating, o.rating);
	}
	
}
