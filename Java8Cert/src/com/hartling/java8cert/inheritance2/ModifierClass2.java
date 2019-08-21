package com.hartling.java8cert.inheritance2;

import com.hartling.java8cert.inheritance.ModifierClass;

class ModifierClass2 extends ModifierClass {

}

abstract class A {
	A(String s) {
		System.out.println("1");
	}

}

class Whizlab extends A {
	Whizlab() {
		super("2");
		System.out.println("2");
	}

	void print() {
		System.out.println("3");

	}

	public static void main(String args[]) {
		new Whizlab().print();
	}
}
