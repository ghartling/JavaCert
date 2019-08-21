package com.hartling.java8cert.vaargs;

public class VarargsExample {
	public static void main(String[] args) {
		VarargsExample v = new VarargsExample();

		System.out.println("test multiple args");
		v.test("1", "2", "3");

		System.out.println("test no args");
		v.test();

		System.out.println("test array");
		String[] myArr = { "1", "2", "3" };
		v.test(myArr);
	}

	public void test(String... varargs) {

		for (String s : varargs) {
			System.out.println("s: " + s);
		}
	}

}
