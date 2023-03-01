/**
 * 
 */
package com.genrics;

/**
 * @author HP
 *
 */

class MyClass<T,T1>{
	private T name;
	private T1 age;
	public MyClass(){
	}
	public MyClass(T name,T1 age){
		this.name= name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public T getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public T1 getAge() {
		return age;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(T name) {
		this.name = name;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(T1 age) {
		this.age = age;
	}
	
	
}
public class GenricsClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyClass<String,Integer> obj = new MyClass<String,Integer>();
		obj.setName("Nithya");
		obj.setAge(21);
		System.out.println("Name : "+ obj.getName());
		System.out.println("Age : "+ obj.getAge());
		obj = new MyClass<String,Integer>("Malathi",23);
		System.out.println("Name : "+ obj.getName());
		System.out.println("Age : "+ obj.getAge());

	}

}
