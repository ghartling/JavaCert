package com.hartling.java8cert.interfaces;

import java.time.ZoneId;

public interface InterfaceWithMain {
	public static void main(String... args) {
		System.out.println("test run");

		int a = 1;
		char b = 2;
		int c = a + b;
		System.out.println("c = " + c);

	}

	ZoneId getZoneId(String zoneString);
}
