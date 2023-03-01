/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */

enum customerStatus { ACTIVE,BLOCKED;}

class BankAccount {
	 private int accountNumber;
	 private float balance;
	 private String ownerName;
	 private customerStatus status;
	 
		BankAccount(/* int accountNumber , float balance , String ownerName */) {
		// this.accountNumber = accountNumber;
		// this.balance = balance;
		// this.ownerName = ownerName;
	 }

	
	
	/**
	 * @return the accountNumber
	 */
	protected int getaccountNumber() {
		return accountNumber;
	}



	/**
	 * @return the balance
	 */
	protected float getbalance() {
		return balance;
	}



	/**
	 * @return the ownerName
	 */
	protected String getownerName() {
		return ownerName;
	}



	/**
	 * @param accountNumber the accountNumber to set
	 */
	protected void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	/**
	 * @param balance the balance to set
	 */
	protected void setbalance(float balance) {
		this.balance = balance;
	}



	/**
	 * @param ownerName the ownerName to set
	 */
	protected void setownerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	



	/**
	 * @return the status
	 */
	protected customerStatus getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	protected void setStatus(customerStatus status) {
		this.status = status;
	}



	public void viewBalance() {
		System.out.println("==========================================================");
		System.out.println("Current Balance is "+ balance);
		System.out.println("==========================================================");
	}
	
	public void deposit(float amount) {
		balance += amount;
		viewBalance();
	}
	public void widhdraw(float amount) {
		if(amount <= balance) {
			balance -= amount;
			viewBalance();
		}
		else {
			viewBalance();
			System.out.println("==========================================================");
			System.out.println("Amount insufficient !!! try again !!!");
			System.out.println("==========================================================");
		}
	}
	
	@Override
	 public String toString() {
		return "Bank Account [ Account Number = "+ accountNumber + ", Owner Name = "+ ownerName+", Balance = "+balance +" ]";
	 }
	 
}
