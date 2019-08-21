package com.hartling.java8cert.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> testList = Arrays.asList("a", "b", "c");

		testList.stream().forEach(s -> System.out.println(s));
	}

}
