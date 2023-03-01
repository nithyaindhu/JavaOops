/**
 * 
 */
package com.DateAndTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class FormatAndParse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		DateTimeFormatter format =DateTimeFormatter.ofPattern("MMM-dd-yyyy");
		LocalDate dob = LocalDate.parse(read.nextLine(),DateTimeFormatter.ofPattern("yyyyMMdd"));
		Period period = Period.between(dob,date);
		System.out.println(period);
		System.out.println(period.getMonths());
		
		String sdate = dob.format(format);
		System.out.println(sdate);
		
		LocalTime time = LocalTime.now();
		LocalTime btime = LocalTime.of(19, 30);
		Duration duration = Duration.between(btime, time);
		System.out.println(duration);
		
	}

}
