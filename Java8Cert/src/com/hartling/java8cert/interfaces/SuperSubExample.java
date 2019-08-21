package com.hartling.java8cert.interfaces;

interface Super {
	static String ID = "QBANK";

	static void x1() {
		System.out.println("Super ID = " + ID);

	}
}

interface Sub extends Super {
	static String ID = "test";

	static void x1() {
		System.out.println("Sub ID = " + ID);

	}

}

public class SuperSubExample implements Sub, Super {
	public static void main(String[] args) {
		System.out.println(Sub.ID);
		System.out.println(Super.ID);

		SuperSubExample s = new SuperSubExample();
		// ambiguous
		// System.out.println(s.ID);

	}
}
