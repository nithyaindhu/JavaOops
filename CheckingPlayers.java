/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class CheckingPlayers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Batsman batsman = new Batsman();
		Bowler bowler = new Bowler();
		
		batsman.SetPlayers("Dhoni", "INDIA");
		batsman.setBatsmanDetails(300, 97.9f);
		
		bowler.SetPlayers("Natrajan", "INDIA");
		bowler.setBowlersDetails(78, 97.6f);
		
		batsman.displayPlayerDetails();
		batsman.displayBatsmanDetails();
		
		bowler.displayPlayerDetails();
		bowler.displayBowlersDetails();
		
		read.close();
	}

}
