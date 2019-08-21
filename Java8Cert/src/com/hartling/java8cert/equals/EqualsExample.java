package com.hartling.java8cert.equals;

public class EqualsExample {
	public static void main(String[] args) {
		Double d = 10.0;
		int i = 10;
		Integer wi = 10;

		Float f = 10.0f;

		Double sum = 10 + 3.0;

		System.out.println((i == d));
		System.out.println(d.equals(i));
		System.out.println(d.equals(wi));
		System.out.println(wi.equals(d));

		System.out.println();

		String s1 = "test1";
		String s2 = new String("test1");
		String s3 = "test1";

		System.out.println("s1==s2: " + (s1 == s2));
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));

		System.out.println("s1==s3: " + (s1 == s3));
		System.out.println("s1.equals(s3): " + (s1.equals(s3)));

		X.hello();

		testIncrement();

	}

	public static void testIncrement() {
		int x = 10;

		if (x++ == 10) {
			System.out.println("post increment x = " + x);
		}

		if (++x == 10) {
			System.out.println("pre increment x = " + x);
		}
	}

	interface X {
		static void hello() {
			System.out.println("hello");

		}

		abstract Number number();
	}

	public class Y implements X {

		@Override
		public Integer number() throws NumberFormatException {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
