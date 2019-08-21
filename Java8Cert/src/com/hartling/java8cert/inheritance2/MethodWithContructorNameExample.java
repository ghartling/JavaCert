package com.hartling.java8cert.inheritance2;

public class MethodWithContructorNameExample {

	void MethodWithContructorNameExample() {
		System.out.println("void method for MethodWithContructorNameExample");
	}

	public MethodWithContructorNameExample() {
		System.out.println("contructor for MethodWithContructorNameExample");
	}

	public static void main(String[] args) {
		MethodWithContructorNameExample c = new MethodWithContructorNameExample();
		c.MethodWithContructorNameExample();
	}

}
