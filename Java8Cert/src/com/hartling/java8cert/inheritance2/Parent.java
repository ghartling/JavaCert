package com.hartling.java8cert.inheritance2;

public class Parent {

	public Parent() {
		System.out.println("Parent contructor");
	}

	{
		System.out.println("parent non-static code block");
	}

	protected void testMethod() {

	}

	static {
		System.out.println("parent static code block");
	}

	public Number covariantExample() {
		return Integer.valueOf(5);
	}

}
