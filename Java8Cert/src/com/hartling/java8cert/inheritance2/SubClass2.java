package com.hartling.java8cert.inheritance2;

public class SubClass2 extends SubClass {

	public SubClass2() {
		System.out.println("SubClass2 contructor");
	}

	public static void main(String args[]) {
		Parent p = new SubClass2();
	}

}
