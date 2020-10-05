package com.pedrorenzo.java11;

/**
 * Lambda was introduced in Java 8, but we now have the possibility to use
 * parameters of a lambda expression as vars. Take a look at the example and at
 * the explanation:
 * 
 * @author pedrorenzo
 */
public class LambdaEnhancement {

	public static void main(String args[]) {
		beforeJava11();
		fromJava11();
	}

	private static void beforeJava11() {
		final AddInterface1 addInterface1 = (a, b) -> (a + b);
		final int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("Before Java 11 - Sum of two Numbers: " + sum);

	}

	private static void fromJava11() {
		final AddInterface1 addInterface1 = (var a, var b) -> (a + b);
		// Change java compiler version to java 10 , you will get compilation error on
		// the above line
		// We can, with Java 11, do it:
		// AddInterface1 addInterface1 = (final var a, final var b) -> (a + b); --> Declare as final
		// AddInterface1 addInterface1 = (@Min(value = 10) var a, @Min(value = 1) var b) -> (a + b); --> Validate input parameters

		final int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("From Java 11 - Sum of two Numbers: " + sum);
	}

}

interface AddInterface1 {
	public int addTwoNumbers(int a, int b);
}