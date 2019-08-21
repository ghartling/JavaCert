package com.hartling.java8cert.numbersandstrings;

public class NumberDivideBy0Example {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt("10", 16);
			System.out.println("x = " + x / 0);
		} catch (Exception e) {
			System.out.println("x/0 = " + e.getMessage());
		}

		try {
			Integer xBox = Integer.valueOf("10", 16);
			System.out.println("x = " + xBox / 0);
		} catch (Exception e) {
			System.out.println("Integer/0 = " + e.getMessage());
		}

		try {
			Integer xBox = Integer.valueOf("10", 16);
			Integer zero = 0;
			Integer result = xBox / zero;
			System.out.println("x = " + result);
		} catch (Exception e) {
			System.out.println("Integer/0 = " + e.getMessage());
		}

		// no exception for Float
		{
			Float f = 10f;
			Float zero = 0f;
			Float result = f / zero;
			System.out.println("Float = " + result);
		}

		{
			// error
			// Double d =10;
			Double d = 10d;
			Double result = 10.0 / 0;
			System.out.println("Double = " + result);
		}

		try {
			double result = 10 / 0;
			System.out.println("double = " + result);
		} catch (Exception e) {
			System.out.println("double/0 = " + e.getMessage());
		}

		{
			Long l = 10l;
		}

		{
			Short s = 6553;
		}
	}

}
