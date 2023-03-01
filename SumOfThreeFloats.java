/**
 * 
 */
package com.CollectionAssignments;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * @author HP
 *
 */
public class SumOfThreeFloats {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//creating hashset for floats
		Set<Float>  floats = new HashSet<Float>();
		for(int i = 0 ; i < 3 ; i++) {
			floats.add(read.nextFloat());
		}
		
		System.out.println(floats.stream()/* .map(x->x*2) */.reduce(0f,(x,x1)->x+x1));
		read.close();
	}

}
