package com.hartling.java8cert.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExceptionExample2 example = new ExceptionExample2();
		example.test1();
		example.test2();
		System.out.println("success");
	}

	public void test1() throws IOException {
		throw new IOException();
	}

	public void test2() throws ClassNotFoundException {
		throw new SecurityException();
	}

	public void test3() throws IOException {
		throw new FileNotFoundException();
	}

	// illegal since IOException is a super class of FileNotFoundException
	// public void test4() throws FileNotFoundException {
	// throw new IOException();
	// }

}
