/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
public class InheritPerson {
	private String _Name;
	private String _Address;
	protected String emailId;
	private int _MobileNumber;
	private String _gender;
	/**
	 * @param _Name
	 * @param _Address
	 * @param emailId
	 * @param _MobileNumber
	 * @param _gender
	 */
	protected void setDetails(String _Name, String _Address, String emailId, int _MobileNumber, String _gender) {
		this._Name = _Name;
		this._Address = _Address;
		this.emailId = emailId;
		this._MobileNumber = _MobileNumber;
		this._gender = _gender;
	}
	
	protected void displayDetails()
	{
		System.out.println("Employee Name : "+_Name);
		System.out.println("Employee Address : "+_Address);
		System.out.println("Employee Email Id : "+emailId);
		System.out.println("Employee Mobile Number : "+_MobileNumber);
		System.out.println("Employee Gender : "+_gender);
	}
	

}
