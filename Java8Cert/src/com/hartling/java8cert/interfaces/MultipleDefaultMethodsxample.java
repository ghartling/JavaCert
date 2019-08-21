package com.hartling.java8cert.interfaces;

interface Default1 {
	static String ID = "QBANK";

	default void hello() {
		System.out.println("A");
	}

	static void hello1() {
		System.out.println("A");
	}
}

abstract interface Default2 {
	static String ID = "QBANK";

	default void hello() {
		// This is NOT valid.     
		System.out.println("B");
	}

	static void hello1() {
		System.out.println("A");
	}
}

interface Default3 extends Default1, Default2 {
	// need to override for this class to compile since both interfaces contain this method
	@Override
	default void hello() {
		// This is NOT valid.     
		System.out.println("B");

		// compile error ambiguous
		// System.out.println(ID);
	}
}

public class MultipleDefaultMethodsxample implements Default1, Default2 {
	public static void main(String[] args) {
		MultipleDefaultMethodsxample c = new MultipleDefaultMethodsxample();
		// c.hello();
		c.hello();

		// compile error ambiguous
		// System.out.println(ID);

		// interface static methods are not inherited but fields are
		// c.hello1();

		// ambiguous
		// String s=Default3.ID;

		// doesn't compile
		// System.out.println(methodVoid());
	}

	// need to override for this class to compile since both interfaces contain this method
	@Override
	public void hello() {
		// super.hello();//This is NOT valid.      
		//
		// A.super.hello(); //This is NOT valid because TestClass does not implement A directly.      
		Default1.super.hello(); // This is valid.   
	}

	public static void methodVoid() {

	}
}
