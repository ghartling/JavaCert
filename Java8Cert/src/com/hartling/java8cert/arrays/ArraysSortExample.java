package com.hartling.java8cert.arrays;

import java.util.Arrays;

public class ArraysSortExample {

	public static void main(String[] args) throws Exception {

		int[] a1 = { 2, -1, 4, 5, 3 };
		int[] a2 = { 2, -1, 4, 5, 3 };

		int[][] a3 = new int[2][];
		a3[0] = a1;
		a3[1] = a2;

		System.out.println(Arrays.equals(a1, a2));
		// System.out.println(Arrays.deepEquals(a1, a2));

		// throws ClassCastException
		// Arrays.sort(a3);
	}

	public static void sortArray() {
		int[][] ints = new int[2][];
		Arrays.sort(ints[1]);
	}

}
