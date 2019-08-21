package com.hartling.java8cert.time;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
	public static void main(String[] args) {

		short dayOfMonth = 1;
		LocalDateTime ld = LocalDateTime.of(2000, 3, dayOfMonth, 12, 15);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/M/yyyy");

		System.out.println(df.format(ld));
		System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(ld));

		// short month (pattern is less than 4)
		System.out.println(DateTimeFormatter.ofPattern("dd/M/yyyy").format(ld));

		// short month (pattern is less than 4)
		System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ld));

		// short month (pattern is less than 4)
		System.out.println(DateTimeFormatter.ofPattern("dd/MMM/yyyy").format(ld));

		// long month (pattern is = 4)
		System.out.println(DateTimeFormatter.ofPattern("dd/MMMM/yyyy").format(ld));

		// narrow month (pattern is = 5)
		System.out.println(DateTimeFormatter.ofPattern("dd/MMMMM/yyyy").format(ld));

		// narrow month (pattern is = 5)
		System.out.println(DateTimeFormatter.ofPattern("dd/LLLL/yyyy").format(ld));

		// year with u
		System.out.println(DateTimeFormatter.ofPattern("d/LLLL/uuuu").format(ld));

		// year with u
		System.out.println(DateTimeFormatter.ofPattern("d/LLLL/uuuu hh:mm").format(ld));

		System.out.println("StandardCharsets.UTF_8: " + StandardCharsets.UTF_8.name());
		System.out.println("StandardCharsets.UTF_8: " + StandardCharsets.UTF_8.toString());
		System.out.println("StandardCharsets.UTF_8: " + StandardCharsets.UTF_8.displayName());
		System.out.println("StandardCharsets.UTF_8: " + Charset.defaultCharset().displayName());

		getLocalDateTimeFromSec(15_276_522_000_00l);
	}

	public static LocalDateTime getLocalDateTimeFromSec(long epochMilli) {
		Instant instant = Instant.ofEpochMilli(epochMilli);
		LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

		System.out.println("ldt: " + ldt.toString());

		return ldt;
	}

}
