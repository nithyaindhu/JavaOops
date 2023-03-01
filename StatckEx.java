/**
 * 
 */
package com.collectionsEx;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
/**
 * @author HP
 *
 */
public class StatckEx {
	private static Scanner read = new Scanner (System.in);
	/** checking stack methods
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		//initial capacity
		System.out.println(stack.capacity());
		// reading elements
		do {
			System.out.print("Enter the values : ");
			String string = read.nextLine();
			if(string.equals("-1")) {
				break;
			}
			stack.push(string);
		}while(true);
		//printing
		System.out.println(stack);
		//setting element at 2 nd index
		stack.setElementAt("hello", 2);
		//using iterator to print
		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		//ensure capacity if not double its capacity
		stack.ensureCapacity(30);
		//copying stack into array
		args = new String[stack.size()];
		stack.copyInto(args);
		for(String s : args) {
			System.out.println(s);
		}
		//return the position of data in stack
		System.out.println(stack.search("hi"));
		
		
	}

}
