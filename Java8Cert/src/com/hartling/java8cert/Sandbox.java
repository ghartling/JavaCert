package com.hartling.java8cert;

import static java.lang.System.out;

import java.io.IOException;

import com.hartling.java8cert.nested.TestInnerClass;
import com.hartling.java8cert.nested.TestInnerClass.PublicCar;

public class Sandbox {
	public float myfloat;

	public static void main(String args[]) throws IOException {
		String firstAndLast = "first last";
		long long1 = 99_000_000_000L;
		long long2 = 99_000_000_000L;

		System.out.println("first = " + firstAndLast.substring(firstAndLast.indexOf("s")));

		Sandbox s = new Sandbox();

		//
		StringBuilder sb = new StringBuilder("test");
		System.out.println("sb = " + sb.length() + ", capacity = " + sb.capacity());

		//
		StringBuffer sBuffer = new StringBuffer("1234567890");
		System.out.println("sBuffer = " + sBuffer.length() + ", capacity = " + sBuffer.capacity());

		// inner classes
		s.testInnerClass();

		out.println(long1);

		System.out.println("x" + 1 + 2);
		System.out.println("x" + (1 + 2));

		s.testTrue();
	}

	public void testFinal(final String value) {
		final int num;
		num = 0;
	}

	public void testInnerClass() {
		TestInnerClass test = new TestInnerClass();
		PublicCar c = test.new PublicCar();

		System.out.println("number of tires = " + c.getNumTires());
	}

	public void testTrue() {
		printTrue(true ^ false | true);
		printTrue((true ^ false) | true);
		printTrue((true ^ false | true));
		printTrue(true ^ (false | true));

	}

	public void printTrue(boolean b) {
		System.out.println("b = " + b);
	}
}
