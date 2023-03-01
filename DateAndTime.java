/**
 * 
 */
package com.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

/**
 * @author HP
 *
 */
public class DateAndTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate now, bnow;
		now = LocalDate.now();
		System.out.println("date is : " +now);
		bnow = LocalDate.of(2004,9,4);
		System.out.println("bdate is : " +bnow);
		System.out.println("is leap year : " + now.isLeapYear());
		System.out.println("is After : " +now.isAfter(bnow));
		System.out.println("is Before : " +now.isBefore(bnow));
		System.out.println("day of week is : " +now.getDayOfWeek());
		System.out.println("day of month is : " +now.getDayOfMonth());
		System.out.println("day of year is : " +now.getDayOfYear());
		System.out.println("add 1 day is  : " +now.plusDays(1));
		System.out.println("add 1 month is  : " +now.plusMonths(1));
		System.out.println("add 1 Year is  : " +now.plusYears(1));
		String format =  "yyyy-MM-dd";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		LocalDate date = LocalDate.parse("2001-09-04", formatter);
		System.out.println("Date is : "+ date);
		Period period = Period.between(date, now); 
		System.out.println("Period is : "+ period + " days : " + period.getDays() 
		+ " Months : "+ period.getMonths()+" year : " +period.getYears());
		System.out.println(now.minus(1,ChronoUnit.MONTHS));
		System.out.println(now.minus(2,ChronoUnit.MONTHS));
		System.out.println(now.minus(1,ChronoUnit.CENTURIES));//100
		System.out.println(now.minus(2,ChronoUnit.DAYS));
		System.out.println(now.plus(1,ChronoUnit.MONTHS));
		System.out.println(now.plus(2,ChronoUnit.MONTHS));
		System.out.println(now.plus(1,ChronoUnit.CENTURIES));
		System.out.println(now.plus(2,ChronoUnit.DAYS));
		System.out.println(now.minus(1,ChronoUnit.DECADES)); // 10 years
		System.out.println(now.minus(2,ChronoUnit.MILLENNIA)); //1000
	//	System.out.println(now.minus(1,ChronoUnit.FOREVER)); 
		System.out.println(bnow.minus(1,ChronoUnit.ERAS));
	//	System.out.println(now.minus(1,ChronoUnit.HALF_DAYS));
		System.out.println(now.with(bnow));
		System.out.println(now.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		System.out.println(now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
		System.out.println(now.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(now.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
		System.out.println(now.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(now.getDayOfWeek());//date =-= day
		System.out.println(now.getDayOfMonth());
		System.out.println(now.lengthOfMonth());//date =-= day
		System.out.println(now.lengthOfYear());//date =-= day
		System.out.println(bnow.lengthOfYear());//date =-= day
		
		LocalTime tnow,time;
		tnow = LocalTime.now();
		time = LocalTime.of(22, 30);
		System.out.println("time is : " +tnow);
		System.out.println("time is : " +tnow.compareTo(time));
		System.out.println("time is : " +tnow.plusHours(1).getMinute());
		System.out.println("time is : " +tnow.plusMinutes(1).getMinute());
		System.out.println("time is : " +tnow.truncatedTo(ChronoUnit.MINUTES));
		System.out.println("time is : " +tnow.truncatedTo(ChronoUnit.HOURS));
		System.out.println("time is : " +tnow.isAfter(time));
		System.out.println("time is : " +tnow.isBefore(time));
		System.out.println("time is : " +tnow.isAfter(time));
		System.out.println("time is : " +tnow.until(time, ChronoUnit.HOURS));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("date time is : " +ldt);
		ldt = LocalDateTime.of(2022, 12, 7, 16, 11);
		System.out.println("date time is : " +ldt);
		ldt = LocalDateTime.of(2022, Month.DECEMBER, 7, 16, 15, 40, 10);
		System.out.println("date time is : " +ldt);
	}

}
