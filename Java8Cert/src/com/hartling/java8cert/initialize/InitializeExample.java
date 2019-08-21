package com.hartling.java8cert.initialize;

public class InitializeExample {

	static final int i = 0;

	static int ci;
	static Integer cii;

	public static void main(String[] args) {
		System.out.println(ci);
		System.out.println(cii.intValue());

		int i = 3, j = 2;
		System.out.println(i-- + --j + ++i);

		System.out.println(i-- + --j + ++i);

		i = 3;
		j = 2;
		if (i++ == 3) {
			System.out.println("i = " + i);
		}
		if (--i == 3) {
			System.out.println("i = " + i);

		}

		// must initialize before using
		// int k;
		// Integer ii;
		// System.out.println("k = " + k);
		// System.out.println("ii = " + ii.intValue());

	}

}
