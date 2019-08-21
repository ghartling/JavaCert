package com.hartling.java8cert.forloop;

public class ForLoopExample {
	public static void main(String[] args) {

		System.out.println("valueOf(i) pre increment after print: ");
		for (int i = 0; i < 3; System.out.println(String.valueOf(i)), ++i)
			;

		System.out.println("valueOf(i) pre increment before print: ");
		for (int i = 0; i < 3; ++i, System.out.println(String.valueOf(i)))
			;

		System.out.println("valueOf(i) post increment after print: ");
		for (int i = 0; i < 3; System.out.println(String.valueOf(i)), i++)
			;

		System.out.println("valueOf(i) post increment before print: ");
		for (int i = 0; i < 3; i++, System.out.println(String.valueOf(i)))
			;

		System.out.println("++i, j++ : ");
		for (int i = 0, j = 0; i < 3; ++i, System.out.println("i = " + String.valueOf(i) + ", j = " + j))
			j++;

		for (int i = 0; i < 10; ++i) {
			continue;

			// error for unreachable code
			// System.out.println(i);
		}

		// compilation error because i isn't initialized
		// for (int i; i < 3; ++i)
		// ;

		int x = 1;
		int y = 2;

		int xy = (++x * y--) * --y;
		System.out.println("xy = " + xy);

	}

	public static void printSb(StringBuilder sb) {
		System.out.println("sb: \"" + sb + "\"");
		System.out.println("sb.length(): " + sb.length());
		System.out.println("sb.capacity(): " + sb.capacity());
	}
}
