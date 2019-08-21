package com.hartling.java8cert.inheritance;

class Super {
	static String ID = "QBANK";
}

class Sub extends Super {
	// static String ID = "QBANK";
	static {
		System.out.print("In Sub");
	}
}

public class SuperSubExample extends Sub {
	public static void main(String[] args) {
		System.out.println(Sub.ID);

		SuperSubExample sub = new SuperSubExample();
		System.out.println(sub.ID);

	}
}
