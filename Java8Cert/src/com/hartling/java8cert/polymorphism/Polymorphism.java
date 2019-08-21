package com.hartling.java8cert.polymorphism;

public class Polymorphism {

	public static final String changeMe = "changeMe";

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();

		System.out.println("sum = " + p.sum());
		System.out.println("sum = " + p.sum(1, 2, 3));

		p.setChangeMe(changeMe);
		System.out.println("changeMe = " + Polymorphism.changeMe);

	}

	public void setChangeMe(String value) {
		value = "I got changed";
	}

	public int sum(int... numbers) {
		int sum = 0;

		for (int n : numbers) {
			sum += n;
		}

		return sum;
	}

}
