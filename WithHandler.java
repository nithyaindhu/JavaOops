/**
 * 
 */
package com.ExceptionHandling;

/**
 * @author HP
 *
 */
public class WithHandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(25/0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("THANK YOU !!!");
		}
	}

}
