package com.pedrorenzo.java8;

/**
 * Lambdas allow our code to be much less verbose than before Java 8.
 * 
 * @author pedrorenzo
 */
public class LambdaAndFunctionalInterface {

	/**
	 * In the first line of the main method, the -> means that we have a lambda
	 * expression! For a single-line lambda expression "return" is optional however
	 * for multi-line Lambda expression "return" is mandatory. For a single-line
	 * lambda expression, curly braces {} are optional however for multi-line Lambda
	 * expression curly braces {} is mandatory.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AddToNumbers addTwoNumbers = (a, b) -> a + b;
		final int numbersAdded = addTwoNumbers.add(2, 3);
		System.out.println(numbersAdded);
	}

}

/**
 * This is a functional interface: it has only one abstract method, and with
 * that, we can use lambda expressions, otherwise, no.
 * 
 * The annotation @FunctionalInterface is optional, but is good to explicit show
 * that it is a functional interface.
 * 
 * It would continue to be a functional interface even if it had a
 * default/static method!
 * 
 * @author pedrorenzo
 */
@FunctionalInterface
interface AddToNumbers {
	int add(final int number1, final int number2);
}