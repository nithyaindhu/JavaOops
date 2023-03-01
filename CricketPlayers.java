/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
public class CricketPlayers {
	private String playerName;
	private String playerCountry;
	
	public void SetPlayers(String playerName, String playerCountry) {
		this.playerName = playerName;
		this.playerCountry = playerCountry;
	}
	
	public void displayPlayerDetails() {
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println("Players Name : "+ playerName);
		System.out.println("Players Country : "+ playerCountry);
	}
}
