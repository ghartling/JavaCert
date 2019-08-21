package com.hartling.java8cert.interfaces;

interface House2 {
	public default String getAddress() {
		return "101 Main Str";
	}
}

interface Bungalow2 extends House2 {
	// @Override
	@Override
	public default String getAddress() {
		return "101 Smart Str";
	}
}

// This fails to compile if Bungalow2 doesn't extend House2: Duplicate default methods named getAddress with the parameters () and () are inherited from the types Bungalow2 and House2
class MyHouse2 implements House2, Bungalow2 {
}

public class DefaultMethodExample2 {

	public static void main(String args[]) {
		House2 ci = new MyHouse2(); // 1
		System.out.println(ci.getAddress()); // 2
	}
}