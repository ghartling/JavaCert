package com.hartling.java8cert.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Date;

public class TimeExample {
	public static void main(String[] args) {

		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime: " + lt.toString());

		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate: " + ld.toString());

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime: " + ldt.toString());

		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println("OffsetDateTime: " + odt.toString() + ", id = " + odt.getOffset().getId());

		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("ZonedDateTime: " + zdt.toString() + ", id = " + zdt.getOffset().getId());
		System.out.println("ZonedDateTime: " + zdt.toString() + ", id = " + zdt.get(ChronoField.DAY_OF_YEAR));

		Instant instant = zdt.toInstant();
		// throws java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: DayOfYear
		// System.out.println("day of year: " + instant.get(ChronoField.DAY_OF_YEAR));

		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println("hannah.length(): " + hannah.length());

		System.out.println("date from instant: " + getDateNeeded());

		String s = "12345";
	}

	public static Date getDateNeeded() {
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt60 = ldt.plusDays(60);
		return Date.from(ldt60.atZone(ZoneId.systemDefault()).toInstant());
	}

}
