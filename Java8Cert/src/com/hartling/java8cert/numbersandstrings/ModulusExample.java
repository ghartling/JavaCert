package com.hartling.java8cert.numbersandstrings;

public class ModulusExample {

	public static void main(String[] args) {
		int x = -10;
		int y = 10;

		String s;
		s = null;
		System.out.println("s = " + s);

		int result = x % -3;
		System.out.println("x % -3 = " + result);

		result = x % 3;
		System.out.println("x % 3 = " + result);

		if (y == 10)
			;
		else
			y *= 2;
		System.out.println("y = " + y);

		switch (x) {
		case 10:
			y *= 2;
			break;
		default:
			y = 5;
			System.out.println("default switch y = " + y);
		case 2:
			y *= 3;
			break;
		}
		System.out.println("after switch y = " + y);

		for (int i = 0; i < 10; ++i) {
			System.out.println("Math.random() = " + Math.random());
			;
		}

		Long l1 = 10l;
		// Long l2 = 10; // invalid

		longTest(10);
	}

	public static void longTest(long x) {

	}

	public static void shortTest(short x) {

	}

}
