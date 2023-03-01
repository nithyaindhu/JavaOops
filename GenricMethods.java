/**
 * 
 */
package com.genrics;

import java.util.Arrays;

/**
 * @author HP
 *
 */
class MyMethod{
	private String name[] ;
	public <T> void setName (T[] name) {
		this.name = (String[]) name ;
	}
	public <T> void displayArray(T[] array) {
		Arrays.stream(array).forEach(System.out::println);
	}
	public <T extends Number> T claculate(T numOne, T numTwo) {
//				if(String.valueOf(numOne.getClass().getName()).equals("java.lang.String") && String.valueOf(numTwo.getClass().getName()).equals("java.lang.String")) {
//			return (T)((String)numOne + (String)numTwo);
//		}
//		else 
		//if(String.valueOf(numOne.getClass().getName()).equals("java.lang.Integer") && String.valueOf(numTwo.getClass().getName()).equals("java.lang.Integer")) {
			
		if(String.valueOf(numOne.getClass().getName()).equals("java.lang.Float") && String.valueOf(numTwo.getClass().getName()).equals("java.lang.Float")) {
			return  (T)(Float)(numOne.floatValue()+numTwo.floatValue());	
		}
		else if(String.valueOf(numOne.getClass().getName()).equals("java.lang.Double") && String.valueOf(numTwo.getClass().getName()).equals("java.lang.Double")) {
			return  (T)(Double)(numOne.doubleValue()+numTwo.doubleValue());	
		}
		else {
			return  (T)(Integer)(numOne.intValue()+numTwo.intValue());	
		}
		
		
	}
	public <T > T claculate(T cOne, T cTwo) {
	
	return (T)(cOne.toString()+ cTwo.toString()) ;
	}
}
public class GenricMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyMethod method = new MyMethod();
		String[] array = {"hi","hello","bye"};
		method.setName(array);
		method.displayArray(array);
		System.out.println(method.claculate(134567998,45676782));
		System.out.println(method.claculate(1.1,2.2));
		System.out.println(method.claculate(1.1f,2.2f));
		System.out.println(method.claculate("Hi","Hello"));

		System.out.println(method.claculate('H','H'));
		
	}

}
