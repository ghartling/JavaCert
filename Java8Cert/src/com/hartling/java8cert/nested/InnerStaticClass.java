package com.hartling.java8cert.nested;

public class InnerStaticClass {
	public static void main(String[] args) {
		Print p = new Print();

		int x = 053;
		String s = "test";

		p.print(8);
	}

	static class Print {
		private static void p2(int i) {

		}

		static void print(int i) {

		}
	}

}
