/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
public class Book {
	private String _isbn;
	private String _name;
	private Author _author;
	private double _price;
	private int _qty;
	
	
	/**
	 * @param _isbn
	 * @param _name
	 * @param _author
	 * @param _price
	 * @param _qty
	 */
	public Book(String _isbn, String _name, Author _author, double _price, int _qty) {
		this(_isbn,_name,_author,_price);
		this._qty = _qty;
	}


	/**
	 * @param _isbn
	 * @param _name
	 * @param _author
	 * @param _price
	 */
	public Book(String _isbn, String _name, Author _author, double _price) {
		this._isbn = _isbn;
		this._name = _name;
		this._author = _author;
		this._price = _price;
	}


	protected String get_isbn() {
		return _isbn;
	}


	protected void set_isbn(String _isbn) {
		this._isbn = _isbn;
	}


	protected String get_name() {
		return _name;
	}


	protected void set_name(String _name) {
		this._name = _name;
	}


	protected Author get_author() {
		return _author;
	}


	protected void set_author(Author _author) {
		this._author = _author;
	}


	protected double get_price() {
		return _price;
	}


	protected void set_price(double _price) {
		this._price = _price;
	}


	protected int get_qty() {
		return _qty;
	}


	protected void set_qty(int _qty) {
		this._qty = _qty;
	}
	
	protected String get_authorName() {
		return _author.get_firstName();
	}


	@Override
	public String toString() {
		return "Book [ isbn = " + _isbn + ",\nname = " + _name + ",\n" + _author + ",\nprice = " + _price + ",\nqty = "
				+ _qty + " ]";
	}
	
	
}
