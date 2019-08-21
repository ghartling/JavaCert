package com.hartling.java8cert.arrays;

import java.io.IOException;

import com.hartling.java8cert.nested.TestInnerClass;
import com.hartling.java8cert.nested.TestInnerClass.PublicCar;

public class ArraysAndSwitchWithVariable {
	public float myfloat;

	public static void main(String args[]) throws IOException {

		int[] nums = { 0, 1, 2, 3, 4 };

		for (int n : nums) {
			System.out.println(n);
			continue;

			// compile error for unreachable code
			// System.out.println(x);
		}

		final int x = 0;
		final int y = 4;

		System.out.println("switch");
		switch (x + y) {
		case x: {
			System.out.println("A");
		}
		case 1: {
			System.out.println("B");
		}
		default:
			System.out.println("default");
			break;
		case y:
			System.out.println("C");
		}

		try {
			testCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
	}

	public void testFinal(final String value) {
		final int num;
		num = 0;
	}

	public static void testCase() throws Exception {

	}

	public void testInnerClass() {
		TestInnerClass test = new TestInnerClass();
		PublicCar c = test.new PublicCar();

		System.out.println("number of tires = " + c.getNumTires());
	}
}
