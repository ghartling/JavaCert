package com.hartling;

public class ShadowExample {
	static int x = 2;
	static int z;

	public static void main(String[] args) {
		System.out.println(x + z);

	}

	static {
		// shadow
		int x = 3;
		z = x;
		;
	}

}
