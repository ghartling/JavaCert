package com.hartling.java8cert.numbersandstrings;

public class BooleanExample {
	public static void main(String[] args) {

		Boolean trueValueOf = Boolean.valueOf("True");
		Boolean trueNew = new Boolean("True");
		Boolean trueParseBoolean = Boolean.parseBoolean("True");

		boolean truePrim = Boolean.TRUE;

		System.out.println("trueValueOf: " + trueValueOf);
		System.out.println("trueValueOf == Boolean.TRUE: " + (trueValueOf == Boolean.TRUE));
		System.out.println("trueNew == Boolean.TRUE: " + (trueNew == Boolean.TRUE));
		System.out.println("trueParseBoolean == Boolean.TRUE: " + (trueParseBoolean == Boolean.TRUE));
		System.out.println("truePrim == Boolean.TRUE: " + (truePrim == Boolean.TRUE));

	}

}
