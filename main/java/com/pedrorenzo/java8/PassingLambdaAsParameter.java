package com.pedrorenzo.java8;

/**
 * With lambda, we can also use Functional Programming: passing a method to a
 * method as parameter.
 * 
 * @author pedrorenzo
 */
public class PassingLambdaAsParameter {
	public static void main(String args[]) {
		final HelloInterface helloInterface = () -> System.out.println("Hello");
		test(helloInterface);
		test2(() -> System.out.println("Hello"));
	}

	private static void test(final HelloInterface helloInterface) {
		System.out.println("From Test method");
		helloInterface.displayHello();

	}

	private static void test2(final HelloInterface helloInterface) {
		System.out.println("From Test2 method");
		helloInterface.displayHello();
	}
}

interface HelloInterface {
	public void displayHello();
}