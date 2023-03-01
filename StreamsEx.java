/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * @author HP
 *
 */
public class StreamsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer num[] = new Integer[] {1,3,2,4,6,7,7,9,0,1};
		Stream<Integer> streamOfArray = Stream.of(num);
		//streamOfArray.distinct().count();
		streamOfArray.sorted().forEach(s->System.out.print(s+" "));
		System.out.println("\n"+(int)Arrays.stream(num).distinct().count());
		
		Collection<String> streamOfCollection = Arrays.asList("hi", "there", "i", "am","nithya");
		Stream<String> soc = streamOfCollection.stream();
		soc.sorted().forEach(s->System.out.print(s+" "));
		
		Stream<String> stringGenerator = Stream.generate(()->"\nhi").limit(3);
		stringGenerator.forEach((s)->System.out.println(s));
	}
}
