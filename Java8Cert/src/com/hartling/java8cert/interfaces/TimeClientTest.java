package com.hartling.java8cert.interfaces;

import java.time.ZoneId;

public class TimeClientTest {

	public static void main(String args[]) {
		final int x;
		x = 9;

		// error
		// x = 5;

		System.out.println("constant = " + TimeClient.MY_CONSTANT);

		// error
		// TimeClient.MY_CONSTANT = "9";

		TimeClient.getZoneId(ZoneId.systemDefault().getId());
	}
}
