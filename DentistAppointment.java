/**
 * 
 */
package com.CollectionAssignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author HP
 *
 */
interface Appointment {
	public boolean occursOn(int date, int month, int year);
	 void makeAppointment(LocalDate date, String description,String appointmentType) ;
	 String dayOfTheWeek();
	 String getDate();
	 void displayAll();
}
class OneTime implements Appointment{
	public LocalDate date;
	public String description;
	public String appointmentType;
	public boolean occursOn(int date, int month, int year) {
		return this.date.equals(LocalDate.of(year, month, date));
	}
	@Override
	public void makeAppointment(LocalDate date, String description, String appointmentType) {
		this.date = date;
		this.description = description;
		this.appointmentType = appointmentType;
	}
	@Override
	public String dayOfTheWeek() {
		// TODO Auto-generated method stub
		return this.date.getDayOfWeek().toString();
	}
	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return date.toString();
	}
	@Override
	public void displayAll() {
		System.out.println("Date : "+ date+ " Description : "+ description + " Appontment type : "+ appointmentType);
	}
}
class Daily implements Appointment{

	public LocalDate date;
	public String description;
	public String appointmentType;
	public boolean occursOn(int date, int month, int year) {
		return this.date.equals(LocalDate.of(year, month, date));
	}

	@Override
	public void makeAppointment(LocalDate date, String description, String appointmentType) {
		this.date = date;
		this.description = description;
		this.appointmentType = appointmentType;
	
	}

	@Override
	public String dayOfTheWeek() {
		// TODO Auto-generated method stub
		return this.date.getDayOfWeek().toString();
		}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return date.toString();
	}
	@Override
	public void displayAll() {
		System.out.println("Date : "+ date+ " Description : "+ description + " Appontment type : "+ appointmentType);
	}
	
}
class Monthly implements Appointment{

	 public LocalDate date;
	 public String description;
	 public String appointmentType;
	 public boolean occursOn(int date, int month, int year) {
		return this.date.equals(LocalDate.of(year, month, date));
	}

	@Override
	public void makeAppointment(LocalDate date, String description, String appointmentType) {
		this.date = date;
		this.description = description;
		this.appointmentType = appointmentType;
	
	}

	@Override
	public String dayOfTheWeek() {
		// TODO Auto-generated method stub
		return this.date.getDayOfWeek().toString();
	}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return date.toString();
	}
	@Override
	public void displayAll() {
		System.out.println("Date : "+ date+ " Description : "+ description + " Appontment type : "+ appointmentType);
	}
}
class sortByDate implements Comparator<Appointment>{

	@Override
	public int compare(Appointment o1, Appointment o2) {
		return o1.getDate().compareTo(o2.getDate());
	}
}
public class DentistAppointment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		do {
			System.out.println("Enter the date in the following format yyyy-MM-dd: ");
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(read.nextLine());
			System.out.println("Enter Description : ");
			String description = read.nextLine();
			System.out.println("Enter the type of Appointment one from below !!!\n1.OneTime\n2.Daily\n3.Monthly");
			Appointment app = null;
			switch(read.nextLine().toUpperCase()){
			case "ONETIME":
				app = new OneTime();
				app.makeAppointment(date, description, "OneTime");
				break;
			case "DAILY":
				app = new Daily();
				app.makeAppointment(date, description, "Daily");
				break;
			case "MONTHLY":
				app = new Monthly();
				app.makeAppointment(date, description, "Monthly");
				break;
			}
			appointments.add(app);
			System.out.println("Enter yes to continue adding appointments : ");
		}while(read.nextLine().equalsIgnoreCase("yes"));
		appointments.stream().forEach(x->System.out.println("day is " +x.dayOfTheWeek()));
		System.out.println("Appointments after sort by date : ");
		Collections.sort(appointments,new sortByDate());
		appointments.stream().forEach(x->x.displayAll());
		System.out.println("Appointments occurs on date/not : ");		
		appointments.stream().forEach(x->System.out.println(x.occursOn(01, 01, 2022)));
		
	}

}
