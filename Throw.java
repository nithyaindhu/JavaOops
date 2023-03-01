/**
 * 
 */
package com.ExceptionHandling;

/**
 * @author HP
 *
 */
public class Throw {
	
	public static void exception(String name) {
		if(name.length() < 5) {
			throw new ArithmeticException("Length less than 5");
		}
		else {
			System.out.println("HI");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			exception("N");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
