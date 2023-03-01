/**
 * 
 */
package com.MovieDetail;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author HP
 *
 */
public class Movie implements java.io.Serializable{
	private String movieID;
	private String movieTitle;
	private String movieLanguage;
	private String movieGenre;
	private String movieDescription;
	private int movieDurationInMins;
	private String movieCountry;
	private LocalDate movieReleaseDate;
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
	
	public void displayMovieDetails() {
		System.out.println("Movie Name : " + movieID);
		System.out.println("Movie Title : " + movieTitle);
		System.out.println("Movie Language : "+ movieLanguage);
		System.out.println("Movie Genre : "+ movieGenre);
		System.out.println("Movie Description : "+ movieDescription);
		System.out.println("Movie Duration in Minutes : "+ movieDurationInMins);
		System.out.println("Movie Country : "+ movieCountry);
		System.out.println("Movie release Date : "+ movieReleaseDate);
	}
	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", movieTitle=" + movieTitle + ", movieLanguage=" + movieLanguage
				+ ", movieGenre=" + movieGenre + ", movieDescription=" + movieDescription + ", movieDurationInMins="
				+ movieDurationInMins + ", movieCountry=" + movieCountry + ", movieReleaseDate=" + movieReleaseDate
				+ "]";
	}
	
	
}
