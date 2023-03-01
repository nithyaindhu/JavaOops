/**
 * 
 */
package com.Files;
import java.io.*;
/**
 * @author HP
 *
 */
public class BufferedInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedInputStream bis = new BufferedInputStream(System.in);
		try {
			FileOutputStream fos = new FileOutputStream("write.txt");
			byte str = (byte) bis.read();
			fos.write(str);
//			byte  i ;
//			while((i = (byte) bis.read()) !='0') {
//				fos.write(i);
//			}
			bis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		//it wont accept system.in 
		BufferedReader bw;
		try {
			System.out.println("jii");
			bw = new BufferedReader(new FileReader("Text.txt"));
			try {
				System.out.println("llii");
				//BufferedWriter fw = new BufferedWriter(new FileWriter("o.txt"));
				FileWriter fw =new FileWriter("Write.txt");
				String  str ;
				while((str = bw.readLine())!=null) {

					System.out.println("jii " + str);
					fw.write(str);
					//fw.newLine();
				}
				fw.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		} catch (FileNotFoundException e1) {
			System.out.println(e1);
			e1.printStackTrace();
		}
		
		
	}

}
