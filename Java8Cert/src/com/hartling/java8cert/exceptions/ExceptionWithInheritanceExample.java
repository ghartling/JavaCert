package com.hartling.java8cert.exceptions;

public class ExceptionWithInheritanceExample extends Animal {
	final int x;

	ExceptionWithInheritanceExample() {
		x = 0;
	}

	public static void main(String[] args) {
		ExceptionWithInheritanceExample example = new ExceptionWithInheritanceExample();
		Animal a = new ExceptionWithInheritanceExample();

		// compile error because Animal.eat() throws Exception
		// a.eat();

		example.eat();
	}

	public void test() {
		throw new RuntimeException();
	}

	@Override
	public void eat() {
		System.out.println("Animal eats");
	}

}

class Animal {
	public void eat() throws Exception {
		System.out.println("Animal eats");
	}
}
