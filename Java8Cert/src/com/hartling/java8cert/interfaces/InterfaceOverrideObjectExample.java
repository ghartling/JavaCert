package com.hartling.java8cert.interfaces;

public interface InterfaceOverrideObjectExample {

	/**
	 * Fails to compile with error: This static method cannot hide the instance method from Object
	 * 
	 * @return
	 */
	// static String toString() {
	// }

	/**
	 * Fails to compile with error: A default method cannot override a method from java.lang.Object
	 * 
	 * @return
	 */
	@Override
	// default String toString() {
	// }
	String toString();

}
