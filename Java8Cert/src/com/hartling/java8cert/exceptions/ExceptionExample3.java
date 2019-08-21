package com.hartling.java8cert.exceptions;

import java.io.IOException;
import static java.util.Arrays.*;

public class ExceptionExample3 {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");

			// throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception");

		} finally {
			System.out.println("finally");

		}
		System.out.println("finished");
	}

}
