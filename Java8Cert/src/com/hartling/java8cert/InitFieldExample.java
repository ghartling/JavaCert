package com.hartling.java8cert;

public class InitFieldExample {
	private String initTest = populateInitTest();

	int x = y;

	// must be static or compile fails
	static int y = 5;

	public InitFieldExample() {
		System.out.println("InitFieldExample()");
	}

	void InitFieldExample() {
		System.out.println("void InitFieldExample()");
	}

	public static void main(String... args) {
		InitFieldExample init = new InitFieldExample();
		System.out.println("initTest: " + init.initTest);

		double x = 10.0 / 0;

		// This will throw an ArithmeticExeption
		// int y = 10 / 0;
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		// this will not compile
		// Double d = 10;
		// Long i =3;

		// this will
		Double d = 10.0;
		Long i = 3l;
		Float f = 3f;

		Double d2 = 10d;
		long l1 = 3;

		float f1 = 3;
		double d3 = 10;
		d3 = f1;
	}

	private String populateInitTest() {
		return "init";
	}
}
