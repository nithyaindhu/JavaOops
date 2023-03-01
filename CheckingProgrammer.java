/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class CheckingProgrammer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Programmer programmer[] = new Programmer[5];
		
		for(int i = 0; i< 5;i++)
		{
			programmer[i] = new Programmer();
			programmer[i].setProgrammer(read.nextLine(), read.nextInt());
			read.nextLine();
		}
		programmer[0].getProjectLeader();
		for(int i=0;i<5;i++)
		{
			programmer[i].getProgrammer();
		}
		read.close();
	}

}
