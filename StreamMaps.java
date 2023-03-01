/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author HP
 *
 */
public class StreamMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer num[] = new Integer[] {1,2,3,1,2,3,4,4,5};
		System.out.println(Stream.of(num).filter(x->x%2==0).distinct().map(x->x*2).reduce(0,(s,i)->(s+i)));
		System.out.println(( Arrays.stream(num).distinct().map(x->x*2)).collect(Collectors.toList()));
		
	}

}
