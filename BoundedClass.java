/**
 * 
 */
package com.genrics;

/**
 * @author HP
 *
 */
class One{
	public void display() {
		System.out.println("One");
	}
}
class Two extends One{
	public void display() {
		System.out.println("Two");
	}
}
class Three extends Two{
	public void display() {
		System.out.println("Three");
	}
}
class MyClassBounded<T extends Three>{
	private T obj;
	MyClassBounded(T obj){
		this.obj = obj;
	}
	public void display() {
		obj.display();
	}
}
public class BoundedClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassBounded<Three>  bounded = new MyClassBounded<Three>(new Three());	
		bounded.display();
		
		}

}
