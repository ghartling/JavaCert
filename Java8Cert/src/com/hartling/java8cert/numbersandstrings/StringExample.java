package com.hartling.java8cert.numbersandstrings;

public class StringExample {
	public static void main(String[] args) {
		long l = 10;
		int i = 10;

		System.out.println("valueOf(i): " + String.valueOf(i));

		String s = "Able was I ere I saw Elba.";
		System.out.println("length: " + s.length());

		String[] myStrings = new String[3];
		String testString = "test a string";
		System.out.format("myStrings.length = %d, testString.length() = %d %n", myStrings.length, testString.length());

		myStrings[1] = testString;
		testString = null;

		System.out.println("testString = " + testString);
		System.out.println("myStrings[1] = " + myStrings[1]);

		String s1 = "test s1";
		String s2 = "test s1";

		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		System.out.println("s1==s2 = " + (s1 == s2));

		String data = "test copyValueOf";
		String copiedData = String.copyValueOf(data.toCharArray(), 5, 4);
		System.out.println("String.copyValueOf(data.toCharArray(), 5, 4) = " + copiedData);
		System.out.println("String.valueOf(data.toCharArray(), 5, 4) = " + String.valueOf(data.toCharArray(), 5, 4));

		char[] c = new char[4];
		data.getChars(5, 9, c, 0);

		System.out.println("getChars(5, 9, c, 0) = " + new String(c));

		// compare
		compareTest();

		System.out.println("true == Boolean.TRUE: " + (true == Boolean.TRUE));
		System.out.println("true == Boolean.parseBoolean(\"true\"): " + (true == Boolean.parseBoolean("true")));

		String[] joinTest = { "a", "b", "c" };
		System.out.println("join = " + String.join(",", joinTest));

		// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 97
		// char result = data.charAt('a');

		printTest();
	}

	private static void compareTest() {

		String a = "a";
		String b = "b";

		System.out.println("a.compareTo(b) = " + a.compareTo(b));

	}

	private static void printTest() {

		char a = 'a';
		int i = 10;
		boolean b = true;
		;

		System.out.println(a);
		System.out.println(a + i);
		// System.out.println(a + b);

	}

}
