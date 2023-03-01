/**
 * 
 */
package com.CollectionAssignments;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
/**
 * @author HP
 *
 */
public class SetIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//reading Strings
		// hash set will not print the elements in entered order
		Scanner read = new Scanner(System.in);
		Set<String> stringSet = new HashSet<String>();
		System.out.println("Enter the strings or enter -1 to exit : ");
		String string;
		do {
			string = read.nextLine();
			if(string.equals("-1")) {
				break;
			}
			else {
				stringSet.add(string);
			}
		}while(true);
		Iterator<String> iterator = stringSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		read.close();
	}

}
