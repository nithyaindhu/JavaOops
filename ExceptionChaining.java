/**
 * 
 */
package com.ExceptionHandling;

/**
 * @author HP
 *
 */
public class ExceptionChaining {

	
	public static void fun() {
		try {
		throw new ArithmeticException("hi there!!!");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			throw e;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fun();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
