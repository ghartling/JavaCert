package com.hartling.java8cert.numbersandstrings;

public class IntegerApiExample {

	public static void main(String[] args) {
		int z = Integer.decode("-0x10");
		Integer x = Integer.decode("-0x10");
		Integer y = Integer.parseInt("-10");

		int a = Integer.valueOf(99);
		Integer b = Integer.valueOf(99);
		System.out.format("a == b: %b %n", (a == b));

		String s = String.valueOf(true);
		// String []dd, ee;

		System.out.format("x = %d, y = %d%n", x, y);
		System.out.format("x = %s, y = %s%n", Integer.toBinaryString(x), Integer.toBinaryString(-y));
		// System.out.println("x = "test carriage return%n");

		testCache();
	}

	public static void testCache() {
		Integer x = Integer.valueOf(127);
		Integer y = 127;
		Integer z = new Integer(127);

		System.out.println("x==y: " + (x == y));
		System.out.println("y==z: " + (y == z));
	}
}