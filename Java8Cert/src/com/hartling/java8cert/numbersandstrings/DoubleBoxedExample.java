package com.hartling.java8cert.numbersandstrings;

public class DoubleBoxedExample {
	void probe(Object x) {
		System.out.println("In Object: " + x);
	} // 3

	// void probe(Number x) {
	// System.out.println("In Number");
	// } // 2

	void probe(Integer x) {
		System.out.println("In Integer");
	} // 2

	void probe(Long x) {
		System.out.println("In Long");
	} // 4

	// void probe(double x) {
	// System.out.println("In double");
	//
	// }

	public static void main(String[] args) {
		double a = 10;
		new DoubleBoxedExample().probe(a);
	}
}
