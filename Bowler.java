/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
public class Bowler extends CricketPlayers{
	private int noOfWickets;
	private float bowlingAverage;
	private String playersProfile;
	
	
	/**
	 * 
	 */
	protected Bowler() {
		playersProfile = "Bowler";
	}
	
	public void setBowlersDetails(int noOfWickets, float bowlingAverage) {
		this.noOfWickets = noOfWickets;
		this.bowlingAverage = bowlingAverage;
	}
	
	public void displayBowlersDetails() {
		System.out.println("Player profile : "+ playersProfile);
		System.out.println("Players total no of Wickets : " + noOfWickets);
		System.out.println("Players Bowling Average : "+ bowlingAverage);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
	}
}
