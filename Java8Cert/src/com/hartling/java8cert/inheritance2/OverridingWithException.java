package com.hartling.java8cert.inheritance2;

import java.io.FileNotFoundException;
import java.io.IOException;

class ExceptionClass {

	int method1() throws FileNotFoundException {
		System.out.println(getClass().getSimpleName() + ".method1");
		return 0;
	}

	int method2() throws IOException {
		System.out.println(getClass().getSimpleName() + ".method2");
		return 0;
	}

}

public class OverridingWithException extends ExceptionClass {
	OverridingWithException() {
	}

	@Override
	int method1() {
		System.out.println(getClass().getSimpleName() + ".method1");
		return 0;
	}

	@Override
	int method2() throws FileNotFoundException {
		System.out.println(getClass().getSimpleName() + ".method2");
		return 0;
	}

	public static void main(String args[]) throws FileNotFoundException {
		OverridingWithException owe = new OverridingWithException();

		owe.method1();
		owe.method2();

		String[] strs = { "A", "B", "C" };
		String s = String.join("-", strs);
		System.out.println("s: " + s);

	}
}
