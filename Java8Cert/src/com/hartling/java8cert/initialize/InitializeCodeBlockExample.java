package com.hartling.java8cert.initialize;

public class InitializeCodeBlockExample {

	{
		int a = 5;
	}

	InitializeCodeBlockExample() {
	}

	public static void main(String[] args) {
		InitializeCodeBlockExample x = new InitializeCodeBlockExample();

		// can't access variabe a from code block
		// System.out.println(x.a);
	}

}
