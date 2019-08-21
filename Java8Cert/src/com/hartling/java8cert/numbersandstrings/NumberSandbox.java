package com.hartling.java8cert.numbersandstrings;

public class NumberSandbox {

	public static void main(String[] args) {

		float f = 5.0f;
		f = 5;

		int i = 200;
		short s = 100;
		f = s;
		double d = f;
		d = 10;

		i = s;

		// invalid
		// Double d = 9; // invalid
		Double d1 = 9.0; // valid
		double dd = 9; // valid

		// Float f = 9; // invalid
		// Float f2 = 9.0; // invalid
		Float f3 = 9f; // valid
		float f4 = 9; // valid
		// float f5 = 9.0; // invalid

		Integer i1 = 9; // valid
		Short s1 = 9; // valid

		short s2 = 9; // valid
		// short s3 = 100000; // invalid > 65535
		short s3 = 32767;
		System.out.println("s3 = " + s3);
		// shortTest(9); // invalid

		testRound();

		testNumberEquality();
	}

	public static void testNumberEquality() {
		Number n = new Integer(5);
		Integer i = new Integer(5);
		Long l = new Long(42);

		System.out.println("n==i: " + (n == i));

		// fails to compile because they are different types
		// System.out.println("l==i: " + (l == i));
		testPrimitiveAssignments();
	}

	public static void testPrimitiveAssignments() {
		byte b = 100;
		char c = 100;
		short s = 100;
		int i = 100;

		boolean bool = true;

		// error
		// b = c;
		// b = s;
		// b = i;

		// s = i;
		// s = c;

		// c = b;
		// c = s;
		// c = i;

		s = b;

		i = b;
		i = s;
		i = c;

		i = s = b;

		// can't assign a char to a String
		// String sc = c;

		// try casting
		int i2 = -70000;
		c = (char) i2;
		System.out.println("c = " + c);

		s = (short) i2;
		System.out.println("s = " + s);

		float f = 0;

		Integer io = i;
		Float fo = f;

		System.out.println("methodx = " + methodX((byte) 5));
	}

	public void testShort() {
		Short s = new Short((short) 9);
		short k = 0;
		Integer i = 9;
		System.out.println(s instanceof Short);
		System.out.println(k == i);
	}

	public static void testRound() {
		System.out.println("Math.round(+.50) = " + Math.round(+.50));
		System.out.println("Math.round(-.50) = " + Math.round(-.50));
		System.out.println("Math.round(-.60) = " + Math.round(-.60));
		System.out.println("Math.round(-1.50) = " + Math.round(-1.50));
	}

	public static double methodX(byte by) {
		double d = 10.0;
		return by / d * 3;
	}
}
