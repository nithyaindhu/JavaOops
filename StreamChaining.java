/**
 * 
 */
package com.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author HP
 *
 */
public class StreamChaining {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		System.out.println(br.read());//prisnt 9 57
		br.readLine();
		System.out.println(Integer.parseInt(br.readLine()));
	}

}
