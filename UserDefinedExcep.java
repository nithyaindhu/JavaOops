/**
 * 
 */
package com.ExceptionHandling;
class InvalidProductException extends Exception{
	InvalidProductException(String str){
		super(str);
	}
}
/**
 * @author HP
 *
 */
public class UserDefinedExcep {
	public static void check(int weight) throws InvalidProductException{
		if(weight>89) {
			throw new InvalidProductException("Invalid weight");
		}
	}
	/**
	 * @param args
	 */
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		try {
			int weight = 90;
			check(weight);
		}catch(InvalidProductException e){
			System.out.println(e);
		}
		finally {
			throw new ArrayIndexOutOfBoundsException("ji");
		}

	}

}
