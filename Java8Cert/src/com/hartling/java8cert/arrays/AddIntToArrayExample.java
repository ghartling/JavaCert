package com.hartling.java8cert.arrays;

import java.util.ArrayList;
import java.util.List;

public class AddIntToArrayExample {
	public static void main(String[] args) throws Exception {
		List al = new ArrayList(); // 1
		al.add(111); // 2
		al.add('a');
		Object o = al.get(0);
		System.out.println(o.getClass().getName()); // 3
		System.out.println(al.get(0)); // 3
	}

}
