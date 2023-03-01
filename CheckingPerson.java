package com.oops;
import java.util.Scanner;

public class CheckingPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read =  new Scanner(System.in);
		
		Person p = new Person();
		
		System.out.print("Enter name : ");
		p.setName(read.nextLine());
		System.out.print("Enter Age : ");
		p.setAge(read.nextInt());
		System.out.print("Enter Height in Meters : ");
		p.setHeightInM(read.nextDouble());
		System.out.print("Enter Weight in kg : ");
		p.setWeightInKg(read.nextDouble());
		read.nextLine();
		System.out.print("Enter gender : ");
		p.setGender(read.nextLine());
		
		Person p2 = new Person();
		
		System.out.print("Enter name : ");
		p2.setName(read.nextLine());
		System.out.print("Enter Age : ");
		p2.setAge(read.nextInt());
		System.out.print("Enter Height in Meters : ");
		p2.setHeightInM(read.nextDouble());
		System.out.print("Enter Weight in kg : ");
		p2.setWeightInKg(read.nextDouble());
		read.nextLine();
		System.out.print("Enter gender : ");
		p2.setGender(read.nextLine());
		
		System.out.println("\n" + p2.getName() + " details are :");
		p2.showDetails();
		System.out.println("\n" + p.getName() + " details are :");
		p.showDetails();
		
		read.close();
	}

}
