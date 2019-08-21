package com.hartling.java8cert.time;

import java.time.Period;

public class PeriodExample {
	public static void main(String[] args) {

		// 1 year
		Period p1 = Period.ofYears(1);

		// 1 month
		Period p2 = Period.of(0, 1, 35);

		// add
		Period p3 = p1.plus(p2);

		System.out.println(p3.getDays());
		System.out.println(p3.getMonths());
		System.out.println(p3.getYears());

		Period p3Normalized = p3.normalized();
		System.out.println(p3Normalized);
		System.out.println(p3Normalized.getYears());
		System.out.println(p3Normalized.getMonths());
		System.out.println(p3Normalized.getDays());
	}

}
