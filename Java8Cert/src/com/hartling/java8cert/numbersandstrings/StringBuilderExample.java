package com.hartling.java8cert.numbersandstrings;

public class StringBuilderExample {
	public static void main(String[] args) {
		int i = 10;
		System.out.println("valueOf(i): " + String.valueOf(i));

		StringBuilder sb = new StringBuilder("test");
		printSb(sb);

		System.out.println();
		System.out.println("set length");
		sb.setLength(10);
		printSb(sb);

		int result = sb.length() >> 1;
		System.out.println("sb.length() >> 1 = " + result);

		System.out.println();
		System.out.println("append");
		sb.append("01234567890123456789");
		printSb(sb);
		// sb.

		result = sb.length() >> 1;
		System.out.println("sb.length() >> 1 = " + result);

		insertExample();
		deleteExample();

		StringBuilder sb1 = new StringBuilder("abc");
		String s1 = new String(sb1);

		System.out.print("print sb without toString: ");
		System.out.print(sb);
		System.out.println(sb);

		String append3Param = "append 3 param";
		sb.append(append3Param.toCharArray(), 6, append3Param.length() - 6);

		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);

	}

	public static void printSb(StringBuilder sb) {
		System.out.println("sb: \"" + sb + "\"");
		System.out.println("sb.length(): " + sb.length());
		System.out.println("sb.capacity(): " + sb.capacity());
	}

	public static void insertExample() {
		StringBuilder sb = new StringBuilder("aAaA");
		sb.insert(sb.lastIndexOf("A"), true);
		System.out.println("sb: \"" + sb + "\"");

	}

	public static void deleteExample() {
		StringBuilder sb = new StringBuilder("aAaA");
		sb.delete(2, 10);
		System.out.println("deleteExample sb: \"" + sb + "\"");

	}

	public static void castStringToIntTest() {
		String[] args = { "1", "2" };

		// compile error
		// int x = (int) args[0];
	}

	public String vaargs1(String... strings) {
		return "vaargs1";
	}

	// vaargs must be last parameter
	/*
	 * public String vaargs1(String... strings, int x) { return "vaargs1"; }
	 */
}

final class MyClass {

}
