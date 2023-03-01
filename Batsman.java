/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
public class Batsman extends CricketPlayers{
	private int highestScore;
	private float battingAverage;
	private String playersProfile;
	
	
	/**
	 * 
	 */
	protected Batsman() {
		playersProfile = "Batsman";
	}

	public void setBatsmanDetails(int highestScore, float battingAverage) {
		this.highestScore = highestScore;
		this.battingAverage = battingAverage;
	}
	
	public void displayBatsmanDetails() {
		System.out.println("Player profile : "+ playersProfile);
		System.out.println("Players Highest Score : "+ highestScore);
		System.out.println("Players Batting Average : "+ battingAverage);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
	}
}
