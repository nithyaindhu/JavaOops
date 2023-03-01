/**
 * 
 */
package com.ExceptionHandling;

/**
 * @author HP
 *
 */
class InvalidAgeException extends Exception{
	InvalidAgeException(String str){
		super(str);
	}

//	@Override
//	public String getMessage() {
//		// TODO Auto-generated method stub
//		return "hi there";
//	}
}
public class UserDefinedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 90;
		try {
			if(age>60) {
				throw new InvalidAgeException("people, whose age more than 60 is not allowed!!!");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
