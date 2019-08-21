package com.hartling.java8cert.interfaces;

interface House {
	public default String getAddress() {
		return "101 Main Str";
	}
}

interface Bungalow extends House {
	@Override
	public default String getAddress() {
		return "101 Smart Str";
	}
}

class MyHouse implements Bungalow, House {
}

public class DefaultMethodExample {

	public static void main(String args[]) {
		House ci = new MyHouse(); // 1
		System.out.println(ci.getAddress()); // 2
	}
}