package com.hartling.java8cert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Dates {

	public static void main(String args[]) {
		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println(dateTime);
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));

		// List<Integer> numbers = Arrays.asList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(Integer.valueOf(1));
		numbers.add(Integer.valueOf(2));
		numbers.add(Integer.valueOf(3));
		numbers.add(Integer.parseInt("10", 16));

		boolean result = numbers.remove(Integer.valueOf(2));
		System.out.println("result = " + result);

		for (Integer i : numbers) {
			System.out.println("i = " + i);

		}

		LocalDate localDate = LocalDate.now();
		String year = String.valueOf(localDate.getYear());
		System.out.println("year = " + year);

	}
}
