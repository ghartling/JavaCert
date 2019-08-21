package com.hartling.java8cert.nested;

import java.io.IOException;

/**
 * Compelling reasons for using nested classes include the following:
 * 
 * It is a way of logically grouping classes that are only used in one place: If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together.
 * Nesting such "helper classes" makes their package more streamlined.
 * 
 * It increases encapsulation: Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private. By hiding class B within class A, A's members can
 * be declared private and B can access them. In addition, B itself can be hidden from the outside world.
 * 
 * It can lead to more readable and maintainable code: Nesting small classes within top-level classes places the code closer to where it is used.
 * 
 * 
 * @param args
 * @throws IOException
 */
public class TestInnerClass {
	private float myfloat = 5;

	public static void main(String args[]) throws IOException {
		TestInnerClass test = new TestInnerClass();
		PrivateCar c = test.new PrivateCar();

		System.out.println("getNumTires = " + c.getNumTires());
		System.out.println("numbegetMyFloat = " + c.getMyFloat());
		System.out.println("multiplyMyFloat = " + c.multiplyMyFloat(6));
	}

	private class PrivateCar {
		final int numTires = 4;

		// can only have static methods if they are final and initialized
		private static final String test = "Im static";

		public void setMyFloat() {
			myfloat = 10;
		}

		public int getNumTires() {
			return numTires;
		}

		public float getMyFloat() {
			myfloat = 10;
			return myfloat;
		}

		public float multiplyMyFloat(int x) {
			myfloat = 10;
			return x * myfloat;
		}
	}

	public class PublicCar {
		final int numTires = 4;

		public int getNumTires() {
			return numTires;
		}
	}
}
