package com.hartling.java8cert.inheritance2;

class C extends B {

	public static void main(String[] args) {
	}

	@Override
	public int method1(int x) throws NullPointerException {
		try {
			double y = 10 / x;
		} catch (ArithmeticException | NullPointerException e) {
			// compile error because e is final if multiple exceptions are caught
			// e = new ArithmeticException();
		}
		return x * x;
	}

	private class X {

	}
}
