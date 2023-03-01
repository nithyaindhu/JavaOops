/**
 * 
 */
package com.CollectionAssignments;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author HP
 *
 */
public class StudentsMark {

	/**
	 * @param args
	 */
	public static void pushStudents(Map<String,Integer> studentsMark,String name, int mark) {
		studentsMark.put(name, mark);
	}
	public static <T>  void popStudents(Stack<T> studentsMark) {
		//studentsMark.stream().forEach(/* x->System.out.println(studentsMark.pop()) */System.out::println);;
//		for(int i = 0 ; i<studentsMark.size(); i++) {
//			System.out.println(studentsMark.pop());
//		}
		Iterator<T> iterator = studentsMark.iterator();
		while(iterator.hasNext()) {
			System.out.println(studentsMark.pop());
		}
		}
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Map <String,Integer> studentsMark = new LinkedHashMap<String,Integer>();
		
		for(int i = 0; i<6; i++) {
			System.out.print("Enter the student name : ");
			String name = read.nextLine();
			System.out.print("Enter the fruit price : ");
			int mark = read.nextInt();
			read.nextLine();
			if(mark>=75) {
				pushStudents(studentsMark,name,mark);
			}
		}

		Stack<String> studentStack = new Stack <String>();
		studentsMark.entrySet().stream().forEach(x->studentStack.push(x.getKey()));
		popStudents(studentStack);
	}

}
