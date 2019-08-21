package com.hartling.java8cert.numbersandstrings;

public class InitializeExample {

	static int s1 = 0;

	static {
		int s1 = 2;
	}

	public static void main(String[] args) {
		System.out.println("s1 = " + s1);

		// integerTest(new Integer[] { 1, 2, 3 });

		// can either supply a dimension size or an array initializer but not both
		Integer[] i1 = new Integer[] { 1, 2, 3 };
		Float[] f1 = new Float[] { 1f, 2f, 3f };
		Float[] f2 = { 1f, 2f, 3f };
		Float f3[][] = { { 1f } };
		Float f4[][];
		Float f5[][] = new Float[][] { {} };
		Float f6[][] = { {} }; // f6[1][0]

		float f7[][];
		float f8[];

		int p[] = new int[] { 1, 2, 3 };
		int p1[] = { 1, 2, 3 };

		System.out.println(String.format("f6[%d][%d]", f6.length, f6[0].length));

		String s1[] = { "1", "2", "3" };
		System.out.println(String.format("s1[%d][%d]", s1.length, s1[0].length()));

		integerEqualityTest();
		expressionTest();
	}

	public static void integerTest(Integer[] x) {
		float f[];

		for (int i : x) {
			System.out.println("i = " + i);
		}
	}

	public static void integerEqualityTest() {
		Integer a = 127;
		Integer b = 127;

		System.out.println("a==b: " + (a == b));

	}

	public static void expressionTest() {
		int x = 1;
		int y = 2;

		int i = (++x * y--) * --y;

		System.out.println("i: " + i);

		x = 1;
		y = 2;
		System.out.println("i: " + (i = (++x * y--)) + ", y = " + y + ", i = " + i * --y);

		x = 1;
		y = 2;

		i = ++x * y-- * --y;

		System.out.println("i: " + i);

	}

}
