/**
 * 
 */
package com.CollectionAssignments;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author HP
 *
 */
public class FilesOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		try {
			FileOutputStream write = new FileOutputStream("Words.txt");
			System.out.println("Enter lines or enter -1 to exit : ");
			do{
				String  line = read.nextLine();
				if(line.equals("-1")) {
					break;
				}
				line += System.lineSeparator();
				byte[] byteArray = line.getBytes();
				write.write(byteArray);
				
			}while(true);
			write.close();
			
		} catch (FileNotFoundException e) {System.out.println(e);
		}catch (IOException e) {
			System.out.println(e);
		}
		ArrayList<String> stringArray = new ArrayList<String>();
		try {
			BufferedReader bos = new BufferedReader(new FileReader("Words.txt"));
			int i ;
			String word = "";
			int count =0;
			while((i = bos.read())!=-1) {
				System.out.print((char)i);
				if(i == 10 || i == 13 || (char)i ==' ') {
					count++;
					if(count ==2 || (char)i ==' ') {
						count = 0;
					stringArray.add(word);
					word="";
					}
					continue;
				}else {
					word += (char)i;
				}
			}
			stringArray.add(word);
			stringArray.remove(" ");
			
			System.out.println(stringArray);
			bos.close();
			}
			catch (FileNotFoundException e) {
			System.out.println(e);
			}catch (IOException e) {
				System.out.println(e);
			}
		
			List<String> plurals = stringArray.stream().filter(x->x.endsWith("s")).collect(Collectors.toList());
			plurals.stream().forEach(x->System.out.println(x.toUpperCase() + " : " +new StringBuffer(x).reverse()));
			stringArray.removeAll(plurals);
			System.out.println(stringArray);
	
	
	}
		
	}
