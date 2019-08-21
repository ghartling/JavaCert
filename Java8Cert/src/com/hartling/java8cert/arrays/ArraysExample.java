package com.hartling.java8cert.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {
	static int x = 2;
	static int z;

	public static void main(String[] args) throws Exception {
		System.out.println(x + z);

		int[] a1 = { 2, -1, 4, 5, 3 };
		int[] a2 = { 2, -1, 4, 5, 3 };

		int[] a3 = new int[] { 2, -1, 4, 5, 3 };

		Object o = a1;

		System.out.println(Arrays.equals(a1, a2));

		// System.out.println(Arrays.deep.deepEquals(a1, a2));

		StringBuilder b = new StringBuilder();

		// Arrays.equals
		Integer i[] = new Integer[] { 1, 2, 3 };

		int[][] twod = new int[3][2];
		// twod[2] = { 1, 2, 3 }; // invalid
		twod[2] = new int[] { 1, 2, 3 };
		// sortArray();

		char cIndex = 1;
		twod[cIndex][0] = 0;

		byte bIndex = 1;
		twod[bIndex][0] = 0;

		short sIndex = 1;
		twod[sIndex][0] = 0;

		long lIndex = 1;
		// twod[lIndex][0] = 0; // invalid

		testArrayInit();

	}

	static {
		int x = 3;
		z = x;
		;
	}

	public static void sortArray() {
		int[][] ints = new int[2][];
		Arrays.sort(ints[1]);
	}

	public static void testArrayInit() {
		// throws java.lang.NegativeArraySizeException
		// int[] z = new int[-1];

		int x[] = new int[0];
		System.out.println("x.length = " + x.length);
		int xx[] = new int[5];
		Object o = xx;

		int xxx[][] = new int[5][5];
		// java.lang.ClassCastException: [I cannot be cast to java.base/java.lang.Integer
		// xxx[0][0] = (int) o;

		o = x;

		// cast into to object boxes it into Integer
		int y = 5;
		o = y;
		System.out.println("o.geName() = " + o.getClass().getName());
		Integer io = (Integer) o;
		System.out.println("io = " + io);

		xxx[0][0] = (Integer) o;
		System.out.println("xxx[0][0] = " + xxx[0][0]);

		//
		int[] dblArray[] = { { 1, 2 }, { 3, 4 } };
		for (int r = 0; r < dblArray.length; ++r) {
			for (int c = 0; c < dblArray[r].length; ++c) {
				System.out.println(String.format("[%d][%d] = %d", r, c, dblArray[r][c]));
			}
		}

		System.out.println("double array: ");
		System.out.println(dblArray);

		System.out.println("single array: ");
		System.out.println(xx);

		List<String> myList = new ArrayList<>(Arrays.asList("a", "b", "c"));

		System.out.println("list: ");
		System.out.println(myList);

		myList.toArray(new String[0]);
		String arrayVar = null;

		// this doesn't compile. You declare it in the for and it can't have the same name as another variable
		// for(arrayVar:myList) { }

		List<Person> personList = new ArrayList<>(Arrays.asList(new Person(1), new Person(2), new Person(3)));

		System.out.println("list: ");
		System.out.println(personList);
	}

}

class Person {
	int age;

	Person(int age) {
		this.age = age;
	}
}