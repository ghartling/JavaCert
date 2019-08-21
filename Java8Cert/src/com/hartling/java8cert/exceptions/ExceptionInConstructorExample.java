package com.hartling.java8cert.exceptions;

import java.io.IOException;

public class ExceptionInConstructorExample {

	public ExceptionInConstructorExample() throws IOException {

	}

	public static void main(String[] args) {
		try {
			ExceptionInConstructorExample example = new ExceptionInConstructorExample();
			example.test();
			// compilation error because the method test doesn't throw an IOException
			// } catch (IOException e) {
			// System.out.println("Caught exception: " + e.getClass().getName());
			// e = new IOException();
		} catch (Exception e) {
			System.out.println("Caught exception: " + e.getClass().getName());
			e = new IOException();
		}
	}

	public void test() {
		throw new RuntimeException();
	}

}

/**
 * Sub class contructor must throw the same exception as parent but can new ones.
 * 
 * @author hartlig
 *
 */
class ExceptionInConstructorExampleSub extends ExceptionInConstructorExample {

	public ExceptionInConstructorExampleSub() throws NoSuchMethodException, IOException {
	}

	@Override
	public void test() {
		super.test();
	}

}