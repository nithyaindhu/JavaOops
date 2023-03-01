/**
 * 
 */
package com.streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author HP
 *
 */
public class DistinctInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"hi","hello","hi","hello","I","am","nithya"};
		Stream<String> distinct = Stream.of(str).map(String::toUpperCase).distinct();
		distinct.distinct().forEach(x->System.out.println(x));
//		Set<String> set = distinct.collect(Collectors.toSet());
//		System.out.println(set);
	}

}
