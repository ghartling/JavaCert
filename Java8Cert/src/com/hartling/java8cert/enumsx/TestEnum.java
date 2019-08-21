package com.hartling.java8cert.enumsx;

import java.io.IOException;

public class TestEnum {
	public float myfloat;

	public static void main(String args[]) throws IOException {
		CarStatus on = CarStatus.ON;
		System.out.println("toString = " + on.toString());
		System.out.println("name = " + on.name());
		System.out.println("getDescription = " + on.getDescription());

		for (CarStatus s : CarStatus.values()) {
			System.out.println("name = " + s.name());
		}
	}
}
