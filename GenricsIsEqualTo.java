/**
 * 
 */
package com.Genrics_assign;

/**
 * @author HP
 *
 */
class Equals{
	public static <T extends Number> boolean isEqualsTo(T num1, T num2) {
		if(num1.doubleValue() == num2.doubleValue()) {
			return true;
		}
		return false;
	}
	public static <T> boolean isEqualsTo(T str1, T str2) {
		 if(str1.toString().equals(str2.toString())) { return true; }
		 else if(str1.equals(str2)) {
			return true;
		}
		return false;
	}
}
public class GenricsIsEqualTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Int : " + Equals.isEqualsTo(1, 2));
		System.out.println("String : " + Equals.isEqualsTo("String", "String"));
		System.out.println("String : " + Equals.isEqualsTo("String", new StringBuffer("String")));
		
		System.out.println("Double : " + Equals.isEqualsTo(1.2, 1.2));
		System.out.println("Char : " + Equals.isEqualsTo('s', 'f'));
		Equals e1 = new Equals(),e2 = new Equals();
		System.out.println("Object : " + Equals.isEqualsTo(e1, e1));
		System.out.println("Object : " + Equals.isEqualsTo(e1, e2));
		
		
	}

}
