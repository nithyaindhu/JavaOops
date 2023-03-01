/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
public class Author {
	private String _firstName;
	private String _lastName;
	private String _email;
	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	
	public Author(String _firstName, String _lastName, String _email) {
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._email = _email;
	}
	protected String get_firstName() {
		return _firstName;
	}
	protected void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}
	protected String get_lastName() {
		return _lastName;
	}
	protected void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}
	protected String get_email() {
		return _email;
	}
	protected void set_email(String _email) {
		this._email = _email;
	}
	
	@Override
	public String toString()
	{
		return "Author = [ FirstName = " + _firstName + ", LastName = " +_lastName +", Email = "+_email + "]";
	}
	
}
