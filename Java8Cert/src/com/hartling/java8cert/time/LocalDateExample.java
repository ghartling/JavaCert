package com.hartling.java8cert.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateExample {
	public static void main(String[] args) {

		LocalDate ld = LocalDate.ofYearDay(2019, 22);
		System.out.println("month: " + ld.getMonthValue());
		System.out.println("month: " + ld.getMonth());

		int x = 5 * +-6;
		int y = 5 * -6;
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		// long
		Instant instant = Instant.ofEpochMilli(1543882931696l);
		// Instant instant = Instant.now();
		LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		System.out.println("date time = " + dateTime.toString());
		System.out.println("millis = " + instant.toEpochMilli());
	}

}
