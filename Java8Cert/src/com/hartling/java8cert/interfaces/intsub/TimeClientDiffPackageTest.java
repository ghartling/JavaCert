package com.hartling.java8cert.interfaces.intsub;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import com.hartling.java8cert.interfaces.TimeClient;

public class TimeClientDiffPackageTest implements TimeClient {

	public static void main(String args[]) {
		final int x;
		x = 9;

		// error
		// x = 5;

		System.out.println("constant = " + TimeClient.MY_CONSTANT);

		// error
		// TimeClient.MY_CONSTANT = "9";
	}

	@Override
	public ZonedDateTime getZonedDateTime(String zoneString) {
		return ZonedDateTime.now();
	}

	@Override
	public void setTime(int hour, int minute, int second) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDate(int day, int month, int year) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return null;
	}
}
