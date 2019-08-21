package com.hartling.java8cert.interfaces;

interface A {
	default void hello() {
		System.out.println("A");
	}
}

interface B extends A {
	@Override
	default void hello() {
		// This is NOT valid.     
		System.out.println("B");

		// super.hello();    
		A.super.hello();// This is valid.    }
	}
}

public class CallSuperDefaultMethodExample implements B {
	public static void main(String[] args) {
		CallSuperDefaultMethodExample c = new CallSuperDefaultMethodExample();
		c.hello();
	}

	@Override
	public void hello() {
		// super.hello();//This is NOT valid.      
		//
		// A.super.hello(); //This is NOT valid because TestClass does not implement A directly.      
		B.super.hello(); // This is valid.    
	}
}
