package com.hartling.java8cert.inheritance;

public class NoDefaultConstructorExample extends Car {
	public NoDefaultConstructorExample(String model) {
		// need this line since the super class doesn't have a default contructor
		super(model);
	}

	protected int j = 12;
}
