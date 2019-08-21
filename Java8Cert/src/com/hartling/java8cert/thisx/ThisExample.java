package com.hartling.java8cert.thisx;

public class ThisExample {
	String a = "x";
	static char b = 'x';
	String c = "x";

	class Inner {
		String a = "y";

		String get() {
			String c = "temp";
			// Line 1
			c = ThisExample.this.a;

			return c;
		}
	}

	ThisExample() {
		System.out.println(new Inner().get());
	}

	public static void main(String args[]) {
		new ThisExample();
	}
}