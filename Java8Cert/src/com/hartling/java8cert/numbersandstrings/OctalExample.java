package com.hartling.java8cert.numbersandstrings;

public class OctalExample {
	int x = 013;

	public static void main(String[] args) {
		OctalExample octal = new OctalExample();

		int y = 013;
		System.out.println("y = " + y);

		System.out.println("x = " + octal.x);

		octal.go(22);

		int b = 0b01;

		Double d = 0.0 / 0.0;
		System.out.println("d = " + d);

		double d1 = 0.0 / 0.0;
		System.out.println("d1 = " + d1);

		for (int i = 0; i < 10; i++, System.out.println(i + ""))
			System.out.println(i + " in loop");

		char c = 65;

		// byte b1 =-129;
		octal.testDouble();
	}

	double testDouble() {
		double d = 3d;
		System.out.println("test double: " + d);
		d = 3d;
		System.out.println("test double: " + d);

		return d;
	}

	void go(final int i) {
		System.out.println(i / x);
	}

}
