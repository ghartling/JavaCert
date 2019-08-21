package com.hartling.java8cert.nested;

/**
 * Local classes are classes that are defined in a block, which is a group of zero or more statements between balanced braces. You typically find local classes defined in the body of a method.
 * 
 * @author hartlig
 *
 */
public class LocalClassEffectivelyFinal {

	static String regularExpression = "[^0-9]";

	public static void validatePhoneNumber(
			String phoneNumber1, String phoneNumber2) {
		final int g;
		g = 5;

		// final int numberLength = 10;

		// Valid in JDK 8 and later:
		// A variable or parameter whose value is never changed after it is initialized is effectively final. numberLength is an example of this
		int numberLength;
		numberLength = 10;
		class PhoneNumber {
			static final int gerry = 0;

			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				// numberLength = 7;
				String currentNumber = phoneNumber
						.replaceAll(
								regularExpression, "");
				if (currentNumber.length() == numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}

			public String getNumber() {
				return formattedPhoneNumber;
			}

			// Valid in JDK 8 and later:

			public void printOriginalNumbers() {
				System.out
						.println("Original numbers are " + phoneNumber1 +
								" and " + phoneNumber2);
			}
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		// Valid in JDK 8 and later:

		myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null)
			System.out.println("First number is invalid");
		else
			System.out.println("First number is " + myNumber1.getNumber());
		if (myNumber2.getNumber() == null)
			System.out.println("Second number is invalid");
		else
			System.out.println("Second number is " + myNumber2.getNumber());

	}

	public static void main(String... args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}
}
