package com.hartling.java8cert.numbersandstrings;

public class NumberExample {
	static Integer testIncrementNotInitialized;
	static Integer testIncrementInitialized = 10;

	static int s1 = 0;

	static {
		int s1 = 2;
		int s2 = 4;
	}

	public static void main(String[] args) {
		System.out.println("s1 = " + s1);

		int x = Integer.parseInt("10", 16);
		System.out.println("x = " + x);

		Integer xBox = Integer.valueOf("10", 16);
		System.out.println("x = " + xBox);

		long l = 10;
		int i = 10;
		System.out.println("l == i: " + (l == i));

		l = i;

		Long lx = 12l;
		Long lhex = 0x99ffCl;

		int x1 = 5_2;
		int _52 = 0;

		int xx = 5;
		xx *= 4;
		System.out.format("x1 = %d, _52 = %d, xx = %d %n", x1, _52, xx);

		int binary5 = 0b101;
		System.out.println("binary5 = " + binary5);

		int o = 013;
		System.out.println("o = " + o);

		Integer a = 10;
		int b = a;

		loopTest();
		loopTest2();

		integerTest(new Integer[] { 1, 2, 3 });

		final int /** */
		testcom = 0;

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
		floatTest(9);
		// charTest(9);

		testIncrement();

		integerCompareTest();
		mathWithFloatDoubleLong();
		TestMathWithIncrements();

		testIntegerCache();

		nullIntegerTest();
	}

	public static void nullIntegerTest() {
		Integer[] a = new Integer[2];
		a[1] = 10;
		for (Integer i : a) {
			System.out.println("i = " + i);
		}
	}

	public static void shortTest(short x) {

	}

	public static void charTest(char c) {

	}

	public static void floatTest(float f) {

	}

	public static double doubleTest(int x) {
		return 10 / 2;
	}

	public static void integerTest(Integer[] x) {
		for (int i : x) {
			System.out.println("i = " + i);
		}
	}

	public static void loopTest() {
		for (float i = 0, j = 10; i < j; System.out.println("i = " + i), i++)
			;
	}

	public static void loopTest2() {
		for (float i = 0, j = 10; i < j; ++i, System.out.println("i = " + i))
			System.out.println("loopTest2: in loop i = " + i);
	}

	public static void integerCompareTest() {
		Integer x = 1;
		Integer y = 1;
		if (x == y) {
			System.out.println("they are equal: " + x + " = " + y);
		}
	}

	public static void testIncrement() {
		if (testIncrementInitialized++ == 10) {
			System.out.println("post increment x = " + testIncrementInitialized);
		}

		// will throw NullPointerException
		// if (testIncrementNotInitialized++ == 10) {
		// System.out.println("post increment x = " + testIncrementNotInitialized);
		// }
	}

	public static void mathWithFloatDoubleLong() {
		float f = 12.0f;
		double d = f++;
		long l = 12;
		d--;
		d -= .3;

		System.out.println("f = " + f + ", d = " + d + ", l = " + l);
		System.out.println((d == l) + " ");
		System.out.println((f == d) + " ");
		System.out.println((d == l) + " ");

	}

	public static void TestMathWithIncrements() {
		int a = 5;
		int b = 3;
		int c = a * b++; // c is set to 15
		System.out.println("c = " + c + ", b = " + b);
		int d = a * ++b; // d is set to 25

		System.out.println("a = " + a + ", b = " + b);
		System.out.println("c = " + c + ", d = " + d);

		int x[] = new int[0];
		System.out.println("x.length = " + x.length);
		int xx[] = new int[5];
		int xxx[][] = new int[5][5];
		Object o = xx;
		// xxx[0][0] = (int) o;

	}

	public static void testIntegerCache() {
		Integer c = 127;
		Integer d = 127;
		Integer g = 200;
		Integer h = 200;

		System.out.println((c == d) + ", g==h: " + (g == h));
	}

}
