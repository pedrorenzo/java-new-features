package com.pedrorenzo.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

/**
 * We now have a lot of good things regarding dates, something that at least for
 * me is very important, becaus before Java 8, deal with dates was hard :(
 * 
 * @author pedrorenzo
 */
public class DateAndTime {

	public static void main(String args[]) {
		displayCurrentDate();
		displayCurrentDateDetails();
		displayCurrentTimeDetails();
		displayBirthday();
		displayInTime();
		displayMeetingDateAndTime();
		displayInstant();
		isBeforeDate();
		isAfterDate();
		isEqualDate();
		minusDays();
		plusDays();
	}

	private static void displayCurrentDate() {
		final Date currentDate = new Date();
		final LocalDate localDate = LocalDate.now();
		final LocalTime localTime = LocalTime.now();
		final LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("Current Date and Time - Before Java 8: " + currentDate);
		System.out.println("Current Date - From Java 8: " + localDate);
		System.out.println("Current Time - From Java 8: " + localTime);
		System.out.println("Current Date and Time From Java 8: " + localDateTime);
	}

	private static void displayCurrentDateDetails() {
		final LocalDate localDate = LocalDate.now();

		System.out.println("localDate.getYear(): " + localDate.getYear());
		System.out.println("localDate.getMonth(): " + localDate.getMonth());
		System.out.println("localDate.getDayOfWeek(): " + localDate.getDayOfWeek());
		System.out.println("localDate.getDayOfMonth(): " + localDate.getDayOfMonth());
		System.out.println("localDate.getDayOfYear(): " + localDate.getDayOfYear());

	}

	private static void displayCurrentTimeDetails() {
		final LocalTime localTime = LocalTime.now();

		System.out.println("Current Time: " + localTime);
		System.out.println("localTime.getSecond(): " + localTime.getSecond());
		System.out.println("localTime.getMinute(): " + localTime.getMinute());
		System.out.println("localTime.getHour(): " + localTime.getHour());
	}

	private static void displayBirthday() {
		final LocalDate myBirthday = LocalDate.of(1993, Month.JANUARY, 26);
		System.out.println("myBirthday: " + myBirthday);
	}

	private static void displayInTime() {
		final LocalTime inTime = LocalTime.of(8, 30, 00);
		System.out.println("In Time :" + inTime);
	}

	private static void displayMeetingDateAndTime() {
		final LocalDate meetingDate = LocalDate.of(2019, Month.MARCH, 5);
		final LocalTime meetingTime = LocalTime.of(10, 30, 00);
		final LocalDateTime meetingDateAndTime = LocalDateTime.of(meetingDate, meetingTime);
		System.out.println("Meeting Time and Date: " + meetingDateAndTime);
	}

	private static void displayInstant() {
		final Instant startTime = Instant.now();
		for (int i = 0; i < 1000; i++) {
			System.out.println("Perform some logic");
		}
		final Instant EndTime = Instant.now();
		final Duration duration = Duration.between(startTime, EndTime);
		System.out.println("Time taken to perform some logic: " + duration.toMillis());

	}

	private static void isBeforeDate() {
		final LocalDate localDate1 = LocalDate.now();
		final LocalDate localDate2 = LocalDate.of(2019, 1, 1);
		if (localDate1.isBefore(localDate2)) {
			System.out.println("Date is before 1st Jan 2019");
		} else {
			System.out.println("Date is not before 1st Jan 2019");
		}
	}

	private static void isAfterDate() {
		final LocalDate localDate1 = LocalDate.now();
		final LocalDate localDate2 = LocalDate.of(2019, 1, 1);
		if (localDate1.isAfter(localDate2)) {
			System.out.println("Date is after 1st Jan 2019");
		} else {
			System.out.println("Date is not after 1st Jan 2019");
		}

	}

	private static void isEqualDate() {
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2019, 1, 1);
		if (localDate1.isEqual(localDate2)) {
			System.out.println("Date1 and Date2 are equal");
		} else {
			System.out.println("Date1 and Date2 are not equal");
		}

	}

	private static void plusDays() {
		final LocalDate localDate = LocalDate.of(2019, 1, 1);
		final LocalDate plusDays = localDate.plusDays(3);
		System.out.println("localDate: " + localDate);
		System.out.println("localDate + 3 days: " + plusDays);
	}

	private static void minusDays() {
		final LocalDate localDate = LocalDate.of(2019, 1, 1);
		final LocalDate minusDays = localDate.minusDays(3);
		System.out.println("localDate: " + localDate);
		System.out.println("localDate - 3 days: " + minusDays);
	}

}
