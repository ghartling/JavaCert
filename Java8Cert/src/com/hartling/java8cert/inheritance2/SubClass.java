package com.hartling.java8cert.inheritance2;

public class SubClass extends Parent {

	public SubClass() {
		System.out.println("SubClass contructor");
	}

	public static void main(String args[]) {
		Parent p = new SubClass();

		p.testMethod();
	}

	@Override
	public final void testMethod() {

	}

	{
		System.out.println("SubClass non-static code block");
	}

	static {
		System.out.println("SubClass static code block");
	}

	@Override
	public Double covariantExample() {
		return Double.valueOf(5);
	}

	public Integer testOverload(int i) {
		return Integer.valueOf(i);
	}

	public Double testOverload(double d) {
		return Double.valueOf(d);
	}

	public Integer testOverload(String s) {
		return Integer.parseInt(s);
	}
}
