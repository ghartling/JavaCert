package com.hartling.java8cert;

public class PrimitiveDataTypes {

	public static void main(String args[]) {
		long l = 0xff;
		char c = '\u0001';
		byte b = 0b0111;

		System.out.println("l = " + l);
		System.out.println("c = " + c);
		System.out.println("b = " + b);

		// strings
		String[] students = new String[10];
		String studentName = "Peter Smith";
		students[0] = studentName;
		studentName = null;
		System.out.println("studentName = " + studentName + ", students[0] = " + students[0]);
	}
}
