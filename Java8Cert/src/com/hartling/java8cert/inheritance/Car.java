package com.hartling.java8cert.inheritance;

public class Car extends Vehicle {

	public Car(String model) {
		System.out.println("car model = " + model);
	}

	public static void main(String... args) {

		System.out.println("test other constructor");
		Car d = new Car("equinox");

	}

	public static void testArgs(String... args) {
		System.out.println("main args = " + args.length);

		for (String s : args) {
			System.out.println("s = " + s);
		}
	}

}
