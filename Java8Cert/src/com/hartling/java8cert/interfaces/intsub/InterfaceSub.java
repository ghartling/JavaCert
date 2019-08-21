package com.hartling.java8cert.interfaces.intsub;

import com.hartling.java8cert.interfaces.InterfaceWithMain;

interface InterfaceSub extends InterfaceWithMain {

	public static void main(String... args) {
		System.out.println("test run");

		int a = 1;
		char b = 2;
		int c = a + b;
		System.out.println("c = " + c);

	}

}
