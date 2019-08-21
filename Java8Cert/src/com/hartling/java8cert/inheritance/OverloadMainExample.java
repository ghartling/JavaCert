package com.hartling.java8cert.inheritance;

public class OverloadMainExample {
	protected int j = 12;

	public static void main(int a) {
		System.out.println("a = " + a);

	}

	public static void main(String[] args) {
		System.out.println("args.length = " + args.length);

	}
}
