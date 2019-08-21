package com.hartling.java8cert.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListSandbox {
	public float myfloat;

	public static void main(String args[]) {
		String myArr[] = { "one", "two", "three" };

		List<String> myList = Arrays.asList(myArr);
		ArrayList<String> al = new ArrayList(myList);
		al.removeIf(s -> s.equalsIgnoreCase("two"));

		// .replaceAll(s -> s.concat("test"));
		Collection myCol = new ArrayList();
		// listTest(myCol);

		arrayListExample();
	}

	public static void listTest(List l) {

	}

	public static void arrayListExample() {
		ArrayList<Double> al = new ArrayList<>();

		System.out.println("al.contains(\"string\"): " + al.contains("string"));
	}
}
