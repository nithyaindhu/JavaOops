/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
class AccountManager {
	private int customers = 5;
	private BankAccount bankAccount[] = new BankAccount[customers];
	 static private int availableCustomers = 0;
	
	
	public void createAccount(int accountNumber, float balance, String ownerName) {
		bankAccount[availableCustomers] = new BankAccount();
		bankAccount[availableCustomers].setaccountNumber(accountNumber);
		bankAccount[availableCustomers].setbalance(balance);
		bankAccount[availableCustomers].setownerName(ownerName);
		bankAccount[availableCustomers].setStatus(customerStatus.ACTIVE);
		System.out.println("==========================================================");
		System.out.println("Account Created Successfully!!!");
		System.out.println("==========================================================");
		availableCustomers++;
	}
	
	public void deleteAccount(int accountNumber) {
		for(int i = 0; i<availableCustomers ; i++) {
			if(bankAccount[i].getaccountNumber() == accountNumber) {
				bankAccount[i].setStatus(customerStatus.BLOCKED);
				System.out.println("==========================================================");
				System.out.println("Account deleted Successfully!!!");
				System.out.println("==========================================================");
				break;
			}
		}
	}
	
	public void displayCustomers() {
		for(int i = 0 ; i<availableCustomers ; i++) {
			System.out.println("==========================================================");
			System.out.println("Account Number : " + bankAccount[i].getaccountNumber());
			System.out.println("Account Holder Name : " + bankAccount[i].getownerName());
			System.out.println("Account Balance : " + bankAccount[i].getbalance());
			System.out.println("Account Status : " + bankAccount[i].getStatus());
			System.out.println("==========================================================");
		}
	}
	public void depositAmount(int accountNumber, float amount) {
		boolean isAccountAvailable = false;
		for(int i = 0 ; i<availableCustomers ; i++) {
			if(bankAccount[i].getaccountNumber()==accountNumber && (bankAccount[i].getStatus()).equals(customerStatus.ACTIVE)) {
				bankAccount[i].deposit(amount);
				isAccountAvailable = true;
				break;
			}
			else if(bankAccount[i].getaccountNumber()==accountNumber  && (bankAccount[i].getStatus()).equals(customerStatus.BLOCKED)) {
				System.out.println("==========================================================");
				System.out.println("Account not Found !!! \nPlease, contact support for any clarifications!!!");
				System.out.println("==========================================================");
				isAccountAvailable = true;
				break;
			}
		}
		if(!isAccountAvailable) {
			System.out.println("==========================================================");
			System.out.println("Account not found!!!");
			System.out.println("==========================================================");
		}
	}
	public void withdrawAmount(int accountNumber, float amount) {
		boolean isAccountAvailable = false;
		for(int i = 0 ; i<availableCustomers ; i++) {
			if(bankAccount[i].getaccountNumber()==accountNumber  && (bankAccount[i].getStatus()).equals(customerStatus.ACTIVE)) {
				bankAccount[i].widhdraw(amount);
				isAccountAvailable = true;
				break;
			}
			else if(bankAccount[i].getaccountNumber()==accountNumber  && (bankAccount[i].getStatus()).equals(customerStatus.BLOCKED)) {
				System.out.println("==========================================================");
				System.out.println("Account not Found !!! \nPlease, contact support for any clarifications!!!");
				System.out.println("==========================================================");
				isAccountAvailable = true;
				break;
			}
		}
		if(!isAccountAvailable) {
			System.out.println("==========================================================");
			System.out.println("Account not found!!!");
			System.out.println("==========================================================");
		}
	}
	public void checkBalance (int accountNumber) {
		for(int i = 0 ; i<availableCustomers ; i++) {
			if(bankAccount[i].getaccountNumber()==accountNumber  && (bankAccount[i].getStatus()).equals(customerStatus.ACTIVE)) {
				//System.out.println("Hi");
				bankAccount[i].viewBalance();
				break;
			}
			else if(bankAccount[i].getaccountNumber()==accountNumber  && (bankAccount[i].getStatus()).equals(customerStatus.BLOCKED)) {
				System.out.println("==========================================================");
				System.out.println("Account not Found !!! \nPlease, contact support for any clarifications!!!");
				System.out.println("==========================================================");
				break;
			}
		}
	}
	
}
