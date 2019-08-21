package com.hartling.java8cert.inheritance2;

import com.hartling.java8cert.inheritance.*;

class B {
	{
		int x = 0;
	}

	B() {
		// compilation error because x is out of scope
		// ++x;
	}

	public static void main(String[] args) {
		// A a = new A();
		// System.out.println("x = "+x);
	}

	public int method1(int x) throws IllegalAccessException {
		return x * x;
	}
}
