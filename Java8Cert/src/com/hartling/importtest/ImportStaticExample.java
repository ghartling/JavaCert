package com.hartling.importtest;

import static java.lang.Math.*;
import static com.hartling.importtest.ImportStaticPow.*;
import static com.hartling.importtest.ImportStaticConstant.*;

public class ImportStaticExample {

	public static void main(String[] args) {
		double pi = Math.PI;

		// compile error saying it's ambiguous since it's defined in ImportStaticPow also
		// System.out.println(pow(5, 5));
		System.out.println(abs(-5));

		// compile error saying it's ambiguous since it's defined in ImportStaticPow also
		// System.out.println("TEST = "+TEST);

	}

}
