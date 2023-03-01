/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		AccountManager accountManager = new AccountManager();
		int option = 0;
		
		
		
		do {
			System.out.println("********************======MENU======********************");
			System.out.println("1.Manager\n2.Customer\n3.Exit");
			System.out.println("==========================================================");
			System.out.print("Enter your option : ");
			switch(option =read.nextInt()) {
			case 1:
				
				do {
				System.out.println("****************======MANAGER MENU======****************");
				System.out.println("1.Create Account\n2.Delete Account\n3.Deposit in a account"
						+ "\n4.Widhdraw from a account\n5.Display All account details\n6.Exit");
				System.out.println("==========================================================");
				System.out.print("Enter your option : ");
				switch(option = read.nextInt()) {
				case 1:
					System.out.print("Enter Account Number : ");
					int accountNumber = read.nextInt();
					System.out.print("Enter balance : ");
					float balance = read.nextFloat();
					read.nextLine();
					System.out.print("Enter Account Holder Name : ");
					String name = read.nextLine();
					accountManager.createAccount(accountNumber, balance, name);
					break;
				case 2:
					System.out.print("Enter Account Number : ");
					accountNumber = read.nextInt();
					accountManager.deleteAccount(accountNumber);
					break;
				case 3:
					System.out.print("Enter Account Number : ");
					accountNumber = read.nextInt();
					System.out.print("Enter amount : ");
					float amount = read.nextFloat();
					accountManager.depositAmount(accountNumber, amount);
					break;
				case 4:
					System.out.print("Enter Account Number : ");
					accountNumber = read.nextInt();
					System.out.print("Enter amount : ");
					amount = read.nextFloat();
					accountManager.withdrawAmount(accountNumber, amount);
					break;
				case 5:
					accountManager.displayCustomers();
					break;
				case 6:
					break;
				}
				}while(option!=6);
				break;
			case 2:
				do {
					System.out.println("****************======CUSTOMER MENU======****************");;
					System.out.println("1.Deposit\n2.Widhdrew\n3.Check Balance\n4.Exit");
					System.out.println("==========================================================");
					System.out.print("Enter your option : ");
					switch(option = read.nextInt()) {
					case 1:
						System.out.print("Enter Account Number : ");
						int accountNumber = read.nextInt();
						System.out.print("Enter amount : ");
						float amount = read.nextFloat();
						accountManager.depositAmount(accountNumber, amount);
						break;
					case 2:
						System.out.print("Enter Account Number : ");
						accountNumber = read.nextInt();
						System.out.print("Enter amount : ");
						amount = read.nextFloat();
						accountManager.withdrawAmount(accountNumber, amount);
						break;
					case 3:
						System.out.print("Enter Account Number : ");
						accountNumber = read.nextInt();
						accountManager.checkBalance(accountNumber);
						break;
					case 4:
						break;
					}
				}while(option != 4);
				break;
			case 3:
				break;				
			}
			
		}while (option != 3);
		read.close();
	}

}
