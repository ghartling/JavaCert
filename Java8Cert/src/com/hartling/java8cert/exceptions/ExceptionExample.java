package com.hartling.java8cert.exceptions;

import java.io.IOException;

public class ExceptionExample {
	String s = this.toString();

	public static void main(String[] args) {
		ExceptionExample example = new ExceptionExample();
		try {
			example.test();
			// compilation error because the method test doesn't throw an IOException
			// } catch (IOException e) {
			// System.out.println("Caught exception: " + e.getClass().getName());
			// e = new IOException();
		} catch (Exception e) {
			System.out.println("Caught exception: " + e.getClass().getName());
			System.out.println(e);
			e = new IOException();
		}
	}

	public void test() {
		throw new RuntimeException("test throw RuntimeException");
	}

}
