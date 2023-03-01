/**
 * 
 */
package com.ExceptionHandling;

import java.io.IOException;

/**
 * @author HP
 *
 */
public class Throws {

	public static void fun() throws IllegalAccessException,IOException{
		if(true) {throw new IllegalAccessException("illegal acceess!!!");}
		//throw new IOException("Hi");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Throws.fun();
			int a = 5/0;
		}catch(Exception e) {
			
		} /*
			 * catch(ArithmeticException e) {
			 * 
			 * }
			 */
		finally {
			System.out.println("I am Nithya!!!");
		}
		//fun();
	System.out.println("jij");	
	}

}
