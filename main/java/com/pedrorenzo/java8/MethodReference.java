package com.pedrorenzo.java8;

/**
 * Method reference is used to refer method of functional interface. It is
 * compact and easy form of lambda expression. In this example,
 * MethodReference::saySomething has the same return type than Sayable.say(),
 * but it could be different!
 * 
 * @author pedrorenzo
 */
public class MethodReference {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	/**
	 * In the first line of the main method, the :: means that we have a method
	 * reference!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Referring static method. If it was a non static method, we would have to
		// instantiate the class and then, e.g.: obj::saySomething;
		final Sayable sayable = MethodReference::saySomething;
		// Calling interface method
		sayable.say();
	}
}

interface Sayable {
	void say();
}